package seleniumsessions;

public class BrowserTestNew {
	//Driver class for BrowserUtilNew and UtilNew 
	public static void main(String[] args) {
		BrowserUtilNew brutil = new BrowserUtilNew();
		brutil.init_browser("firefox");
		brutil.navigateUrl("https://www.flipkart.com");
		String title = brutil.getPageTitle();
		System.out.println(title);
		if (title.contains("Online Shopping Site for Mobiles")) {
			System.out.println("correct title");
		} else {
			System.out.println("incorrct title");
		}
		String acUrl = brutil.getPageUrl();
		System.out.println(acUrl);
		boolean source = brutil.getPageSource().contains("anonymous");
		System.out.println(source);

	}

}
