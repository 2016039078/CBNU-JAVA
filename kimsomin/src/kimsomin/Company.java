package kimsomin;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Company {
	public static void main(String args[]) {
		String result = ""; 
		Employee obi = null; 
		Manager mng = null; 
		String empNo = null; 
		String name = null; 
		String part = null;
		String position = null; 
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("��� �Է�(��)A1285 : ");
			empNo = in.readLine();
			System.out.print("�̸� �Է�(��)��ҹ� :");
			name = in.readLine();
			System.out.print("�μ� �Է�(��)��ȹ :");
			part = in.readLine();
			System.out.print("��å �Է�(��)���-1, �븮-2, ����-3 :");
			position = in.readLine();
		} catch (Exception e) {
			System.out.println("input error");
		}

				if (position.equals("1")) { 
					
					obi = new Employee(empNo, name, part);
					result += obi.resultStr();
				} else { 
					position = (position.equals("2")) ? "�븮" : "����";
					obi = new Manager(empNo, name, part, position);
					result += obi.resultStr();
				}

				// ��� ���ڿ��� �ֿܼ� ���
				System.out.println(result);
			}
		}

	
	
