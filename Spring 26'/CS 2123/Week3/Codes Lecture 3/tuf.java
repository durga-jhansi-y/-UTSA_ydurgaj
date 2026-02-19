public class tuf 
{
    public static void main(String[] args) 
    {
        stack s = new stack();
        s.pu(2);
        s.pu(4);
        s.pu(8);
        System.out.println("Top element: " + s.t());
        System.out.println("Size (Elements in stack): " + s.size());
        System.out.println("Pop: " + s.p());
        System.out.println("Size (Elements in stack) " + s.size());
        System.out.println("Top element: " + s.t());
    }
}
class stack 
{
    int size = 10;
    int arr[] = new int[size];
    int t = -1;
    void pu(int x) 
    {
        t++;
        arr[t] = x;
    }
    int p() 
    {
        int x = arr[t];
        t--;
        return x;
    }
    int t() 
    {
        return arr[t];
    }
    int size() 
    {
        return t + 1;
    }
}

