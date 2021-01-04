package pacakge.com.OOD.Quiz;

public class Student {
    Quiz[] q1=new Quiz[2];
    int RollNo;
  //  int[] quiz=new int[2];
    int examScore;
    String StudentType;
    String StudentName;

    public Student(int RollNo,int[]quiz,String StudentType,String StudentName)
    {
        this.RollNo=RollNo;
        //this.quiz=quiz;
        this.StudentType=StudentType;
        this.StudentName=StudentName;
        for(int i=0;i<2;i++)
        {
            q1[i]=new Quiz(quiz[i]);

        }

    }








}
