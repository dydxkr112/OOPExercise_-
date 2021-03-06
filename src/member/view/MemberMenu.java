package member.view;

import java.util.Scanner;

import member.controller.MemberManager;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	MemberManager mm = new MemberManager();
	int menu = 0;

	public void mainMenu() {
		do {
			System.out.println("=========회원 관리 메뉴=========");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호를 입력하세요 : ");
			menu = sc.nextInt();
			switch(menu) {
			case 1: mm.insertMember(); break;
			case 2: searchMemberMenu(); break;
			case 3: updateMemberMenu(); break;
			case 4: deleteMemberMenu(); break;
			case 5: mm.printAllMember(); break;
			case 9: System.out.println("프로그램을 종료합니다....");break;
			default : System.out.println("잘못 입력하셨습니다.."); return;
			}
		}while(menu !=9);
	}

	public void deleteMemberMenu() {
		int deleteMenu = 0;

		do {
			System.out.println("========회원 정보 검색========");
			System.out.println("1. 회원삭제");
			System.out.println("2. 전체 회원 삭제");
			System.out.println("9. 메인메뉴로");
			System.out.print("메뉴 번호를 입력하세요 : ");
			deleteMenu = sc.nextInt();
			switch(deleteMenu) {
			case 1: mm.daleteOne();; break;
			case 2: mm.deleteAll();; break;
			case 9: System.out.println("메인 메뉴로 이동합니다..."); return;
			default : System.out.println("잘못 입력하셨습니다..."); break;
			}
		}while(deleteMenu != 9);
	}

	public void updateMemberMenu() {
		int updateMenu = 0;

		do {
			System.out.println("========회원 정보 수정========");
			System.out.println("1. 비밀번호 수정하기");
			System.out.println("2. 이름 수정하기");
			System.out.println("3. 이메일 수정하기");
			System.out.println("9. 메인메뉴로");
			System.out.println("==========================");
			System.out.print("메뉴 번호를 입력하세요 : ");
			updateMenu = sc.nextInt();
			switch(updateMenu) {
			case 1: mm.updatePwd(); break;
			case 2: mm.updateName(); break;
			case 3: mm.updateEmail(); break;
			case 9: System.out.println("메인 메뉴로 이동합니다..."); return;
			default : System.out.println("잘못 입력하셨습니다..."); break;
			}
		}while(updateMenu != 9);
	}

	public void searchMemberMenu() {
		int searchMenu = 0;

		do {
			System.out.println("========회원 정보 검색========");
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름로 검색하기");
			System.out.println("3. 이메일 검색하기");
			System.out.println("9. 메인메뉴로");
			System.out.println("==========================");
			System.out.print("메뉴 번호를 입력하세요 : ");
			searchMenu = sc.nextInt();
			switch(searchMenu) {
			case 1: mm.searchId(); break;
			case 2: mm.searchName(); break;
			case 3: mm.searchEmail(); break;
			case 9: System.out.println("메인메뉴로 이돈합니다."); return;
			default : System.out.println("잘못입력하셨습니다.."); break;
			}
		}while(searchMenu != 9);
	}
}
