import Models.Book;
import Models.BookOrder;
import Models.Order;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("A Silent Voice", 1500);
        Book book2 = new Book("Your Lie in April", 1800);
        Book book3 = new Book("Weathering with You", 1850);
        Book book4 = new Book("Plastic Memories", 1900);

        BookOrder bookOrder1 = new BookOrder(1, book1, 2);
        BookOrder bookOrder2 = new BookOrder(2, book2, 3);
        BookOrder bookOrder3 = new BookOrder(3, book3, 4);
        BookOrder bookOrder4 = new BookOrder(4, book4, 3);

        Order order = new Order(1, 10);
        order.addBookOrder(bookOrder1);
        order.addBookOrder(bookOrder2);
        order.addBookOrder(bookOrder3);
        order.addBookOrder(bookOrder4);

        String bill = order.getBill();
        System.out.println(bill);
    }
}