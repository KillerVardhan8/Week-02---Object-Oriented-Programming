import java.time.LocalDate;
import java.util.*;

class Order{
    private int orderId;
    private LocalDate orderDate;

    public Order(int orderId, LocalDate orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public void getOrderStatus(){
        System.out.println("Order Details :");
        System.out.println("Order ID : "+orderId);
        System.out.println("Order Date : "+orderDate);
    }
}

class ShippedOrder extends Order{
    private String trackingNumber;

    public ShippedOrder(int orderId, LocalDate orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public void getOrderStatus() {
        System.out.println("Shipped Order Details :");
        super.getOrderStatus();
        System.out.println("Tracking Number : "+trackingNumber);
    }
}

class DeliveredOrder extends Order{
    private LocalDate deliveryDate;

    public DeliveredOrder(int orderId, LocalDate orderDate, LocalDate deliveryDate) {
        super(orderId, orderDate);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public void getOrderStatus() {
        System.out.println("Delivered Order Details :");
        super.getOrderStatus();
        System.out.println("Delivery date : "+deliveryDate);
    }
}


public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        List<Order> orderList=new ArrayList<>();

        Order order1=new Order(12,LocalDate.of(2025,12,25));
        ShippedOrder shippedOrder1=new ShippedOrder(123,LocalDate.of(2024,8,16),"A123J534");
        DeliveredOrder deliveredOrder1=new DeliveredOrder(1234,LocalDate.of(2023,5,12),LocalDate.of(2024,4,29));

        orderList.add(order1);
        orderList.add(shippedOrder1);
        orderList.add(deliveredOrder1);

        for(Order order:orderList){
            order.getOrderStatus();
            System.out.println();
        }
    }
}
