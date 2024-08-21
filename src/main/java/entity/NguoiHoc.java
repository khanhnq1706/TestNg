/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;

/**
 *
 * @author Thinkpad E440
 */
public class NguoiHoc {

    private String maNguoiHoc;
    private String hoVaTen;
    private Date ngaySinh;
    private boolean gioiTinh;
    private String soDienThoai;
    private String email;
    private String ghiChu;
    private String maNhanVienDaThem;
    private Date ngayDuocThem;

    public NguoiHoc() {
    }

    public NguoiHoc(String maNguoiHoc, String hoVaTen, Date ngaySinh, boolean gioiTinh, String soDienThoai, String email, String ghiChu, String maNhanVienDaThem, Date ngayDuocThem) {
        this.maNguoiHoc = maNguoiHoc;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.ghiChu = ghiChu;
        this.maNhanVienDaThem = maNhanVienDaThem;
        this.ngayDuocThem = ngayDuocThem;
    }

    public Date getNgayDuocThem() {
        return ngayDuocThem;
    }

    public void setNgayDuocThem(Date ngayDuocThem) {
        this.ngayDuocThem = ngayDuocThem;
    }

    

    public String getMaNhanVienDaThem() {
        return maNhanVienDaThem;
    }

    public void setMaNhanVienDaThem(String maNhanVienDaThem) {
        this.maNhanVienDaThem = maNhanVienDaThem;
    }

  

    public String getMaNguoiHoc() {
        return maNguoiHoc;
    }

    public void setMaNguoiHoc(String maNguoiHoc) {
        this.maNguoiHoc = maNguoiHoc;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

}
