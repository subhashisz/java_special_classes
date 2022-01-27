package com.myapp.immutable;

/**
 * Effectively immutable classes are the classes whose state changes in certain
 * condition
 * 
 * @author SUBHASHIS
 * 
 *
 */
public final class EffectivelyImmutableClass {

	private int x;
	private boolean canChange;

	public EffectivelyImmutableClass(boolean state) {
		this.canChange = state;
	}

	public void setX(int newX) {
		if (!canChange) {
			this.x = newX;
		} else {
			throw new IllegalStateException();
		}
	}

}
