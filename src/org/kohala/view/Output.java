package org.kohala.view;

public class Output implements View {

	static int c = 2;
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		for( int i = 0; i <outmenuArr.length; i++ ) {
			System.out.print("\t"+(i+1)+"."+outmenuArr[i]);
		}
		System.out.println();
		System.out.println(inp);
		data.no = sc.nextInt();
		sc.nextLine();
		
		
	}

}
