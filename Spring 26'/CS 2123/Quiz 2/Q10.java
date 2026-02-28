public class Q10 {
    static void tH(int n , char from, char t0, char aux){
        if(n==0){
            System.out.println("N: "+n+"from rod"+from+"to rod"+t0);
            return;
        }
        tH(n-1, from, aux, t0);
        System.out.println("N: "+n+"from rod"+from+"to rod"+t0);
        tH(n-1, aux, t0, from);

    }
    public static void main(String[] args){
        int n = 2;
        tH(n, 'A', 'C', 'B');
    }
    
}
