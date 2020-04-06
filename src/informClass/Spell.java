package informClass;

public class Spell {
	private int second;
	 String name;

	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public String getName() {
		return name;
	}
	public void settingSpells(String name,int linerLV) {
		this.name = name;
		if(this.name.equals("Á¡¸ê")) {
			this.setSecond(300);
		}else if(this.name.equals("Á¡È­")) {
			this.setSecond(180);
		}else if(this.name.equals("½¯µå")) {
			this.setSecond(180);
		}else if(this.name.equals("Èú")) {
			this.setSecond(240);
		}else if(this.name.equals("½º¸¶")) {
			this.setSecond(5);
		}else if(this.name.equals("À¯Ã¼È­")) {
			this.setSecond(180);
		}else if(this.name.equals("ÅÚ")) {
			this.setSecond(360);
		}else if(this.name.equals("Á¤È­")) {
			this.setSecond(210);
		}else if(this.name.equals("Å»Áø")) {
			this.setSecond(210);
		}else {
			this.setSecond(100);
		}

	}
}
