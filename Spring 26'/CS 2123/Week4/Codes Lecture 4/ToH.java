public class ToH 
{
    static void towerOfHanoi(int n, char from_rod, char to_rod, char helper_rod)
    {
        if (n == 1)
        //The base case is when we only have one disk. That is n=1.
        {
            System.out.println("Take disk 1 from rod " +  from_rod + " to rod " + to_rod);
            return;
        }
        towerOfHanoi(n-1, from_rod, helper_rod, to_rod);
        System.out.println("Take disk " + n + " from rod " +  from_rod + " to rod " + to_rod);
        towerOfHanoi(n-1, helper_rod, to_rod, from_rod);
//These are equivalent to:
//1. Move the top n-1 disks to the auxiliary tower.
//2. Move 1 disk from source rod to destination rod.
//3. Take the n-1 disks from auxiliary disk to the destination rod.
    }
    public static void main(String args[])
    {
        int n = 3;
        towerOfHanoi(n,'A','C', 'B');
    }
}
