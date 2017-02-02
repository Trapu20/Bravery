package com.example.pupil.bravery;

/**
 * Created by pupil on 1/6/17.
 */
public class ItemList {
    public int Counter = 0;
    private Item _head = null;
    private Item _currentElement;
    private Item _newElement;


    public void Add(String value, int pos, String pfad, int Preis) throws Exception {
        _currentElement = _head;
        _newElement = new Item(value,pfad,Preis);
        if (pos > getSize() || pos < 0)
            throw new Exception("Out of Range");

        if (pos == 0)           //Dieses IF beinhaltet die Push-Funktion
            if (_head == null) {
                _head = new Item(value, pfad,Preis);
                Counter++;
            }
            else {
                _newElement = new Item(value, pfad,Preis);
                _newElement._nextItem = _head;
                _head = _newElement;
            }
        else {
            int i = 1;
            while (i != pos) {
                _currentElement = _currentElement._nextItem;
                i++;
            }
            _newElement._nextItem = _currentElement._nextItem;
            _currentElement._nextItem = _newElement;
            Counter++;
        }
    }

    public String Itemauswahl(int rnd) {
        int i = 0;
        _currentElement = _head;
        while (i < rnd) {
            _currentElement = _currentElement._nextItem;
            i++;
        }
        return _currentElement.get_name();
    }

    public String ItemPfadAuswahl(int rnd) {
        int i = 0;
        _currentElement = _head;
        while (i < rnd) {
            _currentElement = _currentElement._nextItem;
            i++;
        }
        return _currentElement.get_pfad();
    }

    public int ItemPreis(int rnd) {
        int i = 0;
        _currentElement = _head;
        while (i < rnd)
        {
            _currentElement = _currentElement._nextItem;
            i++;
        }
        return _currentElement.get_preis() ;
    }

    public int getSize(){
        return Counter;
    }
}
