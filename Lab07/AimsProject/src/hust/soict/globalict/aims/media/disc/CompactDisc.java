package hust.soict.globalict.aims.media.disc;
import java.util.*;
public class CompactDisc extends Disc implements Playable {
	private String artist;
	private ArrayList<Track> tracks;
	public CompactDisc() {
	}
	public CompactDisc(String title, String category, String director, int length, float cost, String artist, ArrayList<Track> tracks) {
		super(title, category, director, length, cost);
		this.artist = artist;
		this.tracks = tracks;
	}
	public String getArtist() {
		return artist;
	}
	public void addTrack(Track track) {
		if (tracks.contains(track)) {
			System.out.println("Track is already in the list");
			return;
		}
		else 
			tracks.add(track);
	}
	public void removeTrack(Track track) {
		if (tracks.contains(track)) {
			tracks.remove(track);
			System.out.println("Track removed!");
		}
		else {
			System.out.println("Track is not in the list");
			return;
		}
	}
	public int getTotalLength() {
		int length = 0;
		for (int i=0; i< tracks.size(); i++) {
			length += tracks.get(i).getLength();
		}
		return length;
	}
	public void play() {
		System.out.println("Artists: " + this.getArtist());
		System.out.println("Number of tracks: " + tracks.size());
		for (int i=0; i< tracks.size(); i++) {
			tracks.get(i).play();
		}
	}
}
