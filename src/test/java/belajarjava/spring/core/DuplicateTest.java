package belajarjava.spring.core;

import belajarjava.spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DuplicateTest {

    @Test
    void testDuplicate() {

        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateTest.class);

        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () -> {
            Foo foo = context.getBean(Foo.class);
        });
    }
}
