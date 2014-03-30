import java.util.HashMap;

public class HashMapUserKeyTest {

	public static void main(String[] args) {
		HashMap<Price, String> hm = new HashMap<Price, String>();
		hm.put(new Price("Banana", 20), "Banana");
		hm.put(new Price("Apple", 40), "Apple");
		hm.put(new Price("Orange", 30), "Orange");
		
		System.out.println(hm);
		
		Price key = new Price("Banana", 20);
		System.out.println("Adding duplicate key...");
		hm.put(key, "Grape");
		
		System.out.println("After adding dulicate key:");
		System.out.println(hm);
	}

}

class Price {

	private String item;
	private int price;

	public Price(String itm, int pr) {
		this.item = itm;
		this.price = pr;
	}

	public int hashCode() {
		int hashcode = 0;
		hashcode = price * 20;
		hashcode += item.hashCode();
		return hashcode;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Price) {
			Price pp = (Price) obj;
			return (pp.item.equals(this.item) && pp.price == this.price);
		} else {
			return false;
		}
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return "item: " + item + "  price: " + price;
	}
}
