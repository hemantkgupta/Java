public class SimpleThreads {

	static void threadMessage(String message) {
		String threadName = Thread.currentThread().getName();
		System.out.format("%s: %s%n", threadName, message);
	}

	private static class MessageLoop implements Runnable {
		public void run() {
			String importantInfo[] = { "Mares eat oats", "Does eat oats",
					"Little lambs eat ivy", "A kid will eat ivy too" };
			try {
				for (int i = 0; i < importantInfo.length; i++) {
					Thread.sleep(4000);
					threadMessage(importantInfo[i]);
				}
			} catch (InterruptedException e) {
				threadMessage("I wasn't done!");
			}
		}
	}

	public static void main(String args[]) throws InterruptedException {


		threadMessage("Starting MessageLoop thread");
		Thread t = new Thread(new MessageLoop());
		t.start();
		threadMessage("Waiting for MessageLoop thread to finish");
		
		while (t.isAlive()) {
			threadMessage("Still waiting...");
			
			// Wait max 1 second MessageLoop thread to finish.
			t.join(1000);
			if (t.isAlive()){			
				threadMessage("Tired of waiting!");
				t.interrupt();				
				// -- wait indefinitely
				t.join();
			}
		}
		threadMessage("Finally!");
	}

}