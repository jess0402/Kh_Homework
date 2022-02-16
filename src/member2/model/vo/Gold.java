package member2.model.vo;

public class Gold extends Member {
	
	// 기본생성자
	public Gold() {}
	
	public Gold(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	// 이자포인트 getter
	@Override
	public double getEjaPoint() {
		return super.getPoint() * 0.05;
	}

	@Override
	public int buy(int price) {
		return (int)(price * 0.95);
	}
	

}
