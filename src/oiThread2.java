class OiThread2 extends Thread{

    public void run(){
        for (int i = 1; i <= 5; i++){
            System.out.println("Sapo número: "+ i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Hora de contar sapo.");
        OiThread2 t = new OiThread2();
        t.start();
    }
}