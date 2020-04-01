package org.kohala.resource;

import java.util.Scanner;

import org.kohala.model.Dao;
import org.kohala.view.Input;
import org.kohala.view.Menu;
import org.kohala.view.Output;
import org.kohala.view.Print;
import org.kohala.view.View;

public interface R {
	
	Scanner sc = new Scanner(System.in);
	
	String appTitle = "물고기 전화 번호부";
	String version = "v1.0";
	String author = "hal";
	
	int MAX = 100;
	
	String[] menuArr = {null, "저장", "보기", "수정", "삭제", "종료"};
	View[] viewArr = {new Menu(), new Input(), new Output(), new Print(), null };
	String[] outmenuArr = {"전체 보기", "검색하기"};
	String[] srcmenuArr = {"#으로", "이름으로", "전화 번호로"};
	String[] attArr = {"#", "이름", "전화 번호"};
	String inp = "입력>>";
	String error = "오류 발생";
	String inpError = "잘못 입력하셨습니다.";
	String noRes = "결과가 없습니다.";
	String comPl = "완료하였습니다.";
	String exit = "시스템이 종료됩니다.\n안녕히계세요.";
	
	Data data = new Data();
	View menu = new Menu();
	
	Dao dao = Dao.getInstance();//dao는 private이라 뉴다오 안됨.
	
			
	
}
