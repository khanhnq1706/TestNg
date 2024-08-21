/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import database.JdbcHelper;
import entity.ChuyenDe;
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
public class ChuyenDeDAO implements DAOEntityInterFace<ChuyenDe> {

    @Override
    public void insert(ChuyenDe E) {
        String Sql = "insert chuyenDe values (?,?,?,?,?,?)";
        JdbcHelper.ExecuteUpdate(Sql, E.getMaChuyenDe(), E.getTenChuyenDe(), E.getHocPhi(), E.getThoiLuongHoc(),
                E.getHinhAnh(), E.getMoTa());

    }

    @Override
    public void update(ChuyenDe E) {
        String Sql = "update chuyenDe set tenChuyenDe =? ,hocPhi =?, thoiLuong =?, hinh =? ,moTa =? where maChuyenDe =?";
        JdbcHelper.ExecuteUpdate(Sql, E.getTenChuyenDe(), E.getHocPhi(), E.getThoiLuongHoc(),
                E.getHinhAnh(), E.getMoTa(), E.getMaChuyenDe());

    }

    @Override
    public int delete(String ID) {
        String Sql = "delete chuyenDe where maChuyenDe = ?";
        return JdbcHelper.ExecuteUpdate(Sql, ID);

    }

    @Override
    public List<ChuyenDe> selectAll() {
        List<ChuyenDe> ds = new ArrayList<>();
        String sql = "Select * from ChuyenDe";
        ResultSet rs = JdbcHelper.ExecuteQuery(sql);
        
        
        try {
            while (rs.next()) {
                ChuyenDe temp = readFromResultSet(rs);
                ds.add(temp);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ChuyenDeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ds;
    }

    @Override
    public ChuyenDe findById(String ID) {
        String sql = "Select * from ChuyenDe where MaChuyenDe = ?";
        ResultSet rs = JdbcHelper.ExecuteQuery(sql, ID);
        try {
            while (rs.next()) {
                ChuyenDe temp = readFromResultSet(rs);
                return temp; 
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChuyenDeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
		return null;
        

    }

    private ChuyenDe readFromResultSet(ResultSet rs) throws SQLException {
        ChuyenDe CD = new ChuyenDe();
        CD.setMaChuyenDe(rs.getString(1));
        CD.setTenChuyenDe(rs.getString(2));
        CD.setHocPhi(rs.getFloat(3));
        CD.setThoiLuongHoc(rs.getInt(4));
        CD.setHinhAnh(rs.getString(5));
        CD.setMoTa(rs.getString(6));
        return CD;
    }

   

}
