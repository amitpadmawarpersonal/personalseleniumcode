package seleniumsessions;

public interface Util {

	String CHROME_BROWSER = "chrome";
	String EDGE_BROWSER = "edge";
	String FIREFOX_BROWSER = "firefox";

	public void navigateUrl(String url);

	public String getPageTitle();

	public String getPageUrl();

	public String getPageSource();

	public void closeBrowser();

	public void quitBrowser();

}
