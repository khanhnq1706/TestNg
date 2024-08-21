package test.java.DAO;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.testng.annotations.Test;

import com.mockrunner.mock.jdbc.MockResultSet;

import DAO.ChuyenDeDAO;
import database.JdbcHelper;
import entity.ChuyenDe;
import static org.junit.Assert.assertThat;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;
import java.util.List;
@PrepareForTest({ JdbcHelper.class, ChuyenDeDAO.class })
public class ChuyenDeDAOTest {
    ChuyenDeDAO chuyenDeDao;
	ChuyenDeDAO chuyenDeDaoSpy;

	@Spy
	@InjectMocks
	MockResultSet rs = new MockResultSet("myMock");
	@Test
    public void testInsert() {
        System.out.println("insert");
        ChuyenDe E = null;
        ChuyenDeDAO instance = new ChuyenDeDAO();
        instance.insert(E);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class ChuyenDeDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        ChuyenDe E = null;
        ChuyenDeDAO instance = new ChuyenDeDAO();
        instance.update(E);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Before
	public void setup() {
		chuyenDeDao = new ChuyenDeDAO();
		PowerMockito.mockStatic(JdbcHelper.class);
		chuyenDeDaoSpy = PowerMockito.spy(chuyenDeDao);
	}

	/**
	 * Test of insert method, of class ChuyenDeDAO.
	 */
	@Test(expectedExceptions  = Exception.class)
	public void testInsertNull() {
		System.out.println("insert");
		ChuyenDe E = null;
		ChuyenDeDAO instance = chuyenDeDao;
		instance.insert(E);

	}

	@Test(expectedExceptions  = Exception.class)
	public void testInsertEmpty() {
		System.out.println("insert");
		ChuyenDe E = new ChuyenDe();
		ChuyenDeDAO instance = chuyenDeDao;
		instance.insert(E);

	}

	@Test
	public void testInsertValid() {
		System.out.println("insert");
		ChuyenDe e = new ChuyenDe();
		e.setHinhAnh("avc.img");
		e.setHocPhi(10000);
		e.setMaChuyenDe("CD01");
		e.setMoTa("Mo ta cd 01");
		e.setTenChuyenDe("Thong tin");
		e.setThoiLuongHoc(300);
		ChuyenDeDAO instance = chuyenDeDao;
		chuyenDeDao.insert(e);

	}

	/**
	 * Test of update method, of class ChuyenDeDAO.
	 */
	@Test(expectedExceptions =  NullPointerException.class)
	public void testUpdateNull() {
		System.out.println("update");
		ChuyenDe E = null;
		ChuyenDeDAO instance = chuyenDeDao;
		instance.update(E);

	}

	@Test
	public void testUpdateEmpty() {
		System.out.println("update");
		ChuyenDe E = new ChuyenDe();
		ChuyenDeDAO instance = chuyenDeDao;
		instance.update(E);

	}

	@Test
	public void testUpdateValid() {
		System.out.println("update");
		ChuyenDe e = new ChuyenDe();
		e.setHinhAnh("avc.img");
		e.setHocPhi(10000);
		e.setMaChuyenDe("CD01");
		e.setMoTa("Mo ta cd 01");
		e.setTenChuyenDe("Thong tin");
		e.setThoiLuongHoc(300);
		ChuyenDeDAO instance = chuyenDeDao;
		instance.update(e);

	}

	/**
	 * Test of delete method, of class ChuyenDeDAO.
	 */
	@Test(expectedExceptions =  Exception.class)
	public void testDeleteNull() {
		System.out.println("delete");
		String ID = null;
		ChuyenDeDAO instance = chuyenDeDao;
		int expResult = 0;
		int result = instance.delete(ID);
		assertEquals(expResult, result);

	}

	@Test
	public void testDelete() {
		System.out.println("delete");
		String ID = "CD01";
		ChuyenDeDAO instance = chuyenDeDao;
		int expResult = 1;
		int result = instance.delete(ID);
		assertEquals(expResult, result);
	}

	/**
	 * Test of selectAll method, of class ChuyenDeDAO.
	 */
	@Test
	public void testSelectAll() throws Exception {
		System.out.println("selectAll");

		rs = inItResultSet();
		PowerMockito.when(JdbcHelper.ExecuteQuery(ArgumentMatchers.anyString())).thenReturn(rs);

		List<ChuyenDe> result = chuyenDeDaoSpy.selectAll();
		assertThat(1, CoreMatchers.is(result.size()));

	}
	
	@Test
	public void testSelectAllMulti() throws Exception {
		System.out.println("selectAll");

		rs = inItResultSetMultiData();
		PowerMockito.when(JdbcHelper.ExecuteQuery(ArgumentMatchers.anyString())).thenReturn(rs);

		List<ChuyenDe> result = chuyenDeDaoSpy.selectAll();
		assertThat(3, CoreMatchers.is(result.size()));

	}

	

	/**
	 * Test of findById method, of class ChuyenDeDAO.
	 */
	@Test
	public void testFindById() throws Exception {
		System.out.println("findById");
		String  id =  "CD001";
		rs = inItResultSet();
		PowerMockito.when(JdbcHelper.ExecuteQuery(ArgumentMatchers.anyString(),ArgumentMatchers.anyString())).thenReturn(rs);
		ChuyenDe chuyende = chuyenDeDaoSpy.findById(id);
		assertEquals(chuyende.getMaChuyenDe(), id);
	}
	
	
	@Test(expectedExceptions =  Exception.class)
	public void testFindByIdEmpty() throws Exception {
		System.out.println("findById");
		String  id =  "";
		rs = inItResultSet();
		
		PowerMockito.when(JdbcHelper.ExecuteQuery(ArgumentMatchers.anyString(),ArgumentMatchers.anyString())).thenReturn(rs);
		
		ChuyenDe chuyende = chuyenDeDaoSpy.findById(id);
		
		assertEquals("",chuyende.getMaChuyenDe());

	}
	
	@Test(expectedExceptions =  NullPointerException.class)
	
	public void testFindByIdNull() throws Exception {
		System.out.println("findById");
		String  id =  null;
		rs = inItResultSet();
		
		PowerMockito.when(JdbcHelper.ExecuteQuery(ArgumentMatchers.anyString(),ArgumentMatchers.anyString())).thenReturn(rs);
		
		ChuyenDe chuyende = chuyenDeDaoSpy.findById(id);
		
		assertEquals(chuyende.getMaChuyenDe(), id); 

	}
	
	
	
	private MockResultSet inItResultSet() {
		// TODO Auto-generated method stub
		rs.addColumn("maChuyenDe", new String[] { "CD01" });
		rs.addColumn("tenChuyenDe", new String[] { "Chuyen de hoa" });
		rs.addColumn("hocPhi", new Float[] { 300f });
		rs.addColumn("thoiLuong", new Integer[] { 300 });
		rs.addColumn("hinh", new String[] { "" });
		rs.addColumn("mota", new String[] { "" });
		return rs;
	}
	
	private MockResultSet inItResultSetMultiData() {
		// TODO Auto-generated method stub
		rs.addColumn("maChuyenDe", new String[] { "CD01","CD02","CD03" });
		rs.addColumn("tenChuyenDe", new String[] { "Chuyen de hoa","Chuyen de Ly","Chuyen deToan" });
		rs.addColumn("hocPhi", new Float[] { 300f,300f,300f });
		rs.addColumn("thoiLuong", new Integer[] { 300,300,300 });
		rs.addColumn("hinh", new String[] { "" });
		rs.addColumn("mota", new String[] { "" });
		return rs;
	}
    
}
