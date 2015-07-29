package IPAC.git;

import java.util.Calendar;
import javax.xml.bind.DatatypeConverter;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Hello there!!!");
			
//			String s1 = "my.sharepoint.com/personal/prateek_prateekkaul_onmicrosoft_com/Documents/DelFolder/Documents/DelFolder";
//			String s1 = "my.sharepoint.com/personal/prateek_prateekkaul_onmicrosoft_com/Documents/DelFolder/A.txt";
//			String s1 = "my.sharepoint.com/personal/prateek_prateekkaul_onmicrosoft_com/Documents/DelFolder//Sleep/tram/mastB.txt";
//			String s1 = "my.sharepoint.com/personal/prateek_prateekkaul_onmicrosoft_com/Documents/DelFolder/D/C/Loop/at.txt";
//			String s1 = "my.sharepoint.com/personal/prateek_prateekkaul_onmicrosoft_com/Documents/DelFolder/xxc/yyd/tty/ham/Tam/rate.java";
//		String s1 = "my.sharepoint.com/personal/prateek_prateekkaul_onmicrosoft_com/Documents/DelFolder/cream/Dream/lean/gleean/Seam/pleat/next.cs";
//			String s1 = "my.sharepoint.com/personal/prateek_prateekkaul_onmicrosoft_com/Documents/a.txt";
//	
//	String path = "";
//	String[] allItemsInPath = s1.split("/");
//	
//	for(int pos = 3;pos<allItemsInPath.length-1;pos++)
//	{
//		path +=allItemsInPath[pos] + "/";
//		System.out.println(path);
//	}
	
	
			String date ="2015-07-20T12:04:04.547Z";
			String date1 ="Good Boy";
//			String date ="2015-07-20T12:04:04.547+0530";
			Calendar cd = DatatypeConverter.parseDate(date);
			
			System.out.println(cd.getTimeZone());
	}

}
