package com.example.pupil.bravery;


/**
 * Created by pupil on 1/6/17.
 */
public class Champion{
    public Champion _nextChampion;
    private String _name;
    private String _pfad;

    public Champion(String Championname, String Pfad){
        _name = Championname;
        _pfad = Pfad;
    }

    public String get_name() {
        return _name;
    }

    public String get_pfad() {
        return _pfad;
    }
}
