package my.nastasia.chubatova;


import my.mytest;
import my.mytest2;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        mytest.class,
        mytest2.class
})


public class TestSuiteExample {
}
