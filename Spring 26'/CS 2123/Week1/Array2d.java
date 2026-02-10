//extra arrays practice question 

public class Array2d {
    public double [] [] arrayData;
    int rows = 3;
    int cols = 4;
    
    public static void fillArray(Array2d arrayData){
        for (int i = 0 ; i <3; i++){
            for (int j = 0 ; j < 4  ; j++){
                arrayData.arrayData[i][j] = i + (double)j/10.0;
            }
        }
    }
    public static void main(String[] args){
        Array2d arrayData = new Array2d();
        arrayData.arrayData = new double [arrayData.rows][arrayData.cols];
        fillArray(arrayData);
        for (int i = 0 ; i <3; i++){
            for (int j = 0 ; j < 4  ; j++){
                System.out.print(arrayData.arrayData[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
