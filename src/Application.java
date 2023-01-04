
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Warehouse w1 = new Warehouse();
		Warehouse w2 = new Warehouse();
		
		w1.open = true;
		w1.warehouseName = "Utrecht Working Talent Warehouse";
		w1.profit = 230.00;
		
		w1.addItem("Pasta");
		w1.addItem("Pasta");
		w1.addItem("Pasta");
		w1.addItem("Pasta");
		w1.PrintItems();
		
		w1.RemoveItem("Pasta");
		w1.PrintItems();
		
		w1.PrintProfit();
		
		
	} 

}
