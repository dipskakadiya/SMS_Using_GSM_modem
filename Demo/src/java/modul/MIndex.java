/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modul;

import Bean.BeanIndex;



import java.net.*;
import java.io.InputStreamReader;
import smsSend.SMSClient;


/**
 *
 * @author sai
 */
public class MIndex {
    public MIndex(){
     
    }
    public void send(BeanIndex objbean) throws Exception{
        //System.out.println(objbean.getMessage());
        //URL url = new URL("http://www.ubaid.tk/sms/sms.aspx?uid=8460838411&pwd=dips1992&msg=" + objbean.getNumber() + "&phone=" + objbean.getMessage() + "&provider=160by2");

        //URLConnection conn = url.openConnection();
        //conn.connect();
        //InputStreamReader content = new InputStreamReader(conn.getInputStream());
        //for (int i = 0; i != -1; i = content.read()) {
          //  System.out.print((char) i);
        //}
         SMSClient objsms=new SMSClient(1);
        objsms.sendMessage("9510363083","2nd message");
    }
}



