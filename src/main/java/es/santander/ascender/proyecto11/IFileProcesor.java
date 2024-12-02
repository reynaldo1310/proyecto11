package es.santander.ascender.proyecto11;


public interface IFileProcesor {
    
    String leerFile(String filePath) throws Exception;
    void escribirAFile(String filePath, String content) throws Exception;
    String eliminarVocales(String input);
}



    
    
