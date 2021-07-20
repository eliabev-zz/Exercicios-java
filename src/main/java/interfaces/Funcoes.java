package interfaces;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        Function<String, String> retornaNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> converterStringParaInteiroDobro = string -> Integer.valueOf(string) * 2;
        System.out.println(retornaNomeAoContrario.apply("eliabe"));
        System.out.println(converterStringParaInteiroDobro.apply("37"));
    }
}