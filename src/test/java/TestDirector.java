import Employee.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDirector {
    Director director;

    @Before
    public void before(){
        director = new Director("Johan Martinez","GW0005D",67000,"HR", 150000);
    }

    @Test
    public void hasName(){
        assertEquals("Johan Martinez", director.getName());
    }
    @Test
    public void canGetNINo(){
        assertEquals("GW0005D", director.getNINo());
    }

    @Test
    public void canGetSalary(){
        assertEquals(67000, director.getSalary());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("HR", director.getDeptName());
    }

    @Test
    public void canGetBonus(){
        assertEquals(670, director.payBonus(), 0.01);
    }

    @Test
    public void canGetBudget(){
        assertEquals(150000, director.getBudget());
    }



}
