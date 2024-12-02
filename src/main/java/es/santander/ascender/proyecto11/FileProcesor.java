package es.santander.ascender.proyecto11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileProcesor implements IFileProcesor {

    @Override
    public String leerFile(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        if (!Files.exists(path)) {
            throw new IOException("El archivo no existe: " + filePath);
        }
        return Files.readString(path);
    }

    @Override
    public void escribirAFile(String filePath, String content) throws IOException {
        Path path = Paths.get(filePath);
        Files.writeString(path, content);
    }

    @Override
    public String eliminarVocales(String input) {
        if (input == null) {
            return null;
        }
        return input.replaceAll("[aeiouAEIOU]", "");
    }
}


