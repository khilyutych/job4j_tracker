package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll(){
        Item[] result = new Item[size];
        int counter = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item != null) {
                result[counter] = item;
                counter++;
            }
        }
        return Arrays.copyOf(result, counter);
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[size];
        int counter = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (key.equals(item.getName())) {
                result[counter] = item;
                counter++;
            }
        }
        return Arrays.copyOf(result, counter);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items[index] = item;
        }
        return true;
    }

    public boolean delete(int id) {
        boolean rsl = false;
        if (indexOf(id) != -1) {
            System.arraycopy(items, indexOf(id) + 1, items, indexOf(id), size - indexOf(id) - 1);
        rsl = true;
        }
        items[size - 1] = null;
        size--;
        return rsl;
    }
}