// class sixth{
//     public static void main(String args[]){
//         Scanner tier = new Scanner(System.in);
//         String a="Tirth";
//         System.out.println();
//     }
// }
public class sixth {
    public String frontthreeTimes(String str, int n) {
        int frontLength = Math.min(3, str.length());
        String front = str.substring(0, frontLength);
        String result = "";
        for (int i = 0; i < n; i++) {
            result += front;
        }
        return result;
    }

    public static void main(String[] args) {
        sixth ft = new sixth();
        System.out.println(ft.frontthreeTimes("Chocolate", 2)); 
        System.out.println(ft.frontthreeTimes("Chocolate", 3)); 
        System.out.println(ft.frontthreeTimes("Abc", 3));       
    }
}