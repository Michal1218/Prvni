package prvni;

import java.util.Arrays;

public class Main {
    //psvm
    // ctrl + alt + L - formátování
    public static void main(String[] args) {
        int number; //deklarace
        number = 10; //inicializace
        int number2 = 5;
        System.out.print(number + "\n");
        System.out.print(number2 + "\n");
        String word = "radek";
        System.out.print(word + "\n");
        double num = 12.6;
        float a = 1.6f;
        System.out.println(num);
        System.out.println(a);
        boolean isValid = true; // true/false
        System.out.println(isValid);
        char s = 's';
        System.out.println(s);
        /*int [] array = {2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(array));
        array[2] = 8;
        System.out.println(array[2]);
        System.out.println(Arrays.toString(array));*/
        int[][] array = {{1, 2, 3,}, {4, 5, 6,}};
        System.out.println(array[1][1]);
    }
}