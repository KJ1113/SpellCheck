package Liners;
import java.util.ArrayList;
import informClass.*;
public class Liner {
	private ArrayList<Spell> spellList;
	private int level;
	private String Line;
	private void addSpell() {
		this.spellList =new ArrayList<Spell>();
		spellList.add(new Spell());
		spellList.add(new Spell());
	}
	
	public Liner(String Line) {
		addSpell();
		this.level = 1;
		this.Line = Line;
	}

	public ArrayList<Spell> getSpellList() {
		return spellList;
	}

	public void setSpellList(ArrayList<Spell> spellList) {
		this.spellList = spellList;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}

	public String getLine() {
		return Line;
	}

	public void setLine(String line) {
		Line = line;
	}
	
	public void FirstSpell(String name) {
		this.spellList.get(0).settingSpells(name, this.getLevel());
	}
	public void SecondSpell(String name) {
		this.spellList.get(1).settingSpells(name, this.getLevel());
	}
}
