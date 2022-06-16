package com.bridgelabz.list;

import org.junit.Assert;
import org.junit.Test;

public class ListTest {

    @Test
    public void searchNodeWithValue_WhenFind_ShouldReturnTrue() {
        IList<Integer> list = new LinkedList();
        list.add(56);
        list.add(30);
        list.add(70);
        boolean result = list.search(30);
        Assert.assertTrue(result);

    }

    @Test
    public void searchGivenNode_WhenFind_ShouldInsertDataAsNextNode() {
        LinkedList list = new LinkedList();
        list.add(56);
        list.add(30);
        list.add(70);
        list.insert(30, 40);
        int result = list.index(40);
        Assert.assertEquals(2, result);
    }

    @Test
    public void searchGivenNode_WhenFind_ShouldDeleteNode() {
        LinkedList list = new LinkedList();
        list.add(56);
        list.add(30);
        list.add(70);
        list.insert(30, 40);
        boolean result = list.remove(40);
        int size = list.size();
        Assert.assertTrue(result);
        Assert.assertEquals(size,3 );
    }
}
