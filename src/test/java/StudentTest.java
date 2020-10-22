import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {
      private Student student;

      @Before
      public void initialize(){
          student = new Student();
          assertNotNull(student);
      }

      @Test
      public void studentIdTest(){
          student.setStudentId(123456);
          assertEquals(123456L,student.getStudentId());
          student.setStudentId(123457);
          assertNotEquals(123456,student.getStudentId());
      }

      @Test
      public void  studentNameTest(){
         student.setName("Pedro");
         assertEquals("Pedro",student.getName());
         student.setName("robert");
         assertNotNull(student.getName());
         assertNotEquals("Pedro",student.getName());
      }


      @Test
      public void addGradeTest(){
          student.addGrade(90);
          assertEquals(90,(int) student.getGrades().get(0));
      }

      @Test
      public void getGradesTest(){
          ArrayList<Integer> tempGrades = new ArrayList<>(Arrays.asList(30,50,80));
          student.addGrade(30);
          student.addGrade(50);
          student.addGrade(80);
          assertEquals(3, student.getGrades().size());
          assertEquals(tempGrades, student.getGrades());
          tempGrades.add(100);
          assertNotEquals(tempGrades,student.getGrades());
      }

      @Test
      public void testAverageGrade(){
         student.addGrade(50);
         student.addGrade(50);
         assertEquals(50,student.getGradeAverage(),.5);
      }


}
