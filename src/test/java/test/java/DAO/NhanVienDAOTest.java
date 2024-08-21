package test.java.DAO;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.testng.annotations.Test;

import com.mockrunner.mock.jdbc.MockResultSet;

import DAO.NhanVienDAO;
import database.JdbcHelper;
import entity.NhanVien;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;

import java.util.List;
@PrepareForTest({ JdbcHelper.class, NhanVienDAO.class })
public class NhanVienDAOTest {
	NhanVienDAO NhanVienDAO;
	NhanVienDAO NhanVienDAOSpy;
	
	@Spy
	@InjectMocks
	MockResultSet rs = new MockResultSet("myMock");

	@Before
	public void setup() {
		NhanVienDAO = new NhanVienDAO();
		PowerMockito.mockStatic(JdbcHelper.class);
		NhanVienDAOSpy = PowerMockito.spy(new NhanVienDAO());
	}

	public NhanVienDAOTest() {
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
	 * Test of insert method, of class NhanVienDAO.
	 */
	@Test(expectedExceptions = NullPointerException.class)
	public void testInsertNull() {
		System.out.println("insert");
		NhanVien nv = null;
		NhanVienDAO instance = new NhanVienDAO();
		instance.insert(nv);

	}

	@Test(expectedExceptions = Exception.class)
	public void testInsertEmpty() {
		System.out.println("insert");
		NhanVien nv = new NhanVien();
		NhanVienDAO instance = new NhanVienDAO();
		instance.insert(nv);

	}

	@Test
	public void testInsertValid() {
		System.out.println("insert");
		NhanVien nv = new NhanVien();
		nv.setMaNhanVien("NV01");
		nv.setHoVaTen("Nguyen  van a");
		nv.setMatKhau("12341234");
		nv.setVaiTro(true);
		NhanVienDAO instance = new NhanVienDAO();
		instance.insert(nv);

	}

	/**
	 * Test of update method, of class NhanVienDAO.
	 */
	@Test(expectedExceptions = NullPointerException.class)
	public void testUpdateNull() {
		System.out.println("update");
		NhanVien E = null;
		NhanVienDAO instance = new NhanVienDAO();
		instance.update(E);

	}

	@Test(expectedExceptions = Exception.class)
	public void testUpdateEmpty() {
		System.out.println("update");
		NhanVien E = new NhanVien();
		NhanVienDAO instance = new NhanVienDAO();
		instance.update(E);

	}

	@Test
	public void testUpdateValid() {
		System.out.println("update");
		NhanVien nv = new NhanVien();
		nv.setMaNhanVien("NV01");
		nv.setHoVaTen("Nguyen  van a");
		nv.setMatKhau("12341234");
		nv.setVaiTro(true);
		NhanVienDAO instance = new NhanVienDAO();
		instance.update(nv);

	}

	/**
	 * Test of delete method, of class NhanVienDAO.
	 */
	@Test(expectedExceptions = Exception.class)
	public void testDeleteEmpty() {
		System.out.println("delete");
		String ID = "";
		NhanVienDAO instance = new NhanVienDAO();
		int expResult = 0;
		int result = instance.delete(ID);
		assertEquals(expResult, result);

	}

	@Test(expectedExceptions = Exception.class)
	public void testDeleteNull() {
		System.out.println("delete");
		String ID = null;
		NhanVienDAO instance = new NhanVienDAO();
		int expResult = 0;
		int result = instance.delete(ID);
		assertEquals(expResult, result);

	}

	@Test
	public void testDeleteValid() {
		System.out.println("delete");
		String ID = "NV01";
		NhanVienDAO instance = new NhanVienDAO();
		int expResult = 0;
		int result = instance.delete(ID);
		assertEquals(expResult, result);

	}

	/**
	 * Test of selectAll method, of class NhanVienDAO.
	 */
	@Test
	public void testSelectAll() {
		System.out.println("selectAll");
	

		rs =inItData();

		PowerMockito.when(JdbcHelper.ExecuteQuery(ArgumentMatchers.anyString())).thenReturn(rs);

		List<NhanVien> listNhanVien = NhanVienDAOSpy.selectAll();

		assertEquals(1, listNhanVien.size());

	}
	@Test
	public void testSelectAllMultiData() {
		System.out.println("selectAll");

		rs = inItMultiData();

		PowerMockito.when(JdbcHelper.ExecuteQuery(ArgumentMatchers.anyString())).thenReturn(rs);

		List<NhanVien> listNhanVien = NhanVienDAOSpy.selectAll();

		assertEquals(1, listNhanVien.size());

	}

	/**
	 * Test of findById method, of class NhanVienDAO.
	 */
	@Test
	public void testFindById() {
		System.out.println("selectFindId");

		rs.addColumn();
		String id = "NV01";

		rs = inItData();
		PowerMockito.when(JdbcHelper.ExecuteQuery(ArgumentMatchers.anyString(), ArgumentMatchers.anyString()))
				.thenReturn(rs);

		NhanVien nhanVien = NhanVienDAOSpy.findById(id);

		assertEquals(id, nhanVien.getMaNhanVien());
	}
	
	@Test(expectedExceptions = NullPointerException.class)
	public void testFindByIdNull() {
		System.out.println("selectFindId");

		rs.addColumn();
		String id = null;

		rs = inItData();
		PowerMockito.when(JdbcHelper.ExecuteQuery(ArgumentMatchers.anyString(), ArgumentMatchers.anyString()))
				.thenReturn(rs);

		NhanVien nhanVien = NhanVienDAOSpy.findById(id);

		assertEquals(id, nhanVien.getMaNhanVien());
	}
	
	@Test(expectedExceptions = Exception.class)
	public void testFindByIdEmpty() {
		System.out.println("selectFindId");

		rs.addColumn();
		String id = null;

		rs = inItData();
		PowerMockito.when(JdbcHelper.ExecuteQuery(ArgumentMatchers.anyString(), ArgumentMatchers.anyString()))
				.thenReturn(rs);

		NhanVien nhanVien = NhanVienDAOSpy.findById(id);

		assertEquals(id, nhanVien.getMaNhanVien());
	}

	private MockResultSet inItData() {

		rs.addColumn("maNV", new String[] { "NV01" });
		rs.addColumn("matKhau", new String[] { "NV01" });
		rs.addColumn("hoTen", new String[] { "nguyen van a" });
		rs.addColumn("vaiTro", new Integer[] { 1 });

		return rs;
	}

	private MockResultSet inItMultiData() {

		rs.addColumn("maNV", new String[] { "NV04", "NV02", "NV03" });
		rs.addColumn("matKhau", new String[] { "123", "123", "123" });
		rs.addColumn("hoTen", new String[] { "nguyen van a", "nguyen van a", "nguyen van a" });
		rs.addColumn("vaiTro", new Integer[] { 1, 0, 1 });

		return rs;
	}
}
