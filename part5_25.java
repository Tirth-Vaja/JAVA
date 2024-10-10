public class part5_25 {
    public static void main(String[] args) {
        try {
            int[] o={1,2,3,};
            System.out.println(o[4]);
        } catch (Exception e) {
            System.out.println("Array index out of bound");
        }
    }
}
