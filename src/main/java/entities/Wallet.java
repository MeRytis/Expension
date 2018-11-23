package entities;

import java.util.ArrayList;

/**
 * Finansiniu operaciju sarasas
 */
public class Wallet {
    private ArrayList<Entry> list;

    public Wallet() {
        list = new ArrayList<>();
    }

    /**
     * Islaidų/Pajamu pridejimas i sarasa
     * @param entry viena operacija
     */
    public void add(Entry entry) {
        list.add(entry);
    }

    public ArrayList<Entry> getList() {
        return list;
    }

    /**
     * Balanso skaiciavimas
     * @return balansas
     */
    public int getBalance() {
        int sum = 0;
        for (Entry entry : list) {
            sum += entry.getSum();
        }
        return sum;
    }
}
