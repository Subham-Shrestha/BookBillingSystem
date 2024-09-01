package Models;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private List<BookOrder> bookOrders;
    private double discount;

    public Order(int id, double discount) {
        this.id = id;
        this.bookOrders = new ArrayList<>();
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public List<BookOrder> getBookOrders() {
        return bookOrders;
    }

    public void addBookOrder(BookOrder bookOrder) {
        bookOrders.add(bookOrder);
    }

    public String getBill() {
        double total = 0;
        for (BookOrder bookOrder : bookOrders) {
            int qty = bookOrder.getQuantity();
            double price = bookOrder.getBook().getPrice();
            double amount = qty * price;
            total += amount;
        }

        total -= total * discount / 100;

        String billMessage = "Order ID: " + this.id + "\n" + "Total: " + total;
        return billMessage;
    }
}