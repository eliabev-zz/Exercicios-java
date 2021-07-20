package Arrays;

public class First {

    public static void main(String[] args) {

        int[] meuArray = new int[7];
        meuArray[3] = 15;
        String[] meuOutroArray = {"eu", "voce", "nos", "eliabe", "Fran", "Pedro", "Laura"};

        System.out.println(meuArray[3]);

        for (int i=0; i<meuOutroArray.length; i++) {
            System.out.println(meuOutroArray[i]);
        }
    }
};