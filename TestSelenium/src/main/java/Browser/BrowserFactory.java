package Browser;

public class BrowserFactory {

	
	public static Browser openBrowser(String browser) {
		
		if("mozilla".equalsIgnoreCase(browser))
			return new Mozilla();
		else if ("chrome".equalsIgnoreCase(browser))
			return new Chrome();
		else if ("safari".equalsIgnoreCase(browser))
			return new Safari() ;
		else if ("ie".equalsIgnoreCase(browser))
			return new InternetExplorer() ;

		else 
		return null;
		
	}
}
