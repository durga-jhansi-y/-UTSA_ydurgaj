public class BinarySearch {

  public static void main(String[] args) {
    int[] ints = {1, 2, 4, 5, 7, 9, 11};
    System.out.println("7 is at position: " + binarySearch(ints, 7));
  }
  private static int binarySearch(int[] numbers, int numberToFind) {
    int low = 0;
    int high = numbers.length - 1;
    System.out.println("10.Array Length: " + numbers.length);
    System.out.println("11.High: " + high);

    while (low <= high){
      int middlePosition = (low + high) / 2;
      System.out.println("15.Low: " + low);
      System.out.println("16.High:"+ high);
      System.out.println("17.Middle Position: " + middlePosition);
      int middleNumber = numbers[middlePosition];
      System.out.println("19.Num at Middle: " + middleNumber);
      System.out.println("---------------------------");

      if (numberToFind == middleNumber){
        return middlePosition;
      }
      if (numberToFind < middleNumber){
        high = middlePosition - 1;
      }
      else {
        low = middlePosition + 1;
      }
    }
    return -1;
  }
}


