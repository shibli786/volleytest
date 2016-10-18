package com.example.daffodil.demoapplication;




import android.os.AsyncTask;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

/**
 * Created by daffodil on 18/10/16.
 */
public class JsonParser extends AsyncTask


{



    @Override
    protected Object doInBackground(Object[] params) {



        URL url = null;
        try {
            url = new URL("localhost/betsapp_copy/api/student.php?action=getStudents");
            HttpsURLConnection connection= (HttpsURLConnection) url.openConnection();


            try {

                BufferedReader br= new BufferedReader(new InputStreamReader(connection.getInputStream()));


                StringBuilder stringBuilder = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null) {
                    stringBuilder.append(line).append("\n");
                }
                br.close();
                return stringBuilder.toString();



            }
            finally {
                connection.disconnect();

            }
        }



        catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }
}
