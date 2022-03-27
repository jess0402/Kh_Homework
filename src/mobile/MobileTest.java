package mobile;

public class MobileTest {

	public static void main(String[] args) {
		
		// 각각의 Mobile 객체 생성
		Ltab ltab = new Ltab("Ltab", 500, "AP-01");
		Otab otab = new Otab("Otab", 1000, "AND-20");
		
		// 생성된 객체의 정보 출력
		printHead();
		printLtab(ltab);
		printOtab(otab);
		
		// 각각의 Mobile 객체에 10분씩 충전 
		ltab.charge(10);
		otab.charge(10);
	
		// 10분 충전 후 객체 정보 출력
		System.out.println();
		System.out.println("10분 충전");
		printHead();
		printLtab(ltab);
		printOtab(otab);
		
		// 각각의 Mobile 객체에 5분씩 통화
		ltab.operate(5);
		otab.operate(5);
		
		// 5분 통화 후 객체 정보 출력
		System.out.println();
		System.out.println("5분 통화");
		printHead();
		printLtab(ltab);
		printOtab(otab);
		
	}
	
	public static void printHead() {
		System.out.println("Mobile\tBattery\tOS");
		System.out.println("----------------------");
	}
	
	public static void printLtab(Ltab ltab) {
		System.out.printf("%s\t%d\t%s\n",
				   ltab.getMobileName(), ltab.getBatterySize(), ltab.getOsType());
	}
	
	public static void printOtab(Otab otab) {
		System.out.printf("%s\t%d\t%s\n",
				   otab.getMobileName(), otab.getBatterySize(), otab.getOsType());
	}

}
