import com.echem.Car;
import com.echem.Machine;
import com.echem.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void mainTest(){
        Machine our = new Car();
        String drive = our.drive();

        Assertions.assertEquals("car drive", drive);
    }
}
