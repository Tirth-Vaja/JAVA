import java.util.*;

public class two{
    public static void sort(ArrayList<Integer> arr){
        Collections.sort(arr);
    }
    public static void main(String[] args){
        ArrayList<Integer> arr= new ArrayList<Integer>();
        for(int i =0; i < 5; ++i){
            arr.add(i);
        }
        sort(arr);
        for(int i=0; i < arr.size(); ++i){
            System.out.println(arr.get(i));
        }
    }
}
