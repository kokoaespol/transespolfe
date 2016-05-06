package com.planeticket.tools;

import android.app.Activity;
import android.os.AsyncTask;
import android.util.Log;



import java.util.ArrayList;

/**
 * Created by julio on 26/03/16.
 */
public abstract class WsClient extends AsyncTask<Void, Void, String>{

    public String buildParams;
    public Activity activity;
    //public Controller controller;

    protected WsClient(Activity activity, String code, String nInputs, String nOutputs, String format, String[] inputs, String[] outputs) {

    }
/*
    @Override
    protected String doInBackground(Void... v) {

        return doIn(controller,buildParams);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        doPre(activity);
    }

    @Override
    protected void onPostExecute(String result) {
        doPost(result);
    }

    //public String resultSetLogin(ArrayList<?> result){}
    public String doIn(Controller controller, String buildParams){
        return null;

    }

    public void doPost(String result){

    }

    public void doPre(Activity activity){
        controller = new Controller(activity);
    }*/
}
