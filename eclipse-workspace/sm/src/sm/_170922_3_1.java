package sm;

import java.util.*;

class _170922_3_1 {

	public static void main(String[] args) {
		int j;
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ ���ڸ� �Է��ϼ���");
		j= scanner.nextInt();
		System.out.println("����"+j);
		scanner.close();
		char grade;
		switch (j / 10) {
		case 10:
		case 9:
			grade = 'A';
		System.out.println("�Էµ� ���� " + j + "����  " + grade + "���� �Դϴ�.");
			break;
		case 8:
			grade = 'B';
		System.out.println("�Էµ� ���� " + j + "����  " + grade + "���� �Դϴ�.");
			break;
		case 7:
			grade = 'C';
		System.out.println("�Էµ� ���� " + j + "����  " + grade + "���� �Դϴ�.");
			break;

		case 6:
			grade = 'D';
		System.out.println("�Էµ� ���� " + j + "����  " + grade + "���� �Դϴ�.");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			grade = 'F';
		System.out.println("�Էµ� ���� " + j + "����  " + grade + "���� �Դϴ�.");
			break;
		default:
			System.out.println("�߸��� ���� �Է��Դϴ�");
		}
	}
}
