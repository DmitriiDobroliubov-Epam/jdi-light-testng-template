package org.mytests.uiobjects.example.entities;


public class Defaults {
    public static Contacts DEFAULT_CONTACTS = new Contacts().set(c-> {
        c.lastName = "Iovlev";
        c.position = "ChiefQA";
        c.number = "4321";
        c.seria = "123456";
        c.description = "JDI - awesome UI autoamtion tool";
        c.gender = "Female";
        c.religion = "Other";
        c.wheather = null;
    });
}
