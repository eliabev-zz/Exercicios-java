package assincrono;

public class ThreadExemploJava {
    public static void main(String[] args) {
        BarraDeCarregamento2 barraDeCarregamento2 = new BarraDeCarregamento2();
        BarraDeCarregamento2 barraDeCarregamentoDeNovo = new BarraDeCarregamento2();

        barraDeCarregamento2.start();
        barraDeCarregamentoDeNovo.start();


    }
}

class GerarPDF implements Runnable {
    @Override
    public void run() {
        System.out.println("Gerar PDF");
    }
}

class BarraDeCarregamento implements Runnable {
    @Override
    public void run() {
        System.out.println("loading...");
    }
}

class BarraDeCarregamento2 extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("Rodei: "+getName());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

