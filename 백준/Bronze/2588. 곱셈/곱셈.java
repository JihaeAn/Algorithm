import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int third = B % 10;
        int second = (B / 10) % 10;
        int first = (B / 100);

         int resultA = A * first;
        int resultB = A * second;
        int resultC = A * third;

        System.out.println(resultC);
        System.out.println(resultB);
        System.out.println(resultA);

        System.out.println((resultA * 100) + (resultB * 10) + resultC);
    }
}
