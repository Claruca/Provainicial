

public class Factorial {
    public static void main(String[] args) {
        int fact = 5;
        int resultat = 1;
        for (int i = 1; i <=5; i++) {
            resultat = resultat *i;
        }

        System.out.println("El factorial de " +fact +" es "+ resultat);
    }
}

