package br.edu.unifei.ecot12.oni;

import java.util.HashMap;
import java.util.function.Consumer;

public class Overjoyed implements Humor {
	
	private HashMap<OverjoyedResponseEnum, Consumer<Duplicant>> responses = new HashMap<OverjoyedResponseEnum, Consumer<Duplicant>>();
	
	public Overjoyed() {
		responses.put(OverjoyedResponseEnum.BALLON_ARTIST, d -> ballonArtistResponse(d));
		responses.put(OverjoyedResponseEnum.SPARKLE_STREAKER, d -> sparkleStreakerResponse(d));
		responses.put(OverjoyedResponseEnum.SUPER_PRODUCTIVE, d -> superProductiveResponse(d));
		responses.put(OverjoyedResponseEnum.STICKER_BOMBER, d -> stickerBomberResponse(d));
		responses.put(OverjoyedResponseEnum.YODELER, d -> yodelerResponse(d));
	}
	
	@Override
	public void changeHumor(Duplicant d, int stress) {
		if (stress >= 90)
			d.setHumor(new Stressed());
		else if (stress > 10)
			d.setHumor(new Normal());
	}
	
	public void response(Duplicant d) {
		responses.get(d.getOverjoyedResponse()).accept(d);
	}
	
	private void ballonArtistResponse(Duplicant d) {
		Status s = new Status();
		s.setDescription(d.getName() + " is making ballons");
		d.getStatus().add(s);
	}
	
	private void sparkleStreakerResponse(Duplicant d) {
		Status s = new Status();
		s.setDescription(d.getName() + " is spreading sparkles");
		d.getStatus().add(s);
	}
	
	private void superProductiveResponse(Duplicant d) {
		Status s = new Status();
		s.setDescription(d.getName() + " is super productive");
		d.getStatus().add(s);
	}
	
	private void stickerBomberResponse(Duplicant d) {
		Status s = new Status();
		s.setDescription(d.getName() + " is bombing stickers");
		d.getStatus().add(s);
	}
	
	private void yodelerResponse(Duplicant d) {
		Status s = new Status();
		s.setDescription(d.getName() + " is singing");
		d.getStatus().add(s);
	}
	
}
