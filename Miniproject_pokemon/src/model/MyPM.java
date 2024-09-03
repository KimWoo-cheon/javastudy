package model;

public class MyPM extends PM {

	public MyPM(PM pm) {
		this.name = pm.getName();
		this.type = pm.getType();
		this.atk = pm.getAttack();
		this.skill = pm.getSkill();

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return super.getType();
	}

	@Override
	public void setType(String type) {
		// TODO Auto-generated method stub
		super.setType(type);
	}

	@Override
	public int getAttack() {
		// TODO Auto-generated method stub
		return super.getAttack();
	}

	@Override
	public void setAttack(int atk) {
		// TODO Auto-generated method stub
		super.setAttack(atk);
	}

	@Override
	public String getSkill() {
		// TODO Auto-generated method stub
		return super.getSkill();
	}

	@Override
	public void setSkill(String skill) {
		// TODO Auto-generated method stub
		super.setSkill(skill);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
