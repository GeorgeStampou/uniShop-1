package uniShop;

import GUI.*;

public class Main {
	
	/*����� 8 : ��������� ����������� �������� ���� ������ ��������� ��� ��������.
	 * �� ���� ��� ������ : dai19146,dai19098,dai19005,dai19096,dai19187,dai19144,dai19180,dai19072
	 * 
	 * � ������� �������������� ��� ������.
	 * ������ ��� ����� ���������� ������ ��������. ������ ��� �������
	 * ��������� ���� ���������. ��� ���� ��������� ��������������� � 
	 * ����� LocalDataBase � ����� ���� ����� ����� 
	 * ��� ������ ���� �� ��� �� ���������� �����������.
	 * �������� ��� ��� �������� ����������� ��� ��������� ���� ����
	 * ���� ���������� � �������� �������� �������� ���� �������� �����
	 * �� ������������ ��� ���� ��� ������� filter ���� ��� ���������. 
	 * ������ ���� ���������� ��� � �������� �������� ��� ������� ����� 
	 * ������������ ������ ���� �������� ����� ��� ������ ���� ��� �����������.
	 * ��� ���� ���������� � ���������� ����������� ������/��������.
	 * ����� ������� ��� �������� ��� ������� register ��� login ����� ��� 
	 * ��������� ����� ������� �� ���������. ���������� ���� ����� , ����� �������
	 * ��� ���� �� ������� ������������. �� ���� ��������� ��� ���� createNewAd ��
	 * �� tags. ����� �� �������� �� scroll ��� ������������.
	 * 
	 * ��� registered ������ username : User 1
	 * 						 password : user1
	 */

	public static void main(String[] args) {
		
		LocalDataBase db = new LocalDataBase();
		
		new HomeScreen_Guest(db);
	}

}
