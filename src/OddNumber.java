public class OddNumber implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <10 ; i+=2) {
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
