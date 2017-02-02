package com.example.pupil.bravery;

/**
 * Created by pupil on 1/6/17.
 */
public class Item {
    public Item _nextItem;
    private String _name;
    private String _pfad;
    private int _preis;
    public Item(String itemname,String pfad,int preis) {
        _name = itemname;
        _pfad = pfad;
        _preis = preis;
    }

    public String get_name() {
        return _name;
    }

    public String get_pfad() {
        return _pfad;
    }

    public int get_preis() {
        return _preis;
    }
}
