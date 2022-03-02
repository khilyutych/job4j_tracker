package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book0 = new Book("one", 15);
        Book book1 = new Book("two", 16);
        Book book2 = new Book("three", 17);
        Book book3 = new Book("Clean code", 18);
        Book[] prods = new Book[4];
        prods[0] = book0;
        prods[1] = book1;
        prods[2] = book2;
        prods[3] = book3;
        for (int index = 0; index < prods.length; index++) {
            Book pr = prods[index];
            System.out.println(pr.getName() + " - " + pr.getCount());
        }
        System.out.println("Replace book0 to book3.");
        Book temp = prods[0];
        prods[0] = prods[3];
        prods[3] = temp;
        for (int index = 0; index < prods.length; index++) {
            Book pr = prods[index];
            System.out.println(pr.getName() + " - " + pr.getCount());
        }
        System.out.println("if name is \"Clean code\".");
        for (int index = 0; index < prods.length; index++) {
            Book pr = prods[index];
            if (pr.getName().equals("Clean code")) {
                System.out.println(pr.getName() + " - " + pr.getCount());
            }
        }
    }
}
