package member.controller;

import java.util.Scanner;

import member.model.vo.*;

public class MemberManager {
	private Member[] m = new Member[10];
	private int ctn;
	Scanner sc = new Scanner(System.in);

	public MemberManager() {}

	public void insertMember() {
		System.out.print("���̵� : ");
		String userId = sc.nextLine();

		System.out.print("�н����� : ");
		String userPwd = sc.nextLine();

		System.out.print("�̸� : ");
		String userName = sc.nextLine();

		System.out.print("���� : ");
		int age = sc.nextInt();

		System.out.print("���� : ");
		char gender = sc.next().charAt(0);

		System.out.print("�̸��� : ");
		String email = sc.nextLine();

		m[ctn] = new Member(userId, userPwd, userName, age, gender, email);
		ctn ++;
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�. ���� �޴��� ���ư��ϴ�.");
	}

	public void searchId() {
		System.out.print("�˻��� ���̵� �Է��ϼ��� :");
		String searchId = sc.nextLine();
		int count = 0;
		for(int i = 0;i < ctn; i ++) {
			if(searchId.equals(m[i].getUserId())) {
				printOne(m[i]);
				count ++;
			}
		}
		if(count == 0)System.out.println("�Է��Ͻ� ���̵�� �������� �ʽ��ϴ�.");
	}

	public void searchName() {
		System.out.print("�˻��� �̸��� �Է��ϼ��� :");
		String searchName = sc.nextLine();
		int count = 0;
		for(int i = 0;i < ctn; i ++) {
			if(searchName.equals(m[i].getUserName())) {
				printOne(m[i]);
				count ++;
			}
		}
		if(count == 0 )System.out.println("�Է��Ͻ� �̸��� �������� �ʽ��ϴ�.");
	}

	public void searchEmail() {
		System.out.print("�˻��� �̸����� �Է��ϼ��� :");
		String searchEmail = sc.nextLine();
		int count = 0;
		for(int i = 0;i < ctn; i ++) {
			if(searchEmail.equals(m[i].getUserEmail())) {
				printOne(m[i]);
				count ++;
			}
		}
		if(count ==0) System.out.println("�Է��Ͻ� �̸����� �������� �ʽ��ϴ�.");
	}

	public void updatePwd() {
		System.out.print("������ ȸ���� ���̵� �Է��ϼ��� :");
		String changeUserId = sc.nextLine();
		int count = 0;
		for(int i = 0;i < ctn; i ++) {
			if(changeUserId.equals(m[i].getUserId())) {
				System.out.print("�ٲٽ� ��й�ȣ�� �Է��ϼ��� : ");
				String changeUserPwd = sc.nextLine();
				m[i].setUserPwd(changeUserPwd);
				System.out.println("�н����� ������ �Ϸ�Ǿ����ϴ�.");
				count ++;
				break;
			}
		}
		if(count==0)System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
	}

	public void updateName() {
		System.out.print("������ ȸ���� ���̵� �Է��ϼ��� :");
		String changeUserId = sc.nextLine();
		int count = 0;
		for(int i = 0;i < ctn; i ++) {
			if(changeUserId.equals(m[i].getUserId())) {
				System.out.print("�ٲٽ� �̸��� �Է��ϼ��� : ");
				String changeUserName = sc.nextLine();
				m[i].setUserPwd(changeUserName);
				System.out.println("�̸� ������ �Ϸ�Ǿ����ϴ�.");
				count ++;
				break;
			}
		}
		if(count == 0)  System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
	}

	public void updateEmail() {
		System.out.print("������ ȸ���� ���̵� �Է��ϼ��� :");
		String changeUserId = sc.nextLine();
		int count = 0;
		for(int i = 0;i < ctn; i ++) {
			if(changeUserId.equals(m[i].getUserId())) {
				System.out.print("�ٲٽ� �̸����� �Է��ϼ��� : ");
				String changeUserEmail = sc.nextLine();
				m[i].setUserPwd(changeUserEmail);
				System.out.println("�̸��� ������ �Ϸ�Ǿ����ϴ�.");
				count ++;
				break;
			}
		}
		if(count == 0) System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
	}

	public void daleteOne() {
		System.out.print("Ż���� ȸ���� ���̵� �Է��ϼ��� : ");
		String deleteName = sc.nextLine();
		int count = 0;
		for(int i = 0;i < ctn; i ++) {
			if(deleteName.equals(m[i].getUserId())) {
				m[i] = m[i+1];
				break;
			}

		}
		if(count == 0)System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
		else System.out.println("���������� ���� �Ǿ����ϴ�...");
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
