package ge.cloudconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <br/><br/>
 * Created by <b>Vako Beridze  &lt;vako.beridze@gmail.com&gt; </b> <br/>
 * Created at  <b> 6/1/17 </b> <br/>
 */

@Controller
public class RateController {

    @Value("${rate}")
    String rate;

    @Value("${lanecount}")
    String laneCount;

    @Value("${tollstart}")
    String tollStart;

    @RequestMapping("/rate")
    public String getRate(Model m){
        m.addAttribute("rateamount", rate);
        m.addAttribute("lanes", laneCount);
        m.addAttribute("tollstart", tollStart);

        return "rateview";
    }
}
