package entities;

/**
 * Vienas saraso elemntas
 */
public class Entry {
    private int sum;
    private String item;

    public Entry(int sum, String item) {
        this.sum = sum;
        this.item = item;
    }

    /**
     * Elemento konvertavimas i String
     * @return String elementas
     */
    @Override
    public String toString() {
        return "Entry{" +
                "sum=" + sum +
                ", item='" + item + '\'' +
                '}';
    }

    public int getSum() {
        return sum;
    }

    public String getItem() {
        return item;
    }

     void setSum(int sum) {
        this.sum = sum;
    }
}
