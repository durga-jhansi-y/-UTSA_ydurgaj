public class arrayS {
    public static void main(String[] args){
        stack s = new stack();
        s.pu(2);
        s.pu(4);
        s.pu(8);
        System.out.println("Top: "+s.t());
        System.out.println("Size: "+s.size());
        System.out.println("Popped element: "+s.p());
        System.out.println("Size:" +s.size());
        System.out.println("Top: "+s.t());

    }  
}
class stack {
        int size = 10;
        int t= 0 ;
        int arr[] = new int[size];
        void pu(int x){
            arr[t] = x;
            t++;
        }
        int p(){
            t--;
            return arr[t];
        }
        int t(){
            return arr[t-1];
        }
        int size(){
            return t;
        }
    }
