import Employee.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDeveloper {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Duncan Welsh", "TV300SD", 33000);
    }

    @Test
    public void hasName(){
        assertEquals("Duncan Welsh", developer.getName());
    }
    @Test
    public void canGetNINo(){
        assertEquals("TV300SD", developer.getNINo());
    }

    @Test
    public void canGetSalary(){
        assertEquals(33000, developer.getSalary());
    }



    @Test
    public void canGetBonus(){
        assertEquals(330, developer.payBonus(), 0.01);
    }

//@Test
//    public void canGetRaise(){
//    manager.raisedSalary(5340.0);
//    assertEquals(32040.0, manager.raisedSalary(5340.0), 0.01);
//}


}
