package hust.soict.globalict.garbage;

public class GarbageCreator {
	public static void main(String[] args) {
		//Create garbage
		NoGarbage i1 = new NoGarbage();
		NoGarbage i2 = new NoGarbage();
		i1 = null;
		i2 = null;
	}
}