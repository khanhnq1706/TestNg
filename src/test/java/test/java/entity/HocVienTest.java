package test.java.entity;

import org.testng.annotations.Test;

import entity.HocVien;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;
import org.testng.Assert;
public class HocVienTest {

	 @Test
	    public void testGetMaHocVien() {
	        System.out.println("getMaHocVien");
	        HocVien instance = new HocVien();
	        int expResult = 0;
	        int result = instance.getMaHocVien();
	        assertEquals(result, expResult);
	        // TODO review the generated test code and remove the default call to fail.
	        fail("The test case is a prototype.");
	    }

	    /**
	     * Test of setMaHocVien method, of class HocVien.
	     */
	    @Test
	    public void testSetMaHocVien() {
	        System.out.println("setMaHocVien");
	        int maHocVien = 0;
	        HocVien instance = new HocVien();
	        instance.setMaHocVien(maHocVien);
	        // TODO review the generated test code and remove the default call to fail.
	        fail("The test case is a prototype.");
	    }

	    /**
	     * Test of getMaKhoaHoc method, of class HocVien.
	     */
	    @Test
	    public void testGetMaKhoaHoc() {
	        System.out.println("getMaKhoaHoc");
	        HocVien instance = new HocVien();
	        String expResult = "";
	        String result = instance.getMaKhoaHoc();
	        assertEquals(result, expResult);
	        // TODO review the generated test code and remove the default call to fail.
	        fail("The test case is a prototype.");
	    }

	    /**
	     * Test of setMaKhoaHoc method, of class HocVien.
	     */
	    @Test
	    public void testSetMaKhoaHoc() {
	        System.out.println("setMaKhoaHoc");
	        String maKhoaHoc = "";
	        HocVien instance = new HocVien();
	        instance.setMaKhoaHoc(maKhoaHoc);
	        // TODO review the generated test code and remove the default call to fail.
	        fail("The test case is a prototype.");
	    }

	    /**
	     * Test of getMaNguoihoc method, of class HocVien.
	     */
	    @Test
	    public void testGetMaNguoihoc() {
	        System.out.println("getMaNguoihoc");
	        HocVien instance = new HocVien();
	        String expResult = "";
	        String result = instance.getMaNguoihoc();
	        assertEquals(result, expResult);
	        // TODO review the generated test code and remove the default call to fail.
	        fail("The test case is a prototype.");
	    }

	    /**
	     * Test of setMaNguoihoc method, of class HocVien.
	     */
	    @Test
	    public void testSetMaNguoihoc() {
	        System.out.println("setMaNguoihoc");
	        String maNguoihoc = "";
	        HocVien instance = new HocVien();
	        instance.setMaNguoihoc(maNguoihoc);
	        // TODO review the generated test code and remove the default call to fail.
	        fail("The test case is a prototype.");
	    }

	    /**
	     * Test of getDiemTrungBinh method, of class HocVien.
	     */
	    @Test
	    public void testGetDiemTrungBinh() {
	        System.out.println("getDiemTrungBinh");
	        HocVien instance = new HocVien();
	        float expResult = 0.0F;
	        float result = instance.getDiemTrungBinh();
	        assertEquals(result, expResult, 0.0);
	        // TODO review the generated test code and remove the default call to fail.
	        fail("The test case is a prototype.");
	    }

	    /**
	     * Test of setDiemTrungBinh method, of class HocVien.
	     */
	    @Test
	    public void testSetDiemTrungBinh() {
	        System.out.println("setDiemTrungBinh");
	        float diemTrungBinh = 0.0F;
	        HocVien instance = new HocVien();
	        instance.setDiemTrungBinh(diemTrungBinh);
	        // TODO review the generated test code and remove the default call to fail.
	        fail("The test case is a prototype.");
	    }
}
