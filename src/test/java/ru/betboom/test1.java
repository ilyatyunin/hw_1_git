package ru.betboom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class test1 {
    @Test
    void exampleTest0() {
        Assertions.assertTrue(new Random().nextInt() >= 1);
    }

    @Test
        void exampleTest1() {
            Assertions.assertTrue(3 > 2);

    }
}
