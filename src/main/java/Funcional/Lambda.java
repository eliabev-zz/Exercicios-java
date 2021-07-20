package Funcional;

public class Lambda {
    public static void main (String[] args) {
        Funcao funcao1 = valor -> {
            System.out.println(valor);
            System.out.println(valor);
            return valor;
        };
        funcao1.gerar("Joao");
    }
}

interface Funcao {
    String gerar(String valor);
}