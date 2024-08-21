/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package DAO;

import database.JdbcHelper;
import entity.NguoiHoc;
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
public class NguoiHocDAO implements DAOEntityInterFace<NguoiHoc> {

    @Override
    public void insert(NguoiHoc E) {
        String sql = "insert into nguoihoc values(?,?,?,?,?,?,?,?,?);";
        JdbcHelper.ExecuteUpdate(sql, E.getMaNguoiHoc(), E.getHoVaTen(), E.isGioiTinh() == true ? 1 : 0,
                E.getNgaySinh(), E.getSoDienThoai(), E.getEmail(), E.getGhiChu(),
                E.getMaNhanVienDaThem(), E.getNgayDuocThem());

    }

    @Override
    public void update(NguoiHoc E) {
        String sql = "UPDATE nguoihoc SET HoTen = ?, gioiTinh = ?, ngaySinh =? ,SoDienThoai =? , Email = ? ,ghiChu =? , maNV = ? ,ngayDangKy = ? WHERE  maNguoiHoc = ?";
        JdbcHelper.ExecuteUpdate(sql, E.getHoVaTen(), E.isGioiTinh() == true ? 1 : 0, E.getNgaySinh(), E.getSoDienThoai(),
                E.getEmail(), E.getGhiChu(), E.getMaNhanVienDaThem(), E.getNgayDuocThem(),
                E.getMaNguoiHoc());

    }

    @Override
    public int delete(String ID) {
        String sql = "Delete nguoihoc where maNguoiHoc = ?";
        return JdbcHelper.ExecuteUpdate(sql, ID);

    }

    @Override
    public List<NguoiHoc> selectAll() {
        List<NguoiHoc> ds = new ArrayList<>();
        String sql = "Select * from nguoihoc";
        ResultSet rs = JdbcHelper.ExecuteQuery(sql);
        try {
            while (rs.next()) {
                NguoiHoc Temp = readFormResultSet(rs);
                ds.add(Temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NguoiHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ds;
    }

    public List<NguoiHoc> selectAllbyName(String Name) {
        List<NguoiHoc> ds = new ArrayList<>();
        String sql = "Select * from nguoihoc where HoTen like ?";
        String newName = "%" + Name + "%";
        ResultSet rs = JdbcHelper.ExecuteQuery(sql, newName);
        try {
            while (rs.next()) {
                NguoiHoc Temp = readFormResultSet(rs);
                ds.add(Temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NguoiHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ds;
    }

    @Override
    public NguoiHoc findById(String ID) {
        try {
            String sql = "Select * from nguoihoc where maNguoiHoc = ?";
            ResultSet rs = JdbcHelper.ExecuteQuery(sql, ID);
            while (rs.next()) {
                NguoiHoc temp = readFormResultSet(rs);
                return temp;
            }
        } catch (SQLException ex) {
            Logger.getLogger(NguoiHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    private NguoiHoc readFormResultSet(ResultSet rs) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            NguoiHoc nh = new NguoiHoc();
            nh.setMaNguoiHoc(rs.getString(1));
            nh.setHoVaTen(rs.getString(2));
            nh.setGioiTinh(rs.getInt(3) == 1); 
            nh.setNgaySinh(sdf.parse(rs.getString(4)));
            nh.setSoDienThoai(rs.getString(5));
            nh.setEmail(rs.getString(6));
            nh.setGhiChu(rs.getString(7));
            nh.setMaNhanVienDaThem(rs.getString(8));
            nh.setNgayDuocThem(sdf.parse(rs.getString(9)));
            return nh;
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(NguoiHocDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
