package ru.netogia.BillboarManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netogia.BillboardManager;

public class BillboardManagerTest {
    @Test
    public void zeroTest() {
        BillboardManager manager = new BillboardManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindAll() {
        BillboardManager manager = new BillboardManager();

        manager.addVMovie("Film I");
        manager.addVMovie("Film II");
        manager.addVMovie("Film III");

        String[] expected = {"Film I", "Film II", "Film III"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindAll7() {
        BillboardManager manager = new BillboardManager();

        manager.addVMovie("Film 1");
        manager.addVMovie("Film 2");
        manager.addVMovie("Film 3");
        manager.addVMovie("Film 4");
        manager.addVMovie("Film 5");
        manager.addVMovie("Film 6");
        manager.addVMovie("Film 7");

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast() {
        BillboardManager manager = new BillboardManager();

        manager.addVMovie("Film I");
        manager.addVMovie("Film II");
        manager.addVMovie("Film III");

        String[] expected = {"Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast5() {
        BillboardManager manager = new BillboardManager();

        manager.addVMovie("Film 1");
        manager.addVMovie("Film 2");
        manager.addVMovie("Film 3");
        manager.addVMovie("Film 4");
        manager.addVMovie("Film 5");

        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}