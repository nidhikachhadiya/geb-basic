package spec

import geb.spock.GebSpec
import page.GebishHomePage

class GebishSpec extends GebSpec{

    /*
       @author nidhi.kachhadiya
       @since 31st December 2019
   */
    def "Open book of geb"(){
        when:
            to GebishHomePage
        then:''
            at GebishHomePage
    }
}
