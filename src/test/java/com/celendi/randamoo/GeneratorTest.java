package com.celendi.randamoo;

import org.junit.Test;

import java.util.List;
import java.util.Set;

/**
 * Created by rado on 08-Feb-17.
 */
public class GeneratorTest {

    @Test
    public void test() {

        Generator generator = Generator.newGeneratorFor(Generator.class)
                .ignoreProps("test", "less")
                .setPropWith("id", 1);

        Set<Generator> set = generator.set().withSize(10).build();
        List<Generator> list = generator.list().size(12).build();

        generator.setPropWith("test", 2).build();
    }

}