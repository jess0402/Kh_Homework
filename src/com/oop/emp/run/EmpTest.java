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
					+ "2. 사원 정보 수정\n"
					+ "3. 사원 정보 삭제\n"
					+ "4. 사원 정보 출력\n"
					+ "9. 끝내기\n"
					+ "****************************";
		
		while(true) {
			System.out.println(menu);
			System.out.print("번호를 선택하세요: ");
			int choice = sc.nextInt();
			
			if(choice == 1)
				e.empInput();
			else if(choice ==2) {
				modifyMenu(e);   	// 매개인자로 Employee객체를 전달함.
				continue;
			}

			else if(choice == 3)
				e = null;
			else if(choice == 4) {
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
	

	public void modifyMenu(Employee e) {
		Scanner sc = new Scanner(System.in);
		
		String modifymenu = "*** 사원정보 수정메뉴 ***\n"
						  + "1. 이름 변경\n"
						  + "2. 급여 변경\n"
						  + "3. 부서 변경\n"
						  + "4. 직급 변경\n"
						  + "5. 이전 메뉴로 이동\n"
						  + "********************";
		
		// setter 이용해서 키보드로 입력받은 값 객체 필드에 기록
		while(true) {
			System.out.println(modifymenu);
			System.out.print("번호를 선택하세요: ");
			int num = sc.nextInt();
			
			if(num==1) {
				System.out.print("변경할 이름을 입력하세요: ");
				e.setEmpName(sc.next());
				continue;
			}
			else if(num==2) {
				System.out.print("변경할 급여를 입력하세요: ");
				e.setSalary(sc.nextInt());
				continue;
			}
			else if(num==3) {
				System.out.print("변경할 부서를 입력하세요: ");
				e.setDept(sc.next());
				continue;
			}
			else if(num==4) {
				System.out.print("변경할 직급을 입력하세요: ");
				e.setJob(sc.next());
				continue;
			}
			else if(num==5) {
				System.out.print("이전 메뉴로 이동");
				return;
			}
			else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}

		}
	}


}
