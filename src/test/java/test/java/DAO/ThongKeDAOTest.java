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

import DAO.ThongKeDAO;
import database.JdbcHelper;


import static org.junit.Assert.assertEquals;

import static org.testng.Assert.assertEquals;


import java.util.Date;
import java.util.List;
@PrepareForTest({ JdbcHelper.class, ThongKeDAO.class })
public class ThongKeDAOTest {
	ThongKeDAO ThongKeDAO;
	ThongKeDAO ThongKeDAOSpy;

	@Spy
	@InjectMocks
	MockResultSet rs = new MockResultSet("myMock");

	@Before
	public void setup() {
		ThongKeDAO = new ThongKeDAO();
		PowerMockito.mockStatic(JdbcHelper.class);
		ThongKeDAOSpy = PowerMockito.spy(new ThongKeDAO());
	}

	/**
	 * Test of getSoNguoiHoc method, of class ThongKeDAO.
	 */
	@Test
	public void testGetSoNguoiHoc() throws Exception {
		System.out.println("getSoNguoiHoc");
		rs = dataGetSoNguoi();

		PowerMockito.when(JdbcHelper.ExecuteQuery(ArgumentMatchers.anyString())).thenReturn(rs);

		List<Object[]> listData = ThongKeDAOSpy.getSoNguoiHoc();

		assertEquals(1, listData.size());

	}

	private MockResultSet dataGetSoNguoi() {
		MockResultSet mock = new MockResultSet("mock");
		mock.addColumn("Nam", new Integer[] { 2023 });
		mock.addColumn("SoLuong", new Integer[] { 6 });
		mock.addColumn("DauTien", new Date[] { new Date() });
		mock.addColumn("CuoiCung", new Date[] { new Date() });
		return mock;
	}

	/**
	 * Test of getBangDiem method, of class ThongKeDAO.
	 */
	
	@Test(expectedExceptions = NullPointerException.class)
	public void testGetBangDiemNull() throws Exception {
		System.out.println("getBangDiem");
		Integer maKhoaHoc = null;
	
		rs = dataGetBanDiem();

		PowerMockito.when(JdbcHelper.ExecuteQuery(ArgumentMatchers.anyString(),ArgumentMatchers.any())).thenReturn(rs);

		List<Object[]> listData = ThongKeDAOSpy.getBangDiem(maKhoaHoc);

		assertEquals(1, listData.size());
	}
	
	@Test
	public void testGetBangDiem() throws Exception {
		System.out.println("getBangDiem");
		int maKhoaHoc = 5;
	
		rs = dataGetBanDiem();

		PowerMockito.when(JdbcHelper.ExecuteQuery(ArgumentMatchers.anyString(),ArgumentMatchers.any())).thenReturn(rs);

		List<Object[]> listData = ThongKeDAOSpy.getBangDiem(maKhoaHoc);

		assertEquals(1, listData.size());
	}

	private MockResultSet dataGetBanDiem() {
		MockResultSet mock = new MockResultSet("mock");
		mock.addColumn("maNguoiHoc", new String[] {"NH01"});
		mock.addColumn("HoTen", new String[] { "Nguyen Van A" });
		mock.addColumn("Diem", new Float[] { 6f });
	
		return mock;
	}
	
	
	/**
	 * Test of getDiemTheoChuyenDe method, of class ThongKeDAO.
	 */
	@Test
	public void testGetDiemTheoChuyenDe() throws Exception {
		System.out.println("getDiemTheoChuyenDe");
		rs = dataGetspThongKeDiem();

		PowerMockito.when(JdbcHelper.ExecuteQuery(ArgumentMatchers.anyString())).thenReturn(rs);

		List<Object[]> listData = ThongKeDAOSpy.getDiemTheoChuyenDe();

		assertEquals(1, listData.size());
	}
	private MockResultSet dataGetspThongKeDiem() {
		MockResultSet mock = new MockResultSet("mock");
		mock.addColumn("ChuyenDe", new String[] {"LapTrinhC"});
		mock.addColumn("SoHv",new Integer[] {12});
		mock.addColumn("ThapNhat", new Float[] { -1f });
		mock.addColumn("caoNhat", new Float[] { 6f });
		mock.addColumn("TrungBinh", new Float[] { 3f });
		return mock;
	}

	/**
	 * Test of getDoanhThu method, of class ThongKeDAO.
	 */
	@Test
	public void testGetDoanhThu() throws Exception {
		System.out.println("getDoanhThu");
		
		int nam = 5;
		
		rs = dataGetThongKeDoanhThu();

		PowerMockito.when(JdbcHelper.ExecuteQuery(ArgumentMatchers.anyString(),ArgumentMatchers.any())).thenReturn(rs);

		List<Object[]> listData = ThongKeDAOSpy.getDoanhThu(nam);

		assertEquals(1, listData.size());
	}
	
	@Test(expectedExceptions = NullPointerException.class)
	public void testGetDoanhThuNull() throws Exception {
		System.out.println("getDoanhThu");
		
		Integer nam = null;
		
		rs = dataGetThongKeDoanhThu();

		PowerMockito.when(JdbcHelper.ExecuteQuery(ArgumentMatchers.anyString(),ArgumentMatchers.any())).thenReturn(rs);

		List<Object[]> listData = ThongKeDAOSpy.getDoanhThu(nam);

		assertEquals(1, listData.size());
	}
	
	
	
	
	
	private MockResultSet dataGetThongKeDoanhThu() {
		MockResultSet mock = new MockResultSet("mock");
		mock.addColumn("ChuyenDe", new String[] {"LapTrinhC"});
		mock.addColumn("SoKH",new Integer[] {12});
		mock.addColumn("SoHv",new Integer[] {12});
		mock.addColumn("DoanhThu", new Float[] { -1423512f });
		mock.addColumn("caoNhat", new Float[] { 62451214f });
		mock.addColumn("ThapNhat", new Float[] { 4512346f });
		mock.addColumn("TrungBinh", new Float[] { 34234f });
		return mock;
	}
}
