import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class CohortTest {
    private Cohort cohort;
    private ArrayList<Student> students;
    @Before
    public void createCohort(){
        cohort = new Cohort();
        students = new ArrayList<>();
        students.add(new Student(12345,"Robert"));
        students.add(new Student(12346,"Juan"));

    }

    @Test
    public void canAddStudent(){
        cohort.addStudent(students.get(0));
        assertEquals(1, cohort.getStudents().size());
        assertNotEquals(0,cohort.getStudents().size());
        cohort.addStudent(students.get(1));
        assertEquals(2, cohort.getStudents().size());
        assertNotEquals(1,cohort.getStudents().size());
        assertEquals(students.get(0),cohort.getStudents().get(0));
    }

    @Test
    public void getAllStudents(){
        assertNotNull(cohort.getStudents());
        assertFalse(cohort.getStudents().size()>0);
        canAddStudent();
        assertEquals(2,cohort.getStudents().size());
    }

    @Test
    public void getAllAverage(){

    }
}
