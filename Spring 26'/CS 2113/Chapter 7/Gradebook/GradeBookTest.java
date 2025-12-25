public class GradeBookTest {
    public static void main(String[] args){
        int[] gradesArray = {97, 96 , 100, 100, 98, 90, 72, 100, 100, 98, 100, 96};
        GradeBook myGradeBook = new GradeBook("CS101 Introduction to Java Programming", gradesArray);
        System.out.printf("Welcome to grade book for%n%s%n%n", myGradeBook.getName());
        myGradeBook.ProcessGrades();
    }
}
