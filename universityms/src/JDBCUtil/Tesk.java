package JDBCUtil;

import java.sql.Connection;
import JDBCUtil.JDBCUtil;

public class Tesk {
	public static void main(String[] args) {

		Connection con = JDBCUtil.getConnection();

		if (con != null) {
			System.out.println("Kết nối thành công!");
		} else {
			System.out.println("Kết nối thất bại!");
		}
	}

}