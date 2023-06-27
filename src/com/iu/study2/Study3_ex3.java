package com.iu.study2;
import java.util.Scanner;
public class Study3_ex3 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // 아이디 입력
	        System.out.print("아이디를 입력하세요: ");
	        String id = scanner.nextLine();

	        // 패스워드 입력
	        System.out.print("패스워드를 입력하세요: ");
	        String password = scanner.nextLine();

	        // 로그인 처리
	        boolean isLoggedIn = performLogin(id, password);

	        // 로그인 성공 여부 출력
	        if (isLoggedIn) {
	            System.out.println("로그인 성공");
	            calculateSalary();
	        } else {
	            System.out.println("로그인 실패");
	        }

	        scanner.close();
	    }

	    private static boolean performLogin(String id, String password) {
	        // 아이디와 비밀번호가 각각 "1234"와 "5678"일 경우에만 로그인 성공으로 처리
	        return id.equals("1234") && password.equals("5678");
	    }

	    private static void calculateSalary() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("직원 유형을 선택하세요 (1.정규직, 2.계약직): ");
	        int employeeType = scanner.nextInt();

	        if (employeeType == 1) {
	            System.out.print("급여를 입력하세요: ");
	            double salary = scanner.nextDouble();

	            // 정규직 공제율
	            double healthInsuranceRate = 0.03;
	            double nationalPensionRate = 0.02;
	            double employmentInsuranceRate = 0.01;
	            double workersCompensationRate = 0.01;

	            // 실급여 계산
	            double deductions = salary * (healthInsuranceRate + nationalPensionRate + employmentInsuranceRate + workersCompensationRate);
	            double netSalary = salary - deductions;

	            // 실급여 출력
	            System.out.println("실급여: " + netSalary);
	        } else if (employeeType == 2) {
	            System.out.print("급여를 입력하세요: ");
	            double salary = scanner.nextDouble();

	            // 계약직 공제율
	            double withholdingTaxRate = 0.033;

	            // 실급여 계산
	            double deductions = salary * withholdingTaxRate;
	            double netSalary = salary - deductions;

	            // 실급여 출력
	            System.out.println("실급여: " + netSalary);
	        } else {
	            System.out.println("유효하지 않은 선택입니다.");
	        }

	        scanner.close();
	    }
	}
