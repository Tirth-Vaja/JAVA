import java.util.*;

class pr9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nm = sc.next();
        String res = "";
        for(int i=0;i<nm.length();i++){
            res = res+nm.charAt(i)+nm.charAt(i);
        }

        System.out.println(res);
    }
}
