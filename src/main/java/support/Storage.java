package support;

import entities.Entry;
import entities.Wallet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Finansiniu operacijos istorijos saugojimas
 */
class Storage {
    private static final String FILENAME = "money.txt";

    /**
     * Nuskaitymas is failo
     * @return operaciju sarasas
     */
    static Wallet load() {
        Wallet wallet = new Wallet();
        try {
            FileReader reader = new FileReader(FILENAME);
            BufferedReader buffer = new BufferedReader(reader);
            while (true) {
                String sum = buffer.readLine();
                if (sum == null) {
                    break;
                }
                String item = buffer.readLine();
                wallet.add(new Entry(Integer.parseInt(sum), item));
            }

        } catch (IOException e) {
            return wallet;
        }
        return wallet;
    }

    static boolean save(Wallet wallet) {
        try (FileWriter writer = new FileWriter(FILENAME);) {

            for (Entry entry : wallet.getList()) {
                writer.write(entry.getSum() + "\n" + entry.getItem() + "\n");
            }
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}

