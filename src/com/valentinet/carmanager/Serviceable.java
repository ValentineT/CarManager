package com.valentinet.carmanager;

public interface Serviceable {
	public boolean isReadyToService();

	public double getDistanceOnService();
	public void addDistance(int additionalDistance);
	public void addDistance(double additionalDistance);
	public void serviceReset();
}
