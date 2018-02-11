package com.taijue.modal.node;

import java.util.Arrays;
import java.util.Random;


public class Node<T,S> implements Comparable<Node<T,S>>{
	public long seqno;
	public T target;
	public S data;

	@Override
	public int compareTo(Node<T, S> o) {
		long v = this.seqno - o.seqno;
		return v == 0 ? 0 : ( v > 0 ? 1 : -1 );
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Random random = new Random();
		
		int size = 15; int l = random.nextInt(size);
		Node<String,String>[] array = new Node[size];
		Node<String,String> elem = null;
		for(int i = 0; i < size ; i++){
			Node<String,String> node = new Node<String,String>();
			node.seqno = i;
			node.target = "node_" + node.seqno;
			node.data = "node_" + node.seqno;
			array[i] = node;
			if(l == i){
				elem = node;
			}
		}
		
		System.out.println(elem + "-->" + Arrays.asList(IHelper.than(array, elem)));
	}
	
	public String toString(){
		return "{" + this.seqno + "," + this.target + "}";
	}
}
