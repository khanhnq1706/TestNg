/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import database.JdbcHelper;
import entity.KhoaHoc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thinkpad E440
 */
public class KhoaHocDAO implements DAOEntityInterFace<KhoaHoc> {
    
    @Override
    public void insert(KhoaHoc E) {
        String sql = "insert khoaHoc(maChuyenDe,hocPhi,thoiLuong,ngayKhaiGiang,ghiChu,maNV,ngaytao) values (?,?,?,?,?,?,?)";
        JdbcHelper.ExecuteUpdate(sql, E.getMaChuyenDe(), E.getHocPhi(), E.getThoiLuong(), E.getNgayKhaiGiang(),
                E.getGhiChu(), E.getMaNhanVien(), E.getNgayTao());  
        
    }
    
    @Override
    public void update(KhoaHoc E) {
        String sql = "update khoaHoc set maChuyenDe =?, hocPhi=?,thoiLuong=?,ngayKhaiGiang=?,ghiChu=?,maNV=?,ngaytao=? where maKhoaHoc =?";
        JdbcHelper.ExecuteUpdate(sql, E.getMaChuyenDe(), E.getHocPhi(), E.getThoiLuong(), E.getNgayKhaiGiang(),
                E.getGhiChu(), E.getMaNhanVien(), E.getNgayTao(), E.getMaKhoaHoc());
        
    }
    
    @Override
    public int delete(String ID) {
        String sql = "delete khoahoc where maKhoaHoc =?";
        return JdbcHelper.ExecuteUpdate(sql, ID);
        
    }
    
    @Override
    public List<KhoaHoc> selectAll() {
        List<KhoaHoc> ds = new ArrayList<>();
        String Sql = "Select * from khoaHoc";
        ResultSet rs = JdbcHelper.ExecuteQuery(Sql);
        try {
            while (rs.next()) {
                KhoaHoc temp = readFromResultSet(rs);
                ds.add(temp);
                
            }
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(KhoaHocDAO.class.getName()).log(Level.SEVERE, null, ex); 
        }
        
        return ds;
    }
    
    public List<KhoaHoc> selectAllWhereChuyenDe(String maChuyenDe) {
        List<KhoaHoc> ds = new ArrayList<>();
        String sql = "Select * from khoahoc where maChuyenDe =? ";
        ResultSet rs = JdbcHelper.ExecuteQuery(sql, maChuyenDe);
        try {
            while (rs.next()) {
                KhoaHoc temp = readFromResultSet(rs);
                
                ds.add(temp);
                
            }
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(KhoaHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ds;
    }
    
    public List<String> selectYear() {
        List<String> dsNam = new ArrayList<>();
        String sql = "select year(ngayKhaiGiang) from khoaHoc group by year(ngayKhaiGiang)";
        ResultSet rs = JdbcHelper.ExecuteQuery(sql);
        try {
            while (rs.next()) {
                dsNam.add(rs.getString(1));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhoaHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return dsNam;
    }
    
    @Override
    public KhoaHoc findById(String ID) {
        String sql = "select * from khoahoc where maKhoaHoc = ?";
        ResultSet rs = JdbcHelper.ExecuteQuery(sql, ID);
        try {
            while (rs.next()) {
                return readFromResultSet(rs);
                
            }
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(KhoaHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null; 
    }
    
    public KhoaHoc findByNote(String ID) {
        String sql = "select * from khoaHoc where ghiChu like ?";
        ResultSet rs = JdbcHelper.ExecuteQuery(sql, ID);
        try {
            while (rs.next()) {
                return readFromResultSet(rs);
                 
            }
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(KhoaHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    
    private KhoaHoc readFromResultSet(ResultSet rs) throws SQLException, ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        KhoaHoc temp = new KhoaHoc();
        temp.setMaKhoaHoc(String.valueOf(rs.getInt(1)));
        temp.setMaChuyenDe(rs.getString(2));
        temp.setHocPhi(rs.getFloat(3));
        temp.setThoiLuong(rs.getInt(4));
        temp.setNgayKhaiGiang(sdf.parse(rs.getString(5)));
        temp.setGhiChu(rs.getString(6));
        temp.setMaNhanVien(rs.getString(7));
        temp.setNgayTao(sdf.parse(rs.getString(8)));
        
        return temp;
    }
}
