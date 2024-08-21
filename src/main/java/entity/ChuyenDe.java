/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package entity;

/**
 *
 * @author Thinkpad E440
 */
public class ChuyenDe {
    private String maChuyenDe;
    private String tenChuyenDe;
    private float hocPhi;
    private int thoiLuongHoc;
    private String hinhAnh;
    private String moTa;

    public ChuyenDe() {
    }

    public ChuyenDe(String maChuyenDe, String tenChuyenDe, float hocPhi, int thoiLuongHoc, String hinhAnh, String moTa) {
        this.maChuyenDe = maChuyenDe;
        this.tenChuyenDe = tenChuyenDe;
        this.hocPhi = hocPhi;
        this.thoiLuongHoc = thoiLuongHoc;
        this.hinhAnh = hinhAnh;
        this.moTa = moTa;
    }

    public String getMaChuyenDe() {
        return maChuyenDe;
    }

    public void setMaChuyenDe(String maChuyenDe) {
        this.maChuyenDe = maChuyenDe;
    }

    public String getTenChuyenDe() {
        return tenChuyenDe;
    }

    public void setTenChuyenDe(String tenChuyenDe) {
        this.tenChuyenDe = tenChuyenDe;
    }

    public float getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(float hocPhi) {
        this.hocPhi = hocPhi;
    }

    public int getThoiLuongHoc() {
        return thoiLuongHoc;
    }

    public void setThoiLuongHoc(int thoiLuongHoc) {
        this.thoiLuongHoc = thoiLuongHoc;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return  tenChuyenDe ;
    }
    
    

    
}
