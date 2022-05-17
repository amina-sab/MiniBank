package model;

import java.util.Observable;

public class Compte extends Observable{
public int value ;
public Compte (int  vi)
{
    value=vi;
}

public void deb(int v){
    value=value-v;
    this.setChanged();
    this.notifyObservers(new Integer(value));
}
public void cred(int v){
    value=value+v;
    this.setChanged();
    this.notifyObservers(new Integer(value));
}
}