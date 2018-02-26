package zoohandlung;

public class Papagei extends Tier implements Laufen, Fliegen {

    String lieblingswort;
    double spannweite;
    int anzahlBeine;

    public Papagei(String name, double gewicht, String lieblingswort, double spannweite) {
        super(name, gewicht);
        this.lieblingswort = lieblingswort;
        this.spannweite = spannweite;
    }

    public String sprich(String wort) {
        System.out.println(wort);
        return wort;
    }

    @Override
    public void laufe() {
        System.out.println("Ich laufe");
    }

    @Override
    public void setAnzahlBeine(int anzahlBeine) {
        this.anzahlBeine = anzahlBeine;
    }

    @Override
    public int getAnzahlBeine() {
        return anzahlBeine;
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
