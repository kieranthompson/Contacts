package com.example.kieran.contacts;

/**
 * Created by kieran on 13/11/16.
 */

public class Contact {

    private int _id;
    private String _contactname;

    public Contact(){

    }

    public Contact(String _contactname){
        this._contactname = _contactname;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_contactname() {
        return _contactname;
    }

    public void set_contactname(String _contactname) {
        this._contactname = _contactname;
    }
}
