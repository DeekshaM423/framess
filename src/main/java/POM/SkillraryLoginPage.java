package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {

	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gerasBtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillraryDemoapp;
	
	@FindBy(name="q")
	private WebElement serachtb;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement gobtn;
	
	
	@FindBy(name="q")
	private WebElement serachTb;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement goBtn;
	
	public SkillraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void gerasButton() {
		gerasBtn.click();
	}
	
	public void skillrarydemoApp() {
		skillraryDemoapp.click();
	}
	
	public void serachtxtbox(String name) {
		serachtb.sendKeys(name);
	}
	
	public void serachtextbox(String text) {
		serachtb.sendKeys(text);
	}
	public void serachButton() {
		gobtn.click();
	}
	
	public void goButton() {
		gobtn.click();
	}
	
}
