package OTT;

public class One implements Runnable {
    private CommonResorce cs;

    public One(CommonResorce cs) {
        this.cs = cs;
    }

    @Override
    public void run() {

        try {

            while(true){
                cs.print_one();
                Thread.sleep(2000);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
