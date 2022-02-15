package member2.model.vo;

public class Gold extends Member {
	
	// 기본생성자
	public Gold() {}
	
	public Gold(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	// 이자포인트 getter
	@Override
	public double getInterest() {
		return super.getPoint() * 0.05;
	}
	

}
