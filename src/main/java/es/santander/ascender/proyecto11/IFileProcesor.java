package es.santander.ascender.proyecto11;

public interface IFileProcesor {
    String leerFile(String filePath) throws Exception;
    String eliminarVocales(String input);
    void escribirAFile(String filePath, String content) throws Exception;
}
