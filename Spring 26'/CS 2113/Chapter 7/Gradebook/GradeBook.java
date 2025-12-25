public class GradeBook {
    private int[] grades;
    private String courseName;
    
    public GradeBook(String courseName, int[] grades){
        this.courseName = courseName;
        this.grades = grades;
    }
    
    public void setName (String courseName){
        this.courseName = courseName;
    }

    public String getName() {
        return courseName;
    }
    
    public void ProcessGrades(){
        outputGrades();

        System.out.printf("Class average is %.2f%n", getAverage());

        System.out.printf("The lowest and highest grades are %2d and %2d%n", getMin(), getMax());

        outputBarChart();

    }

    public int getMin(){
        int min = grades[0];
        for (int i = 0 ; i<grades.length ; i++){
            if(grades[0] <min){
                min = grades[i];
            }
        }
        return min;
    }

    public int getMax(){
        int max = grades[0];
        for (int i = 0 ; i <grades.length ; i++){
            if(grades[i] >max){
                max = grades[i];
            }
        }
        return max;
    }

    public double getAverage(){
        int total = 0;
        for (int i = 0 ; i<grades.length ; i++){
            total += grades[i];
        }
        return (double) total/grades.length;
    }

    public void outputBarChart(){
        int[] frequency = new int[11];
        for (int i = 0 ; i <grades.length ; i++){
            ++frequency[grades[i]/10];
        }
        System.out.println("Grade distribution:");
        for (int count = 0 ; count <frequency.length ; count++){
            if(count == 10){
                System.out.printf("%5d: ", 100);
            }else{
                System.out.printf("%02d-%02d: ", count*10, count*10+9);
            }
            for (int i = 0 ; i<frequency[count] ; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void outputGrades(){
        System.out.printf("The grades are:%n%n");
        for (int student = 0 ; student <grades.length ; student++){
            System.out.printf("Student %2d: %3d%n", student+1, grades[student]);
        }
    }
}
