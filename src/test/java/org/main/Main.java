package org.main;

import org.pojo.SearchHotelPojo;
import org.pojo.SelectHotelPojo;
import org.pojo.SigninPojo;
import org.reusable.Reusable;

public class Main extends Reusable {
	public static void main(String[] args) throws InterruptedException {
		webLaunch();
		webUrl("http://adactinhotelapp.com/index.php");
		SigninPojo np = new SigninPojo();
		insert(np.getUsername(), "Gopideva");
		insert(np.getPssword(), "deva@1274");
		System.out.println(" ");
		System.out.println("****SigninPojo****");	
		getTit();
		getCurrUrl();
		btnTap(np.getLogin());
		Thread.sleep(2000);

		SearchHotelPojo sh = new SearchHotelPojo();
		sbi(sh.getLoc(), 8);
		sbi(sh.getHotel(), 2);
		sbi(sh.getRoomType(), 4);
		sbi(sh.getRoomNo(), 10);
		insert(sh.getChkinDate(), "22/06/2020");
		insert(sh.getChkoutDate(), "01/07/2020");
		sbi(sh.getAdultRoom(), 2);
		sbi(sh.getChildRoom(), 2);
		System.out.println(" ");
		System.out.println("****SearchHotelPojo****");
		getTit();
		getCurrUrl();
		btnTap(sh.getSearch());
		Thread.sleep(2000);
		
		SelectHotelPojo sl=new SelectHotelPojo();
		btnTap(sl.getSelectHotel());
		System.out.println(" ");
		System.out.println("****SelectHotelPojo****");
		getTit();
		getCurrUrl();
		btnTap(sl.getCont());

	
	}}
