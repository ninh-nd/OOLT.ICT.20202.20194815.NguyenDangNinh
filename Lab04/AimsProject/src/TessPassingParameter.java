
public class TessPassingParameter {

	public static void main(String[] args) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		swap(jungleDVD, cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
	}
	//Swap function for swapping two DVDs
	public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		DigitalVideoDisc tmp = new DigitalVideoDisc(dvd1.getTitle(), dvd1.getCategory(), dvd1.getDirector(), dvd1.getLength(), dvd1.getCost());
		changeTitle(dvd1, dvd2.getTitle());
		changeCategory(dvd1, dvd2.getCategory());
		changeLength(dvd1, dvd2.getLength());
		changeDirector(dvd1, dvd2.getDirector());
		changeCost(dvd1, dvd2.getCost());
		changeTitle(dvd2, tmp.getTitle());
		changeCategory(dvd2, tmp.getCategory());
		changeLength(dvd2, tmp.getLength());
		changeDirector(dvd2, tmp.getDirector());
		changeCost(dvd2, tmp.getCost());
	}
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
	public static void changeCategory(DigitalVideoDisc dvd, String category) {
		String oldCategory = dvd.getCategory();
		dvd.setCategory(category);
		dvd = new DigitalVideoDisc(oldCategory);
	}
	public static void changeDirector(DigitalVideoDisc dvd, String director) {
		String oldDirector = dvd.getDirector();
		dvd.setDirector(director);
		dvd = new DigitalVideoDisc(oldDirector);
	}
	public static void changeCost(DigitalVideoDisc dvd, float cost) {
		float oldCost = dvd.getCost();
		dvd.setCost(cost);
		dvd = new DigitalVideoDisc(oldCost);
	}
	public static void changeLength(DigitalVideoDisc dvd, int length) {
		int oldLength = dvd.getLength();
		dvd.setLength(length);
		dvd = new DigitalVideoDisc(oldLength);
	}
}

	
