public class GradeBookTest {
    public static void main(String[] args){
        
        int[][] gradesArray={{87,96,70},{65,82,88},{73,95,70} ,{94,100,92},{83,65,85},{78,88,98},{93,79,91},{99,85,92},{85,72,69},{91,90,83}};
        GradeBook myGradeBook = new GradeBook("CS101 Introduction to Java Programming",gradesArray);
        System.out.printf("Welcome to the grade book for %n%s%n",myGradeBook.getName());
        myGradeBook.processGrades();
    }
}
