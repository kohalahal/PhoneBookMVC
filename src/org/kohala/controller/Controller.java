package org.kohala.controller;
import static org.kohala.resource.R.*;

import org.kohala.model.Dto;
import org.kohala.view.Front;
import org.kohala.view.Print;


public class Controller {
	
	public void service() {
		
		new Front().display();
		while(data.no != 5) {		
			try {
				System.out.println("try");
				viewArr[data.no].display();
				switch(data.no) {
				
				case 1: //data.dto를 dao로 넒긴다
						//System.out.println("case1");
						System.out.println("::::"+menuArr[data.no]+" 메뉴::::");
						viewArr[data.no].display();
						dao.insert(data.dto);
						break;
						
						System.out.println("::::"+menuArr[data.no]+" 메뉴::::");
						viewArr[2].display();
						switch(data.no) {
						case 1:
						case 2:((Print)viewArr[3]).display(data.dtoArr);
						}
						
						
				case 2: //dao에서 가져와서 view로 넘긴다
						break;
								
				case 3:
						System.out.println("::::"+menuArr[data.no]+" 메뉴::::");
				case 4:
						System.out.println("::::"+menuArr[data.no]+" 메뉴::::");
				case 5:
						System.out.println("::::"+menuArr[data.no]+" 메뉴::::");

				default:
				
				
				}
				
			} catch (NullPointerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(error);
			} catch (Exception e) {
				System.out.println(error);
			}
			data.no = 0;
		}
		
		
	}

}
