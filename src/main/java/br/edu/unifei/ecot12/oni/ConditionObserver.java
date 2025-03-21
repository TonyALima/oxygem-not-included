package br.edu.unifei.ecot12.oni;

public interface ConditionObserver <N extends Number>{
	public void update(Duplicant d, N value);
	
}
