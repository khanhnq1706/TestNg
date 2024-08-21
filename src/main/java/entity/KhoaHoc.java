/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package entity;

import java.util.Date;
import java.util.concurrent.ForkJoinTask;
import ulti.DateHelper;

/**
 *
 * @author Thinkpad E440
 */
public class KhoaHoc {
    private String maKhoaHoc;
    private String maChuyenDe;
    private float hocPhi;
    private int thoiLuong;
    private Date ngayKhaiGiang;
    private String ghiChu;
    private String maNhanVien;
    private Date ngayTao;

    public KhoaHoc() {
    }

    public KhoaHoc(String maKhoaHoc, String maChuyenDe, float hocPhi, int thoiLuong, Date ngayKhaiGiang, String ghiChu, String maNhanVien, Date ngayTao) {
        this.maKhoaHoc = maKhoaHoc;
        this.maChuyenDe = maChuyenDe;
        this.hocPhi = hocPhi;
        this.thoiLuong = thoiLuong;
        this.ngayKhaiGiang = ngayKhaiGiang;
        this.ghiChu = ghiChu;
        this.maNhanVien = maNhanVien;
        this.ngayTao = ngayTao;
    }

    public KhoaHoc(String maChuyenDe, float hocPhi, int thoiLuong, Date ngayKhaiGiang, String ghiChu, String maNhanVien, Date ngayTao) {
        this.maChuyenDe = maChuyenDe;
        this.hocPhi = hocPhi;
        this.thoiLuong = thoiLuong;
        this.ngayKhaiGiang = ngayKhaiGiang;
        this.ghiChu = ghiChu;
        this.maNhanVien = maNhanVien;
        this.ngayTao = ngayTao;
    }

    public String getMaKhoaHoc() {
        return maKhoaHoc;
    }

    public void setMaKhoaHoc(String maKhoaHoc) {
        this.maKhoaHoc = maKhoaHoc;
    }

    public String getMaChuyenDe() {
        return maChuyenDe;
    }

    public void setMaChuyenDe(String maChuyenDe) {
        this.maChuyenDe = maChuyenDe;
    }

    public float getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(float hocPhi) {
        this.hocPhi = hocPhi;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public Date getNgayKhaiGiang() {
        return ngayKhaiGiang;
    }

    public void setNgayKhaiGiang(Date ngayKhaiGiang) {
        this.ngayKhaiGiang = ngayKhaiGiang;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    @Override
    public String toString() {
        return maChuyenDe + "("+DateHelper.DateToString(ngayTao)+")";

    }
    
    
    
   
}
