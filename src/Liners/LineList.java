package Liners;

import java.util.ArrayList;

public class LineList {
	private ArrayList<Liner> llist;
	public LineList() {
		llist =new ArrayList<Liner>();
		llist.add(new Liner("ž"));
		llist.add(new Liner("����"));
		llist.add(new Liner("�̵�"));
		llist.add(new Liner("����"));
		llist.add(new Liner("����"));
	}
	public  ArrayList<Liner> getlinelist() {
		return llist;
	}
}
