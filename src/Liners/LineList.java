package Liners;

import java.util.ArrayList;

public class LineList {
	private ArrayList<Liner> llist;
	public LineList() {
		llist =new ArrayList<Liner>();
		llist.add(new Liner("탑"));
		llist.add(new Liner("정글"));
		llist.add(new Liner("미드"));
		llist.add(new Liner("원딜"));
		llist.add(new Liner("도구"));
	}
	public  ArrayList<Liner> getlinelist() {
		return llist;
	}
}
