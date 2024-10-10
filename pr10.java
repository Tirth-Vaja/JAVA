import java.util.*;
class pr10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nm = sc.next();

        int len = nm.length();
        String lc = nm.toLowerCase();
        String uc = nm.toUpperCase();
        String rev = "";
        
        for(int i=len-1;i>=0;i--){
            // char ch = ;
            rev = rev+nm.charAt(i);
        }
        System.out.println(rev);
        System.out.println(lc);
        System.out.println(len);
        System.out.println(uc);

    }
}