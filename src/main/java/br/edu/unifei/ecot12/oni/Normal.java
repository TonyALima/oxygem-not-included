package br.edu.unifei.ecot12.oni;

public class Normal implements Humor {

	@Override
	public void changeHumor(Duplicant d, int stress) {
		if (stress < 10)
			d.setHumor(new Overjoyed());
		else if (stress >= 90)
			d.setHumor(new Stressed());
	}

}
