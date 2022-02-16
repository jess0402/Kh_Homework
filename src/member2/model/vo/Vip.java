package member2.model.vo;

public class Vip extends Member {
	
	public Vip() {
		super();
	}

	public Vip(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	// 이자포인트 getter
	@Override
	public double getEjaPoint() {
		return super.getPoint() * 0.1;
	}

	@Override
	public int buy(int price) {
		return (int)(price * 0.9);
	}
	

}