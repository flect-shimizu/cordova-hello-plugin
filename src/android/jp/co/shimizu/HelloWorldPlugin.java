package jp.co.shimizu;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class HelloWorldPlugin extends CordovaPlugin {
    @Override
    public boolean execute(String action, String data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("say")) {

            String name = data;
            String message = "Hello, " + name;
            callbackContext.success(message);

            return true;

        } else {
            
            return false;
        }
    }
}

        