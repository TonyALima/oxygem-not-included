package br.edu.unifei.ecot12.oni;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<Duplicant> dups = new ArrayList<Duplicant>();
		Random r = new Random();
		PrintingPod print = PrintingPod.getInstace();
		
		print.setDuplicantBuilder(new ResearcherDuplicant());
		dups.add(print.printDuplicant());
		System.out.println();
		
		print.setDuplicantBuilder(new CookerDuplicant());
		dups.add(print.printDuplicant());
		System.out.println();
		
		print.setDuplicantBuilder(new RandomDuplicant());
		dups.add(print.printDuplicant());
		System.out.println();
		
		for (Duplicant d : dups) {
			int v = r.nextInt(100);
			((DuplicantCondition<Integer>) d.getConditions().get(DuplicantConditionEnum.STRESS)).setValue(v);
			System.out.println("Setting " + d.getName() + " stress to " + v);
			System.out.println(d.getHumor());
			
			if (d.getHumor() instanceof Stressed) {
				Stressed s = (Stressed) d.getHumor();
				s.response(d);
			}
			if (d.getHumor() instanceof Overjoyed) {
				Overjoyed o = (Overjoyed) d.getHumor();
				o.response(d);
			}
		}
		
		System.out.println("\nSetting " + dups.get(2).getName() + " life to 0");
		((DuplicantCondition<Integer>) dups.get(2).getConditions().get(DuplicantConditionEnum.HEALTH)).setValue(0);
		
		for (Duplicant d : dups) {
			System.out.println(d.getName() + "'s status: ");
			for (Status s: d.getStatus()) {
				System.out.println(s.getDescription());
			}
			System.out.println();
		}
		
	}

}
