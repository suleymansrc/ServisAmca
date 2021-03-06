package com.example.suleymansrc.servisamca;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by suleymansrc on 4.2.2017.
 */
public class RequestHandler {
    private static RequestHandler mInstance;
    private RequestQueue mRequestQueue;
    private static Context mCtx;

    public RequestHandler(Context context) {
        this.mCtx = context;
        mRequestQueue=getRequestQueue();
    }
    public static synchronized RequestHandler getInstance (Context context){
        if(mInstance==null){
            mInstance=new RequestHandler(context);
        }
        return mInstance;
    }

    public RequestQueue getRequestQueue() {
        if(mRequestQueue==null){
            mRequestQueue= Volley.newRequestQueue(mCtx.getApplicationContext());
        }
        return mRequestQueue;
    }
    public <T> void addToRequestQueue(Request<T> req){
        getRequestQueue().add(req);
    }
}
