import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        int randomNumber;
        int varhatoHozam;
        int elvetettBuzaMennyisegeTonnaban;

        boolean exit = false;
        while(!exit) {
            System.out.println("Add meg az elvetett búza mennyiségét tonnában!");
            String bekertAdat = input.next();
            if (bekertAdat.equals("")) {
                exit = true;
            } else {
                elvetettBuzaMennyisegeTonnaban = Integer.parseInt(bekertAdat);
                randomNumber = rnd.nextInt(15 - 5) + 5;

                varhatoHozam = milyenHozamVarhato(randomNumber, elvetettBuzaMennyisegeTonnaban);
                System.out.println("A várható hozam " + varhatoHozam + " tonna.");

                String milyenEv = milyenEvVarhato(varhatoHozam, elvetettBuzaMennyisegeTonnaban);
                kiIras(milyenEv);
            }
        }
    }

    public static int milyenHozamVarhato(int idojarasiViszony, int buzaMennyiseg) {
        return idojarasiViszony * buzaMennyiseg;
    }

    public static String milyenEvVarhato(int varhatoHozam, int elvetettBuza) {
        int eredmeny = varhatoHozam / elvetettBuza;
        if (eredmeny > 12) {
            return "átlag feletti";
        }
        if (eredmeny < 9) {
            return "átlag alatti";
        }
        return "átlagos";
    }

    public static void kiIras(String milyenEvVarhato) {
        System.out.println("A hozam alapján " + milyenEvVarhato + " év várható.");
    }
}
