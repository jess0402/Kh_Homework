package member2.model.vo;

public class Ruby extends Member {

	public Ruby() {
		super();
	}

	public Ruby(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	// 이자포인트 getter
	@Override
	public double getEjaPoint() {
		return super.getPoint() * 0.3;
	}
	
	@Override
	public int buy(int price) {
		return (int)(price * 0.7);
	}
	
	
	

}
