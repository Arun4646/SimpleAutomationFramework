package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility {
	
	WebDriver driver;
	String executingFolderPath;

	public ScreenshotUtility(WebDriver driver) {
		this.driver = driver;
	}
	
	public void takeScreenshot(){
		String imageName = Thread.currentThread().getStackTrace()[2].getMethodName() + "_" +System.currentTimeMillis() + ".png";
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File(executingFolderPath+"\\"+ imageName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String createExecutingFolder(String name) {
		
		String PATH = System.getProperty("user.dir")+"\\screenshots\\";
		executingFolderPath = PATH + name +"_"+ System.currentTimeMillis();   
		File directory = new File(String.valueOf(executingFolderPath));
		if(!directory.exists()){
			directory.mkdir();
		}

		return executingFolderPath;
	}
}
