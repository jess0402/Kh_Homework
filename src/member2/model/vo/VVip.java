package member2.model.vo;

public class VVip extends Member {
	
	public VVip() {
		super();
	}

	public VVip(String name, String grade, int point) {
		super(name, grade, point);
	}

	// 이자포인트 getter
	@Override
	public double getEjaPoint() {
		return super.getPoint() * 0.15;
	}

	@Override
	public int buy(int price) {
		return (int)(price * 0.85);
	}
	
	

}
