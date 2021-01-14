package my;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import java.lang.Thread;

public class mytest {

    @Test
    public void foo1() {
        Thread.sleep(40000);
        if (System.currentTimeMillis()%3==1){
        }
        else {
            Assert.fail("fail message");
        };

    };
    @Test
    public void foo2() {
        if (System.currentTimeMillis()%3==1){
        }
        else {
            Assert.fail("fail message");
        };

    };
    @Test
    public void foo3() {
        if (System.currentTimeMillis()%3==1){
        }
        else {
            Assert.fail("fail message");
        };

    };

}
