package com.io.employee.run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.io.employee.model.vo.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		saveEmployee();
		loadEmployee();

	}
	
	public static void saveEmployee() {
		Employee[] employeeArr = new Employee[3];
		employeeArr[0] = new Employee(0, "신사임당", '여', "010-1234-1234", "인사부", 3000000, 0.1);
		employeeArr[1] = new Employee(1, "유관순", '여', "010-1234-5678", "마케팅부", 2000000, 0.3);
		employeeArr[2] = new Employee(2, "선덕여왕", '여', "010-6666-7777", "재무부", 5000000, 0.15);
	
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.dat"))) {
			for(int i = 0; i < employeeArr.length; i++) {
				oos.writeObject(employeeArr[i]);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	
		System.out.println("직원 저장 종료!");
	}
	
	public static void loadEmployee() {
		Employee[] empArr = new Employee[3];
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.dat"))){
			for(int i = 0; i < empArr.length; i++) {
				empArr[i] = (Employee) ois.readObject();
			}
			
			for(Employee emp : empArr)
				emp.printEmployee();
			
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일을 찾을 수 없습니다.");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	

}
