package br.edu.unifei.ecot12.oni;

public interface EntityFabric<C extends Entity> {
	public C makeEntity();
}
