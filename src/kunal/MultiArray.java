package kunal;

public class MultiArray {
    public static void main(String[] args) {
        int[][] kk = {{3, 3, 3, 3}, {4, 4, 4, 4}, {5, 5, 5, 5}};

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.println("kk= " + kk[i][j]);
            }

        }
    }
}