import java.util.Scanner;

	public class Multiplication {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dimension: ");
	
        int sizeofx= sc.nextInt();

        int sizeofy = sc.nextInt();

	int x;

        int y;

        int product;

        for (x = 1; x <= sizeofx; x++) {

            for (y = 1; y <= sizeofy; y++) {

               product = x * y;

                System.out.printf("%10d", product);
            }
            System.out.println();
        }
    }
}