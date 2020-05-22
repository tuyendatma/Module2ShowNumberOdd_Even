public class Main {
    public static void main(String[] args) {
        OddNumber odd = new OddNumber();
        Thread oddThread = new Thread(odd);

        EvenNumber even = new EvenNumber();
        Thread evenThread = new Thread(even);
        oddThread.start();
        try {
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        evenThread.start();
    }
}
