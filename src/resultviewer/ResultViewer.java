/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resultviewer;

import java.io.IOException;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author User
 */
public class ResultViewer {

    
    public static void main(String[] args) throws IOException{
       Frame f = new Frame();
        f.setVisible(true);

} 
    
    public static void webpage(String indexnumber,Frame f) throws IOException{
         Response response;
             response = (Response) Jsoup.connect("https://doenets.lk/result/alresult.jsf")
                     .data("frm","frm")
                     .data("frm:btnSubmit","submit")
                     .data("frm:username",indexnumber)
                     .data("javax.faces.ViewState","ytD84SYHYtBpqEIwyiK5A/76x7lRS88BTZ3uxjykz7AE9dUMJGXcus0K6sJ7NxI0StCGK5PAYju8HUL57hGklUlUtJVoBzqlmnuwfjcJopgWTuPMRZ+15L2dHqVGErMLuIuZBbn2y3FtPKH+eZUkersn83zu9K5+KsrePDhIeXaOi0oyCSBwYYz7M5fJ+yRRLdcWanc4fNTcBboxkUVue9NbYS7LAK7Y56bjcwhQjvRaTra0vJCcBNVOdFolBV9802mlYe2Q9ln/pJATd+FFcKfXeRkVIhO8spF/LGO23citwDbaITNpeq/vkPinn28skyE3CXqOk51oxdVgPhFNgqLv43NKIrwizFyyf0hrFuahu2cqbzAR5depy0d9TDPm/8hz888E+mznC2CPdsuJvx/7kkEGJ627kHuArfKp5MjVsBN/Dk6/fWQDoNIXCkm5ugpRCaszbRJjC3pn9w5f4+UH5lkWaeQkqOFnIerS2N7hpxHu9+dNONlncCuGLld/YpVvgf8+XXMyf5/+j5r6hQ==\"")
                     .method(Method.POST)
                     .execute();

        Document d=response.parse();
     
        Elements lines = d.select("td");
    
        Element ch;
        ch = d.getElementById("j_idt11:j_idt13_content");
        
        if(ch==null){
        int i=0;
         f.invalidLable.setText("");
         for (Element headline : lines) {
             
                 
            
             switch (i) {
                 case 0:
                     f.examLable.setText(headline.ownText());
                     break;
                 case 1:
                     f.ExamValLable.setText(headline.ownText());
                     break;
                 case 2:
                     f.yearLable.setText(headline.ownText());
                     break;
                 case 3:
                     f.yearValueLable.setText(headline.ownText());
                     break;
                 case 4:
                     f.nameLable.setText(headline.ownText());
                     break;
                 case 5:
                     f.nameValLable.setText(headline.ownText());
                     break;
                 case 6:
                     f.indexLable.setText(headline.ownText());
                     break;
                 case 7:
                     f.indexValLable.setText(headline.ownText());
                     break;
                 case 8:
                     f.DRLable.setText(headline.ownText());
                     break;
                 case 9:
                     f.DRValLable.setText(headline.ownText());
                     break;
                 case 10:
                     f.IRLable.setText(headline.ownText());
                     break;
                 case 11:
                     f.IRValLable.setText(headline.ownText());
                     break;
                 case 12:
                     f.Zlable.setText(headline.ownText());
                     break;
                 case 13:
                     f.ZValLable.setText(headline.ownText());
                     break;
                 case 14:
                     f.streamLable.setText(headline.ownText());
                     break;
                 case 15:
                     f.streamValLable.setText(headline.ownText());
                     break;
                 case 16:
                     f.s1Lable.setText(headline.ownText());
                     break;
                 case 17:
                     f.s1valLable.setText(headline.ownText());
                     break;
                 case 18:
                     f.s2Lable.setText(headline.ownText());
                     break;
                 case 19:
                     f.s2ValLable.setText(headline.ownText());
                     break;
                 case 20:
                     f.s3Lable.setText(headline.ownText());
                     break;
                 case 21:
                     f.s3ValLable.setText(headline.ownText());
                     break;
                 case 22:
                     f.s4Lable.setText(headline.ownText());
                     break;
                 case 23:
                     f.s4ValLable.setText(headline.ownText());
                     break;
                 case 24:
                     f.s5Lable.setText(headline.ownText());
                     break;
                 case 25:
                     f.s5ValLable.setText(headline.ownText());
                     break;
                 default:
                     break;
             }
            
             i++;
         }
        }else{
           f.invalidLable.setText("Invalid");
           f.examLable.setText("");         
           f.ExamValLable.setText("");
           f.yearLable.setText("");
           f.yearValueLable.setText("");
           f.nameLable.setText("");
           f.nameValLable.setText("");
           f.indexLable.setText("");
           f.indexValLable.setText("");
           f.DRLable.setText("");
           f.DRValLable.setText("");
           f.IRLable.setText("");
           f.IRValLable.setText("");
           f.Zlable.setText("");
           f.ZValLable.setText("");
           f.streamLable.setText("");
           f.streamValLable.setText("");
           f.s1Lable.setText("");
           f.s1valLable.setText("");
           f.s2Lable.setText("");
           f.s2ValLable.setText("");
           f.s3Lable.setText("");
           f.s3ValLable.setText("");
           f.s4Lable.setText("");
           f.s4ValLable.setText("");
           f.s5Lable.setText("");
           f.s5ValLable.setText("");
        }
        //return arr;
    }
    
}
