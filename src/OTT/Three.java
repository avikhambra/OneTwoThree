package OTT;

public class Three implements Runnable {
    private CommonResorce cs;

    public Three(CommonResorce cs) {
        this.cs = cs;
    }

    @Override
    public void run() {

        while(true) {

            try {

                cs.print_three();
                Thread.sleep(2000);

            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }

    }
}
