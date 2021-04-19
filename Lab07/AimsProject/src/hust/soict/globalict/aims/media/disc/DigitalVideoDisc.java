package hust.soict.globalict.aims.media.disc;

import java.util.ArrayList;

public class DigitalVideoDisc extends Disc {
	private String director;
	private int length;
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, director, length, cost);
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title, category, director, cost);
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
	}
	public DigitalVideoDisc(float cost) {
		super(cost);
	}
	public DigitalVideoDisc(String title) {
		super(title);
	}
	public DigitalVideoDisc(int length) {
		super(length);
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public boolean search(String title) {
		return this.getTitle().toLowerCase().contains(title.toLowerCase());
	}
//	@Override
//	public void showDatabase() {
//		for (DigitalVideoDisc disc: database)
//			System.out.println("ID: " + disc.getId() + " - " + "Title: " + disc.getTitle() + " - " + "Category: " + disc.getCategory() + " - " + "Director: " + disc.getDirector() + " - " + "Length: " + disc.getLength() + " - " + "Cost: " + disc.getCost() + "\n");
//	}
}
 