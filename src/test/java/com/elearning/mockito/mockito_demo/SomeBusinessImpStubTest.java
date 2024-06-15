package com.elearning.mockito.mockito_demo.business;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SomeBusinessImpStubTest {
    @Test
    public void findGreatestOfAll_Senario1(){
        DataServiceHub1 dataServiceHub1 = new DataServiceHub1();
        SomeBuisnessImp someBuisnessImp = new SomeBuisnessImp(dataServiceHub1);
        int result = someBuisnessImp.findGreatestOfAll();
        Assertions.assertEquals(17,result);
    }

    @Test
    public void findGreatestOfAll_Senario2(){
        DataServiceHub2 dataServiceHub2 = new DataServiceHub2();
        SomeBuisnessImp someBuisnessImp = new SomeBuisnessImp(dataServiceHub2);
        int result = someBuisnessImp.findGreatestOfAll();
        Assertions.assertEquals(10,result);
    }
}

class DataServiceHub1 implements DataService{
    @Override
    public int[] retrieveAll() {
        return new int[] {5,10,3,2,17};
    }
}

class DataServiceHub2 implements DataService{
    @Override
    public int[] retrieveAll() {
        return new int[] {10};
    }
}