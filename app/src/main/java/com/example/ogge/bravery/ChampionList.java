package com.example.pupil.bravery;


/**
 * Created by pupil on 1/6/17.
 */
public class ChampionList {
    public int Counter = 0;
    private Champion _head = null;
    private Champion _currentElement;
    private Champion _newElement;
    public void Push(String value, Champion i,String Pfad)
    {
        if (_head == null) {
            _head = new Champion(value,Pfad);
        }
        else {
            _newElement = new Champion(value,Pfad);
            _newElement._nextChampion = _head;
            _head = _newElement;
        }
        Counter++;
    }
    public void Add(String value, int pos,String Pfad) throws Exception {
        _currentElement = _head;
        _newElement = new Champion(value,Pfad);
        if (pos > GetSize() || pos < 0)
            throw new Exception("Out of range");
        if (pos == 0)
        {
            if (_head == null){
                _head = new Champion(value, Pfad);
                Counter++;
            }
            else {
                _newElement = new Champion(value, Pfad);
                _newElement._nextChampion = _head;
                _head = _newElement;
            }
        }
        else {
            int i = 1;
            while (i != pos)
            {
                _currentElement = _currentElement._nextChampion;
                i++;
            }
            _newElement._nextChampion = _currentElement._nextChampion;
            _currentElement._nextChampion = _newElement;
            Counter++;
        }
    }
    public int GetSize(){
        return Counter;
    }

    public String Championauswahl(int rnd) {
        int help = rnd;
        int i = 0;
        _currentElement = _head;
        while (i<help) {
            _currentElement = _currentElement._nextChampion;
            i++;
        }
        return _currentElement.get_name();
    }
    public String ChampionPfadAuswahl(int rnd) {
        int i = 0;
        _currentElement = _head;
        while (i < rnd)
        {
            _currentElement = _currentElement._nextChampion;
            i++;

        }
        return _currentElement.get_pfad();
    }
    public String ChampionAbility() {
        String Back;
        int ability = 0 + (int)(Math.random() * 3);
        //Random rnd = new Random();
        //int ability = rnd.Next(0, 3);
        //rnd.nextInt();

        if (ability == 0)
            Back = "Q";
        else if (ability == 1)
            Back = "W";
        else if (ability == 2)
            Back = "E";
        else Back = "null";
        return Back;
    }
}
