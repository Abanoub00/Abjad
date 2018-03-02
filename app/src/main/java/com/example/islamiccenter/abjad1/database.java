package com.example.islamiccenter.abjad1;

import android.os.AsyncTask;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by islamic center on 27/11/2017.
 */

public class database extends AsyncTask<String,String,String>   {

    @Override
    protected String doInBackground(String... params) {
        String full_name = params[0];
        String user_name = params[1];
        String password = params[2];
        String confirm_password = params[3];
        String data = "";
        int tmp;
        try {
            URL url = new URL("http://10.0.2.2:8080/save.php");
            String urlparams = "Full_name" + full_name + "user_name" + user_name + "password" + password + "Confirm_password" + confirm_password;
            HttpURLConnection hurl = (HttpURLConnection) url.openConnection();
            hurl.setDoOutput(true);
            OutputStream os = hurl.getOutputStream();
            os.write(urlparams.getBytes());
            os.flush();
            os.close();
            InputStream is = hurl.getInputStream();
            while ((tmp = is.read()) != -1) {
                data += (char) tmp;
            }

            is.close();
        } catch (MalformedURLException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return data;

    }

  /*@Override
    protected void onPostExecute (String s){
        if (s.equals(""))
        s="datasaved";
        Toast.makeText(database.this, "Data Saved Successed", Toast.LENGTH_SHORT).show();

    }
*/

}


