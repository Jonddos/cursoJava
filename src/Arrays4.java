public class Arrays4 {
    public static void main(String[] args) {
        int[][] matriz_bi = new int[4][5];

        matriz_bi[0][0]=12;
        matriz_bi[0][1]=14;
        matriz_bi[0][2]=35;
        matriz_bi[0][3]=23;
        matriz_bi[0][4]=66;

        matriz_bi[1][0]=22;
        matriz_bi[1][1]=34;
        matriz_bi[1][2]=42;
        matriz_bi[1][3]=21;
        matriz_bi[1][4]=53;

        matriz_bi[2][0]=62;
        matriz_bi[2][1]=23;
        matriz_bi[2][2]=53;
        matriz_bi[2][3]=23;
        matriz_bi[2][4]=51;

        matriz_bi[3][0]=63;
        matriz_bi[3][1]=124;
        matriz_bi[3][2]=23;
        matriz_bi[3][3]=42;
        matriz_bi[3][4]=25;
        for(int i=0; i<4;i++) {
                System.out.println();
            for(int j=0;j<5;j++){

                System.out.print(matriz_bi[i][j] + " ");

            }
        }
    }
}
