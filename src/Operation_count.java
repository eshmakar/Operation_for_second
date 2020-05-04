public class Operation_count {

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            Thread.sleep(0);

            int count = 0;
            boolean b = true;

            long start = System.currentTimeMillis();

            while (b) {
                while (start == System.currentTimeMillis()) {
                    count++;
                }
                b = false;
            }
            System.out.println(count);

        }

    }
}
