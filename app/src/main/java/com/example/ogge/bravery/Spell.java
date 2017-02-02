package com.example.pupil.bravery;

/**
 * Created by pupil on 1/6/17.
 */
public class Spell {
    public int CreateRandomSpell() {
        int rndSpell =0 + (int)(Math.random() * 8);
//0 = Flash, 1 = Teleport, 2 = Smite, 3 = Ghost, 4 = Barrier, 5 = Heal, 6 = Ignite, 7 = Exhaust, 8 = Cleanse
       return  rndSpell;
    }
}
