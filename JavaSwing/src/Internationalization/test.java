package Internationalization;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        int lang;
        Scanner inp = new Scanner(System.in);
        ResourceBundle bundle;
        do {
            System.out.println("1. English");
            System.out.println("2. Vietnamese");
            System.out.println("3. Exit program");
            System.out.print("Please choose your language: ");
            lang = inp.nextInt();
            switch (lang) {
                case 1:
                    bundle = ResourceBundle.getBundle("internationalization.MessageBundle", Locale.US);
                    System.out.println("Message in " + Locale.US
                            + ": " + bundle.getString("greeting"));
                    break;
                case 2:
                    //changing the default locale to Vietnamese
                    Locale.setDefault(new Locale("vi", "VN"));
                    bundle = ResourceBundle.getBundle("internationalization.MessageBundle");
                    System.out.println("Message in " + Locale.getDefault()
                            + ": " + bundle.getString("greeting"));
                    break;
            }
        } while (lang != 3);
    }
}
