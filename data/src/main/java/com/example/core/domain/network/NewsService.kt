package com.example.core.domain.network
import com.example.domain.data.NewsResponse
import com.example.domain.data.SourceResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsService {
    @GET("top-headlines")
    suspend fun getTopHeadlines(
        @Query("country") country: String,
        @Query("apiKey") apiKey: String
    ): Response<NewsResponse>

    @GET("sources")
    suspend fun getNewsSources(
        @Query("apiKey") apiKey: String
    ): Response<SourceResponse>
}