package br.com.ks.labs.search.config;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Bucket {

    private String  getSystemPath() throws IOException {
        String configPath = System.getenv("SEARCH_PATH");
        File path = new File(configPath);
        if (!(path.exists() || path.isDirectory())) {
            System.out.println("Opsss não foi possivel encontrar o diretorio configurado");
            System.out.println("Favor configurar a variavel SEARCH_PATH");
            System.out.println("Comando:  export SEARCH_PATH=diretorio");
            throw new IOException() ;
        }
        return configPath;

    }

    public Map listFiles() throws IOException {
        try (Stream<java.nio.file.Path> stream = Files.list(Paths.get(getSystemPath()))) {
            return stream
                    .map(Path::toString)
                    .collect(Collectors.toMap(file -> file, this::readFile));
        }
    }

        private String readFile(String file) {
            try {
                return new String(Files.readAllBytes(Paths.get(file)));
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println(String.format("Erro ao ler o arquivo: %s", file));
            }
            return "Error";
        }

}
