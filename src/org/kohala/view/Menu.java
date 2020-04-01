package org.kohala.view;

public class Menu implements View {
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("<<전화 번호부  메인 메뉴>>");
		for(int i = 1; i<menuArr.length; i++) {
			System.out.printf("\t%d.%s",i,menuArr[i]);
		}
		System.out.println();
		System.out.println(inp);
		data.no = sc.nextInt();
		sc.nextLine();			
	}
	
//	public static void main(String[] args) {
//		new Menu().display();
//	}

}
