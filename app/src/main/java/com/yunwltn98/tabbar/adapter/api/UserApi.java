package com.yunwltn98.tabbar.adapter.api;

import com.yunwltn98.tabbar.model.User;
import com.yunwltn98.tabbar.model.UserRes;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserApi {

    @POST("/user/register")
    Call<UserRes> register(@Body User user);

    @POST("/user/login")
    Call<UserRes> login(@Body User user);

}
