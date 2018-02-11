package com.taijue.modal.list;

import java.util.ArrayList;


public class PayloadList<E, P> extends ArrayList<E> implements IPayloadList<E, P> {
	private static final long serialVersionUID = 6123130571390318538L;
	
	public P payload;
	public void setPayload(int index, P val){
		if(index > this.size()){
			this.payload = val;
		}
	}
	
	public static void main(String[] args) {
		PayloadList<String, Integer> list = new PayloadList<String, Integer>();
		list.setPayload(1, 0);
		System.out.println(list.payload);
		
		PayloadList<String, String> list2 = new PayloadList<String, String>();
		list2.setPayload(1, "null");
		System.out.println(list2.payload);
	}
}
