package br.edu.unifei.ecot12.oni;

public enum CritterConditionEnum implements ConditionEnum {
	HEATH(Integer.class),
	REPRODUCTION(Integer.class),
	AGE(Integer.class),
	HAPPINESS(Integer.class),
	TEMPERATURE(Float.class);
	
	private final Class<? extends Number> classNumber;
	private CritterConditionEnum(Class<? extends Number> classNumber) {
		this.classNumber = classNumber;
	}
	
	public Class<? extends Number> getClassNumber() {
		return classNumber;
	}
	
}
