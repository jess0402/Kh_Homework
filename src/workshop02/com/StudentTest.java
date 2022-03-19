package workshop02.com;

public class StudentTest {

	public static void main(String[] args) {
		Student[] studentArr = new Student[3];
		
		// Student 객체를 3개 생성하여 배열에 넣는다.
		studentArr[0] = new Student("홍길동", 15, 170, 80);
		studentArr[1] = new Student("한사람", 13, 180, 70);
		studentArr[2] = new Student("임걱정", 16, 175, 65);
		
		// 배열에 있는 객체 정보를 모두 출력한다.
		System.out.println("이름\t나이\t신장\t몸무게");
		for(int i = 0; i < studentArr.length; i++) 
			System.out.println(studentArr[i].studentInfo());
		
		System.out.println();
		
		// Student 객체들의 나이의 평균 출력
		double sumAge = 0;
		for(int j = 0; j < studentArr.length; j++) 
			sumAge += studentArr[j].getAge();
		
		System.out.printf("나이 평균: %.3f\n", sumAge/studentArr.length);
		
		// Student 객체들의 신장의 평균 출력
		double sumHeight = 0;
		for(int a = 0; a < studentArr.length; a++)
			sumHeight += studentArr[a].getHeight();
		
		System.out.printf("신장 평균: %.3f\n", sumHeight/studentArr.length);
		
		// Student 객체들의 몸무게의 평균 출력
		double sumWeight = 0;
		for(int b = 0; b < studentArr.length; b++)
			sumWeight += studentArr[b].getWeight();
		
		System.out.printf("몸무게 평균: %.3f\n\n", sumWeight/studentArr.length);
			
		// 학생들 중 나이가 가장 많은 학생과 적은 학생 출력
		int maxAgeIndex = 0;
		int minAgeIndex = 0;
		
		for(int m = 0; m < studentArr.length; m++) {
			if(studentArr[maxAgeIndex].getAge() < studentArr[m].getAge())
				maxAgeIndex = m;
			if(studentArr[minAgeIndex].getAge() > studentArr[m].getAge())
				minAgeIndex = m;
		}
		System.out.println("나이가 가장 많은 학생: " + studentArr[maxAgeIndex].getName());
		System.out.println("나이가 가장 적은 학생: " + studentArr[minAgeIndex].getName());
		
		// 학생들 중 신장이 가장 적은 학생과 큰 학생 출력
		int tallestIndex = 0;
		int shortestIndex = 0;
		
		for(int n = 0; n < studentArr.length; n++) {
			if(studentArr[tallestIndex].getHeight() < studentArr[n].getHeight())
				tallestIndex = n;
			if(studentArr[shortestIndex].getHeight() > studentArr[n].getHeight())
				shortestIndex = n;
		}
		System.out.println("신장이 가장 큰 학생: " + studentArr[tallestIndex].getName());
		System.out.println("신장이 가장 작은 학생: " + studentArr[shortestIndex].getName());
		
		// 학생들 중 몸무게가 가장 적은 학생과 많이 나가는 학생 출력
		int maxWeightIndex = 0;
		int minWeightIndex = 0;
		
		for(int k = 0; k < studentArr.length; k++) {
			if(studentArr[maxWeightIndex].getWeight() < studentArr[k].getWeight())
				maxWeightIndex = k;
			if(studentArr[minWeightIndex].getWeight() > studentArr[k].getWeight())
				minWeightIndex = k;
		}
		System.out.println("몸무게가 가장 많이 나가는 학생: " + studentArr[maxWeightIndex].getName());
		System.out.println("몸무게가 가장 적게 나가는 학생: " + studentArr[minWeightIndex].getName());
		
	}

}
