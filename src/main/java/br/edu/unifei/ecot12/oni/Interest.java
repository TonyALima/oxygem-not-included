package br.edu.unifei.ecot12.oni;

public class Interest {
	private AtributeEnum type;
	private int bonus;
	
	public AtributeEnum getType() {
		return type;
	}
	public void setType(AtributeEnum type) {
		this.type = type;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
}
