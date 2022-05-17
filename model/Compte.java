package model;

public class Compte{
public int value ;
public Compte (int  vi)
{
    value=vi;
}

public void deb(int v){
    value=value-v;
}
public void cred(int v){
    value=value+v;
}
}