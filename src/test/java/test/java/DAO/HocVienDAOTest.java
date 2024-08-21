package test.java.DAO;

import org.junit.Before;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.powermock.api.mockito.PowerMockito;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import com.mockrunner.mock.jdbc.MockResultSet;

import DAO.HocVienDAO;
import database.JdbcHelper;
import entity.HocVien;
import java.util.List;
public class HocVienDAOTest {

	HocVienDAO HocVienDAO ;
	HocVienDAO HocVienDAOSpy;
	
	@Spy
	@InjectMocks
	MockResultSet rs = new MockResultSet("myMock");
	
	@Before
	public void setup() {
		HocVienDAO = new HocVienDAO();
		PowerMockito.mockStatic(JdbcHelper.class);
		HocVienDAOSpy  = PowerMockito.spy(new HocVienDAO());
	}
	

    /**
     * Test of insert method, of class HocVienDAO.
     */
    @Test(expectedExceptions = Exception.class)
    public void testInsertNull() {
        System.out.println("insert");
        HocVien E = null;
        HocVienDAO instance = new HocVienDAO();
        instance.insert(E);

    }
    @Test(expectedExceptions = Exception.class)
    public void testInsertEmpty() {
        System.out.println("insert");
        HocVien E = new HocVien();
        HocVienDAO instance = new HocVienDAO();
        instance.insert(E);

    }
    @Test
    public void testInsertValid() {
        System.out.println("insert");
        HocVien E = new HocVien();
        E.setMaNguoihoc("NH01");
        E.setMaKhoaHoc("KH01");
        E.setDiemTrungBinh(8);
        HocVienDAO instance = new HocVienDAO();
        instance.insert(E);

    }

    /**
     * Test of update method, of class HocVienDAO.
     */
    @Test(expectedExceptions = NullPointerException.class)
    public void testUpdateNull() {
        System.out.println("update");
        HocVien E = null;
        HocVienDAO instance = new HocVienDAO();
        instance.update(E);
      
    }
    @Test(expectedExceptions = Exception.class)
    public void testUpdateEmpty() {
        System.out.println("update");
        HocVien E = new HocVien();
        HocVienDAO instance = new HocVienDAO();
        instance.update(E);
      
    }
    @Test
    public void testUpdateValid() {
        System.out.println("update");
        HocVien E = new HocVien();
        E.setMaNguoihoc("NH01");
        E.setMaKhoaHoc("KH01");
        E.setDiemTrungBinh(8);
        HocVienDAO instance = new HocVienDAO();
        instance.update(E);
      
    }

    /**
     * Test of delete method, of class HocVienDAO.
     */
    @Test(expectedExceptions = Exception.class)
    public void testDeleteEmpty() {
        System.out.println("delete");
        String ID = "";
        HocVienDAO instance = new HocVienDAO();
        int expResult = 0;
        int result = instance.delete(ID);
        assertEquals(expResult, result);
    }
    
