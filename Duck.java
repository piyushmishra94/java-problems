public class Duck {
     public  Duck(){
        System.out.println(" Let override it");
    }
    public static void main(String[] args) {
         swim(0, 0);
        }    
        public static void swim(int a , int b){
            System.out.println(" The value is over load");

        }
        public static void display(){

        }
    }
    class  childduck extends Duck{
            Duck d1 = new Duck();
            //d1.swim(7,8);
    }
    
