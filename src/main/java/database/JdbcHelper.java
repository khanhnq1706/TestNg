/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thinkpad E440
 */
public class JdbcHelper {

    private static String url = "jdbc:sqlserver://localhost:1433;databaseName=Polypro";
    private static String user = "sa";
    private static String passSQL = "123";

    public static PreparedStatement getPreparedStm(String sql, Object... obj) {
        try {
            Connection con = DriverManager.getConnection(url, user, passSQL);
            PreparedStatement pstm = null;
            if (sql.startsWith("{")) {
                pstm = con.prepareCall(sql);

            } else {
                pstm = con.prepareStatement(sql);

            }

            for (int i = 0; i < obj.length; i++) {
                pstm.setObject(i + 1, obj[i]);

            }

            return pstm;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static int ExecuteUpdate(String sql, Object... obj) {
        PreparedStatement pstm;
        try {
            pstm = getPreparedStm(sql, obj);
            // return > 0 neu nhu co thay doi trong database
         

            return pstm.executeUpdate();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);

        }

    }

    public static ResultSet ExecuteQuery(String sql, Object... obj) {

        ResultSet rs;
        try {
            PreparedStatement pstm = getPreparedStm(sql, obj);

            return rs = pstm.executeQuery();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } 

    }
    
    
    

}
