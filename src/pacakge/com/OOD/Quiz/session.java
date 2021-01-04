package pacakge.com.OOD.Quiz;

import java.util.Arrays;

public class session {

        Student[] students = new Student[2];
        public session()
        {
        }

        protected void calAvg()
        {
            for(int i=0;i<students.length;i++)
            {
                int sum=0;
                for(int j=0;j<students[i].q1.length;j++)
                {
                    sum+=students[i].q1[j].marks;
                }
                float avg=sum/15;

                System.out.println(avg);
            }
        }
        protected void quizAscend()
        {
            for(int i=0;i<students.length;i++)
            {
                Arrays.sort(students[i].q1);
            }
        }
        protected void PTstudentName()
        {
            for(int i=0;i<students.length;i++)
            {
                if(students[i].StudentType=="PartTime") {
                    System.out.println(students[i].StudentName);
                }
            }

        }
        protected void ExamScore()
        {
            for(int i=0;i<students.length;i++)
            {
                if(students[i].StudentType=="FullTime") {
                    System.out.println(students[i].examScore);
                }
            }

        }



}
