package com.hexaware.model;

import java.io.Serializable;

public class Salary implements Serializable {

	private int basic;
	private double hra;
	private double pf;
	private double gross;
	private double net;
	protected String salaryType;
	private double hourlyRate;
	private int hoursWorked;
	private double dailySalary;

	public Salary() {
		super();

	}

	public Salary(int basic, double hra, double pf, double gross, double net) {
		super();
		this.basic = basic;
		this.hra = hra;
		this.pf = pf;
		this.gross = gross;
		this.net = net;
	}

	public int getBasic() {
		return basic;
	}

	public void setBasic(int basic) {
		this.basic = basic;
	}

	public double getHra() {
		return hra;
	}

	public void setHra() {
		this.hra = this.getBasic() * 0.1;
	}

	public double getPf() {
		return pf;
	}

	public void setPf() {
		this.pf = this.getBasic() * 0.05;
	}

	public double getGross() {
		return gross;
	}

	public void setGross() {
		this.gross = this.getBasic() + this.getHra() + this.getPf();
	}

	public double getNet() {
		return net;
	}

	public void setNet() {
		this.net = this.getGross() - this.getPf();
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public String getSalaryType() {
		return salaryType;
	}

	public void setSalaryType(String salaryType) {
		this.salaryType = salaryType;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getDailySalary() {
		return dailySalary;
	}

	public void setDailySalary() {
		this.dailySalary = this.hourlyRate * this.hoursWorked;
	}

	@Override
	public String toString() {
		String salaryInfo;
		switch (getSalaryType()) {

		case "monthly":
			salaryInfo = "FT Salary [salaryType=" + salaryType + "basic=" + basic + ", " + "hra=" + hra + ", pf=" + pf
					+ ", gross=" + gross + ", net=" + net + "]";
			break;
		case "daily":
			salaryInfo = "PT Salary [salaryType=" + salaryType + ", hourlyRate=" + hourlyRate + ", hoursWorked="
					+ hoursWorked + ", dailySalary=" + dailySalary + "]";
			break;
		default:
			salaryInfo = "Salary: $" + "No Salary";
		}
		return salaryInfo;

	}

}
