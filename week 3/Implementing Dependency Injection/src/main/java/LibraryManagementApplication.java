package com.library;

public class LibraryManagementApplication{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.showBooks();  // Should invoke repository method
    }
}