package com.bootcamp.conversions;

public interface Quantity {

	public abstract Quantity add(Quantity quantity);

	public abstract Quantity convert(Quantity quantity);

	public abstract boolean equals(Object object);

	public abstract double toBaseUnit();

	public abstract Quantity fromBaseUnit(double value);

}