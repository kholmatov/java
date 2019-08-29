import java.util.Scanner;

public class HRJavaStringReverse {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A = sc.next();
        StringBuilder input1 = new StringBuilder();
        input1.append(A);
        input1 = input1.reverse();
        if(A.contentEquals(input1))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
