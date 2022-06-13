import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void detectCapitalUseTest1() {
        CILab test_lab = new CILab();
        test_lab.setString("CapiTAl");
        assertEquals(false,test_lab.detectCapitalUse(), "should return true");

    }
    public void detectCapitalUseTest2(){
        CILab test_lab_2 = new CILab();
        test_lab_2.setString("bbbb");
        assertEquals(true,test_lab_2.detectCapitalUse(), "should return false");
    }


}
