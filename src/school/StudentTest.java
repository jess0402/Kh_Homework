package school;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentArray[] = new Student[3];
		
		// Student 객체를 3개 생성하여 배열에 넣는다.
		studentArray[0] = new Student("홍길동", 15, 171, 81);
		studentArray[1] = new Student("한사람", 13, 183, 72);
		studentArray[2] = new Student("임걱정", 16, 175, 65);
		
		
		// 배열에 있는 객체 정보를 모두 출력한다.
		for(int i = 0; i < studentArray.length; i++) {
			System.out.printf("이름: %s 나이: %d 신장: %d 몸무게: %d\n",
							   studentArray[i].getName(), studentArray[i].getAge(),
							   studentArray[i].getHeight(), studentArray[i].getWeight());
		}
		
		System.out.println();
		// 나이의 평균 출력
		double sumAge = 0;
		
		for(int j = 0; j < studentArray.length; j++) {
			sumAge += studentArray[j].getAge();
		}
		
		System.out.printf("나이의 평균: %.2f\n", sumAge/studentArray.length);
		
		// 신장의 평균 출력
		double sumHeight = 0;
		
		for(int m = 0; m < studentArray.length; m++) {
			sumHeight += studentArray[m].getHeight();
		}
		
		System.out.printf("신장의 평균: %.2f\n", sumHeight/studentArray.length);
		
		// 몸무게의 평균 출력
		double sumWeight = 0;
		
		for(int n = 0; n < studentArray.length; n++) {
			sumWeight += studentArray[n].getWeight();
		}
		
		System.out.printf("몸무게의 평균: %.2f\n", sumWeight/studentArray.length);
	}

}
