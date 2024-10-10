import java.util.*;

public class three{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text : ");
        String s = sc.nextLine();
        s = s.toLowerCase();
        StringTokenizer st = new StringTokenizer(s,".,;/()! " );
        TreeSet<String> words = new TreeSet<String>();
        while(st.hasMoreTokens()){
            words.add( st.nextToken() );
        }
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        Iterator<String> i = words.iterator();
        while(i.hasNext()){
            String word = i.next();
            int count = 0;
            st = new StringTokenizer(s,".,;/()! ");
            while(st.hasMoreTokens()){
                String swe = st.nextToken();
                if(word.equals(swe) )  count++;
            }
            map.put( word, count );
        }
        System.out.println(map);
        sc.close();
    }
}
