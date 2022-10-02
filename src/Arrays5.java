public class Arrays5 {
    public static void main(String[] args) {
        int [][] matriz1 = {{12,43,56,75,23},{24,53,24,21,42},{42,25,53,63,21},{42,54,65,12,44}};
        /*for(int i=0; i<4;i++){
            System.out.println();
            for (int j=0; j<5; j++){
                System.out.println(matriz1[i][j] + " ");
            }
        }*/
        for(int []fila:matriz1){
            System.out.println();
            for(int z:fila){
                System.out.print(z +" ");
            }
        }
    }
}
