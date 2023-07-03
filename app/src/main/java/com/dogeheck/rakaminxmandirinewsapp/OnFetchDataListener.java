package com.dogeheck.rakaminxmandirinewsapp;

import com.dogeheck.rakaminxmandirinewsapp.Models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse>{
    void onFetchData(List<NewsHeadlines> list, String message);
    void onError(String message);
}
