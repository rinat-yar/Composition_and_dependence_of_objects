package ru.netogia.BillboarManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netogia.BillboardManager;

public class BillboardManagerTest {
    @Test
    public void zeroTest(){
        BillboardManager manager = new BillboardManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindAll(){
        BillboardManager manager = new BillboardManager();

        manager.addVMovie("Film I");
        manager.addVMovie("Film II");
        manager.addVMovie("Film III");

        String[] expected = { "Film I", "Film II", "Film III" };
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void testFindLast(){
        BillboardManager manager = new BillboardManager();

        manager.addVMovie("Film I");
        manager.addVMovie("Film II");
        manager.addVMovie("Film III");

        String[] expected = {"Film III", "Film II", "Film I" };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}