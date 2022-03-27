package mobile;

public class Otab extends Mobile {
	
	public Otab() {	}
	
	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}

	// 사용
	@Override
	public int operate(int time) {
		setBatterySize(getBatterySize() - (time * 12));
		return getBatterySize(); 
	}
	
	// 충전
	@Override
	public int charge(int time) { 		
		setBatterySize(getBatterySize() + (time * 8));
		return getBatterySize(); 
	}

}
