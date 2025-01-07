package study.test0106;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.IOException;

public class ApiService {
	public static void main(String[] args) throws IOException {
		List<WeatherInfo> weatherList = new ArrayList<>();

		StringBuilder urlBuilder = new StringBuilder(
				"http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getVilageFcst"); /* URL */
		urlBuilder.append("?" + URLEncoder.encode("serviceKey", "UTF-8")
				+ "Kte4Q%2FS%2F5x4vCYQ2%2Fk1rJg0KzppnY5YZnzsY1vAw83vSb5IVs54ggXXzrHf%2FWxUCMwz3VofRaXr0Pm%2Fx73Skcw%3D%3D"); /*
																																 * Service
																																 * Key
																																 */
		urlBuilder
				.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /* 페이지번호 */
		urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "="
				+ URLEncoder.encode("1000", "UTF-8")); /* 한 페이지 결과 수 */
		urlBuilder.append("&" + URLEncoder.encode("dataType", "UTF-8") + "="
				+ URLEncoder.encode("json", "UTF-8")); /* 요청자료형식(XML/JSON) Default: XML */
		urlBuilder.append("&" + URLEncoder.encode("base_date", "UTF-8") + "="
				+ URLEncoder.encode("20210628", "UTF-8")); /* ‘21년 6월 28일발표 */
		urlBuilder.append(
				"&" + URLEncoder.encode("base_time", "UTF-8") + "=" + URLEncoder.encode("0500", "UTF-8")); /* 05시 발표 */
		urlBuilder.append(
				"&" + URLEncoder.encode("nx", "UTF-8") + "=" + URLEncoder.encode("55", "UTF-8")); /* 예보지점의 X 좌표값 */
		urlBuilder.append(
				"&" + URLEncoder.encode("ny", "UTF-8") + "=" + URLEncoder.encode("127", "UTF-8")); /* 예보지점의 Y 좌표값 */

		URL url = new URL(urlBuilder.toString());
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/json");
		System.out.println("Response code: " + conn.getResponseCode());
		BufferedReader rd;
		if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
			rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		} else {
			rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = rd.readLine()) != null) {
			sb.append(line);
		}
		rd.close();
		conn.disconnect();

		try {
			JSONParser parser = new JSONParser();
			JSONObject jsonObject = (JSONObject) parser.parse(sb.toString());
			JSONObject responseBody = (JSONObject) ((JSONObject) jsonObject.get("response")).get("body");
			JSONArray items = (JSONArray) ((JSONObject) responseBody.get("items")).get("item");

			for (Object obj : items) {
				JSONObject item = (JSONObject) obj;
				WeatherInfo info = new WeatherInfo();

				info.setCategory((String) item.get("category"));
				info.setFcstDate((String) item.get("fcstDate"));
				info.setFcstTime((String) item.get("fcstTime"));
				info.setFcstValue((String) item.get("fcstValue"));

				weatherList.add(info);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static List<WeatherInfo> getWeatherInfoList(String baseDate, String baseTime, String nx, String ny)
			throws IOException {
		List<WeatherInfo> weatherList = new ArrayList<>();
		return weatherList;
	}
}