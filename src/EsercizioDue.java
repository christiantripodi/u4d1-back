import java.util.Scanner;


public class EsercizioDue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci La Prima Stringa");
        String primaStringa = scanner.nextLine();

        System.out.println("Inserisci la sconda stringa");
        String secondaStringa = scanner.nextLine();

        System.out.println(primaStringa + secondaStringa);
        scanner.close();
    }
}
