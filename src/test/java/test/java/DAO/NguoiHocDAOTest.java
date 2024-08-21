package test.java.DAO;

import org.junit.Before;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.testng.annotations.Test;

import com.mockrunner.mock.jdbc.MockResultSet;

import DAO.NguoiHocDAO;
import database.JdbcHelper;
import entity.NguoiHoc;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;

import java.sql.SQLException;
import java.util.List;
@PrepareForTest({ JdbcHelper.class, NguoiHocDAO.class })
public class NguoiHocDAOTest {

	 
		NguoiHocDAO NguoiHocDAO ;
		NguoiHocDAO NguoiHocDAOSpy;
		
		
		@Spy
		@InjectMocks
		MockResultSet rs = new MockResultSet("myMock");

		
		@Before
		public void setup() {
			NguoiHocDAO = new NguoiHocDAO();
			PowerMockito.mockStatic(JdbcHelper.class);
			NguoiHocDAOSpy  = PowerMockito.spy(new NguoiHocDAO());
		}
		
		
	    public NguoiHocDAOTest() {
	    }
	    

	    /**
	     * Test of insert method, of class NguoiHocDAO.
	     */
	    @Test(expectedExceptions = NullPointerException.class)
	    public void testInsertNull() {
	        System.out.println("insert");
	        NguoiHoc E = null;
	        NguoiHocDAO instance = new NguoiHocDAO();
	        
	        instance.insert(E);
	       
	    }
	    @Test(expectedExceptions = Exception.class)
	    public void testInsertEmpty() {
	        System.out.println("insert");
	        NguoiHoc E = new NguoiHoc();
	        NguoiHocDAO instance = new NguoiHocDAO();
	        
	        instance.insert(E);
	       
	    }
	    @Test
	    public void testInsertValid() {
	        System.out.println("insert");
	        NguoiHoc E = new NguoiHoc();
	        E.setMaNguoiHoc("NH01");
	        E.setMaNhanVienDaThem("NV01");
	        E.setGioiTinh(false); 
	        E.setHoVaTen("Nguyen Van A");
	        NguoiHocDAO instance = new NguoiHocDAO();
	        
	        instance.insert(E);
	       
	    }

	    /**
	     * Test of update method, of class NguoiHocDAO.
	     */
	    @Test(expectedExceptions = NullPointerException.class)
	    public void testUpdateNull() {
	        System.out.println("update");
	        NguoiHoc E = null;
	        NguoiHocDAO instance = new NguoiHocDAO();
	        instance.update(E);
	    
	    }
	    @Test(expectedExceptions = Exception.class)
	    public void testUpdateEmpty() {
	        System.out.println("update");
	        NguoiHoc E = new NguoiHoc();
	        NguoiHocDAO instance = new NguoiHocDAO();
	        instance.update(E);
	    
	    }
	    @Test
	    public void testUpdateValid() {
	        System.out.println("update");
	        NguoiHoc E = new NguoiHoc();
	        E.setMaNguoiHoc("NH01");
	        E.setMaNhanVienDaThem("NV01");
	        E.setGioiTinh(false); 
	        E.setHoVaTen("Nguyen Van A");
	        NguoiHocDAO instance = new NguoiHocDAO();
	        instance.update(E);
	    
	    }

	    /**
	     * Test of delete method, of class NguoiHocDAO.
	     */
	    @Test(expectedExceptions = Exception.class)
	    public void testDeleteEmpty() {
	        System.out.println("delete");
	        String ID = "";
	        NguoiHocDAO instance = new NguoiHocDAO();
	        int expResult = 0;
	        int result = instance.delete(ID);
	        assertEquals(expResult, result);
	    }

	    @Test(expectedExceptions = Exception.class)
	    public void testDeleteNull() {
	        System.out.println("delete");
	        String ID = null;
	        NguoiHocDAO instance = new NguoiHocDAO();
	        int expResult = 0;
	        int result = instance.delete(ID);
	        assertEquals(expResult, result);
	    }
	    @Test
	    public void testDeleteValid() {
	        System.out.println("delete");
	        String ID = "NH01";
	        NguoiHocDAO instance = new NguoiHocDAO();
	        int expResult = 0;
	        int result = instance.delete(ID);
	        assertEquals(expResult, result);
	    }
	    
	    /**
	     * Test of selectAll method, of class NguoiHocDAO.
	     * @throws SQLException 
	     */
	    @Test
	    public void testSelectAll() throws SQLException {
	        System.out.println("selectAll");

	       
	        rs= inItData();
	        
	        PowerMockito.when(JdbcHelper.ExecuteQuery( ArgumentMatchers.anyString())).thenReturn(rs);
	        
	        List<NguoiHoc> listNguoiHoc = NguoiHocDAOSpy.selectAll();
	        
	        assertEquals(1, listNguoiHoc.size());
	        
	    }



	    /**
	     * Test of findById method, of class NguoiHocDAO.
	     * @throws SQLException 
	     */
	    @Test
	    public void testFindById() throws SQLException {
	        rs= inItData();
	        
	        String id = "NH01";
	        PowerMockito.when(JdbcHelper.ExecuteQuery( ArgumentMatchers.anyString(),ArgumentMatchers.anyString())).thenReturn(rs);
	        NguoiHoc nguoiHoc = NguoiHocDAOSpy.findById(id);
	        
	        assertEquals(id, nguoiHoc.getMaNguoiHoc());
	    }
	    
	    private MockResultSet inItData() throws SQLException {
	    	
	    	rs.addColumn("maNguoiHoc",new String[] {"NH01"});
	    	rs.addColumn("HoTen",new String[] {"Nguyen Van A"});
	    	rs.addColumn("GioiTinh",new Integer [] {1});
	    	rs.addColumn("maNV",new  String[] {"NV01"});
	    	rs.beforeFirst();
	    	return rs;
	    }
}
