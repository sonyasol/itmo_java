package org.itmo.lab2;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.sum(56.1, 98.5));
        System.out.println(calc.divide(14000000, 100));
        System.out.println(calc.multiply(12, 56));
        System.out.println(calc.subtract(560, 160));

        Book book = new Book();
        Book book2 = new Book("nnn", "hjfjhfdfd", 50, 63.2, true);

        book.setAuthor("Булгаков М.");
        System.out.println(book.getAuthor());

        book2.setPages(100);
        System.out.println(book2.getPages() + " страниц");
    }
}
