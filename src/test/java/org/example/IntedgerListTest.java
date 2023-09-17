package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerListImplTest {

    IntegerListImplTest integerList = new IntegerListImplTest();

    @Test
    void add_success() {

        Integer item = 5;

        Integer expected = item;

        Integer actual = integerList.add(item, item);
        assertEquals(expected, actual);
    }

    private Integer add(Integer item, Integer integer) {
        return item;
    }

    @Test
    void add_withListIndexNotFoundException() {

        Integer item = 5;


        assertDoesNotThrow(() -> integerList.add(item, item));
    }

    @Test
    void testAdd_success() {

        Integer item = 5;
        int index = 0;

        Integer expected = 5;

        Integer actual = integerList.add(index, item);
        assertEquals(expected, actual);
    }

    private Integer add(int index, Integer item) {
        return item;
    }

    @Test
    void testAdd_withListIndexNotFoundException() {

        Integer item = 5;
        int index = 1;

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> integerList.add(index, item));
    }

    @Test
    void set_success() {

        Integer item = 5;
        int index = 0;


        Integer expected = 5;


        Integer actual = integerList.set(index, item);
        assertEquals(expected, actual);
    }

    private Integer set(int index, Integer item) {
        return item;
    }

    @Test
    void set_withListIndexNotFoundException() {


        Integer item = 5;
        int index = 1;

        assertDoesNotThrow(() -> integerList.set(index, item));
    }

    @Test
    void remove_withListNullException() {


        Integer item = 5;


        assertThrows(ArrayIndexOutOfBoundsException.class, () -> integerList.remove(item));
    }

    private void remove(Integer item) {
    }

    @Test
    void testRemove_withListNullException() {


        int index = 0;


        assertDoesNotThrow(() -> integerList.remove(index));
    }

    @Test
    void contains_success() {

        Integer item = 5;

        Boolean expected = false;

        Boolean actual = integerList.contains(item);
        assertEquals(expected, actual);
    }

    private Boolean contains(Integer item) {
        return null;
    }

    @Test
    void indexOf_success() {

        Integer item = 5;

        int expected = -1;

        int actual = integerList.indexOf(item);
        assertEquals(expected, actual);
    }

    private int indexOf(Integer item) {
        return 0;
    }

    @Test
    void lastIndexOf_success() {


        Integer item = 5;


        int expected = -1;


        int actual = integerList.lastIndexOf(item);
        assertEquals(expected, actual);
    }

    private int lastIndexOf(Integer item) {
        return 0;
    }

    @Test
    void get_success() {


        int index = 1;


        Integer expected = null;


        Integer actual = integerList.get(index);
        assertEquals(expected, actual);
    }

    private Integer get(int index) {
        return null;
    }

    @Test
    void get_withListIndexNotFoundException() {


        int index = 1;


        assertDoesNotThrow(() -> integerList.get(index));
    }

    @Test
    void testEquals_success() {

        IntedgerList IntegerList1 = (IntedgerList) new IntegerListImplTest();

        boolean expected = true;

        Boolean actual = integerList.equals(IntegerList1);
        assertEquals(expected, actual);
    }

    @Test
    int size() {


        int size = 0;

        int expected = size;


        int actual = integerList.size();
        assertEquals(expected, actual);
        return size;
    }

    @Test
    Boolean isEmpty() {


        boolean expected = true;

        Boolean actual = integerList.isEmpty();
        assertEquals(expected, actual);
        return actual;
    }

    @Test
    void clear() {


        int size = 0;

        int expected = size;


        integerList.clear();
        assertEquals(expected, size);
    }

    @Test
    void toArray() {


        Integer[] list = new Integer[2];


        Integer[] expected = list;

        Integer[] actual = list;
        assertEquals(expected, actual);
    }
}