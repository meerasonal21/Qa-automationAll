package data;

public class ReadWriteExcelFile {

	public static void main(String[] args) {
		Xls_Reader d = new Xls_Reader("C:\\QA\\Testing\\NikulTest.xlsx");
		System.out.println(d.getCellData("Data1", "Name", 3));//this is the main step to read from excel 
		String correctEmail = d.getCellData("Data1", 1, 2);//these are extra steps
		System.out.println(correctEmail);
		
		String browser = d.getCellData("Data1", "Browser", 2);
		System.out.println(browser);
		
		System.out.println(d.getRowCount("Data1"));//7
		System.out.println(d.getColumnCount("Data1"));//7
	    
		d.setCellData("Data1", "Name", 11, "Testing11");
		System.out.println(d.getCellData("Data1", "Name", 11));//Testing11
		System.out.println(d.getRowCount("Datat1"));//11
		
		d.addColumn("Data1", "Nikul");
		System.out.println(d.getColumnCount("Data1"));
	
	
	
	
	
	}

}
