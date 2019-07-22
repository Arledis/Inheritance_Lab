import Employee.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestManager {

    Manager manager;

@Before
    public void before(){
    manager = new Manager("Paul Welsh", "ST6873D", 26700, "IT");
}

@Test
    public void hasName(){
    assertEquals("Paul Welsh", manager.getName());
}
@Test
    public void canGetNINo(){
    assertEquals("ST6873D", manager.getNINo());
}

@Test
    public void canGetSalary(){
    assertEquals(26700, manager.getSalary());
}

@Test
    public void canGetDeptName(){
    assertEquals("IT", manager.getDeptName());
}

@Test
    public void canGetBonus(){
    assertEquals(267, manager.payBonus(), 0.01);
}

//@Test
//    public void canGetRaise(){
//    manager.raisedSalary(5340.0);
//    assertEquals(32040.0, manager.raisedSalary(5340.0), 0.01);
//}

}
