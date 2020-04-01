package org.kohala.model;
import static org.kohala.resource.R.*;

public class Dao {
	
	private static int total = 0;
	
	private int top = 0; //current data sum
	private int seq = 1; //keep ++
	
	private Dto[] dao = new Dto[MAX];
	{
	dao[top++] = new Dto(seq++, "KIM", "010-1111-1111");
	dao[top++] = new Dto(seq++, "KIM", "010-1111-1111");
	dao[top++] = new Dto(seq++, "KIM", "010-1111-1111");
	dao[top++] = new Dto(seq++, "KIM", "010-1111-1111");
	dao[top++] = new Dto(seq++, "KIM", "010-1111-1111");
	}
	private Dao() {}//singletone
	private static Dao instance = new Dao();//private so it needs to made in it
	
	public static Dao getInstance() {
		if(instance == null) {
			instance = new Dao();
		}
		return instance;
	}
	
	
	public int emptyIdx() {
		int emp = -1;
		for(int i = 0 ; i < dao.length; i++ ) {
			if(dao[i] == null) { emp = i; break; }
			else { continue; }
		}
		return emp;
	}
	
	public void insert(Dto dto) {
		dao[emptyIdx()] = dto;
		total++;
	}
	
	
	public Dto[] search(String n) {
		Dto[] src = null; 
		int res = 0;
		for(int i = 0 ; i < dao.length; i++ ) {
			try {
				if ( dao[i].getName().equals(n) || dao[i].getPhone().equals(n) ) {res++;}
				else continue;
			} catch (NullPointerException e) {
				continue;
			}
		}
		if (res == 0) return src;
		else {
			src = new Dto[res];
			for(int j = 0; j < src.length; j++) {
				for(int i = 0 ; i < dao.length; i++ ) {
					try {
						if ( dao[i].getName().equals(n) || dao[i].getPhone().equals(n) ) {
							src[j] = dao[i];
							continue;
						} 
					} catch (NullPointerException e) {
						continue;
					}
				}
			}
			return src;
			}	
	}
	
	public Dto[] seletAll() { //그냥 dao주면 수정할지도모름. 복사해서주기
		
		//return dao.clone();
		Dto[] arr = new Dto[total];
		for ( int i = 0; i < total ; i++ ) {
			arr[i] = new Dto();
			arr[i].setIdx(dao[i].getIdx());
			arr[i].setName(dao[i].getName());
			arr[i].setPhone(dao[i].getPhone());
		}
		return arr;
		
	}
	
	public Dto[] selet(Dto dto) {
		Dto[] src = new Dto[top];
		int cnt=0;
		for(int i = 0; i<top; i++) {
			if(dao[i].getName().toUpperCase().equals(dto.getName().toUpperCase())) {
				src[cnt]= new Dto();
				src[cnt].setIdx(dao[i].getIdx());
				src[cnt].setName(dao[i].getName());
				src[cnt].setPhone(dao[i].getPhone());
				cnt++;
			}
		}
		Dto[] arr = new Dto[cnt];
		for(int i = 0; i<cnt; i++) {
			arr[i] = src[i];
		}
		return arr;
	}

	public Dto seletone(Dto dto) {
		return null;
		
	}
	
	public void update(Dto dto) {
		
	}
	
	public void delete(int a) {
		dao[a] = null;
		total--;
	}
	
	
	

}
