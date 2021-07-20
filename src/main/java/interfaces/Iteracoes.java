package interfaces;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes{
    public static void main(String[] args) {
        String[] nomes = {"eliabe", "eliabe", "fran", "pedro", "laura", "lucas", "sofia"};
        Integer[] numero = {1, 2, 3, 4, 5};
        imprimirNomesFiltrados(nomes);
    }

    public static void imprimirNomesFiltrados(String... nomes) {

        String nomesParaImprimir = "";
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals("eliabe")){
                nomesParaImprimir+=" "+nomes[i];
            }
        }

        String nomesParaImprimirStream = Stream.of(nomes).filter(nome -> nome.equals("eliabe"))
                        .collect(Collectors.joining(" "));
        System.out.println("Nomes do for: "+nomesParaImprimir);
        System.out.println("Nomes do Stream: "+nomesParaImprimirStream);
    }
}