package pacakge.com.OOD.Quiz;

public class FullTimeStudent extends Student {

    public FullTimeStudent(int RollNo, int[] quiz, String StudentType,int examScore,String StudentName) {
        super(RollNo, quiz, StudentType,StudentName);
        this.examScore=examScore;
    }
}
