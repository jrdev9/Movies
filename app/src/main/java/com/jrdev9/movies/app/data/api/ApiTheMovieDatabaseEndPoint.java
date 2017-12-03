package com.jrdev9.movies.app.data.api;


import com.jrdev9.movies.BuildConfig;
import com.jrdev9.movies.modules.discovermovies.data.sources.api.models.ApiDiscoverMoviesResponse;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;


public interface ApiTheMovieDatabaseEndPoint {

    String BASE_URL = "https://api.themoviedb.org/";
    String VERSION = "3/";
    String API_KEY = BuildConfig.THE_MOVIE_DB_API_KEY;

    @GET("discover/movie")
    Call<ApiDiscoverMoviesResponse> discoverMovies(@QueryMap Map<String, String> options);
}
