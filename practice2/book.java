package practice2;

class Book {
    String title, author;
    double price;
    static int count = 0;

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
        count++;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java", "James", 499);
        Book b2 = new Book("Python", "Guido", 599);
        b1.display();
        b2.display();
        System.out.println("Total Books: " + Book.count);
    }
}
