package br.edu.unifei.ecot12.oni;

import java.util.ArrayList;
import java.util.List;

public abstract class Entity {
	private List<Status> status = new ArrayList<Status>();

	public List<Status> getStatus() {
		return status;
	}

	public void setStatus(List<Status> status) {
		this.status = status;
	}
	
	
}
