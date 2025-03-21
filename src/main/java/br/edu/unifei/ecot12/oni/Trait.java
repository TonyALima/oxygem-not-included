package br.edu.unifei.ecot12.oni;

public abstract class Trait <T extends TraitEnum>{
	private T type;
	private String effect;
	
	public T getType() {
		return type;
	}
	public void setType(T type) {
		this.type = type;
	}
	public String getEffect() {
		return effect;
	}
	public void setEffect(String effect) {
		this.effect = effect;
	}
	public Trait(T type) {
		super();
		this.type = type;
	}
	
}
