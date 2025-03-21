package br.edu.unifei.ecot12.oni;

public class StressObserver implements ConditionObserver<Integer> {

	@Override
	public void update(Duplicant d, Integer value) {
		d.getHumor().changeHumor(d, value);
	}
	
}
