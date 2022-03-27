package compony;

public class Compony {
	
	private double salary;
	private double annualIncome;
	private double afterTaxIncome;
	private double bonus;
	private double afterTaxBonus;
	
	public Compony() {
		super();
	}

	public Compony(double salary) {
		super();
		this.salary = salary;
	}
	
	public double getIncome() { 
		return salary * 12;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public double getBonus() {
		return (salary * 0.2) * 4;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getAfterTaxBonus() {
		return getBonus() * 0.945;
	}

	public void setAfterTaxBonus(double afterTaxBonus) {
		this.afterTaxBonus = afterTaxBonus;
	}

	public double getAfterTaxIncome() {
		return getIncome() * 0.9;
	}
	
	public void setAfterTaxIncome(double afterTaxIncome) {
		this.afterTaxIncome = afterTaxIncome;
	}
	
	
	
}
