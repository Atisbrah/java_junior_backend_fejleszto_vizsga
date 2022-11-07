public class konyv extends rekord{
    String Cím;
    String Szerzo;
    String Nyelv;
    int MegjelenesiDatum;

    public konyv(String ISBN, String cím, String szerzo, String nyelv, int megjelenesiDatum) {
        super(ISBN);
        Cím = cím;
        Szerzo = szerzo;
        Nyelv = nyelv;
        MegjelenesiDatum = megjelenesiDatum;
    }

    public konyv() {

    }
}
