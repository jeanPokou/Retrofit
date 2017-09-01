package com.jeanpokou.retrofit.api.service;

import com.jeanpokou.retrofit.api.model.GitHubRepo;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface GitHubClient {
    @GET("/users/{user}/repos")
    Call<List<GitHubRepo>> reposForUer(
            @Path("user") String user
    );
}
