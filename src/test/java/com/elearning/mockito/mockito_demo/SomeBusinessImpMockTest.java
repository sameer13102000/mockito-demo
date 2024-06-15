import com.elearning.mockito.mockito_demo.business.DataService;
import com.elearning.mockito.mockito_demo.business.SomeBuisnessImp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessImpMockTest {
    @Mock
    private DataService dataService;

    @InjectMocks
    SomeBuisnessImp someBuisnessImp;

    @Test
    public void findGreatestOfAll_Senario1(){
        //DataService dataService = mock(DataService.class); // might be a class or interface, here we have data layer interface so using the interface
        when(dataService.retrieveAll()).thenReturn(new int[] {5,10,3,2,17});
        //SomeBuisnessImp someBuisnessImp = new SomeBuisnessImp(dataService);
        int result = someBuisnessImp.findGreatestOfAll();
        Assertions.assertEquals(17,result);
    }

    @Test
    public void findGreatestOfAll_Senario2(){
        //DataService dataService = mock(DataService.class); // might be a class or interface, here we have data layer interface so using the interface
        when(dataService.retrieveAll()).thenReturn(new int[] {78});
        //SomeBuisnessImp someBuisnessImp = new SomeBuisnessImp(dataService);
        int result = someBuisnessImp.findGreatestOfAll();
        Assertions.assertEquals(78,result);
    }

    @Test
    public void findGreatestOfAll_Senario3(){
        //DataService dataService = mock(DataService.class); // might be a class or interface, here we have data layer interface so using the interface
        when(dataService.retrieveAll()).thenReturn(new int[] {});
        //SomeBuisnessImp someBuisnessImp = new SomeBuisnessImp(dataService);
        int result = someBuisnessImp.findGreatestOfAll();
        Assertions.assertEquals(Integer.MIN_VALUE,result);
    }
}

