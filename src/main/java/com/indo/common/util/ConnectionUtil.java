package com.indo.common.util;


import java.net.URL;
import java.net.URLConnection;

public class ConnectionUtil {
    public static boolean isConnectedToServer(String url, int timeout) {
        try{
            URL myUrl = new URL(url);
            URLConnection connection = myUrl.openConnection();
            connection.setConnectTimeout(timeout);
            connection.connect();
            return true;
        } catch (Exception e) {
            // todo Handle exceptions
            return false;
        }
    }

}
