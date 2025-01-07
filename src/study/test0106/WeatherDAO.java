package study.test0106;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WeatherDAO {

    Connection conn;
    PreparedStatement psmt;
    ResultSet rs;

    public int saveWeatherInfo(WeatherInfo weatherInfo) {
        conn = DBConnectionManager.connectDB();

        int result = 0;

        String sqlQuery = "INSERT INTO WEATHERINFO VALUES (weatherinfo_pk_seq.nextval, ?, ?, ?, ?)";

        try {
            psmt = conn.prepareStatement(sqlQuery);

            psmt.setString(1, weatherInfo.getCategory());
            psmt.setString(2, weatherInfo.getFcstDate());
            psmt.setString(3, weatherInfo.getFcstTime());
            psmt.setString(4, weatherInfo.getFcstValue());

            result = psmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnectionManager.disconnectDB(conn, psmt, rs);
        }

        return result;
    }
}