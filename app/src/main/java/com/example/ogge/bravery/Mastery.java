package com.example.pupil.bravery;

/**
 * Created by pupil on 1/7/17.
 */
public class Mastery {
    public int[] CreateRandomMastery(){
        int[] rndMasteries = new int[3];
        int Mastery1 = 1 + (int)(Math.random() * 18);
        int Mastery2;
        int Mastery3;
        int help;

        if (Mastery1 <= 12) {
            Mastery2 = 1 + (int) (Math.random() * 12);
        }
        else {
            Mastery2 = 1 + (int) (Math.random() * (30 - Mastery1));
        }

        Mastery3 = 30 - Mastery1 - Mastery2;

        if (Mastery3 > 18) {
            help = Mastery3 - 18;
            Mastery3 = Mastery3 - help;

            Mastery2 += help;
        }
        rndMasteries[0] = Mastery1;
        rndMasteries[1] = Mastery2;
        rndMasteries[2] = Mastery3;

        return rndMasteries;
    }
}
