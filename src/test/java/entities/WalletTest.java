package entities;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class WalletTest {

    @Test
    public void add() {
        Wallet wallet = new Wallet();
        wallet.add(new Entry(10, "Atlyginimas"));
        assertEquals(1, wallet.getList().size());
        wallet.add(new Entry(20, "Islaidos"));
        assertEquals(2, wallet.getList().size());
    }
}