package hust.soict.globalict.aims;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.media.book.Book;
import hust.soict.globalict.aims.media.disc.CompactDisc;
import hust.soict.globalict.aims.media.disc.DigitalVideoDisc;
import hust.soict.globalict.aims.media.disc.Track;
import hust.soict.globalict.aims.order.Order;
import hust.soict.globalict.aims.threads.MemoryDaemon;
import java.util.*;

public class Aims {

	public static void main(String[] args) {
		MemoryDaemon mem = new MemoryDaemon();
		Thread newThread = new Thread(mem);
		mem.start(newThread);
		Order newOrder = new Order();
		while (true) {
			showMenu();
			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();
			switch(choice) {
			case 0:
			{
				System.exit(0);
			}
			case 1:
			{
				newOrder = new Order();
				System.out.println("New order has been created");
				break;
			}
			case 2:
			{
				System.out.println("Select 1. DVD or 2. Book or 3. CD");
				Scanner sc = new Scanner(System.in);
				int type = sc.nextInt();
					switch(type) {
					case 1: {
						sc.nextLine();
						System.out.print("DVD's name: ");
						String name = sc.nextLine();
						System.out.print("DVD's category: ");
						String category = sc.nextLine();
						System.out.print("DVD's director: ");
						String director = sc.nextLine();
						System.out.print("DVD's length: ");
						int length = sc.nextInt();
						System.out.print("DVD's cost: ");
						float cost = sc.nextFloat();
						DigitalVideoDisc dvd = new DigitalVideoDisc(name, category, director, length, cost);
						newOrder.addMedia(dvd);
						break;
					}
					case 2: {
						sc.nextLine();
						System.out.print("Book's title: ");
						String title = sc.nextLine();
						System.out.print("Book's category: ");
						String category = sc.nextLine();
						System.out.print("List of authors (comma seperated): ");
						String authorList = sc.nextLine();
						// List process
						List<String> authors = Arrays.asList(authorList.split(",[ ]*"));
						System.out.print("Book's cost");
						float cost = sc.nextFloat();
						Book book = new Book(title, category, authors, cost);
						newOrder.addMedia(book);
						break;
					}
					case 3: {
						sc.nextLine();
						System.out.print("CD's name: ");
						String name = sc.nextLine();
						System.out.print("CD's category: ");
						String category = sc.nextLine();
						System.out.print("CD's director: ");
						String director = sc.nextLine();
						System.out.print("CD's artist: ");
						String artist = sc.nextLine();
						ArrayList<Track> tracks = new ArrayList<Track>();
						while (true) {
							    System.out.println("Enter track name and length. Enter 0 to stop inputting");
								System.out.print("Enter title: ");
								String title = sc.nextLine();
								if (title == "0") break;
								System.out.print("Enter length: ");
								int length = sc.nextInt();
								Track newTrack = new Track(title, length);
								tracks.add(newTrack);
							}
						System.out.print("CD's cost: ");
						float cost = sc.nextFloat();
						CompactDisc cd = new CompactDisc(name, category, director, cost, artist, tracks);
						cd.setLength(cd.getLength());
						newOrder.addMedia(cd);
						break;
					}
					default:
						System.out.println("Please enter 1 or 2 or 3");
						break;
					}
				System.out.println("Book/DVD added successfully");
				break;
			}
			case 3:
			{
				System.out.println("Current ordered items: ");
				newOrder.printOrder();
				System.out.print("Enter an ID to remove: ");
				while (true) {
					Scanner del = new Scanner(System.in);
					int id = del.nextInt();
					if (id < 0 || id > newOrder.getItemsOrdered().size()) {
						System.out.println("Invalid ID. Please enter a valid ID to remove");
					}
					else {
						newOrder.removeMedia(id);
						System.out.println("Removed successfully");
						break;
					}
						
				}
				break;
			}
			case 4:
			{
				newOrder.printOrder(); 
				break;
			}
			default:
				System.out.println("Please choose a number between 0 and 4");
			}
		}
	}
	public static void showMenu() { 

		System.out.println("Order Management Application: "); 

		System.out.println("--------------------------------"); 

		System.out.println("1. Create new order"); 

		System.out.println("2. Add item to the order"); 

		System.out.println("3. Delete item by id"); 

		System.out.println("4. Display the items list of order"); 

		System.out.println("0. Exit"); 

		System.out.println("--------------------------------"); 

		System.out.println("Please choose a number: 0-1-2-3-4"); 
	}
}
