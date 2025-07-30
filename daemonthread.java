class DaemonThreadExample extends Thread {
    public void run() {
        while (true) { // Infinite loop to show daemon behavior
            System.out.println("Daemon Thread running...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class daemonthread {
    public static void main(String[] args) {
        DaemonThreadExample t1 = new DaemonThreadExample();
        t1.setDaemon(true);  // Convert to Daemon thread
        t1.start();

        System.out.println("Main thread sleeping for 2 seconds...");
        try {
            Thread.sleep(2000); // Main thread sleeps for 2 seconds
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        
        System.out.println("Main thread ends, JVM stops daemon thread automatically.");
    }
}
