/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Thinkpad E440
 */
public class NhanVien {
    
    private String maNhanVien;
    private String matKhau;
    private String hoVaTen;
    private boolean vaiTro;

    public NhanVien() {
    }

    public NhanVien(String maNhanVien, String matKhau, String hoVaTen, boolean vaiTro) {
        this.maNhanVien = maNhanVien; 
        this.matKhau = matKhau;
        this.hoVaTen = hoVaTen;
        this.vaiTro = vaiTro;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public boolean getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(boolean vaiTro) {
        this.vaiTro = vaiTro;
    }
    
    
    
}
