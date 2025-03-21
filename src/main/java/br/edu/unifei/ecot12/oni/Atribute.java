package br.edu.unifei.ecot12.oni;

public class Atribute {
	private final AtributeEnum type;
	private int value;
	
	public AtributeEnum getType() {
		return type;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Atribute(AtributeEnum type) {
		super();
		this.type = type;
	}
	
	
}
