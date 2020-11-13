package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.sun.org.apache.xpath.internal.objects.XStringForFSB;

public class DoubtClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./src/main/java/browserDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/");
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']//li"));
		for (WebElement webElement : ele) {
			System.out.println(webElement.getText());
		}
	}
}

class excel{
	public static String data(String fileName, String sheetName) throws IOException {
		
		String value = "";
		File f = new File(fileName);
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheet = w.getSheet(sheetName);
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j <row.getPhysicalNumberOfCells() ; j++) {
				Cell cell = row.getCell(j);
				CellType celltype = cell.getCellType();
				if(celltype.equals(CellType.STRING)){
					value = cell.getStringCellValue();
				}
				else if(celltype.equals(CellType.NUMERIC)) {
					int v = (int) cell.getNumericCellValue();
					value = String.valueOf(v);
				}
			}
		}
		return value;
	}
}
