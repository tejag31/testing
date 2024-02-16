package com.Common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.Table.Cell;

import io.reactivex.rxjava3.internal.util.LinkedArrayList;

public class CommonFunctionalities {

	/**
	 * public means to access(use) the any where of the project and webDriver is
	 * interface
	 */
	public static WebDriver driver;

	/** this variable used for exceplity wait */
	private WebDriverWait wait;

	/** this variable used for window handling functions */
	public String parentWindow;
	public String childWindow;
	public static String key;

	/**
	 * this method is used for common clickable functionality in webapplication
	 * <p>
	 * elementlocator parameter is a webelement locator path in dom structure.
	 */
	public boolean clickElement(By elementLocator) {
		WebElement ele = driver.findElement(elementLocator);
		if (ele.isDisplayed() & ele.isEnabled()) {
			try {
				ele.click();
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}

		} else {
			return false;
		}

	}

	/**
	 * This method used for Explicity Wait..
	 * <p>
	 * parameters are element means locator path
	 * <p>
	 * time duration of seconds
	 */
	public void elementdelay(By element, long time) {
		WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(time))
				.until(ExpectedConditions.elementToBeClickable((element)));

	}

	/**
	 * This method used for sending the text in the text field...
	 * <p>
	 * parameters are elementLocator means textfield locator path in dom structure.
	 * <p>
	 * text means sending the data
	 */
	public boolean enterText(By elementLocator, String text) {

		if (elementEnable(elementLocator) & elementDisplay(elementLocator)) {
			try {
				driver.findElement(elementLocator).clear();
				driver.findElement(elementLocator).sendKeys(text);
				return true;
			} catch (Exception e) {
				e.printStackTrace();
		     
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * This method used for Enable the element...
	 * <p>
	 * parameters are elementLocator means element locator path in dom structure.
	 */
	public boolean elementEnable(By elementLocator) {
		try {
			driver.findElement(elementLocator).isEnabled();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * This method used for Display the element...
	 * <p>
	 * parameters are elementLocator means element locator path in dom structure.
	 */
	public boolean elementDisplay(By elementLocator) {
		try {
			driver.findElement(elementLocator).isDisplayed();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * This method used for Select the element...
	 * <p>
	 * parameters are elementLocator means element locator path in dom structure.
	 */
	public boolean elementSelecte(By elementLocator) {
		try {
			driver.findElement(elementLocator).isSelected();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * This method used for Screen shot...
	 * <p>
	 * parameters "name" means storing different names.
	 */
	public boolean Screen_Shot(String name) throws Exception {
		try {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			// Now you can do whatever you need to do with it some delay.
			FileUtils.copyFile(scrFile, new File("..\\test-output\\ERP_ScreenShots\\" + name + ".png"));
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	/**
	 * Generic method for Select_By_Text functionality.
	 * <p>
	 * dom structure tag mustbe Select.
	 * <p>
	 * paramters are elementlocator means element path and text means dropdown text
	 */
	public boolean dropDownSelectText(By elementLocator, String text) {
		if (elementEnable(elementLocator) & elementDisplay(elementLocator)) {
			try {
				Select drpCountry = new Select(driver.findElement(elementLocator));
				drpCountry.selectByVisibleText(text);
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * Generic method for Select_By_Index functionality.
	 * <p>
	 * dom structure tag mustbe Select.
	 * <p>
	 * paramters are elementLocator means element path and index means dropdown
	 * index value
	 */
	public boolean dropDownSelectIndex(By elementLocator, int index) {
		if (elementEnable(elementLocator) & elementDisplay(elementLocator)) {
			try {
				Select drpCountry = new Select(driver.findElement(elementLocator));
				drpCountry.selectByIndex(index);
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * Generic method for Dropdown functionality.
	 * <p>
	 * dom structure without Select tag.
	 * <p>
	 * paramters are elementLocator1 means dropdown element path and paramters are
	 * elementLocator2 means inside the dropdown text element path.
	 */
	public boolean Dropdown_Click(By elementLocator1, By elementLocator2) {
		if (elementEnable(elementLocator1) & elementDisplay(elementLocator1)) {
			try {
				clickElement(elementLocator1);
				clickElement(elementLocator2);
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * This method used for Check Box the element...
	 * <p>
	 * parameters elementlocator means element path in dom structure.
	 */
	public boolean Checkbox(By elementLocator) {
		if (elementEnable(elementLocator) & elementDisplay(elementLocator)) {
			try {
				clickElement(elementLocator);
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * This method used for Radio Button the element...
	 * <p>
	 * parameters elementlocator means element path in dom structure.
	 */
	public boolean Radiobutton(By elementLocator) {
		if (elementEnable(elementLocator) & elementDisplay(elementLocator)) {
			try {
				clickElement(elementLocator);
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * This method used for Clear the element text field...
	 * <p>
	 * parameters elementlocator means element path in dom structure.
	 */
	public boolean textClear(By elementLocator) {
		if (elementEnable(elementLocator) & elementDisplay(elementLocator)) {
			try {
				driver.findElement(elementLocator).clear();
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * This method used for Scrolldown the page...
	 * <p>
	 * parameters num means page scroll down to end number.
	 */
	public void ScrollPage(int hori, int verti) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + hori + "," + verti + ")", "");
	}

	/**
	 * This method used for get the text from the table data...
	 * <p>
	 * parameters tablename means table title
	 * <p>
	 * excellvalue means table column value
	 * <p>
	 * excellname means table column header
	 */
	public int Web_tables_text(By tablename, String Excellvalue, String ExcolName) {
		// boolean result = false;
		int row = -1;
		WebElement table = driver.findElement(tablename);
		List<WebElement> cells = table.findElements(By.xpath(("tbody/tr/th")));
		int colCount = cells.size();
		int colnum = 1;
		for (int i = 1; i <= colCount; i++) {
			String colname = table.findElement(By.xpath(("tbody/tr/th[" + i + "]"))).getText();
			if (colname.equalsIgnoreCase(ExcolName)) {
				colnum = i;
				break;
			}
		}
		int rows = table.findElements(By.xpath(("tbody/tr"))).size();
		int rownum = 0;
		for (int j = 2; j <= rows; j++) {
			String cellvalue = table.findElement(By.xpath(("tbody/tr[" + j + "]/td[" + colnum + "]"))).getText();

			if (cellvalue.equalsIgnoreCase(Excellvalue)) {
				rownum = j;
				break;
			}

		}

		if (rownum >= 2) {
			row = rownum;
		}
		return row;
	}

	/**
	 * This method used for Accept the popup...
	 */
	public boolean alertAccept() {
		try {
			driver.switchTo().alert().accept();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * This method used for Dismiss the popup...
	 */
	public boolean alertDismiss() {
		try {
			driver.switchTo().alert().dismiss();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * This method used for gettext the popup...
	 */
	public String alertGetText() {
		try {
			return driver.switchTo().alert().getText();

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	/**
	 * This method used for gettext the popup...
	 * <p>
	 * text parameter means passing the data in popup.
	 */
	public void alertSendkeys(String text) {
		try {
			driver.switchTo().alert().sendKeys(text);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * This method used for gettext from webelement...
	 * <p>
	 * locator parameter means webelement path.
	 */
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}

	/**
	 * This method used for geturl from webpage...
	 */
	public String currentURL() {
		return driver.getCurrentUrl();
	}

	/**
	 * This method used for gettitle from webpage...
	 */
	public String getTitle() {
		return driver.getTitle();
	}

	/** using this method for exceplicity wait */
	public void Waits(int time) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(time));
	}

	/** using this method for wait after element is present */
	public void alertIsPresent() {
		wait.until(ExpectedConditions.alertIsPresent());
	}

	/** using this method for wait after element is clickable */
	public void elementClickable(By locator) {
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	/** using this method for wait after element is visiblity */
	public void visibilityOfElement(By locator) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	/** using this method for mulitiple windows handling */
	public void WindowsHandling() {
		parentWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		for (String s : windows) {
			if (!s.equals(parentWindow)) {
				childWindow = s;
			}
		}
	}

	/** using this method for window handling */
	public void switchToWindow() {
		if (driver.getWindowHandle().equals(parentWindow))
			driver.switchTo().window(childWindow);
		else
			driver.switchTo().window(parentWindow);
	}

	/** using this method for delay in seconds */
	public void delay(int timesec) {

		long start = System.currentTimeMillis();
		long end = start + timesec * 1000;
		while (System.currentTimeMillis() < end) {
			// Some expensive operation on the item.
		}

	}

	public int tableInfo(String colno, String rowno) throws InterruptedException {
		int noofcols = driver.findElements(By.xpath("//thead/tr/th")).size();
		int noofrows = driver.findElements(By.xpath("//tbody/tr")).size(); // can edit
		int row = 0;
		int count = 0;
		int j = 0;
		int totalpages = 2; // edit
		for (int i = 1; i <= noofcols; i++) {
			WebElement colname = driver.findElement(By.xpath("//thead/tr/th[" + i + "]"));
			if (colname.getText().equals(colno)) {
				for (int m = 1; m <= totalpages; m++) {
					for (j = 1; j <= noofrows; j++) {
						WebElement rowvalue = driver.findElement(By.xpath("//tbody/tr[" + j + "]/td[" + i + "]"));
						scrollToElement(rowvalue);
						count++;
						if (rowvalue.getText().equals(rowno)) {
							row = count;
							break;
							
						}
					}
					if (driver.findElement(By.xpath("//a[text()='Next']")).isEnabled() && j > noofrows) {
						WebElement nextpage = driver.findElement(By.xpath("//a[text()='Next']"));
						scrollToElement(nextpage);
						Thread.sleep(3000);
						nextpage.click();
						Thread.sleep(3000);
					}
					if (row > 0)
						break;
				}
			}
			if (row > 0)
				break;
		}
		return row;
	}

	public static String[][] excelData(String loc, String sheetname, By locator) throws IOException {
		// By No_of_rooms = ;
		File file = new File(loc);
		FileInputStream fi = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sheet = wb.getSheet(sheetname);
		int a = sheet.getLastRowNum(); // 3
		int b = sheet.getRow(0).getLastCellNum(); // 2
		String[][] data = new String[a][b];
		Object[] data1 = new String[a];

		for (int i = 1; i <= a; i++) {

			for (int j = 0; j < b; j++) {
				key = sheet.getRow(i).getCell(j).toString();
				WebElement ele = driver.findElement(locator);
				// driver.findElement(By.xpath("//input[@placeholder='"+sheet.getRow(i).getCell(j).toString()+"']"));
				j++;
				XSSFCell cell = sheet.getRow(i).getCell(j);
				if (cell != null) {
					switch (cell.getCellType()) {
					case NUMERIC:
						double numericValue = cell.getNumericCellValue();
						int ab = (int) numericValue;
						ele.sendKeys("" + ab + "");

						break;
					case STRING:
						String stringValue = cell.getStringCellValue();
						ele.sendKeys(stringValue);

						break;
					}
				} else {
					System.out.println("Cell is null");
				}
			}
		}

		return data;
	}

	public void scrollToElement(WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	public void editActions(int row) {
		By editactions = By.xpath("//button[@data-bs-target='#editData-"+row+"']");
		clickElement(editactions);
	}
	public void DeleteActions(int row) {
   	 By deleteactions=By.xpath("//button[@data-bs-target='#deleteData-"+row+"']");
		clickElement(deleteactions);
	}
	public void removeRecord(int row) {
		By removerecord=By.xpath("//div[@id='deleteData-"+row+"']//a[text()='Delete']");
		clickElement(removerecord);
		
	}
	public void submitUpdated(int row) {
   	 By update_submit = By.xpath("//div[@id='editData-"+row+"']//span[text()='Submit']");
		clickElement(update_submit);
	}
	public void UpdateStatus(int row) {
		
		By status=By.xpath("//tbody/tr/td[@class='sorting_1' and text()='"+row+"']/following-sibling::td/form//button");
	    WebElement activeandinactive=driver.findElement(status);
	    scrollToElement(activeandinactive);
	    clickElement(status);
	}
	public void searchRecords(String value) {
		By search=By.xpath("//input[@type='search']");
		enterText(search,value);
	}
	
	public String searcfunc(int row,String value) {
		By loc=By.xpath("//tbody/tr/td[@class='sorting_1' and text()='"+row+"']/following-sibling::td[text()='"+value+"  ']");
		WebElement ele=driver.findElement(loc);
		scrollToElement(ele);
		System.out.println(ele.getText());
		return ele.getText();
	}
	

}