    @Test(expectedExceptions = Exception.class)
    public void testDeleteNull() {
        System.out.println("delete");
        String ID = null ;
        HocVienDAO instance = new HocVienDAO();
        int expResult = 0;
        int result = instance.delete(ID);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDeleteValid() {
        System.out.println("delete");
        String ID = "1" ;
        HocVienDAO instance = new HocVienDAO();
        int expResult = 0;
        int result = instance.delete(ID);
        assertEquals(expResult, result);
    }

    /**
     * Test of selectAll method, of class HocVienDAO.
     */
    @Test
    public void testSelectAll() {
        System.out.println("selectAll");
    
        rs = inItResultSet();
        PowerMockito.when(JdbcHelper.ExecuteQuery( ArgumentMatchers.anyString())).thenReturn(rs);
        
        List<HocVien> result = HocVienDAOSpy.selectAll();
        for (HocVien hocVien : result) {
			System.out.println(hocVien.getMaHocVien()+"|"+hocVien.getMaKhoaHoc()+"|"+hocVien.getMaNguoihoc());
		}
        assertEquals(1, result.size());
      
        
    }
    @Test
    public void testSelectAllMultiData() {
        System.out.println("selectAll");
    
        rs = inItResultSetMultiData();
        PowerMockito.when(JdbcHelper.ExecuteQuery( ArgumentMatchers.anyString())).thenReturn(rs);
        
        List<HocVien> result = HocVienDAOSpy.selectAll();
        for (HocVien hocVien : result) {
			System.out.println(hocVien.getMaHocVien()+"|"+hocVien.getMaKhoaHoc()+"|"+hocVien.getMaNguoihoc());
		}
        assertEquals(3, result.size());
      
        
    }

    /**
     * Test of selectMaKhoaHoc method, of class HocVienDAO.
     */
    @Test
    public void testSelectMaKhoaHoc() { 
        System.out.println("selectMaKhoaHoc");
        String maKhoaHoc = "3";
        rs = inItResultSetMultiData();
        PowerMockito.when(JdbcHelper.ExecuteQuery( ArgumentMatchers.anyString(),ArgumentMatchers.anyString())).thenReturn(rs);
        
        List<HocVien> result = HocVienDAOSpy.selectMaKhoaHoc(maKhoaHoc);
        assertEquals(3, result.size());
       
    }
    @Test(expectedExceptions = Exception.class)
    public void testSelectMaKhoaHocNull() {
        System.out.println("selectMaKhoaHoc");
        String maKhoaHoc = null;
        rs = inItResultSetMultiData();
        PowerMockito.when(JdbcHelper.ExecuteQuery( ArgumentMatchers.anyString(),ArgumentMatchers.anyString())).thenReturn(rs);
        
        List<HocVien> result = HocVienDAOSpy.selectMaKhoaHoc(maKhoaHoc);
        assertEquals(3, result.size());
       
    }

    /**
     * Test of findById method, of class HocVienDAO.
     */
    @Test
    public void testFindByIdValid() {
        System.out.println("findById");
        String ID = "3";
        rs = inItResultSetMultiData();
        PowerMockito.when(JdbcHelper.ExecuteQuery( ArgumentMatchers.anyString(),ArgumentMatchers.anyString())).thenReturn(rs);
        
        HocVien result = HocVienDAOSpy.findById(ID);
        assertEquals(Integer.parseInt(ID), result.getMaHocVien());
    }
    
    @Test(expectedExceptions = NullPointerException.class)
    public void testFindByIdNull() {
        System.out.println("findById");
        String ID = null;
        rs = inItResultSetMultiData();
        PowerMockito.when(JdbcHelper.ExecuteQuery( ArgumentMatchers.anyString(),ArgumentMatchers.anyString())).thenReturn(rs);
        
        HocVien result = HocVienDAOSpy.findById(ID);
        assertEquals(ID, result.getMaHocVien());
    }
 
    /**
     * Test of findByMaNguoiHocAndMaKhoaHoc method, of class HocVienDAO.
     */
    @Test
    public void testFindByMaNguoiHocAndMaKhoaHoc() {
        System.out.println("findByMaNguoiHocAndMaKhoaHoc");
        String maNguoiHoc = "HV01";
        String maKhoaHoc = "3";
        rs = inItResultSetMultiData();
        PowerMockito.when(JdbcHelper.ExecuteQuery( ArgumentMatchers.anyString(),ArgumentMatchers.anyString(),ArgumentMatchers.anyString())).thenReturn(rs);
        
        HocVien result = HocVienDAOSpy.findByMaNguoiHocAndMaKhoaHoc(maNguoiHoc, maKhoaHoc);
        assertEquals("HV01", result.getMaNguoihoc());
        assertEquals("3", result.getMaKhoaHoc());
    }
    
    @Test(expectedExceptions = Exception.class)
    public void testFindByMaNguoiHocAndMaKhoaHocNull() {
        System.out.println("findByMaNguoiHocAndMaKhoaHoc");
        String maNguoiHoc = null;
        String maKhoaHoc = null;
        rs = inItResultSetMultiData();
        PowerMockito.when(JdbcHelper.ExecuteQuery( ArgumentMatchers.anyString(),ArgumentMatchers.anyString(),ArgumentMatchers.anyString())).thenReturn(rs);
        
        HocVien result = HocVienDAOSpy.findByMaNguoiHocAndMaKhoaHoc(maNguoiHoc, maKhoaHoc);
        assertEquals("HV01", result.getMaNguoihoc());
        assertEquals("3", result.getMaKhoaHoc());
    }

    /**
     * Test of DeleteByMaNguoiHocAndMaKhoaHoc method, of class HocVienDAO.
     */
    @Test
    public void testDeleteByMaNguoiHocAndMaKhoaHoc() {
        System.out.println("DeleteByMaNguoiHocAndMaKhoaHoc");
        String maNguoiHoc = "NH01";
        String maKhoaHoc = "3";
        HocVienDAO instance = new HocVienDAO();
        instance.DeleteByMaNguoiHocAndMaKhoaHoc(maNguoiHoc, maKhoaHoc);
    }
    @Test(expectedExceptions = NullPointerException.class)
    public void testDeleteByMaNguoiHocAndMaKhoaHocNull() {
        System.out.println("DeleteByMaNguoiHocAndMaKhoaHoc");
        String maNguoiHoc = "NH01";
        String maKhoaHoc = "3";
        HocVienDAO instance = new HocVienDAO();
        instance.DeleteByMaNguoiHocAndMaKhoaHoc(maNguoiHoc, maKhoaHoc);
    }
    @Test(expectedExceptions  = Exception.class)
    public void testDeleteByMaNguoiHocAndMaKhoaHocEmpty() {
        System.out.println("DeleteByMaNguoiHocAndMaKhoaHoc");
        String maNguoiHoc = "";
        String maKhoaHoc = "";
        HocVienDAO instance = new HocVienDAO();
        instance.DeleteByMaNguoiHocAndMaKhoaHoc(maNguoiHoc, maKhoaHoc);
    }
    
    private MockResultSet inItResultSet() {
    	rs.addColumn("maHocVien",new Integer[] {4});
    	rs.addColumn("maKhoaHoc",new String [] {"3"});
    	rs.addColumn("maNguoiHoc",new String [] {"HV01"});
    	rs.addColumn("diem",new Float [] {9f});
    	return  rs;
    }
    private MockResultSet inItResultSetMultiData() {
    	rs.addColumn("maHocVien",new Integer[] {3,5,6});
    	rs.addColumn("maKhoaHoc",new String [] {"3","3","3"});
    	rs.addColumn("maNguoiHoc",new String [] {"HV01","HV03","HV05"});
    	rs.addColumn("diem",new Float [] {9f,8f,6f});
    	return  rs;
    }
}
