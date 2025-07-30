class UserThreadExample extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("User Thread running: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class userthread{
    public static void main(String[] args) {
        UserThreadExample t1 = new UserThreadExample();
        t1.start();
        System.out.println("Main method ends, but JVM keeps running because user thread is active.");
    }
}
