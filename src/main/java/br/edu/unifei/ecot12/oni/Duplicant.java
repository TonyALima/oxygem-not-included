package br.edu.unifei.ecot12.oni;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Duplicant extends Entity {

	private String name;
	private String about;
	private Humor humor = new Normal();
	private HashMap<AtributeEnum, Atribute> atributes = new HashMap<AtributeEnum, Atribute>();
	private List<Trait<?>> traits = new ArrayList<Trait<?>>();
	private HashMap<DuplicantConditionEnum, DuplicantCondition<?>> conditions = new HashMap<DuplicantConditionEnum, DuplicantCondition<?>>();
	private List<Interest> interests = new ArrayList<Interest>();
	private OverjoyedResponseEnum overjoyedResponse;
	private StressReactionEnum stressReaction;

	protected Duplicant() {}
	
	public OverjoyedResponseEnum getOverjoyedResponse() {
		return overjoyedResponse;
	}

	public void setOverjoyedResponse(OverjoyedResponseEnum overjoyedResponse) {
		this.overjoyedResponse = overjoyedResponse;
	}

	public Humor getHumor() {
		return humor;
	}

	public void setHumor(Humor humor) {
		this.humor = humor;
	}

	public StressReactionEnum getStressReaction() {
		return stressReaction;
	}

	public void setStressReaction(StressReactionEnum stressReaction) {
		this.stressReaction = stressReaction;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HashMap<AtributeEnum, Atribute> getAtributes() {
		return atributes;
	}

	public void setAtributes(HashMap<AtributeEnum, Atribute> atributes) {
		this.atributes = atributes;
	}

	public List<Trait<?>> getTraits() {
		return traits;
	}

	public void setTraits(List<Trait<?>> traits) {
		this.traits = traits;
	}

	public HashMap<DuplicantConditionEnum, DuplicantCondition<? extends Number>> getConditions() {
		return conditions;
	}

	public List<Interest> getInterests() {
		return interests;
	}

	public void setInterests(List<Interest> interests) {
		this.interests = interests;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}
}
