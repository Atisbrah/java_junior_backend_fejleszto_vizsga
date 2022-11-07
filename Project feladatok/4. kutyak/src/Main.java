import java.io.*;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;
import java.util.*;


public class Main {

    public static List<Kutya> kutyak=new ArrayList<>();


    public static void main(String[] args) {
        kutyak = kutyakFajlBeolvasas();

        System.out.println("Gazdátlan/örökbefogadható kutyák száma: " + gazdatlanKutyakSzama());

        hianyzoIDTxtbeIrasa();
    }

    public static Set<Integer> hianyzoIDk() {
        Set<Integer> hianyzoIDk = new HashSet<>();
        for (int i = 0; i < osszesID().size(); i++) {
            for (int j = 0; j < meglevoIDk().size(); j++) {
                if (osszesID().get(i) != meglevoIDk().get(j)) {
                    hianyzoIDk.add(i);
                }
            }
        }
        return hianyzoIDk;
    }

    public static List<Integer> osszesID() {
        List<Integer> osszesID = new ArrayList<>();
        for (int i = 0; i < 407; i++) {
            osszesID.add(i);
        }
        return osszesID;
    }

    public static List<Integer> meglevoIDk() {
        List<Integer> meglevoIDk = new ArrayList<>();
        for (Kutya kutya : kutyak) {
            meglevoIDk.add(kutya.ID);
        }
        return meglevoIDk;
    }

    public static List<Kutya> kutyakFajlBeolvasas() {
        List<Kutya> kutyak = new ArrayList<>();
        String KutyakFajlEleresiUt = "C:\\java_junior_backend_fejleszto_vizsga_Lajko_Attila\\junior_java_backend_fejleszto-main\\junior_java_backend_fejleszto-main\\Forrásfájlok\\4_kutyak.csv";

        try (Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(new FileInputStream(KutyakFajlEleresiUt), StandardCharsets.ISO_8859_1)))) {

            scanner.useDelimiter(";|\\r\\n");
            scanner.nextLine();

            while (scanner.hasNext()) {
                Kutya kutya = new Kutya();
                kutya.ID = scanner.nextInt();
                kutya.KutyaNeve = scanner.next();
                kutya.Ivar = scanner.next();
                kutya.ChipSzama = scanner.next();
                kutya.Tulajdonos = scanner.next();
                kutyak.add(kutya);
            }

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        return kutyak;
    }

    public static void hianyzoIDTxtbeIrasa() {
        String hianyzoIDTxtEleresiUt = "C:\\java_junior_backend_fejleszto_vizsga_Lajko_Attila\\junior_java_backend_fejleszto-main\\junior_java_backend_fejleszto-main\\Forrásfájlok\\hianyzoIDk.txt";
        try (BufferedWriter bw  = new BufferedWriter(new FileWriter(hianyzoIDTxtEleresiUt, true))){

            Iterator<Integer> it = hianyzoIDk().iterator();
            for (int i = 0; i < hianyzoIDk().size(); i++) {
                bw.write(it.next());
                bw.newLine();
            }

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static int gazdatlanKutyakSzama() {
        int count = 0;
        for (Kutya kutya : kutyak) {
            if (kutya.Tulajdonos.equals("")) {
                ++count;
            }
        }
        return count;
    }
}