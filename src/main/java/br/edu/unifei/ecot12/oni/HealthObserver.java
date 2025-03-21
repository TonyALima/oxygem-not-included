package br.edu.unifei.ecot12.oni;

public class HealthObserver implements ConditionObserver<Integer> {

	@Override
	public void update(Duplicant d, Integer value) {
		if (value == 0) {
			Status s = new Status();
			s.setDescription("Dead");
			d.getStatus().add(s);
		}
	}

}
