package externesPackage;

import zoohandlung.*;

public class ExterneMainKlasse {

    public static void main(String[] args) {
        Laufen[] tiere = new Laufen[2]; // neues Array für zwei Objekte vom Typ Laufen erstellen

        Papagei p = new Papagei("Ara", 1.3, "Hallo", 40);
        p.setAnzahlBeine(2);

        Loewe leo = new Loewe("Leo", 115);
        leo.setAnzahlBeine(4);

        tiere[0] = p; // p und leo im Array speichern
        tiere[1] = leo;

        int summe = 0; // in Summe steht am Ende die Gesamtzahl der Beine

        for (int i = 0; i < tiere.length; i++) {
            summe += tiere[i].getAnzahlBeine(); // Jetzt geht alles!
        }
        System.out.println(summe);
    }
}
