public class Arrays {
    public static void main(String[] args) {
//        Primera forma de declarar matriz
//        int[] matriz_mia = new int[10];
//
//        matriz_mia[0] = 1;
//        matriz_mia[1] = 2;
//        matriz_mia[2] = 3;
//        matriz_mia[3] = 4;
//        matriz_mia[4] = 5;
//        matriz_mia[5] = 6;
//        matriz_mia[6] = 7;
//        matriz_mia[7] = 8;
//        matriz_mia[8] = 9;
//        matriz_mia[9] = 10;

        int[] matriz_mia = {2,3,5,7,8,3,1,2,3,24,5,6,1231,124,125,4};

        for (int i = 0; i< matriz_mia.length; i++ ){
            System.out.println("Valor del indice "+i+" es: "+matriz_mia[i]);
        }
    }
}
