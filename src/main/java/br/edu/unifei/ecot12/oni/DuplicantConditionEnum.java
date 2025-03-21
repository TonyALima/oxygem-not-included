package br.edu.unifei.ecot12.oni;

public enum DuplicantConditionEnum implements ConditionEnum{
	HEALTH(Integer.class),
	STRESS(Integer.class),
	MORALE(Integer.class),
	BLADDER(Integer.class),
	BREATH(Integer.class),
	STAMINA(Integer.class),
	CALORIES(Integer.class),
	TEMPERATURE(Float.class),
	DECOR(Integer.class),
	RAD_DOSE(Float.class);
	
	private final Class<? extends Number> classNumber;
	private DuplicantConditionEnum(Class<? extends Number> classNumber) {
		this.classNumber = classNumber;
	}
	
	public Class<? extends Number> getClassNumber() {
		return classNumber;
	}
}
