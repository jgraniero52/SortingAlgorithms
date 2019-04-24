package main;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

import Algorithms.BubbleSort;
import Algorithms.InsertionSort;
import Algorithms.MergeSort;
import Algorithms.QuickSort;
import Algorithms.SelectionSort;
import Trees.BinaryTree;
import Trees.Node;

public class Main {

	public static void main(String[] args) {		
		Random rand = new Random();
		int[] randomArray = new int[15];
		
		for(int i = 0; i < randomArray.length; i ++) {
			randomArray[i] = rand.nextInt(50);
		}
		System.out.println("Original Array: " + Arrays.toString(randomArray));
		
//		SelectionSort selectionSort = new SelectionSort();
//		System.out.println();
//		System.out.println("SelectionSort of Array: " + Arrays.toString(selectionSort.sort(randomArray)));
//		
//		BubbleSort bubbleSort = new BubbleSort();
//		System.out.println();
//		System.out.println("BubbleSort of Array: " + Arrays.toString(bubbleSort.sort(randomArray)));
//		System.out.println("Recursive BubbleSort of Array: " + Arrays.toString(bubbleSort.recursiveSort(randomArray, randomArray.length)));
//	
//		InsertionSort insertionSort = new InsertionSort();
//		System.out.println();
//		System.out.println("InsertionSort of Array: " + Arrays.toString(insertionSort.sort(randomArray)));
//		System.out.println("Recursive InsertionSort of Array: " + Arrays.toString(insertionSort.recursiveSort(randomArray, 1)));

//		BinaryTree binaryTree = new BinaryTree();
//		int arr[] = { 4, 5, 10, 15, 7}; 
//		Node root = binaryTree.insertLevelOrder(arr, null, 0);
//		binaryTree.printTree(root);
		
//		MergeSort mergeSort = new MergeSort();
//		System.out.println(Arrays.toString(mergeSort.mergeSort(randomArray)));
		
		QuickSort quickSort = new QuickSort();
		System.out.println(Arrays.toString(quickSort.sort(randomArray)));

	}
}