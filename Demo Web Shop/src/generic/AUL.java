package generic;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class AUL implements IAutoConst
{
 public static String getPropertyValue(String path, String key)
 	{
	 String val="";
	 try
	 {
	 	Properties p=new Properties();
	 	p.load(new FileInputStream(path));
	 	val = p.getProperty(key);
	 }
	 catch (Exception e) 
	 {
	 }
	 return val;
	 }
 
 public static void getScreenShot(WebDriver driver, String path , String name )
 {
	 TakesScreenshot ts=(TakesScreenshot)driver;
	 try
	 {
	 File srcFile=ts.getScreenshotAs(OutputType.FILE);
	 File destFile=new File(path+name);
	 FileUtils.copyFile(srcFile, destFile);
	 }
	 catch (Exception e)
	 {
		 
	 }
  }
 
 
 }


 