// Here Robber is not allowed to rob the adjacent house and find the max value
public class robbery {
    static int[] cache;

    public static void main(String[] args) {
        int[] house = { 45, 50, 100, 20, 26, 39 };
        System.out.println(" The maximum value the robber robbed is : " + findtherobber(house, house.length - 1));
        System.out.println(" The maximum value the robber robbed1 is : " + findtherobber1(house, house.length - 1));
        System.out.println(" The maximum value the robber robbed1 is : " + findtherobber2(house, house.length - 1));

    }

    public static int findtherobber(int[] house, int n) {
        // so here is two cases: -
        // 1st he choose ith house to rob
        // 2nd not choose ith house to rob
        if (n < 2) {
            return house[n];
        }
        int maxvalue1 = house[n] + findtherobber(house, n - 2);
        int maxvalue2 = findtherobber(house, n - 1);

        return Math.max(maxvalue1, maxvalue2);
    }

    public static int findtherobber1(int[] house, int n) {
        if (n < 2) {
            return house[n];
        }
        try {
            if (cache[n] > 0) {
                return cache[n];
            }
        } catch (Exception e) {
            //System.out.println(" The exception value is : " + e);

        }
        int x = house[n] + findtherobber1(house, n - 2);
        int y = findtherobber1(house, n - 1);

        return Math.max(x, y);
    }
    public static int findtherobber2(int[] house, int n){
        int [] cache1 = new int [n];
        cache1[0] = house[0];
        cache1[1] = Math.max(house[0], house[1]);
       // System.out.println("The value of cache is : " + cache1[0] + cache1[1]);
        for(int i=2; i<n;i++){
            try{
            int x = cache1[i-2] + house[i];
            int y = cache1[i-1];
            cache1[i] = Math.max(x, y);
            }catch(Exception e){

            }
        }
           return cache1[n-1] ;
    }
}
