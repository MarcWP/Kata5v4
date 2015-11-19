/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5v;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class KATA5V {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {

       //String name="C:\\Users\\usuario\\Desktop\\emails.txt";
        ArrayList<String>mailArray=MailLoader.read();
        Histogram<String> histogram = MailHistogramBuilder.build(mailArray);
        new HistogramaDisplay(histogram).execute();
    }
}
