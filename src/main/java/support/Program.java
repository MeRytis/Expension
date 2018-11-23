package support;

import entities.Entry;
import entities.Wallet;

import java.util.ArrayList;

/**
 * Programos valdymas
 */
public class Program {
    public void start() {
        Dialog dialog = new Dialog();
        Wallet wallet = Storage.load();
        dialog.showMessage("Sveiki!");
        while (true) {
            switch (dialog.showMenu()) {
                case "1": // Registruoti pajamas
                    wallet.add(new Entry(Integer.parseInt(dialog.showMessageWithReturn("Iveskite suma: ")), dialog.showMessageWithReturn("Nurodyite pajamu saltini: ")), false);
                    dialog.showMessage("Pajamos uzregistruotos");
                    break;
                case "2": // Registruoti islaidas
                    wallet.add(new Entry(Integer.parseInt(dialog.showMessageWithReturn("Iveskite suma: ")), dialog.showMessageWithReturn("Nurodyite islaidų priezasti: ")), true);
                    dialog.showMessage("Islaidos uzregistruotos");
                    break;
                case "3": // Saraso atvaizdavimas
                    dialog.showList(wallet.getList());
                    break;
                case "4": // Balanso apskaiciavimas
                    dialog.showMessage("Balansas: " + getBalance(wallet.getList()));
                    break;
                case "0": // Issaugojimas ir uzdarymas
                    if (Storage.save(wallet)) {
                        dialog.showMessage("Duomenys issaugoti, darbas baigtas!");
                        return;
                    } else {
                        dialog.showMessage("Issaugoti nepavyko!\nBandykite dar karta.");
                        break;
                    }
                default: // Klaida
                    dialog.showMessage("Iveskite teisinga menu pasirinkima: nuo 0 iki 3");
                    break;
            }
        }

    }

    /**
     * Balanso skaiciavimas
     * @param list Operaciju sarasas
     * @return balansas
     */
    private int getBalance(ArrayList<Entry> list) {
        int sum = 0;
        for (Entry entry : list) {
            sum += entry.getSum();
        }
        return sum;
    }
}
