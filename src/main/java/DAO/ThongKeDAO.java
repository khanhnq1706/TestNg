/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import database.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thinkpad E440
 */
public class ThongKeDAO {
    
    public List<Object[]> getSoNguoiHoc() throws SQLException {
        List<Object[]> ds = new ArrayList<>();
        String sql = "{Call sp_ThongKeNguoiHoc}";
        ResultSet rs = JdbcHelper.ExecuteQuery(sql); 
        try {
            while (rs.next()) {
                Object[] temp = {rs.getObject(1), rs.getObject(2), rs.getObject(3), rs.getObject(4)};
                ds.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ds;
    }

    public List<Object[]> getBangDiem(int maKhoaHoc) throws SQLException {
        List<Object[]> ds = new ArrayList<>();
        String sql = "{call sp_BangDiem(?)}";
        ResultSet rs = JdbcHelper.ExecuteQuery(sql, maKhoaHoc);
        try {
            while (rs.next()) {
                String xepLoai = "Xuat Sac";
                float diem = rs.getFloat("diem");
                if (diem < 0) {
                    xepLoai = "chua nhap";
                } else if (diem < 3) {
                    xepLoai = "Kem";
                } else if (diem < 5) {
                    xepLoai = "Yeu";
                } else if (diem < 6.5) {
                    xepLoai = "Trung binh";
                } else if (diem < 7.5) {
                    xepLoai = "kha";
                } else if (diem < 9) {
                    xepLoai = "Gioi";
                }

                Object[] temp = {rs.getObject(1), rs.getObject(2), rs.getObject(3), xepLoai};
                ds.add(temp);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ds;
    }

    public List<Object[]> getDiemTheoChuyenDe() throws SQLException {
        List<Object[]> ds = new ArrayList<>();
        String sql = "{call sp_ThongKeDiem}";
        ResultSet rs = JdbcHelper.ExecuteQuery(sql);
        try {
            while (rs.next()) {
                Object[] temp = {rs.getObject(1), rs.getObject(2), rs.getObject(3), rs.getObject(4), rs.getObject(5)};
                ds.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 

        return ds;
    }
    
    public List<Object[]> getDoanhThu(int nam) throws SQLException{
        List<Object[]> ds = new ArrayList<>();
        String sql = "{call sp_ThongKeDoanhThu(?)}";
        ResultSet rs = JdbcHelper.ExecuteQuery(sql, nam);
        
        try {
            while(rs.next()){
                Object[] temp = {rs.getObject(1),rs.getObject(2),rs.getObject(3),rs.getObject(4),rs.getObject(5),
                                 rs.getObject(6),rs.getObject(7),};
                ds.add(temp);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return ds;
    
    }

}
