package my;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import java.lang.Thread;

public class mytest2 {

    @Test
    public void foo2() {
        if (1==1){
            try
            {
                Thread.sleep(3);
            }
            catch(InterruptedException e)
            {
                // this part is executed when an exception (in this example InterruptedException) occurs
            }
            Assert.fail("fail message");

        }
        else {
            System.out.println(System.currentTimeMillis());
            try
            {
                Thread.sleep(4);
            }
            catch(InterruptedException e)
            {
                // this part is executed when an exception (in this example InterruptedException) occurs
            }
            Assert.fail("fail message");
        };

    };


}

