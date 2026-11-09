import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Quiz {

    // Uma pergunta: enunciado, alternativas e o índice da alternativa correta
    static class Pergunta {
        String enunciado;
        List<String> alternativas = new ArrayList<>();
        int correta;
    }

    // Lê o arquivo com Java NIO e transforma as linhas em perguntas
    static List<Pergunta> lerPerguntas(Path caminho) throws IOException {
        List<String> linhas = Files.readAllLines(caminho, StandardCharsets.UTF_8);
        List<Pergunta> perguntas = new ArrayList<>();
        Pergunta atual = null;

        for (String linha : linhas) {
            linha = linha.replace("\uFEFF", "").trim();

            if (linha.isEmpty()) {
                if (atual != null) {
                    perguntas.add(atual);
                    atual = null;
                }
            } else if (atual == null) {
                atual = new Pergunta();
                atual.enunciado = linha;
            } else if (linha.startsWith("*")) {
                atual.correta = atual.alternativas.size();
                atual.alternativas.add(linha.substring(1).trim());
            } else {
                atual.alternativas.add(linha);
            }
        }
        if (atual != null) {
            perguntas.add(atual); // última pergunta do arquivo
        }
        return perguntas;
    }

    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in, StandardCharsets.UTF_8);
        List<Pergunta> perguntas = lerPerguntas(Paths.get("perguntas.txt"));

        int acertos = 0;
        int erros = 0;

        System.out.println("=== QUIZ ===");

        for (int i = 0; i < perguntas.size(); i++) {
            Pergunta p = perguntas.get(i);

            System.out.println();
            System.out.println((i + 1) + ") " + p.enunciado);
            for (int j = 0; j < p.alternativas.size(); j++) {
                System.out.println("   " + (char) ('A' + j) + " - " + p.alternativas.get(j));
            }

            // pede a resposta até o jogador digitar uma letra válida
            int escolhida = -1;
            while (escolhida < 0) {
                System.out.print("Sua resposta: ");
                String resposta = teclado.nextLine().trim().toUpperCase();
                if (resposta.length() == 1) {
                    int indice = resposta.charAt(0) - 'A';
                    if (indice >= 0 && indice < p.alternativas.size()) {
                        escolhida = indice;
                    }
                }
                if (escolhida < 0) {
                    System.out.println("Resposta inválida. Digite uma das letras.");
                }
            }

            if (escolhida == p.correta) {
                System.out.println("Correto!");
                acertos++;
            } else {
                System.out.println("Errado! A resposta certa era: " + p.alternativas.get(p.correta));
                erros++;
            }
        }

        System.out.println();
        System.out.println("Acertos: " + acertos);
        System.out.println("Erros: " + erros);

        // Salva o resultado em arquivo com Java NIO
        List<String> resultado = Arrays.asList("Acertos: " + acertos, "Erros: " + erros);
        Files.write(Paths.get("resultado.txt"), resultado, StandardCharsets.UTF_8);
        System.out.println("Resultado salvo em resultado.txt");
    }
}