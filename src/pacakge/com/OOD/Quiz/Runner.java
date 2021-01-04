package pacakge.com.OOD.Quiz;

public class Runner {
    public static void main(String[] args)
    {
        session session=new session();
        session.students[0] = new FullTimeStudent(90,new int[]{2,5},"FullTime",100,"slut");
        session.students[1]=new PartTimeStudent(80,new int[]{7,8},"PartTime","akanskha slut");
        session.PTstudentName();
        session.ExamScore();
    }





}
