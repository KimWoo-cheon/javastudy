package model;

public class PM {
	
	String name;
	String type;
	int atk;
	String skill;
	
	public PM(String name, String type, int atk, String skill) {
		this.name = name;
		this.type = type;
		this.atk = atk;
		this.skill = skill;
	}
	public PM() {
	
	}
	
	public PM(String name, String type, String skill) {
		this.name = name;
		this.type = type;
		this.skill = skill;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAttack() {
		return atk;
	}
	public void setAttack(int atk) {
		this.atk = atk;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	@Override
	public String toString() {
		return "내포켓몬은 [이름=" + name + ", type=" + type + ", skill=" + skill + "] 입니다.";
	}

	
}
