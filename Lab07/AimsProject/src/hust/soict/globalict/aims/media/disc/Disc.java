package hust.soict.globalict.aims.media.disc;

import hust.soict.globalict.aims.media.Media;

public class Disc extends Media {
	private int length;
	private String director;
	public int getLength() {
		return length;
	}
	public String getDirector() {
		return director;
	}
	public Disc() {
	}
	public Disc(String title, String category, String director, int length, float cost) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
	}
	public Disc(String title, String category, String director, float cost) {
		super(title, category, cost);
		this.director = director;
	}
	public Disc(String title, String category, float cost) {
		super(title, category, cost);
	}
	public Disc(float cost) {
		super(cost);
	}
	public Disc(String title) {
		super(title);
	}
	public Disc(int length) {
		super();
		this.length = length;
	}
}
