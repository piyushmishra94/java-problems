public class Permutation {
   public static void main(String[] args) {
     String str = "abc";
     System.out.println(" The permutation of given string is ");
     Permute(str,0,str.length()-1);
   }
   public static void Permute(String str, int l,int r){
        if(l == r){
            System.out.println(str);
        }
        else{
            for(int i=l ; i<=r;i++){
                str = Swap(str,i,l);
                Permute(str, l+1, r);
                str = Swap(str, i, l);
            }
        }
   }
   public static String Swap(String str ,int i, int j){
  
     char ch [] = str.toCharArray();
     char temp = ch[i];
     ch[i] = ch[j];
     ch[j] = temp;
     String st = new String(ch);
     return st;
   }
   
}
