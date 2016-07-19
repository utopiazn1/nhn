package nhn.framework.hello;

import static org.junit.Assert.assertEquals;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import nhn.framework.config.DbConfig;

@ContextConfiguration(classes = DbConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class HelloTest {

    @Resource
    Hello hello;

    @Test
    public void sayHello() {
        String message = hello.sayHello("World");
        assertEquals("Hello World", message);
    }
}
