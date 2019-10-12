import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Random;

public class Order {

  // ============================================================
  // Member Variables
  // ============================================================

  private ArrayList<OrderLine> orderLineList;
  private LocalDate orderDate;
  private int orderID;
  private final int MAX_RANDOM_ID = 99999;

  // ============================================================
  // Constructors
  // ============================================================

  public Order(LocalDate currentDate) {
    orderDate = currentDate;
    orderLineList = new ArrayList<OrderLine>();
    orderID = generateOrderID();
  }

  // ============================================================
  // Accessors
  // ============================================================

  public LocalDate getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(LocalDate orderDate) {
    this.orderDate = orderDate;
  }

  // ============================================================
  // Public Instance Methods
  // ============================================================

  // TODO Add functionality to check for existing tool orderline
  public void addOrderLine(Tool toolToOrder, int orderQuantity) {
    OrderLine orderLine = new OrderLine(toolToOrder, orderQuantity);
    orderLineList.add(orderLine);
  }

  public void printOrderLinesToConsole() {
    printSeparator();
    System.out.println("\nORDER ID:\t\t\t" + orderID + "\nDate Ordered:\t\t\t" + orderDate + "\n");

    for (OrderLine orderLine : orderLineList) {
      System.out.println("\nItem description:\t\t" + orderLine.getToolName() + "\nAmount ordered:\t\t"
          + orderLine.getOrderAmount() + "\nSupplier:\t\t" + orderLine.getToolSupplier());
    }

    printSeparator();
  }

  // ============================================================
  // Private Instance Methods
  // ============================================================

  private int generateOrderID() {
    Random r = new Random();
    int randomID = (int) (MAX_RANDOM_ID * r.nextDouble());

    return randomID;
  }

  private void printSeparator() {
    System.out.println("*".repeat(70));
  }
}