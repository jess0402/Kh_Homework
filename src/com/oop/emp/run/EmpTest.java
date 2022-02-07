package com.oop.emp.run;

import java.util.Scanner;

import com.oop.emp.model.Employee;

public class EmpTest {

	public static void main(String[] args) {
		
		EmpTest emp = new EmpTest();
		emp.mainMenu();
		

	}
	
	public void mainMenu() {
		Employee e = new Employee();
		Scanner sc = new Scanner(System.in);
		String menu = "*****사원 정보 관리 프로그램*****\n"
					+ "1. 새 사원 정보 입력\n"
					+ "2. 사원 정보 삭제\n"
					+ "3. 사원 정보 출력\n"
					+ "9. 끝내기\n"
					+ "****************************";
		
		while(true) {
			System.out.println(menu);
			System.out.print("번호를 선택하세요: ");
			int choice = sc.nextInt();
			
			if(choice == 1)
				e.empInput();
			else if(choice == 2)
				e = null;
			else if(choice == 3) {
				if(e == null)
					System.out.println("사원정보가 없습니다.");
				e.empOutput();
			}

			else if(choice == 9) {
				System.out.println("종료되었습니다.");
				break;
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}		
		
	}

}
