package br.edu.unifei.ecot12.oni;

import java.util.HashMap;

public class Critter extends Entity {
	private String name;
	private HashMap<CritterConditionEnum ,CritterCondition<?>> conditions = new HashMap<CritterConditionEnum ,CritterCondition<?>>();
	
	protected Critter() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HashMap<CritterConditionEnum, CritterCondition<?>> getConditions() {
		return conditions;
	}

	public void setConditions(HashMap<CritterConditionEnum, CritterCondition<?>> conditions) {
		this.conditions = conditions;
	};
	
}
