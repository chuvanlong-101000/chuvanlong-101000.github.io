package KiemTra;
import java.util.Map;
import java.util.HashMap;
public class _13_Roman_to_Integer {
    public static void main(String[] args) {
        System.out.println(romanToInt("MDVIII"));
    }

    public static int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum=0;
        int len = s.length();
        for (int i = 0 ; i < len ; i++) {
            int n=map.get(s.charAt(i));
           
            if (i != len - 1 && n < map.get(s.charAt(i+1))){
                sum = sum-n;
            }else{
                sum = sum+n;
            }
        }
        return sum;
    }    
}
