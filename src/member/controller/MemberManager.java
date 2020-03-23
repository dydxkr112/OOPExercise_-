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
		int count = 0;
		for(int i = 0;i < ctn; i ++) {
			if(searchId.equals(m[i].getUserId())) {
				printOne(m[i]);
				count ++;
			}
		}
		if(count == 0)System.out.println("입력하신 아이디는 존재하지 않습니다.");
	}

	public void searchName() {
		System.out.print("검색할 이름을 입력하세요 :");
		String searchName = sc.nextLine();
		int count = 0;
		for(int i = 0;i < ctn; i ++) {
			if(searchName.equals(m[i].getUserName())) {
				printOne(m[i]);
				count ++;
			}
		}
		if(count == 0 )System.out.println("입력하신 이름은 존재하지 않습니다.");
	}

	public void searchEmail() {
		System.out.print("검색할 이메일을 입력하세요 :");
		String searchEmail = sc.nextLine();
		int count = 0;
		for(int i = 0;i < ctn; i ++) {
			if(searchEmail.equals(m[i].getUserEmail())) {
				printOne(m[i]);
				count ++;
			}
		}
		if(count ==0) System.out.println("입력하신 이메일은 존재하지 않습니다.");
	}

	public void updatePwd() {
		System.out.print("수정할 회원의 아이디를 입력하세요 :");
		String changeUserId = sc.nextLine();
		int count = 0;
		for(int i = 0;i < ctn; i ++) {
			if(changeUserId.equals(m[i].getUserId())) {
				System.out.print("바꾸실 비밀번호를 입력하세요 : ");
				String changeUserPwd = sc.nextLine();
				m[i].setUserPwd(changeUserPwd);
				System.out.println("패스워드 수정이 완료되었습니다.");
				count ++;
				break;
			}
		}
		if(count==0)System.out.println("수정할 회원이 존재하지 않습니다.");
	}

	public void updateName() {
		System.out.print("수정할 회원의 아이디를 입력하세요 :");
		String changeUserId = sc.nextLine();
		int count = 0;
		for(int i = 0;i < ctn; i ++) {
			if(changeUserId.equals(m[i].getUserId())) {
				System.out.print("바꾸실 이름을 입력하세요 : ");
				String changeUserName = sc.nextLine();
				m[i].setUserPwd(changeUserName);
				System.out.println("이름 수정이 완료되었습니다.");
				count ++;
				break;
			}
		}
		if(count == 0)  System.out.println("수정할 회원이 존재하지 않습니다.");
	}

	public void updateEmail() {
		System.out.print("수정할 회원의 아이디를 입력하세요 :");
		String changeUserId = sc.nextLine();
		int count = 0;
		for(int i = 0;i < ctn; i ++) {
			if(changeUserId.equals(m[i].getUserId())) {
				System.out.print("바꾸실 이메일을 입력하세요 : ");
				String changeUserEmail = sc.nextLine();
				m[i].setUserPwd(changeUserEmail);
				System.out.println("이메일 수정이 완료되었습니다.");
				count ++;
				break;
			}
		}
		if(count == 0) System.out.println("수정할 회원이 존재하지 않습니다.");
	}

	public void daleteOne() {
		System.out.print("탈퇴할 회원의 아이디를 입력하세요 : ");
		String deleteName = sc.nextLine();
		int count = 0;
		for(int i = 0;i < ctn; i ++) {
			if(deleteName.equals(m[i].getUserId())) {
				m[i] = m[i+1];
				break;
			}

		}
		if(count == 0)System.out.println("수정할 회원이 존재하지 않습니다.");
		else System.out.println("성공적으로 삭제 되었습니다...");
	}
	public void deleteAll() {
		for(int i = 0;i < ctn; i ++) {
		m[i].setAge(0);
		m[i].setEmail("");
		m[i].setGender(' ');
		m[i].setUserId("");
		m[i].setUserName("");
		m[i].setUserPwd("");
		}
		ctn = 0;
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
