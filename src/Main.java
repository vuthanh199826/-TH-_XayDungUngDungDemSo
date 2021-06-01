public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        while (count.getMyThread().isAlive()){
            System.out.println("thread is live");
            Thread.sleep(1000);
        }
    }
}
