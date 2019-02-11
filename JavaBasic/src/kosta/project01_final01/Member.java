package kosta.project01_final01;

import java.util.Calendar;

public class Member extends Movie implements User {

	public Member() {
	}

	private String id;
	private String pw;
	Calendar gc = Calendar.getInstance();
	int month = gc.get(Calendar.MONTH) + 1;
	public Member(int titleNum, int date, int time, String id, String pw) {
		super(titleNum, date, time);
		this.id = id;
		this.pw = pw;
	}

	public Member(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public void show() {

		int a = super.getTitleNum();
		if (super.getDate() == 0) {
			System.out.println("ȸ�� [\tID :" + id +"] ���� ���೻���� �����ϴ�." );
			
		} else {
			System.out.println("ȸ�� \tID :" + id +"�� ���೻�� �Դϴ�. ");
			System.out.println(
					"�� �� :" + super.movie[a] + "\t\t �� ¥ :"+ month +" �� " + super.getDate()+" �� " + "\t\t �� ���� �ð� : " + super.getTime()+" : 00" );
			System.out.println("---------------------------------------------------------------------------------");
		}
	}
}