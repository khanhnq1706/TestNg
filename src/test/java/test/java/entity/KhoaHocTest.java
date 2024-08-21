package test.java.entity;

import org.testng.annotations.Test;

import entity.KhoaHoc;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.util.Date;

import org.testng.Assert;
public class KhoaHocTest {

	 /**
     * Test of getMaKhoaHoc method, of class KhoaHoc.
     */
    @Test
    public void testGetMaKhoaHoc() {
        System.out.println("getMaKhoaHoc");
        KhoaHoc instance = new KhoaHoc();
        String expResult = "";
        String result = instance.getMaKhoaHoc();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaKhoaHoc method, of class KhoaHoc.
     */
    @Test
    public void testSetMaKhoaHoc() {
        System.out.println("setMaKhoaHoc");
        String maKhoaHoc = "";
        KhoaHoc instance = new KhoaHoc();
        instance.setMaKhoaHoc(maKhoaHoc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaChuyenDe method, of class KhoaHoc.
     */
    @Test
    public void testGetMaChuyenDe() {
        System.out.println("getMaChuyenDe");
        KhoaHoc instance = new KhoaHoc();
        String expResult = "";
        String result = instance.getMaChuyenDe();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaChuyenDe method, of class KhoaHoc.
     */
    @Test
    public void testSetMaChuyenDe() {
        System.out.println("setMaChuyenDe");
        String maChuyenDe = "";
        KhoaHoc instance = new KhoaHoc();
        instance.setMaChuyenDe(maChuyenDe);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHocPhi method, of class KhoaHoc.
     */
    @Test
    public void testGetHocPhi() {
        System.out.println("getHocPhi");
        KhoaHoc instance = new KhoaHoc();
        float expResult = 0.0F;
        float result = instance.getHocPhi();
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHocPhi method, of class KhoaHoc.
     */
    @Test
    public void testSetHocPhi() {
        System.out.println("setHocPhi");
        float hocPhi = 0.0F;
        KhoaHoc instance = new KhoaHoc();
        instance.setHocPhi(hocPhi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getThoiLuong method, of class KhoaHoc.
     */
    @Test
    public void testGetThoiLuong() {
        System.out.println("getThoiLuong");
        KhoaHoc instance = new KhoaHoc();
        int expResult = 0;
        int result = instance.getThoiLuong();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setThoiLuong method, of class KhoaHoc.
     */
    @Test
    public void testSetThoiLuong() {
        System.out.println("setThoiLuong");
        int thoiLuong = 0;
        KhoaHoc instance = new KhoaHoc();
        instance.setThoiLuong(thoiLuong);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNgayKhaiGiang method, of class KhoaHoc.
     */
    @Test
    public void testGetNgayKhaiGiang() {
        System.out.println("getNgayKhaiGiang");
        KhoaHoc instance = new KhoaHoc();
        Date expResult = null;
        Date result = instance.getNgayKhaiGiang();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNgayKhaiGiang method, of class KhoaHoc.
     */
    @Test
    public void testSetNgayKhaiGiang() {
        System.out.println("setNgayKhaiGiang");
        Date ngayKhaiGiang = null;
        KhoaHoc instance = new KhoaHoc();
        instance.setNgayKhaiGiang(ngayKhaiGiang);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGhiChu method, of class KhoaHoc.
     */
    @Test
    public void testGetGhiChu() {
        System.out.println("getGhiChu");
        KhoaHoc instance = new KhoaHoc();
        String expResult = "";
        String result = instance.getGhiChu();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGhiChu method, of class KhoaHoc.
     */
    @Test
    public void testSetGhiChu() {
        System.out.println("setGhiChu");
        String ghiChu = "";
        KhoaHoc instance = new KhoaHoc();
        instance.setGhiChu(ghiChu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaNhanVien method, of class KhoaHoc.
     */
    @Test
    public void testGetMaNhanVien() {
        System.out.println("getMaNhanVien");
        KhoaHoc instance = new KhoaHoc();
        String expResult = "";
        String result = instance.getMaNhanVien();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaNhanVien method, of class KhoaHoc.
     */
    @Test
    public void testSetMaNhanVien() {
        System.out.println("setMaNhanVien");
        String maNhanVien = "";
        KhoaHoc instance = new KhoaHoc();
        instance.setMaNhanVien(maNhanVien);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNgayTao method, of class KhoaHoc.
     */
    @Test
    public void testGetNgayTao() {
        System.out.println("getNgayTao");
        KhoaHoc instance = new KhoaHoc();
        Date expResult = null;
        Date result = instance.getNgayTao();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNgayTao method, of class KhoaHoc.
     */
    @Test
    public void testSetNgayTao() {
        System.out.println("setNgayTao");
        Date ngayTao = null;
        KhoaHoc instance = new KhoaHoc();
        instance.setNgayTao(ngayTao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class KhoaHoc.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        KhoaHoc instance = new KhoaHoc();
        String expResult = "";
        String result = instance.toString();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
