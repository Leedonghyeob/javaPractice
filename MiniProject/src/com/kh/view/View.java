package com.kh.view;

import java.util.Scanner;

import com.kh.model.controller.StudentController;

public class View {
	private StudentController sControl;
	private Scanner scanner;
	
	public View() {
		scanner = new Scanner(System.in);
		sControl = new StudentController();
	}
	
	public void mainView(){
		System.out.println("국비지원 프로그램 성적에 따른 혜택관리 프로그램");

		/*
		 * 1. 출석율, 2. 시험성적, 3. 프로젝트성적, 4. 총합 점수 
		 *
		 */
		while(true) {
			System.out.println("====".repeat(6));
			System.out.println("1. 출석점수");
			System.out.println("2. 시험점수");
			System.out.println("3. 프로젝트점수");
			System.out.println("4. 총합 점수에 따른 순위");
			System.out.println("0. 프로그램 종료");
			System.out.println("====".repeat(6));
			
			System.out.println(">> 메뉴 선택 :");
			int score = scanner.nextInt();
		
			
			switch(score) {
			case 1:
				attendanceMENU();
				break;
			case 2:
				examScoreMenu();
				break;
			case 3:
				projectScoreMenu();
				break;
			case 4:
				totalRankMenu();
				break;
			case 0:
				return;
			default:
					System.out.println("잘못입력되엇습니다. 다시 입력해주세요.");
					
			}
		}
	}
	public void attendanceMENU() {
		/*
		 * 1. 총 수업일, 2.출석일 3.출석율 4.점수환산(30점)
		 */
		System.out.println("====".repeat(6));
		System.out.println("1. 총 수업일");
		System.out.println("2. 출석일");
		System.out.println("3. 출석율");
		System.out.println("4. 환산된 점수(최대30점)");
		System.out.println("====".repeat(6));
		int score = scanner.nextInt();
	
		
		switch(score) {
		case 1:
			learningDate();
			break;
		case 2:
			attendanceDate();
			break;
		case 3:
			absenceDate();
			break;
		case 4:
			transformAbsenceScore();
			break;
		default:
				System.out.println("잘못입력되엇습니다. 다시 입력해주세요.");
				
		}
	}
	public void examScoreMenu() {
		/*
		 * 1.성적 2. 90점이상 대상자 3.점수환산 (30점)
		 */
		System.out.println("====".repeat(6));
		System.out.println("1. 성적");
		System.out.println("2. 90점 이상 상여금수여자");
		System.out.println("3. 환산된 점수(최대30점)");
		System.out.println("====".repeat(6));
		int score = scanner.nextInt();
		
		switch(score) {
		case 1:
			examScore();
			break;
		case 2:
			bonusPerson();
			break;
		case 3:
			transformExamScore();
			break;
		default:
			System.out.println("잘못입력되엇습니다. 다시 입력해주세요.");
	}
	}
	public void projectScoreMenu() {
		/*
		 * 1.점수 2. 등수(1,2,3등) 3. 점수환산(40점)
		 */
		System.out.println("====".repeat(6));
		System.out.println("1. 성적");
		System.out.println("2. 상여금 수여자");
		System.out.println("3. 환산된 점수(최대40점)");
		System.out.println("====".repeat(6));
		int score = scanner.nextInt();
		
		switch(score) {
		case 1:
			projectScore();
			break;
		case 2:
			rankedProject();
			break;
		case 3:
			transformProjectScore();
			break;
		default:
			System.out.println("잘못입력되엇습니다. 다시 입력해주세요.");
	}
	}
	
	public void totalRankMenu() {
		/*
		 * 1. 총 환산점수 2. 환산점수에 따른 순위
		 */
		System.out.println("====".repeat(6));
		System.out.println("1. 환산된 점수계산");
		System.out.println("2. 최종 상여금 수여자");
		System.out.println("====".repeat(6));
		int score = scanner.nextInt();
		
		switch(score) {
		case 1:
			totalScore();
			break;
		case 2:
			finalRanking();	
			break;
		default:
			System.out.println("잘못입력되엇습니다. 다시 입력해주세요.");
		}
	}
	public void learningDate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("총수업 일을 입력하세요 ");
		int learningDate = sc.nextInt();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}





















