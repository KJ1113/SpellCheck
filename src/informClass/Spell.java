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
		if(this.name.equals("����")) {
			this.setSecond(300);
		}else if(this.name.equals("��ȭ")) {
			this.setSecond(180);
		}else if(this.name.equals("����")) {
			this.setSecond(180);
		}else if(this.name.equals("��")) {
			this.setSecond(240);
		}else if(this.name.equals("����")) {
			this.setSecond(5);
		}else if(this.name.equals("��üȭ")) {
			this.setSecond(180);
		}else if(this.name.equals("��")) {
			this.setSecond(360);
		}else if(this.name.equals("��ȭ")) {
			this.setSecond(210);
		}else if(this.name.equals("Ż��")) {
			this.setSecond(210);
		}else {
			this.setSecond(100);
		}

	}
}
