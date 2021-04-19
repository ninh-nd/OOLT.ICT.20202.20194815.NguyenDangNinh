package hust.soict.globalict.aims.media.disc;

public class Track {
	private String title;
	private int length;
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	public Track() {
	}
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	public Track(String title) {
		this.title = title;
	}
	public Track(int length) {
		this.length = length;
	}
}
