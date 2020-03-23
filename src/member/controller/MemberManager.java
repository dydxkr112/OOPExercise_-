package member.controller;

import java.util.Scanner;

import member.model.vo.*;

public class MemberManager {
	private Member[] m = new Member[10];
	private int ctn;
	Scanner sc = new Scanner(System.in);
	
	public MemberManager() {}
	
	public void insertMember() {
		System.out.print("아이디 : ");
		String userId = sc.nextLine();

		System.out.print("패스워드 : ");
		String userPwd = sc.nextLine();

		System.out.print("이름 : ");
		String userName = sc.nextLine();

		System.out.print("나이 : ");
		int age = sc.nextInt();

		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);

		System.out.print("이메일 : ");
		String email = sc.nextLine();
		
		m[ctn] = new Member(userId, userPwd, userName, age, gender, email);
		ctn ++;
		System.out.println("입력이 완료되었습니다. 메인 메뉴로 돌아갑니다.");
	}

	public void searchId() {
		System.out.print("검색할 아이디를 입력하세요 :");
		String searchId = sc.nextLine();
		
		for(int i = 0;i < ctn; i ++) {
			if(searchId.equals(m[i].getUserId())) {
				printOne(m[i]);
			}else System.out.println("입력하신 아이디는 존재하지 않습니다.");
		}
	}
	
	public void printAllMember() {
		for(int i = 0; i < ctn; i ++) {
			System.out.println(m[i].getUserId() + ", " + m[i].getUserPwd() + ", " + m[i].getUserName());
		}
	}
	
	public void printOne(Member m) {
		System.out.println(m.getUserId() + ", " + m.getUserPwd() + ", " + m.getUserName());
	}



}
