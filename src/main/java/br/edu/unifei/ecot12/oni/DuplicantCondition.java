package br.edu.unifei.ecot12.oni;

import java.util.ArrayList;
import java.util.List;

public class DuplicantCondition<N extends Number> extends Condition<DuplicantConditionEnum, N> {
	
	private Duplicant duplicant;
	
	private List<ConditionObserver<N>> observers = new ArrayList<ConditionObserver<N>>();
	
	@SuppressWarnings("unchecked")
	public DuplicantCondition(DuplicantConditionEnum type, Duplicant d) {
		super(type);
		if (this.getType() == DuplicantConditionEnum.STRESS)
			observers.add((ConditionObserver<N>) new StressObserver());
		if (this.getType() == DuplicantConditionEnum.HEALTH)
			observers.add((ConditionObserver<N>) new HealthObserver());
		this.duplicant = d;
	}
	
	public List<ConditionObserver<N>> getObservers() {
		return observers;
	}

	public void setObservers(List<ConditionObserver<N>> observers) {
		this.observers = observers;
	}
	
	private void notify(N v) {
		for (ConditionObserver<N> o : observers) {
			o.update(duplicant, v);
		}
	}
	
	public void setValue(N value) {
		super.setValue(value);
		notify(value);
	}
}
