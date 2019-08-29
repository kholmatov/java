import java.util.Scanner;

public class HRJavaSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String[] Sa = S.split("");
        for(int i = start; i<end; i++){
            System.out.printf("%s",Sa[i]);
        }
    }
}
