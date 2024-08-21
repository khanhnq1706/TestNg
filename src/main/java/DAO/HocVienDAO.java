/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import database.JdbcHelper;
import entity.HocVien;
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
public class HocVienDAO implements DAOEntityInterFace<HocVien> {

    @Override
    public void insert(HocVien E) {
        String sql = "insert hocVien(maKhoaHoc,maNguoiHoc) values(?,?)";
        JdbcHelper.ExecuteUpdate(sql, E.getMaKhoaHoc(), E.getMaNguoihoc());

    } 

    @Override
    public void update(HocVien E) {
        String sql = "update hocvien set maKhoaHoc=? ,maNguoiHoc=?, diem=? where maHocVien=?";
        JdbcHelper.ExecuteUpdate(sql, E.getMaKhoaHoc(), E.getMaNguoihoc(), E.getDiemTrungBinh(), E.getMaHocVien());

    }

    @Override
    public int delete(String ID) {
        String sql = "delete hocvien where maHocVien = ? ";
        return JdbcHelper.ExecuteUpdate(sql, ID);

    }

    @Override
    public List<HocVien> selectAll() {
        List<HocVien> ds = new ArrayList<>();
        String sql = "Select  *  from hocvien";
        ResultSet rs = JdbcHelper.ExecuteQuery(sql);
        try {
            while (rs.next()) {
                HocVien temp = readFromResultSet(rs);
                ds.add(temp);

            }
        } catch (SQLException ex) {
            Logger.getLogger(HocVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ds;
    }

    public List<HocVien> selectMaKhoaHoc(String maKhoaHoc) {

        List<HocVien> ds = new ArrayList<>();
        String sql = "Select  *  from hocvien where maKhoaHoc = ?";
        ResultSet rs = JdbcHelper.ExecuteQuery(sql, maKhoaHoc);

        try {
            while (rs.next()) {
                HocVien hv = readFromResultSet(rs);
                ds.add(hv);

            }
        } catch (SQLException ex) {
            Logger.getLogger(HocVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ds;
    }

    @Override
    public HocVien findById(String ID) {
        String sql = "Select  *  from hocvien where maHocVien =?";
        ResultSet rs = JdbcHelper.ExecuteQuery(sql, ID);
        try {
            while (rs.next()) {
                return readFromResultSet(rs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public HocVien findByMaNguoiHocAndMaKhoaHoc(String maNguoiHoc, String maKhoaHoc) {
        String sql = "Select  *  from hocvien where maNguoiHoc = ? and maKhoaHoc=?";
        ResultSet rs = JdbcHelper.ExecuteQuery(sql, maNguoiHoc, maKhoaHoc);
        try {
            while (rs.next()) {
                return readFromResultSet(rs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public void DeleteByMaNguoiHocAndMaKhoaHoc(String maNguoiHoc, String maKhoaHoc) {
        String sql = "delete hocVien where  maKhoaHoc =? and maNguoiHoc=?";
        JdbcHelper.ExecuteUpdate(sql, maKhoaHoc, maNguoiHoc);

    }

    private HocVien readFromResultSet(ResultSet rs) throws SQLException {
        HocVien hv = new HocVien();
        hv.setMaHocVien(rs.getInt(1));
        hv.setMaKhoaHoc(String.valueOf(rs.getInt(2)));
        hv.setMaNguoihoc(rs.getString(3));
        hv.setDiemTrungBinh(rs.getFloat(4));
        return hv;
    }

}
