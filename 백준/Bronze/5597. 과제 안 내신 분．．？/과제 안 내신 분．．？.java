import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        int[] students = new int[30];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 28; i++) {
            int student = Integer.parseInt(br.readLine()) - 1;
            students[student] = student + 1;
        }
        
        for (int i = 0; i < 30; i++) {
            if (students[i] == 0) {
                System.out.println(i + 1);
            }
        }
    }
}
