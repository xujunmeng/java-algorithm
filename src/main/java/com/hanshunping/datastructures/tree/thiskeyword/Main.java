package com.hanshunping.datastructures.tree.thiskeyword;

/**
 * Created by jgsoft on 2020/5/23.
 */
public class Main {

    public static void main(String[] args) {
        Book book = new Book("java", 22);
        String info = book.getInfo();
        System.out.println(info);
    }

}
class Book{
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getInfo() {
        return "书籍 : " + this.name + ", 价格 : " + this.price;
    }
}