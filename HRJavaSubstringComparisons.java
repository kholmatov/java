import java.util.Scanner;

public class HRJavaSubstringComparisons {

    public static String getString(String s, int k){
        String first = s.substring(0,k);
        String last = s.substring(0,k);
        for(int i = 0; i <= s.length()-k; i++){
            String str = s.substring(i, k+i);
            if(first.compareTo(str)>0){
                first = str;
            }
            if(last.compareTo(str)<0){
                last = str;
            }
        }
        return first+"\n"+last;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int k = in.nextInt();
        System.out.println(getString(S, k));
    }
}
