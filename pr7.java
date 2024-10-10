import java.util.*;

class pr7{

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    String nm = sc.next();
    int n = 3;
    front(nm, n);

    }
    public static void front(String nm,int n){
        
        String ans = nm.substring(0,3);
        for(int i = 0;i<3;i++){
        System.out.print(ans);
        }
    }

}