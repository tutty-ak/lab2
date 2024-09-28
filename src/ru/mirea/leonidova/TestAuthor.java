package ru.mirea.leonidova;

public class TestAuthor {
    public static void main(String[] args){
        Author a1 = new Author("Pushkin", "pushkin@mail.ru", 'M');
        System.out.println(a1);
        a1.setEmail("pushkin@yandex.ru");
        System.out.println(a1);
    }
}
