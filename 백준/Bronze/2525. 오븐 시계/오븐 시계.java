import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String origin = sc.nextLine();
        int duringTime = sc.nextInt();

        String[] split = origin.split(" ");
        int H = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);

        int mok = (M + duringTime) / 60;

        if (mok >= 1) {
            if (H + mok >= 24) {
                int HH = H + mok - 24;
                System.out.println(HH + " " + (M + duringTime - (mok * 60)));
            } else {
                System.out.println((H + mok) + " " + (M + duringTime - (mok * 60)));
            }
        } else {
            System.out.println(H + " " + (M + duringTime));
        }
    }
}
