package test.java.DAO;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.testng.annotations.Test;

import com.mockrunner.mock.jdbc.MockResultSet;

import DAO.KhoaHocDAO;
import database.JdbcHelper;
import entity.KhoaHoc;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
@PrepareForTest({JdbcHelper.class,KhoaHocDAO.class})
public class KhoaHocDAOTest {
	KhoaHocDAO KhoaHocDAO ;
	KhoaHocDAO KhoaHocDAOSpy;
	
	@Spy
	@InjectMocks
	MockResultSet rs = new MockResultSet("myMock") ;
	
	@Before
	public void setup() {
		KhoaHocDAO = new KhoaHocDAO();
		PowerMockito.mockStatic(JdbcHelper.class);
		KhoaHocDAOSpy  = PowerMockito.spy(new KhoaHocDAO());  
	}
	
    
    public KhoaHocDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insert method, of class KhoaHocDAO.
     */
    @Test
    public void testInsertValiid() {
        System.out.println("insert");
        KhoaHoc E = new KhoaHoc();
        E.setMaKhoaHoc("1");
        E.setMaChuyenDe("java1");
        E.setHocPhi(300f);
        E.setThoiLuong(400);
        E.setNgayKhaiGiang(new Date());
        E.setMaNhanVien("nv01");
        E.setNgayTao(new Date());
        KhoaHocDAO instance = new KhoaHocDAO();
        instance.insert(E);
      
    }
    
    @Test(expectedExceptions = NullPointerException.class)
    public void testInsertNull() {
        System.out.println("insert");
        KhoaHoc E = null;
        KhoaHocDAO instance = new KhoaHocDAO();
        instance.insert(E);
      
    }
    @Test(expectedExceptions = Exception.class)
    public void testInsertEmpty() {
        System.out.println("insert");
        KhoaHoc E = new KhoaHoc();
        KhoaHocDAO instance = new KhoaHocDAO();
        instance.insert(E);
      
    }



    /**
     * Test of update method, of class KhoaHocDAO.
     */
    
    @Test(expectedExceptions = Exception.class)
    public void testUpdateEmpty() {
        System.out.println("update");
        KhoaHoc E = new KhoaHoc();
        KhoaHocDAO instance = new KhoaHocDAO();
        instance.update(E);
       
    }
    
    @Test(expectedExceptions = NullPointerException.class)
    public void testUpdateNull() {
        System.out.println("update");
        KhoaHoc E = null;
        KhoaHocDAO instance = new KhoaHocDAO();
        instance.update(E);
       
    }
    
    @Test
    public void testUpdateValid() {
        System.out.println("update");
        KhoaHoc E = new KhoaHoc();
        E.setMaKhoaHoc("1");
        E.setMaChuyenDe("java1");
        E.setHocPhi(300f);
        E.setThoiLuong(400);
        E.setNgayKhaiGiang(new Date());
        E.setMaNhanVien("nv01");
        E.setNgayTao(new Date());
        KhoaHocDAO instance = new KhoaHocDAO();
        instance.update(E);
       
    }
    
   

    /**
     * Test of delete method, of class KhoaHocDAO.
     */
    @Test(expectedExceptions = NullPointerException.class)
    public void testDeleteNull() {
        System.out.println("delete");
        String ID = null;
        KhoaHocDAO instance = new KhoaHocDAO();
        int expResult = 0;
        int result = instance.delete(ID);
        assertEquals(expResult, result);

    }
    @Test(expectedExceptions = Exception.class)
    public void testDeleteEmpty() {
        System.out.println("delete");
        String ID = "";
        KhoaHocDAO instance = new KhoaHocDAO();
        int expResult = 0;
        int result = instance.delete(ID);
        assertEquals(expResult, result);

    }
    @Test
    public void testDeleteValid() {
        System.out.println("delete");
        String ID = "3";
        KhoaHocDAO instance = new KhoaHocDAO();
        int expResult = 0;
        int result = instance.delete(ID);
        assertEquals(expResult, result);

    }

    /**
     * Test of selectAll method, of class KhoaHocDAO.
     * @throws SQLException 
     */
    @Test 
    public void testSelectAll() throws Exception { 
        System.out.println("selectAll");
        
        // Khởi tạo dữ liệu giả cho ResultSet
        rs = inItData();
        
        // Mock phương thức ExecuteQuery của JdbcHelper để trả về ResultSet giả
        PowerMockito.when(JdbcHelper.ExecuteQuery(ArgumentMatchers.anyString())).thenReturn(rs);
        
        // Thiết lập mô phỏng cho phương thức rs.next(), giả lập có dữ liệu trong ResultSet
      PowerMockito.when(rs.next()).thenReturn(true);
        
        // Gọi phương thức selectAll của KhoaHocDAO
        List<KhoaHoc> listKhoaHoc = KhoaHocDAOSpy.selectAll();
        
        // Kiểm tra số lượng phần tử trong danh sách trả về
        assertEquals(1, listKhoaHoc.size());
    }
    
    @Test
    public void testSelectAllMultiData() throws SQLException {
        System.out.println("selectAll");
        KhoaHocDAO instance = new KhoaHocDAO();
        
        rs =inItDataMultidata();
        
        PowerMockito.when(JdbcHelper.ExecuteQuery(ArgumentMatchers.anyString())).thenReturn(rs);
        
        List<KhoaHoc> listKhoaHoc = KhoaHocDAOSpy.selectAll();
        for (KhoaHoc khoaHoc : listKhoaHoc) {
			System.out.println(khoaHoc.toString());
		}
        assertEquals(3, listKhoaHoc.size());  
        
       
    }

    /**
     * Test of selectAllWhereChuyenDe method, of class KhoaHocDAO.
     */

  
    private MockResultSet inItData() {
    	
    	rs.addColumn("maKhoaHoc",new String[] {"1"});
    	rs.addColumn("maChuyenDe",new String[] {"java2"}) ;
    	rs.addColumn("hocPhi",new Float[] {300f});
    	rs.addColumn("thoiLuong",new Integer[] {322});
    	rs.addColumn("ngayKhaiGiang",new java.sql.Date[] { new java.sql.Date (new  Date().getTime())});
    	rs.addColumn("ngayTao",new java.sql.Date[] { new java.sql.Date (new  Date().getTime())});
    	rs.addColumn("maNv",new String[] {"nv1"});
    	
    	return  rs;
    }
    
    
   
    
  private MockResultSet inItDataMultidata() throws SQLException {
    	
	  
    	rs.addColumn("maKhoaHoc",new String[] {"1","3","2"});
    	rs.addColumn("maChuyenDe",new String[] {"java2","java3","java4"}) ;
    	rs.addColumn("hocPhi",new Float[] {300f,300f,500f});
    	rs.addColumn("thoiLuong",new Integer[] {322,534,523});
//    	rs.addColumn("ngayKhaiGiang",new java.sql.Date[] { new java.sql.Date (new  Date().getTime()),new java.sql.Date (new  Date().getTime()),new java.sql.Date (new  Date().getTime())});
//    	rs.addColumn("ngayTao",new java.sql.Date[] { new java.sql.Date (new  Date().getTime()),new java.sql.Date (new  Date().getTime()),new java.sql.Date (new  Date().getTime())});
    	rs.addColumn("maNv",new String[] {"nv1","nv2","nv3"}); 
    	rs.beforeFirst();
    	return  rs;
    }
}
