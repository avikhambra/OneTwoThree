import OTT.CommonResorce;
import OTT.One;
import OTT.Two;
import OTT.Three;


public class Main {
    public static void main(String[] args) {

        CommonResorce res = new CommonResorce();

        One one = new One(res);
        Thread t1 = new Thread(one);
        t1.setName("first_Thread -->");

        Two two = new Two(res);
        Thread t2 = new Thread(two);
        t2.setName("second_Thread -->");

        Three three = new Three(res);
        Thread t3 = new Thread(three);
        t3.setName("third_Thread -->");

        t1.start();
        t2.start();
        t3.start();

    }
}