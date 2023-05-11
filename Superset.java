import java.util.*;
import java.util.Set;

public class Superset {
    public static void main(String[] args) {
        String str = "abc";
        int x = FindLongestsubstring(str,0,str.length());
    }
    public static int FindLongestsubstring(String str, int l, int h){
        int max = 0;
        for(int i=l; i<h;i++){
            for(int j=i+1;j<=h;j++){
                String s = str.substring(i, j);
                int x = Findlength(s);
                max = Math.max(max, x);
            }
        }
        return max;
    }
    public static int Findlength(String str){
        Set<Character> set = new HashSet<>();
        int i = 0;
        int count = 0;
        while(i < str.length()){
            i++;
            if(set.contains(str.charAt(i))){
                count =0;
                break;
            }
            else{
                count++;
            }
        }
        return count;
    }
    
}

