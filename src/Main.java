import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        String[] grupos = java.util.stream.IntStream.range(0, 8)
                .mapToObj(i -> "Grupo " + (char) ('A' + i))
                .toArray(String[]::new);


        String[][] selecoesPorGrupo = {
                {"Catar", "Equador", "Senegal", "Holanda"},
                {"Inglaterra", "Irã", "Estados Unidos", "País de Gales"},
                {"Argentina", "Arábia Saudita", "México", "Polônia"},
                {"França", "Austrália", "Dinamarca", "Tunísia"},
                {"Espanha", "Costa Rica", "Alemanha", "Japão"},
                {"Bélgica", "Canadá", "Marrocos", "Croácia"},
                {"Brasil", "Sérvia", "Suíça", "Camarões"},
                {"Portugal", "Gana", "Uruguai", "Coreia do Sul"}
        };

        if (grupos.length != selecoesPorGrupo.length) {
            throw new IllegalStateException("Os arrays de grupos e seleções precisam ter o mesmo tamanho.");
        }

        Path raiz = Paths.get("copa do mundo 2022");

        try {
            Files.createDirectories(raiz);

            IntStream.range(0, grupos.length)
                    .forEach(indice -> {
                        try {
                            Path pastaDoGrupo = raiz.resolve(grupos[indice]);
                            Files.createDirectories(pastaDoGrupo);

                            Path arquivo = pastaDoGrupo.resolve("selecoes.txt");
                            String conteudo = Arrays.stream(selecoesPorGrupo[indice])
                                    .collect(java.util.stream.Collectors.joining(System.lineSeparator()));

                            Files.writeString(
                                    arquivo,
                                    conteudo,
                                    StandardCharsets.UTF_8,
                                    StandardOpenOption.CREATE,
                                    StandardOpenOption.TRUNCATE_EXISTING
                            );
                        } catch (IOException e) {
                            throw new RuntimeException("Erro ao criar estrutura do grupo " + grupos[indice], e);
                        }
                    });

            System.out.println("Estrutura criada com sucesso na pasta: " + raiz.toAbsolutePath());
        } catch (IOException e) {
            System.out.println("Erro ao criar a estrutura: " + e.getMessage());
        }
    }

}
