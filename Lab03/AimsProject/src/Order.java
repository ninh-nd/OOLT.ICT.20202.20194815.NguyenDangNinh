import java.util.*;
public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	
	private Stack<DigitalVideoDisc> itemsOrdered = new Stack<DigitalVideoDisc>();
	private int qtyOrdered = itemsOrdered.size();
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < 10) {
			itemsOrdered.push(disc);
			qtyOrdered++;
			if (qtyOrdered != 9)
			System.out.println("The disc has been added");
			else if (qtyOrdered == 9)
			System.out.println("The disc has been added. Warning: The order is almost full");
		}
			if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
				System.out.println("The order is full");
				return;
			}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		itemsOrdered.removeElement(disc);
		qtyOrdered--;
		System.out.println("The disc has been removed");
	}
	public float totalCost() {
		float totalcost = 0.00f;
		while (itemsOrdered.size() > 0) totalcost += itemsOrdered.pop().getCost();
		return totalcost;
	}
}
