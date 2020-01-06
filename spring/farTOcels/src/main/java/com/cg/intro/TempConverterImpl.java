package com.cg.intro;

public class TempConverterImpl implements TempConverter{

	private double formula;
	
	public TempConverterImpl(double formula){
		System.out.println("TempConverterImpl() double Parameter");
		this.formula=formula;
	}
	public TempConverterImpl(String formula){
		System.out.println("TempConverterImpl() String Parameter");
		this.formula=Double.parseDouble(formula);
	}
	public double fartocel(double far) {
		// TODO Auto-generated method stub
		System.out.println("fartocel()");
		return (far-32)*formula;
	}
	

}
