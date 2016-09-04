package jiayangs.weatherstar;

/**
 * Created by sjyhe on 9/4/2016.
 */
public class Weather {
    public String data;
    public String forecast;
    public String highTemp;
    public String lowTemp;

    public Weather(){
        data = "Today, September 03";
        forecast = "clear";
        highTemp = "72";
        lowTemp = "38";
    }

    public Weather(int i){
        data = "Today, September 03";
        forecast = "clear";
        highTemp = String.valueOf(60+10*i);
        lowTemp = "38";
    }
}
