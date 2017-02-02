package com.example.pupil.bravery;

/**
 * Created by pupil on 1/7/17.
 */
public class Ability {
    public String CreateRandomAbility() {
        String Back;
        int rndAbility =1 + (int)(Math.random() * 3);

        if (rndAbility == 1) {
            Back = "Q";
        }
        else if (rndAbility == 2) {
            Back = "W";
        }
        else if (rndAbility == 3) {
            Back = "E";
        }
        else Back = "Null";

        return Back;
    }
}