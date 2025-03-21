package br.edu.unifei.ecot12.oni;

import java.util.HashMap;
import java.util.function.Consumer;

public class Stressed implements Humor {
	
	private HashMap<StressReactionEnum, Consumer<Duplicant>> responses = new HashMap<StressReactionEnum, Consumer<Duplicant>>();

	public Stressed() {
		responses.put(StressReactionEnum.VOMITER, d -> vomiterResponse(d));
		responses.put(StressReactionEnum.DESTRUCTIVE, d -> destructiveResponse(d));
		responses.put(StressReactionEnum.BINGE_EATER, d -> bingeEaterResponse(d));
		responses.put(StressReactionEnum.UGLY_CRIER, d -> uglyCrierResponse(d));
		responses.put(StressReactionEnum.BANSHEE, d -> bansheeResponse(d));
	}
	@Override	
	public void changeHumor(Duplicant d, int stress) {
		if (stress < 10)
			d.setHumor(new Overjoyed());
		else if (stress < 90)
			d.setHumor(new Normal());
	}
	
	public void response(Duplicant d) {
		responses.get(d.getStressReaction()).accept(d);
	}
	
	private void vomiterResponse(Duplicant d) {
		Status s = new Status();
		s.setDescription(d.getName() + " is vomiting");
		d.getStatus().add(s);
	}
	
	private void destructiveResponse(Duplicant d) {
		Status s = new Status();
		s.setDescription(d.getName() + " is destroing");
		d.getStatus().add(s);
	}
	
	private void bingeEaterResponse(Duplicant d) {
		Status s = new Status();
		s.setDescription(d.getName() + " is eating nonstop");
		d.getStatus().add(s);
	}
	
	private void uglyCrierResponse(Duplicant d) {
		Status s = new Status();
		s.setDescription(d.getName() + " is crying");
		d.getStatus().add(s);
	}
	
	private void bansheeResponse(Duplicant d) {
		Status s = new Status();
		s.setDescription(d.getName() + " is uncontrollable");
		d.getStatus().add(s);
	}
}
