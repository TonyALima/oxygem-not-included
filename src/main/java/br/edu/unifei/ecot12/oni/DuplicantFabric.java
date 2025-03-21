package br.edu.unifei.ecot12.oni;

public class DuplicantFabric implements EntityFabric<Duplicant> {

	@Override
	public Duplicant makeEntity() {
		Duplicant d = new Duplicant();
		for (DuplicantConditionEnum dc : DuplicantConditionEnum.values()) {
			if (dc.getClassNumber() == Integer.class) {
				d.getConditions().put(dc, new DuplicantCondition<Integer>(dc, d));
			}else if (dc.getClassNumber() == Float.class) {
				d.getConditions().put(dc, new DuplicantCondition<Float>(dc, d));
			}
		}
		
		for (AtributeEnum a: AtributeEnum.values()) {
			d.getAtributes().put(a, new Atribute(a));
		}

		return d;
	}

}
