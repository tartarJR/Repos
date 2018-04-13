package com.tatar.repos.network;

import com.tatar.repos.model.Repository;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by mobile on 13.04.2018.
 */

public interface Service {

    @GET("repositories")
    Call<List<Repository>> getAllRepos();

}
