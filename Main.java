import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Order order = Order.getInstance();
        Item book = Item.getInstance("book", 1, BigDecimal.valueOf(12.49));
        Item chocolate = Item.getInstance("chocolate bar", 1, BigDecimal.valueOf(0.85));
        Item cd = Item.getInstance("music CD", 1, BigDecimal.valueOf(14.99));
        order.addItem(book);
        order.addItem(chocolate);
        order.addItem(cd);
    }
}
