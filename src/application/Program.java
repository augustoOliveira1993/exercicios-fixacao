package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Client;
import model.entities.Order;
import model.entities.OrderItem;
import model.entities.OrderStatus;
import model.entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String nameCli = sc.nextLine();
		System.out.print("Email: ");
		String emailCli = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birdDatelCli = sc.next();
		Client client = new Client(nameCli, emailCli, sdf.parse(birdDatelCli));
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus statusOder = OrderStatus.valueOf(sc.next());
		Order order = new Order(new Date(), statusOder, client);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		for (int i=1; i <=n; i++) {
			System.out.printf("Enter #%d item data:\n", i);
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productprice = sc.nextDouble();
	
			Product product = new Product(productName, productprice);
			
			System.out.print("Quatity: ");
			int quantity = sc.nextInt();
			
			order.addItem(new OrderItem(quantity, productprice, product));
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		sc.close();

	}

}
