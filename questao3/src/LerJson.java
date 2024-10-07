import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class LerJson {
    File file = new File("src/dados.json");
    byte[] bytes;
    String arquivo;

    {
        try {
            bytes = Files.readAllBytes(file.toPath());
            arquivo = new String(bytes, "UTF-8");
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    Gson gson = new Gson();
    DiaValor[] diaValores = gson.fromJson(arquivo, DiaValor[].class);
}
