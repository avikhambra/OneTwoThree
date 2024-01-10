package OTT;

public class Two implements Runnable{
    private CommonResorce cs;

    public Two(CommonResorce cs) {
        this.cs = cs;
    }

    @Override
    public void run() {

        try {

            while(true){
                cs.print_two();
                Thread.sleep(2000);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
