import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

waiting {
    timeout = 2
}
autoClearCookies = true
atCheckWaiting = true

environments {

    // run test in chrome browser
    chrome {
        driver = { new ChromeDriver() }
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