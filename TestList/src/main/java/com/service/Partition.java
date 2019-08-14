package com.service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Partition {
	
	private List<Integer> list;
	private int taille;
	
	/**
	 * instancie liste et taille
	 * @param list
	 * @param taille
	 */
	public Partition(List<Integer> list, int taille) {
		this.list = list;
		this.taille = taille;
	}
	
	/**
	 * fonction divise la liste par des sous listes
	 * @return LinkedList<List<Integer>>
	 */
	public ArrayList<List<Integer>> divideList(){
		
		ArrayList<List<Integer>> listResult = new ArrayList<List<Integer>>();
		
		for(int start = 0; start < this.list.size(); start = start+this.taille) {
			
			int end = (start+this.taille < this.list.size() )? start+this.taille : this.list.size();
			
			List<Integer> listTmp = this.list.subList(start,end);
			listResult.add(listTmp);
		}
		
		return listResult;	
	}

}
