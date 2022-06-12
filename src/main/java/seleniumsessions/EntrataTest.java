package seleniumsessions;

public class EntrataTest {
	//Driver class for BrowserUtil class and Util Interface
	public static void main(String[] args) {

		BrowserUtil butil = new BrowserUtil();
		butil.init_driver("chrome");
		butil.navigateUrl("https://www.entrata.com");
		String title = butil.getPageTitle();
		System.out.println(title);
		if (title.equals("Property Management Software | Entrata")) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is wrong");
		}
		String currentUrl = butil.getPageUrl();
		System.out.println(currentUrl);
		boolean source = butil.getPageSource().contains("Learn More About Working for Entrata");
		System.out.println(source);

	}

}
