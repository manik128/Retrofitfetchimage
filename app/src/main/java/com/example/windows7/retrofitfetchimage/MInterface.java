package com.example.windows7.retrofitfetchimage;


import com.squareup.okhttp.ResponseBody;

import retrofit.Callback;

import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.Call;

/**
 * Created by Admin on 02-02-2017.
 */

public interface MInterface {
    @GET("/api/RetrofitAndroidImageResponse")
    Call<ResponseBody> getImageDetails();
//    @FormUrlEncoded
//    @POST("/test/index.php")
//    public void insertUser(
//            @Field("name") String name,
//            @Field("username") String username,
//            @Field("password") String password,
//            @Field("email") String email,
//            @Field("phno") String phone,
//            Callback<Response> callback);

}
