import java.util.*;

public class Longestsub {
    // Longest substring without repeating string
    public static void main(String[] args) {
        String s = "pwwkew";
        int n =  Longestsubstr(s);
        System.out.println("The Longest common substring is : " + n);
        System.out.println(" By sliding window approach : " + Longest1(s));
    }

    public static int Longest1(String s){
        int count =0;
        Set<Character> set = new HashSet<>();
        int left =0;
        for(int right =0; right<s.length();right++){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                count = Math.max(count, right-left+1);
            }
            else{
                while(s.charAt(left) != s.charAt(right)){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));
                left++;
                set.add(s.charAt(right));
            }
        }
        System.out.println("The value at set is : " + set);

        return count;

    }

    public static int Longest(String s){
        Set<Character>set=new HashSet<>();
        int maxLength=0;
        int left=0;
        for(int right=0;right<s.length();right++){
           
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                maxLength=Math.max(maxLength,right-left+1);
                
            }else{
                while(s.charAt(left)!=s.charAt(right)){
                    set.remove(s.charAt(left));
                    left++;
                     
                }
                set.remove(s.charAt(left));
                left++;
                set.add(s.charAt(right));
            }
            
        }
        return maxLength;
    }
    public static int Longestsubstr(String s){
        Set<Character> set = new HashSet<>();
        int count =0;
        for(int i=0 ; i< s.length();i++){
            int count1 =0;
            set.removeAll(set);
            for(int j=i;j<s.length();j++){
                if(set.contains(s.charAt(j))){
                    count1 = 0;
                    set.removeAll(set);
                    set.add(s.charAt(j));
                    count1++;
                    
                }
                else{
                    count1++;
                    set.add(s.charAt(j));
                }
                count = Math.max(count, count1);
            }
            
        }
        return count;
    }
}
