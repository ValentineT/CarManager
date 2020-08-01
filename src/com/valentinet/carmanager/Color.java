package com.valentinet.carmanager;

public enum Color {
	WHITE, GREEN, BLACK, BLUE, SILVER, RED;

	@Override
    public String toString() {
        return name().toLowerCase();
}
//	public String toPrettyString() {
//		return this.toString().toLowerCase();
//		}
}
