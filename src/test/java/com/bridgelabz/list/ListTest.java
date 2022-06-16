package com.bridgelabz.list;

import org.junit.Assert;
import org.junit.Test;

public class ListTest {

        @Test
        public void SearchNodeWithValue_WhenFind_ShouldReturnTrue() {
            IList<Integer> list = new LinkedList();
            list.add(56);
            list.add(30);
            list.add(70);
            boolean result = list.search(30);
            Assert.assertTrue(result);
        }
    }

