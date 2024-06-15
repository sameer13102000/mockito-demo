package com.elearning.mockito.mockito_demo.business;

public class SomeBuisnessImp {
    private DataService dataService;

    public SomeBuisnessImp(DataService dataService){
        this.dataService = dataService;
    }

    public int findGreatestOfAll(){
        int[] numbers = dataService.retrieveAll();
        int greatestValue = Integer.MIN_VALUE;
        for(int value : numbers){
            if(value > greatestValue)
                greatestValue = value;
        }
        return greatestValue;
    }

}
