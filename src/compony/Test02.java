package compony;

public class Test02 {
	public static void main(String[] args) {
		
		int salary = Integer.parseInt(args[0]);
		Compony cp = new Compony(salary);
		
		System.out.printf("연 기본급 합: %.1f 세후: %.1f\n", cp.getIncome(), cp.getAfterTaxIncome());
		System.out.printf("연 보너스 합: %.1f 세후: %.1f\n", cp.getBonus(), cp.getAfterTaxBonus());
		System.out.printf("연 지급액 합: %.1f", cp.getAfterTaxIncome() + cp.getAfterTaxBonus());
	}

}
