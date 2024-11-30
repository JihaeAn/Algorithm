import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int [] list = new int[count];

        for (int i = 0; i < count; i++) {
            list[i] = sc.nextInt();
        }
        
        int find = sc.nextInt();
        
        int result = 0;
        for(int j = 0; j < list.length; j++) {
            if( list[j] == find) {
                result += 1;
            }
        }
        System.out.println(result);
    }
}
