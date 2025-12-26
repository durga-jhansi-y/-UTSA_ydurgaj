public class PackageDataTest {
    public static void main(String[] args){
        PackageData packageData = new PackageData();

        System.out.printf("After instantiation : %n%s%n", packageData);

        packageData.number = 77;
        packageData.string = "Goodbye";

        System.out.printf("After changing values: %n%s%n",packageData);
        
    }
}
