import java.util.*;

public class Main {

    public static Random rnd=new Random();

    public static List<int[]> Naplo = new ArrayList<>();

    public static void main(String[] args) {



        Map<String, Integer> Diakok = new HashMap<>();

        Diakok.put("Edina", 1);
        Diakok.put("Géza", 2);
        Diakok.put("Réka", 3);
        Diakok.put("Béla", 4);
        Diakok.put("Zita", 5);
        Diakok.put("Tamás", 6);

        int randomNumber = rnd.nextInt(100 - 1) + 1;

        int jegy = jegyGenerator(randomNumber);

        try {

        }
        catch (NullPointerException e)
        {
            System.out.println("Nincs ilyen nevű diák!");
        }
    }

    public static int randomJegyGenerator() {
        int[] nums = {1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5};
        int random = rnd.nextInt(20);
        return nums[random];
    }

    public static int jegyGenerator(int randomNumber) {
        return randomJegyGenerator();
    }

    public static double diakEvVegiErtekelese(int diakKod) {

    }
}