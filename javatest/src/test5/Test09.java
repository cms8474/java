package test5;

import java.util.ArrayList;
import java.util.HashMap;

class Orange {
	private String 	country;
	private int		price;
	
	public Orange(String country, int price) {
		super();
		this.country = country;
		this.price = price;
	}
	@Override
	public String toString() {
		return "원산지 :" + country + ", 가격 : " + price;
	}
	
	
}

public class Test09 {
	public static void main(String[] args) {
		ArrayList<Orange> list1 = new ArrayList<>();
		list1.add(new Orange("파주", 3000));
		list1.add(new Orange("수원", 3000));
		
		ArrayList<Orange> list2 = new ArrayList<>();
		list2.add(new Orange("청주", 3000));
		list2.add(new Orange("충주", 3000));
		
		ArrayList<Orange> list3 = new ArrayList<>();
		list3.add(new Orange("밀양", 3000));
		list3.add(new Orange("함안", 3000));

		HashMap<List<Orange>> map = new HashMap<>();
		map.put("gyeonggi", list1);
		map.put("chungbuk", list2);
		map.put("gyungnam", list3);
		
		List<Orange> list = map.;
		Orange orange = list.;
		orange.show();
		
		map.;
		map.;
		
	}//med
} // ed
