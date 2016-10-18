package zsw;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class TestSpringmvcController extends AbstractController {

	//Map<String, Object> map = new HashMap<String, Object>();
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,HttpServletResponse res) throws Exception {
		
		System.out.println("...................");
		return new ModelAndView("haha");
	}
	
	
	

}
