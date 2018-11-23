package support;

import entities.Entry;

import java.util.ArrayList;
import java.util.Scanner;

    /**
     * Pranesimų atvaizdavimas ir vartotojo duomenu nuskaitymas
     */
public class Dialog {
    private Scanner scanner;

    Dialog() {
        scanner = new Scanner(System.in);
    }

        /**
         * Menu atvaizdavimas
         * @return pasirinktas menu punktas
         */
    String showMenu() {
        showMessage("Pasirinkite viena is zemiau nurodytu punktu:\n" +
                    "1. Registruoti pajamas;\n" +
                    "2. Registruoti islaidas;\n" +
                    "3. Parodyti visus irasus;\n" +
                    "4. Apskaiciuoti balansa;\n" +
                    "0. Issaugoti duomenis ir baigti darba.\n" +
                    "Veiksmas:");
        return scanner.nextLine();
    }

    void showMessage(String message) {
        System.out.println(message);
    }
    String showMessageWithReturn(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    void showList(ArrayList<Entry> list) {
        for (Entry entry : list) {
            showMessage(entry.toString());
        }
    }
}
