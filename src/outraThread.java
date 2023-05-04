public class outraThread extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("waltur");
        }
    }

    public static void main(String[] args) {
        outraThread t = new outraThread();
        thread2 t2 = new thread2();
        t.start();
        t2.start();

    }
}

