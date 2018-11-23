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
     * @param isExpense islaidos pozymis
     */
    public void add(Entry entry, boolean isExpense) {
        if (isExpense) {
            int sum = entry.getSum();
            sum*= -1;
            entry.setSum(sum);
        }
        list.add(entry);
    }

    public ArrayList<Entry> getList() {
        return list;
    }
}
