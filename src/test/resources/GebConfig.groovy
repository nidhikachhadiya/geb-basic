import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities

waiting {
    timeout = 2
}
autoClearCookies = true
atCheckWaiting = true

environments {

    // run test in chrome browser
    chrome {
        driver = {
        ChromeOptions options = new ChromeOptions ()
            options.addArguments("start-fullscreen")
            options.addArguments("-incognito")
            options.setExperimentalOption("useAutomationExtension", false);
            options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
       new ChromeDriver(capabilities)
        }
    }

    //run test with chrome browser in headless mode
    chromeHeadless {
        driver = {
            ChromeOptions o = new ChromeOptions()
            o.addArguments('headless')
            new ChromeDriver(o)
        }
    }
}
baseUrl = "http://gebish.org"