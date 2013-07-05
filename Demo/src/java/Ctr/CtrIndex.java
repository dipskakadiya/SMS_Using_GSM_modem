/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ctr;
import Bean.BeanIndex;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modul.MIndex;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
/**
 *
 * @author sai
 */
public class CtrIndex extends MultiActionController {
     public ModelAndView show(HttpServletRequest req, HttpServletResponse res) {
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }
     public ModelAndView send(HttpServletRequest req, HttpServletResponse res,BeanIndex objbean) {
          ModelAndView mv = new ModelAndView("index");
        try {
            MIndex objmindex = new MIndex();
            objmindex.send(objbean);
            res.sendRedirect("index.htm?action=show&flag=1");
            } catch (Exception e) {
            }
           
        return mv;  
    }
}
