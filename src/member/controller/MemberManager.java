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
		
		for(int i = 0;i < ctn; i ++) {
			if(searchId.equals(m[i].getUserId())) {
				printOne(m[i]);
			}else System.out.println("�Է��Ͻ� ���̵�� �������� �ʽ��ϴ�.");
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
