package test.java.entity;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;
import org.testng.Assert;
import java.util.List;


import DAO.ChuyenDeDAO;
import entity.ChuyenDe;

public class ChuyenDeTest {


	    /**
	     * Test of insert method, of class ChuyenDeDAO.
	     */
	 @Test
	    public void testGetMaChuyenDe() {
	        System.out.println("getMaChuyenDe");
	        ChuyenDe instance = new ChuyenDe();
	        String expResult = "";
	        String result = instance.getMaChuyenDe();
	        assertEquals(result, expResult);
	        // TODO review the generated test code and remove the default call to fail.
	        fail("The test case is a prototype.");
	    }

	    /**
	     * Test of setMaChuyenDe method, of class ChuyenDe.
	     */
	    @Test
	    public void testSetMaChuyenDe() {
	        System.out.println("setMaChuyenDe");
	        String maChuyenDe = "";
	        ChuyenDe instance = new ChuyenDe();
	        instance.setMaChuyenDe(maChuyenDe);
	        // TODO review the generated test code and remove the default call to fail.
	        fail("The test case is a prototype.");
	    }

	    /**
	     * Test of getTenChuyenDe method, of class ChuyenDe.
	     */
	    @Test
	    public void testGetTenChuyenDe() {
	        System.out.println("getTenChuyenDe");
	        ChuyenDe instance = new ChuyenDe();
	        String expResult = "";
	        String result = instance.getTenChuyenDe();
	        assertEquals(result, expResult);
	        // TODO review the generated test code and remove the default call to fail.
	        fail("The test case is a prototype.");
	    }

	    /**
	     * Test of setTenChuyenDe method, of class ChuyenDe.
	     */
	    @Test
	    public void testSetTenChuyenDe() {
	        System.out.println("setTenChuyenDe");
	        String tenChuyenDe = "";
	        ChuyenDe instance = new ChuyenDe();
	        instance.setTenChuyenDe(tenChuyenDe);
	        // TODO review the generated test code and remove the default call to fail.
	        fail("The test case is a prototype.");
	    }

	    /**
	     * Test of getHocPhi method, of class ChuyenDe.
	     */
	    @Test
	    public void testGetHocPhi() {
	        System.out.println("getHocPhi");
	        ChuyenDe instance = new ChuyenDe();
	        float expResult = 0.0F;
	        float result = instance.getHocPhi();
	        assertEquals(result, expResult, 0.0);
	        // TODO review the generated test code and remove the default call to fail.
	        fail("The test case is a prototype.");
	    }

	    /**
	     * Test of setHocPhi method, of class ChuyenDe.
	     */
	    @Test
	    public void testSetHocPhi() {
	        System.out.println("setHocPhi");
	        float hocPhi = 0.0F;
	        ChuyenDe instance = new ChuyenDe();
	        instance.setHocPhi(hocPhi);
	        // TODO review the generated test code and remove the default call to fail.
	        fail("The test case is a prototype.");
	    }

	    /**
	     * Test of getThoiLuongHoc method, of class ChuyenDe.
	     */
	    @Test
	    public void testGetThoiLuongHoc() {
	        System.out.println("getThoiLuongHoc");
	        ChuyenDe instance = new ChuyenDe();
	        int expResult = 0;
	        int result = instance.getThoiLuongHoc();
	        assertEquals(result, expResult);
	        // TODO review the generated test code and remove the default call to fail.
	        fail("The test case is a prototype.");
	    }

	    /**
	     * Test of setThoiLuongHoc method, of class ChuyenDe.
	     */
	    @Test
	    public void testSetThoiLuongHoc() {
	        System.out.println("setThoiLuongHoc");
	        int thoiLuongHoc = 0;
	        ChuyenDe instance = new ChuyenDe();
	        instance.setThoiLuongHoc(thoiLuongHoc);
	        // TODO review the generated test code and remove the default call to fail.
	        fail("The test case is a prototype.");
	    }

	    /**
	     * Test of getHinhAnh method, of class ChuyenDe.
	     */
	    @Test
	    public void testGetHinhAnh() {
	        System.out.println("getHinhAnh");
	        ChuyenDe instance = new ChuyenDe();
	        String expResult = "";
	        String result = instance.getHinhAnh();
	        assertEquals(result, expResult);
	        // TODO review the generated test code and remove the default call to fail.
	        fail("The test case is a prototype.");
	    }

	    /**
	     * Test of setHinhAnh method, of class ChuyenDe.
	     */
	    @Test
	    public void testSetHinhAnh() {
	        System.out.println("setHinhAnh");
	        String hinhAnh = "";
	        ChuyenDe instance = new ChuyenDe();
	        instance.setHinhAnh(hinhAnh);
	        // TODO review the generated test code and remove the default call to fail.
	        fail("The test case is a prototype.");
	    }

	    /**
	     * Test of getMoTa method, of class ChuyenDe.
	     */
	    @Test
	    public void testGetMoTa() {
	        System.out.println("getMoTa");
	        ChuyenDe instance = new ChuyenDe();
	        String expResult = "";
	        String result = instance.getMoTa();
	        assertEquals(result, expResult);
	        // TODO review the generated test code and remove the default call to fail.
	        fail("The test case is a prototype.");
	    }

	    /**
	     * Test of setMoTa method, of class ChuyenDe.
	     */
	    @Test
	    public void testSetMoTa() {
	        System.out.println("setMoTa");
	        String moTa = "";
	        ChuyenDe instance = new ChuyenDe();
	        instance.setMoTa(moTa);
	        // TODO review the generated test code and remove the default call to fail.
	        fail("The test case is a prototype.");
	    }

	    /**
	     * Test of toString method, of class ChuyenDe.
	     */
	    @Test
	    public void testToString() {
	        System.out.println("toString");
	        ChuyenDe instance = new ChuyenDe();
	        String expResult = "";
	        String result = instance.toString();
	        assertEquals(result, expResult);
	        // TODO review the generated test code and remove the default call to fail.
	        fail("The test case is a prototype.");
	    }

}
