/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5v;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class MailLoader {

    public static ArrayList<String> read() throws ClassNotFoundException, SQLException, IOException {
        ArrayList<String> mailList = new ArrayList<>();
        Class.forName("org.sqlite.JDBC");
        Connection conect = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\usuario\\Desktop\\DB\\PEOPLE");
        Statement state = conect.createStatement();
        String query = "SELECT * FROM MAILS";
        ResultSet rs = state.executeQuery(query);
        System.out.println("query");
        while (rs.next()) {
            String mail = rs.getString("Mail");
            if (!mail.contains("@")) {
                continue;
            }
            mailList.add(mail);
        }
        return mailList;

    }
}
