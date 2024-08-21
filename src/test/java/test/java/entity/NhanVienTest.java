package test.java.entity;

import org.testng.annotations.Test;

import entity.NhanVien;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;
import java.util.Date;
public class NhanVienTest {

   @Test
   public void testGetMaNhanVien() {
       System.out.println("getMaNhanVien");
       NhanVien instance = new NhanVien();
       String expResult = "";
       String result = instance.getMaNhanVien();
       assertEquals(result, expResult);
       // TODO review the generated test code and remove the default call to fail.
       fail("The test case is a prototype.");
   }

   /**
    * Test of setMaNhanVien method, of class NhanVien.
    */
   @Test
   public void testSetMaNhanVien() {
       System.out.println("setMaNhanVien");
       String maNhanVien = "";
       NhanVien instance = new NhanVien();
       instance.setMaNhanVien(maNhanVien);
       // TODO review the generated test code and remove the default call to fail.
       fail("The test case is a prototype.");
   }

   /**
    * Test of getMatKhau method, of class NhanVien.
    */
   @Test
   public void testGetMatKhau() {
       System.out.println("getMatKhau");
       NhanVien instance = new NhanVien();
       String expResult = "";
       String result = instance.getMatKhau();
       assertEquals(result, expResult);
       // TODO review the generated test code and remove the default call to fail.
       fail("The test case is a prototype.");
   }

   /**
    * Test of setMatKhau method, of class NhanVien.
    */
   @Test
   public void testSetMatKhau() {
       System.out.println("setMatKhau");
       String matKhau = "";
       NhanVien instance = new NhanVien();
       instance.setMatKhau(matKhau);
       // TODO review the generated test code and remove the default call to fail.
       fail("The test case is a prototype.");
   }

   /**
    * Test of getHoVaTen method, of class NhanVien.
    */
   @Test
   public void testGetHoVaTen() {
       System.out.println("getHoVaTen");
       NhanVien instance = new NhanVien();
       String expResult = "";
       String result = instance.getHoVaTen();
       assertEquals(result, expResult);
       // TODO review the generated test code and remove the default call to fail.
       fail("The test case is a prototype.");
   }

   /**
    * Test of setHoVaTen method, of class NhanVien.
    */
   @Test
   public void testSetHoVaTen() {
       System.out.println("setHoVaTen");
       String hoVaTen = "";
       NhanVien instance = new NhanVien();
       instance.setHoVaTen(hoVaTen);
       // TODO review the generated test code and remove the default call to fail.
       fail("The test case is a prototype.");
   }

   /**
    * Test of getVaiTro method, of class NhanVien.
    */
   @Test
   public void testGetVaiTro() {
       System.out.println("getVaiTro");
       NhanVien instance = new NhanVien();
       boolean expResult = false;
       boolean result = instance.getVaiTro();
       assertEquals(result, expResult);
       // TODO review the generated test code and remove the default call to fail.
       fail("The test case is a prototype.");
   }

   /**
    * Test of setVaiTro method, of class NhanVien.
    */
   @Test
   public void testSetVaiTro() {
       System.out.println("setVaiTro");
       boolean vaiTro = false;
       NhanVien instance = new NhanVien();
       instance.setVaiTro(vaiTro);
       // TODO review the generated test code and remove the default call to fail.
       fail("The test case is a prototype.");
   }
}
