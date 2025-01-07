package study.test0106;

public class WeatherInfo {

    /*
  CREATE TABLE WEATHERINFO (
    id NUMBER PRIMARY KEY,
    category VARCHAR2(64),
    fcst_date VARCHAR2(64),
    fcst_time VARCHAR2(64),
    fcst_value VARCHAR2(64));
    
     CREATE SEQUENCE weatherinfo_pk_seq
     START WITH 1
     INCREMENT BY 1
     NOCYCLE;
     */

    int id;
    String category;
    String fcstDate;
    String fcstTime;
    String fcstValue;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFcstDate() {
        return fcstDate;
    }

    public void setFcstDate(String fcstDate) {
        this.fcstDate = fcstDate;
    }

    public String getFcstTime() {
        return fcstTime;
    }

    public void setFcstTime(String fcstTime) {
        this.fcstTime = fcstTime;
    }

    public String getFcstValue() {
        return fcstValue;
    }

    public void setFcstValue(String fcstValue) {
        this.fcstValue = fcstValue;
    }

    @Override
    public String toString() {
        return "WeatherInfo [id=" + id + ", category=" + category + ", fcstDate=" + fcstDate
                + ", fcstTime=" + fcstTime + ", fcstValue=" + fcstValue + "]";
    }
}