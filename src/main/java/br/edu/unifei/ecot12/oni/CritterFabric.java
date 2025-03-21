package br.edu.unifei.ecot12.oni;

public class CritterFabric implements EntityFabric<Critter> {

	@Override
	public Critter makeEntity() {
		Critter c = new Critter();
		
		for (CritterConditionEnum cc : CritterConditionEnum.values()) {
			if (cc.getClassNumber() == Integer.class) {
				c.getConditions().put(cc, new CritterCondition<Integer>(cc));
			}else if (cc.getClassNumber() == Float.class) {
				c.getConditions().put(cc, new CritterCondition<Float>(cc));
			}
		}
		
		return c;
	}
	
}
