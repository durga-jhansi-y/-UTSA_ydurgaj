public class GradeBook {
    private String courseName;
    private int[][] grades;

    public GradeBook (String courseName , int[][] grades){
        this.courseName = courseName;
        this.grades = grades;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public String getName(){
        return courseName;
    }

    public void processGrades(){
        outPutGrades();

        System.out.printf(" %n%s %d%n%s %d%n%n","Lowest grade is",getMinimum(),"Highest grade is",getMaximum());   

        outputBarchart();
    }

    public int getMinimum(){
        int min = grades[0][0];
        for (int[] studentGrades : grades){
            for (int grade : studentGrades){
                if(grade < min){
                    min = grade;
                }

            }
        }
        return min;
    }

    public int getMaximum(){
        int max = grades[0][0];;
        for(int[] studentGrades :grades){
            for (int grade : studentGrades){
                if(grade >max){
                    max = grade;
                }
            }
        }
        return max;
    }

    public double getAverage(int[] setGrades){
        int total = 0;
        for (int grade : setGrades){
            total+=grade;
        }
        return (double)total/setGrades.length;
    }

    public void outputBarchart(){
        int [] frequency = new int[11];
        for (int[] studentGrades : grades){
            for (int grade : studentGrades){
                ++frequency[grade/10];
            }
        }
        for (int count = 0 ; count<frequency.length  ; count++){
            if(count == 10){
                System.out.printf("%5d: ",100);
            }
            else {
                System.out.printf("%02d-%02d: ",count*10,count*10+9);
            }
        
            for(int stars= 0 ; stars < frequency[count] ; stars++){
                System.out.print("*");
            }
            
            System.out.println();
        }

    }

    public void outPutGrades(){
        System.out.printf("The grades are: %n%n");
        for (int i = 0 ; i<grades[0].length ; i++){
            System.out.printf("Test %d\t",i+1);
        }
        System.out.println("Average");

        for (int i = 0 ; i<grades.length ; i++){
            System.out.printf("Student %2d\t",i+1);
            for (int j = 0 ; j<grades[i].length ; j++){
                System.out.printf("%d\t",grades[i][j]);
            }
            System.out.printf("%.2f%n",getAverage(grades[i]));

        }


    }
}