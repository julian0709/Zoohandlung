/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoohandlung;

/**
 *
 * @author j.roder
 */
public class Ente extends Tier implements Laufen,Fliegen,Schwimmen{
    int AnzahlBeine = 0;
    int SchwimmGeschwindigkeit = 0;
    @Override
    public int getAnzahlBeine(){
        return AnzahlBeine;
    }
    @Override
    public void setAnzahlBeine(int Anzahl){
        if(Anzahl > 0){
            AnzahlBeine = Anzahl;
        }
    }
    @Override
    public void laufe(){
        System.out.println("Ich laufe los");
    }
    @Override
    public void fliegelos(){
        System.out.println("Ich fliege los");
    }
    @Override
    public void lande(){
        System.out.println("Ich lande");
    }
    
    public void schwimmlos(){
        System.out.println("Ich schwimme los");
    }
    
    public void schwimmstop(){
        System.out.println("Ich höre auf zu schwimmen");
    }
    public int getSchwimmGeschwindigkeit(){
        return SchwimmGeschwindigkeit;
    }
    public void setSchwimmGeschwindigkeit(int Geschwindigkeit){
        SchwimmGeschwindigkeit=Geschwindigkeit;
    }
}
