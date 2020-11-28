import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

    public class Weather {
        static  String url="https://samples.openweathermap.org/data/2.5/forecast/hourly?q=London,us&appid=b6907d289e10d714a6e88b30761fae22";
        void getWeather(String date)
        {
            try {


                URL u = new URL(url);
                HttpURLConnection connection = (HttpURLConnection)u.openConnection();
                BufferedReader in=new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputline;
                StringBuffer response=new StringBuffer();
                while ((inputline=in.readLine())!=null)
                {
                    response.append(inputline);
                }
                JSONParser parser=new JSONParser();
                Object obj=parser.parse(response.toString());
                JSONObject json_obj=(JSONObject)obj;
                JSONArray list =(JSONArray)json_obj.get("list");
                boolean dataFound=false;
                for(int i=0;i<list.size();i++) {
                    JSONObject address = (JSONObject) list.get(i);
                    String temp[] = address.get("dt_txt").toString().split(" ");


                    if (date.equals(temp[0])) {
                        dataFound=true;
                        JSONObject main = (JSONObject) address.get("main");
                        System.out.print("Temperature: " + main.get("temp").toString());
                        System.out.print("     " + address.get("dt_txt"));
                        System.out.println();
                    }

                }
                if(dataFound==false)
                {
                    System.out.println("No data found or please check date format");
                }

            }
            catch (UnknownHostException u)
            {
                System.out.println("Please check internet connection");
            }
            catch (ConnectException c)
            {
                System.out.println("Please check internet connection");
            }
            catch(Exception e)
            {
                System.out.println(e);
            }

        }
        void getPressure(String date)
        {
            try {

                URL u = new URL(url);

                HttpURLConnection connection = (HttpURLConnection)u.openConnection();
                BufferedReader in=new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputline;
                StringBuffer response=new StringBuffer();
                while ((inputline=in.readLine())!=null)
                {
                    response.append(inputline);
                }
                JSONParser parser=new JSONParser();
                Object obj=parser.parse(response.toString());
                JSONObject json_obj=(JSONObject)obj;
                JSONArray list =(JSONArray)json_obj.get("list");
                boolean dataFound=false;
                for(int i=0;i<list.size();i++) {
                    JSONObject address = (JSONObject) list.get(i);
                    String temp[] = address.get("dt_txt").toString().split(" ");


                    if (date.equals(temp[0])) {
                        dataFound=true;
                        JSONObject main = (JSONObject) address.get("main");
                        System.out.print("Pressure: " + main.get("pressure").toString());
                        System.out.print("     " + address.get("dt_txt"));
                        System.out.println();
                    }

                }
                if(dataFound==false)
                {
                    System.out.println("No data found or please check date format");
                }

            }
            catch (UnknownHostException u)
            {
                System.out.println("Please check internet connection");
            }
            catch (ConnectException c)
            {
                System.out.println("Please check internet connection");
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        void getWindSpeed(String date)
        {
            try {

                URL u = new URL(url);

                HttpURLConnection connection = (HttpURLConnection)u.openConnection();
                BufferedReader in=new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputline;
                StringBuffer response=new StringBuffer();
                while ((inputline=in.readLine())!=null)
                {
                    response.append(inputline);
                }
                JSONParser parser=new JSONParser();
                Object obj=parser.parse(response.toString());
                JSONObject json_obj=(JSONObject)obj;
                JSONArray list =(JSONArray)json_obj.get("list");
                boolean dataFound=false;
                for(int i=0;i<list.size();i++) {
                    JSONObject address = (JSONObject) list.get(i);
                    String temp[] = address.get("dt_txt").toString().split(" ");


                    if (date.equals(temp[0])) {
                        dataFound=true;
                        JSONObject main = (JSONObject) address.get("wind");
                        System.out.print("Wind Speed: " + main.get("speed").toString());
                        System.out.print("     " + address.get("dt_txt"));
                        System.out.println();
                    }

                }
                if(dataFound==false)
                {
                    System.out.println("No data found or please check date format");
                }

            }
            catch (UnknownHostException u)
            {
                System.out.println("Please check internet connection");
            }
            catch (ConnectException c)
            {
                System.out.println("Please check internet connection");
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }


    }




