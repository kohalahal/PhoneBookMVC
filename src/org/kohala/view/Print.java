package org.kohala.view;

import org.kohala.model.Dto;

public class Print implements View {
	
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		if(data.no == 1) {
			if(data.dtoArr == null) {
				System.out.println(noRes);
				return;
			} else {
				for(int i = 0; i < attArr.length; i++) {
					System.out.print(attArr[i]+"\t");
				}
				System.out.println();
				for(int i = 0; i < data.dtoArr.length; i++) {
					try {
						System.out.println(data.dtoArr[i]);
					} catch (NullPointerException e) {}
				}
				System.out.println();
			}
		} else if (data.no == 2) {
			
		}
}
