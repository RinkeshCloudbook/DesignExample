package com.one.designexample.Retrofit;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {
    @FormUrlEncoded
    @POST("WebService/studentEventList.php")
    Call<Example> getUserData(@Field("branchId") String str, @Field("schoolId") String str2, @Field("sessionId") String str3, @Field("userId") String str4);


}
