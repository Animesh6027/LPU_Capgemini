/*Q. Online Order Processing System
Each Order has:
	int orderId
	String customerName
	double orderAmount
	int itemCount
	long orderTime

Write a Java program to sort orders using Comparator based on:
	Higher orderAmount first
	If amount same → fewer itemCount first
	If itemCount same → earlier orderTime first
	If orderTime same → customerName in ascending order
	If customerName same → orderId in ascending order */

import java.util.*;
public class P1 {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(101, "Alice", 250.0, 3, 1625152800000L));
        orders.add(new Order(102, "Bob", 300.0, 2, 1625156400000L));
        orders.add(new Order(103, "Charlie", 250.0, 2,1625152800000L));
        orders.add(new Order(104, "David", 300.0, 2, 1625152800000L));

        for(Order o : orders) {
            System.out.println(o);
        }
    }
}
class Order{
    int orderId;
    String customerName;
    double orderAmount;
    int itemCount;
    long orderTime;
    
    Order(int orderId, String customerName, double orderAmount, int itemCount, long orderTime){
        super();
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderAmount = orderAmount;
        this.itemCount = itemCount;
        this.orderTime = orderTime;
    }
    public String toString() {
        return "Order [orderId=" + orderId + ", customerName=" + customerName + ", orderAmount=" + orderAmount
                + ", itemCount=" + itemCount + ", orderTime=" + orderTime + "]";
    }
}
class OrderComparator implements Comparator<Order>{
    @Override
    public int compare(Order o1, Order o2) {
        if(o1.orderAmount != o2.orderAmount) {
            return Double.compare(o2.orderAmount, o1.orderAmount); 
        }else if(o1.orderAmount == o2.orderAmount){
            return Double.compare(o1.itemCount, o2.itemCount);
        }else if(o1.itemCount == o2.itemCount) {
            return Long.compare(o1.orderTime, o2.orderTime);
        }else if(o1.orderTime == o2.orderTime) {
            int nameComp = o1.customerName.compareTo(o2.customerName);
            if(nameComp != 0) {
                return nameComp;
            }else {
                return Integer.compare(o1.orderId, o2.orderId);
            }
        }else if(o1.customerName.equals(o2.customerName)) {
            return Integer.compare(o1.orderId, o2.orderId);
        }
        return 0;
    }
}
