package br.edu.unifei.ecot12.oni;

public abstract class Condition <C extends ConditionEnum, N extends Number>{
	private final C type;
	private N value;
	private N max;
	
	public Condition(C type) {
		super();
		this.type = type;
	}
	
	public C getType() {
		return type;
	}

	public N getValue() {
		return value;
	}

	public void setValue(N value) {
		this.value = value;
	}

	public N getMax() {
		return max;
	}

	public void setMax(N max) {
		this.max = max;
	}
	
	
}
