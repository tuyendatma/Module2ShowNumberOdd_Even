public class EvenNumber implements Runnable{
    @Override
    public void run() {
        for (int i = 2; i <=10 ; i+=2) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
