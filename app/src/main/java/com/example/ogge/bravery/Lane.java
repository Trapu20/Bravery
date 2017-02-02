package com.example.pupil.bravery;

import java.util.Random;

/**
 * Created by pupil on 1/6/17.
 */
public class Lane {
    public int CreateRandomLane(){
        int rndLane = 0 + (int)(Math.random() * 4);
        //0 = Top, 1 = Jungle, 2 = Mid, 3 = ADC, 4 = Support
        return rndLane;
    }
}
