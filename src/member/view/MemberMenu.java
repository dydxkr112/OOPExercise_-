package member.view;

import java.util.Scanner;

import member.controller.MemberManager;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	MemberManager mm = new MemberManager();
	int menu = 0;

	public void mainMenu() {
		do {
			System.out.println("=========ȸ�� ���� �޴�=========");
			System.out.println("1. �ű� ȸ�� ���");
			System.out.println("2. ȸ�� ���� �˻�");
			System.out.println("3. ȸ�� ���� ����");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("5. ȸ�� ���� ���");
			System.out.println("9. ����");
			System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
			menu = sc.nextInt();
			switch(menu) {
			case 1: mm.insertMember(); break;
			case 2: searchMemberMenu(); break;
			case 3: updateMemberMenu(); break;
			case 4: deleteMemberMenu(); break;
			case 5: mm.printAllMember(); break;
			case 9: System.out.println("���α׷��� �����մϴ�....");break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�.."); return;
			}
		}while(menu !=9);
	}

	public void deleteMemberMenu() {
		int deleteMenu = 0;

		do {
			System.out.println("========ȸ�� ���� �˻�========");
			System.out.println("1. ȸ������");
			System.out.println("2. ��ü ȸ�� ����");
			System.out.println("9. ���θ޴���");
			System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
			deleteMenu = sc.nextInt();
			switch(deleteMenu) {
			case 1: mm.daleteOne();; break;
			case 2: mm.deleteAll();; break;
			case 9: System.out.println("���� �޴��� �̵��մϴ�..."); return;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�..."); break;
			}
		}while(deleteMenu != 9);
	}

	public void updateMemberMenu() {
		int updateMenu = 0;

		do {
			System.out.println("========ȸ�� ���� ����========");
			System.out.println("1. ��й�ȣ �����ϱ�");
			System.out.println("2. �̸� �����ϱ�");
			System.out.println("3. �̸��� �����ϱ�");
			System.out.println("9. ���θ޴���");
			System.out.println("==========================");
			System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
			updateMenu = sc.nextInt();
			switch(updateMenu) {
			case 1: mm.updatePwd(); break;
			case 2: mm.updateName(); break;
			case 3: mm.updateEmail(); break;
			case 9: System.out.println("���� �޴��� �̵��մϴ�..."); return;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�..."); break;
			}
		}while(updateMenu != 9);
	}

	public void searchMemberMenu() {
		int searchMenu = 0;

		do {
			System.out.println("========ȸ�� ���� �˻�========");
			System.out.println("1. ���̵�� �˻��ϱ�");
			System.out.println("2. �̸��� �˻��ϱ�");
			System.out.println("3. �̸��� �˻��ϱ�");
			System.out.println("9. ���θ޴���");
			System.out.println("==========================");
			System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
			searchMenu = sc.nextInt();
			switch(searchMenu) {
			case 1: mm.searchId(); break;
			case 2: mm.searchName(); break;
			case 3: mm.searchEmail(); break;
			case 9: System.out.println("���θ޴��� �̵��մϴ�."); return;
			default : System.out.println("�߸��Է��ϼ̽��ϴ�.."); break;
			}
		}while(searchMenu != 9);
	}
}
