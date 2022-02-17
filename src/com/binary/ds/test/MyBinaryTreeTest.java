package com.binary.ds.test;

import com.binary.ds.MyBinaryTree;

import org.junit.Assert;
import org.junit.Test;


public class MyBinaryTreeTest {

	@Test
	public void givenThreeNumbersWhenAddedToBinaryThreeShouldReturnSizeThree() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int size = myBinaryTree.getSize();
		Assert.assertEquals(3,size);
	}
}
