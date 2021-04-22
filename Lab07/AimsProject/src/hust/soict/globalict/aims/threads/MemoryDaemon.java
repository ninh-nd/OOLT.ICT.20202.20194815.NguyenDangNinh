package hust.soict.globalict.aims.threads;

public class MemoryDaemon implements java.lang.Runnable {
	long memoryUsed = 0;
	public MemoryDaemon() {
	}
	@Override
	public void run() {
		Runtime rt = Runtime.getRuntime();
		long used;
		while (true) {
			used = rt.totalMemory() - rt.freeMemory();
			if (used != memoryUsed) {
				System.out.println("\tMemory used = " + used);
				memoryUsed = used;
			}
		}
	}
	public static void start(Thread thread) {
		thread.setDaemon(true);
		thread.start();
	}
}
