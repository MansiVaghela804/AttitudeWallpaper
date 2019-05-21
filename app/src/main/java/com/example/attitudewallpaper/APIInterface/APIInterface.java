package com.example.attitudewallpaper.APIInterface;

import com.example.attitudewallpaper.Api_Response.CategoryResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIInterface {
    @FormUrlEncoded
    @POST("common_model.php")
    Call<CategoryResponse> GET_BRAND_RESPONSE_CALL_COMMON_CATEGORIES(
            @Field("getUsers") String getUsers);
}
