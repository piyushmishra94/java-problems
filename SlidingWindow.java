public class SlidingWindow {
    public static int [] slide;
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int winsize =4;
        Sliding(arr,arr.length-1,winsize);
    }
    public static void Sliding(int [] arr , int n, int win){
        System.out.println("The value of win is : " + n);
        if(n < win){
            System.out.println("The value of window is less than the array size");
        }
        else{
            System.out.println("The value of win is : " + win);
            //int k=0;
            for(int i=0;i<win;i++){
                slide[i] = 0;
              
            }
            // for(int i=0;i<win;i++){
            //     slide[k] = slide[k] + arr[i];
            //   k++;       
            // }
        }
        //     // for(int i= win+1;i<n;i++){
        //     //     slide[k++] = slide[k] + arr[i]-arr[i-win];
        //     // }
        //     // for(int i=0;i<slide.length;i++){
        //     //     System.out.println(slide[i]);
        //     // }
        // }
    }
    
}
