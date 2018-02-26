package zoohandlung;

public class Schmetterling extends Tier implements Laufen, Fliegen {

    int AnzahlBeine = 0;

    @Override
    public int getAnzahlBeine() {
        return AnzahlBeine;
    }

    @Override
    public void setAnzahlBeine(int Beine) {
        if (Beine > 0) {
            AnzahlBeine = Beine;
        }
    }

    @Override
    public void laufe() {
        System.out.println("Ich laufe!");
    }

    @Override
    public void fliegelos() {
        System.out.println("Ich fliege los");
    }

    @Override
    public void lande() {
        System.out.println("Ich lande");
    }
}
