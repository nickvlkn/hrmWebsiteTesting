package hrm.neotech.test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import hrm.neotech.utils.BaseClass;

public class CheckboxDemo extends BaseClass{

	public static void main(String[] args) {
		//https://neotech.vercel.app/checkbox
		
		setUp();
		List<WebElement>checkboxes=driver.findElements(By.xpath("//main[@class='content']//div/label"));
		
		for(WebElement checkbox:checkboxes)
		{
			boolean selected=checkbox.isSelected();
			System.out.println(selected);
			if(!checkbox.isSelected())
			{
				checkbox.click();
		}
			
		}
		
		
		//tearDown();

	}

}
