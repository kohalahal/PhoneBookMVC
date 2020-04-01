package org.kohala.view;

import org.kohala.model.Dto;

public class Input implements View {
	
	static int c = 1;
	@Override
	public void display() {
		// TODO Auto-generated method stub
		Dto dto = new Dto();
		System.out.println("이름 입력>>");
		dto.setName(sc.nextLine());
		System.out.println("전화 번호 입력>>");
		dto.setPhone(sc.nextLine());
		data.dto = dto;
		
		
	}

}
