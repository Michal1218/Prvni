import java.util.Scanner;

public class a {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej prvni cislo");
        double a = sc.nextDouble();
        System.out.println("Zadej druhe cislo");
        double b = sc.nextDouble();
        switch (args[0]) {
            case "s":
                System.out.println(a + b);
                break;
            case "o":
                System.out.println(a - b);
                break;
            case "n":
                System.out.println(a * b);
                break;
            case "d":
                System.out.println(a / b);
                break;
            default:
                System.out.println("neplatny argument");
        }
    }
}
