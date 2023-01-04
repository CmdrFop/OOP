import java.util.ArrayList;

public class Warehouse {
	public boolean open;
	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public String getWarehouseName() {
		return warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	public double getProfit() {
		return profit;
	}

	public void setProfit(double profit) {
		this.profit = profit;
	}

	public void setItems(ArrayList<String> items) {
		this.items = items;
	}
	public String warehouseName;
	public double profit;
	
	ArrayList<String> items = new ArrayList<String>();
	
	public Warehouse() {
		open = false;
	}
	
	public void PrintName() {
		System.out.println("The name of the warehouse is " + warehouseName);
	}
	public void PrintProfit() {
		System.out.println(profit);
	}
	
	
	public void PrintItems() {
		for (int i = 0; i < items.size(); i = i + 1) {
			  System.out.print(items.get(i));
			}
		System.out.println("");
	}
	
	public void RemoveItem(String item) {
		int index = items.indexOf(item);
		items.remove(index);
	}
	public void addItem(String item) {
		items.add(item);
	}
	public ArrayList<String> getItems(){
		return items;
	}
	public double gettotalProfit() {
		return profit*(items.size());
	}

}
