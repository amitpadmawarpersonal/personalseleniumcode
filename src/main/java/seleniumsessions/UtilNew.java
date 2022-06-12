package seleniumsessions;

public interface UtilNew {
	
	String chrome_browser = "chrome";
	String edge_browser = "edge";
	String firefox_browser = "firefox";
	
	public void navigateUrl(String url);

	public String getPageTitle();

	public String getPageUrl();

	public String getPageSource();

	public void closeBrowser();

	public void quitBrowser();

}
