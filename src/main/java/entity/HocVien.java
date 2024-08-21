/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Thinkpad E440
 */
public class HocVien {
    
    private int maHocVien;
    private String maKhoaHoc;
    private String maNguoihoc; 
    private float diemTrungBinh = -1;

    public HocVien() {
    }

    public HocVien(int maHocVien, String maKhoaHoc, String maNguoihoc, float diemTrungBinh) {
        this.maHocVien = maHocVien;
        this.maKhoaHoc = maKhoaHoc;
        this.maNguoihoc = maNguoihoc;
        this.diemTrungBinh = diemTrungBinh;
    }

    public HocVien(int maHocVien, String maKhoaHoc, String maNguoihoc) {
        this.maHocVien = maHocVien;
        this.maKhoaHoc = maKhoaHoc;
        this.maNguoihoc = maNguoihoc;
    }
    
    public int getMaHocVien() {
        return maHocVien;
    }

    public void setMaHocVien(int maHocVien) {
        this.maHocVien = maHocVien;
    }

    public String getMaKhoaHoc() {
        return maKhoaHoc;
    }

    public void setMaKhoaHoc(String maKhoaHoc) {
        this.maKhoaHoc = maKhoaHoc;
    }

    public String getMaNguoihoc() {
        return maNguoihoc;
    }

    public void setMaNguoihoc(String maNguoihoc) {
        this.maNguoihoc = maNguoihoc;
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }
    
    
    
}
