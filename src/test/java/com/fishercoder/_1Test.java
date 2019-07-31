package com.fishercoder;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.solutions._1;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _1Test {
    private static _1.Solution1 solution1;
    private static _1.Solution2 solution2;
    private static ListNode l1;
    private static ListNode l2;

    private static int[] expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _1.Solution1();
        solution2 = new _1.Solution2();
    }

    @Test
    public void test1() {
        int[] array = new int[] {2, 7, 11, 16};
        expected = new int[]{0, 1};
        assertArrayEquals(expected, solution1.twoSum(array, 9));
    }

    @Test
    public void test2() {
        int[] array = new int[] {2, 7, 11, 16};
        expected = new int[]{-1, -1};
        assertArrayEquals(expected, solution1.twoSum(array, 8));
    }

    @Test
    public void test3() {
        int[] array = new int[] {2, 7, 11, 16};
        expected = new int[]{0, 1};
        assertArrayEquals(expected, solution2.twoSum(array, 9));
    }

    @Test
    public void test4() {
        int[] array = new int[] {2, 7, 11, 16};
        expected = new int[]{-1, -1};
        assertArrayEquals(expected, solution2.twoSum(array, 8));
    }
}
