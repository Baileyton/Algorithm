import java.util.Scanner;

/*

*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int row = 0; row<N; row++) {
            for(int colunm = 0; colunm<=row; colunm++){
                System.out.print("*");
            }
            for (int column = 2 * (N - row - 1); column > 0; column--) {
                System.out.print(" ");
            }
            for(int colunm = 0; colunm <= row; colunm++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = N-1; row>0; row--) {
            for(int colunm = 0; row>colunm; colunm++){
                System.out.print("*");
            }
            for (int column = 2 * (N - row); column > 0; column--) {
                System.out.print(" ");
            }
            for(int colunm = 0; row>colunm; colunm++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}