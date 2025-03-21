package br.edu.unifei.ecot12.oni;

public class CritterCondition<N extends Number> extends Condition<CritterConditionEnum, N> {

	public CritterCondition(CritterConditionEnum type) {
		super(type);
	}
}
