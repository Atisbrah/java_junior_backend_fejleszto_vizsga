import java.util.ArrayList;
import java.util.List;

public class konyvtar implements IkonyevkSzama{

    private List<konyv> konyvek = new ArrayList<>();

    @Override
    public int ISBNperDarab(String ISBNSzam) {
        konyv keresettKonyv;
        int count = 0;
        for (konyv konyv : konyvek) {
            if (konyv.getISBN().equals(ISBNSzam)) {
                ++count;
            }
        }
        return count;
    }

    public void konyvHozzaAd(konyv konyv) {
        konyvek.add(konyv);
    }

    public List<konyv> getKonyvek() {
        return konyvek;
    }
}
