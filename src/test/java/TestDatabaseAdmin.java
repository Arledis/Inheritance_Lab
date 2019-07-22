import Employee.techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDatabaseAdmin {

    DatabaseAdmin databaseAdmin;
    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Maria Scott", "ST6874D", 26700);
    }

    @Test
    public void hasName(){
        assertEquals("Maria Scott", databaseAdmin.getName());
    }
    @Test
    public void canGetNINo(){
        assertEquals("ST6874D", databaseAdmin.getNINo());
    }

    @Test
    public void canGetSalary(){
        assertEquals(26700, databaseAdmin.getSalary());
    }



    @Test
    public void canGetBonus(){
        assertEquals(267, databaseAdmin.payBonus(), 0.01);
    }
}
