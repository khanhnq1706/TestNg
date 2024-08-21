/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import database.JdbcHelper;
import entity.NhanVien;
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
public class NhanVienDAO implements DAOEntityInterFace<NhanVien> {

    @Override
    public void insert(NhanVien nv) {
        String sql = "insert into nhanvien values (?,?,?,?)";
        JdbcHelper.ExecuteUpdate(sql, nv.getMaNhanVien(), nv.getMatKhau(), nv.getHoVaTen(), nv.getVaiTro());
    }

    @Override
    public void update(NhanVien E) {
        String sql = " update nhanvien set matKhau =?, hoTen=?, vaiTro=? where maNV = ?";
        JdbcHelper.ExecuteUpdate(sql, E.getMatKhau(), E.getHoVaTen(), E.getVaiTro() == true ? 1 : 0, E.getMaNhanVien());

    }

    @Override
    public int delete(String ID) {
        String sql = "delete nhanvien where maNV =?";
        return JdbcHelper.ExecuteUpdate(sql, ID);

    }

    @Override
    public List<NhanVien> selectAll() {
        List<NhanVien> dsnv = new ArrayList<>();
        String sql = "Select * from nhanvien";
        ResultSet rs = JdbcHelper.ExecuteQuery(sql);

        try {
            while (rs.next()) {
                NhanVien nv = readFromRS(rs);
                dsnv.add(nv);

            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dsnv;
    }

    @Override
    public NhanVien findById(String ID) {
        String sql = "Select * from nhanvien where maNV = ?";
        ResultSet rs = JdbcHelper.ExecuteQuery(sql, ID);
        try {
            while (rs.next()) {
                return readFromRS(rs); 

            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    private NhanVien readFromRS(ResultSet rs) throws SQLException {
        NhanVien nv = new NhanVien();
        nv.setMaNhanVien(rs.getString("maNV"));
        nv.setMatKhau(rs.getString("matKhau"));
        nv.setHoVaTen(rs.getString("hoTen"));
        nv.setVaiTro((rs.getInt("vaiTro") == 1));
        return nv;
    }

}
