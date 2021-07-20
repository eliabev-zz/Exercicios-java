package Funcional;

import java.util.function.UnaryOperator;

public class Funcional{

    public static void main(String[] args) {
        UnaryOperator<Integer> CalcularValorVezesTrinta = valor -> valor * 30;
        int valor = 10;
        System.out.print("O resultado é: " + CalcularValorVezesTrinta.apply(10));

    }
};