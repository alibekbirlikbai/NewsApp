package kz.iitu.itse1903.birlikbai.newsapp.App.A_CATEGORIES.Models;

import java.io.Serializable;
import java.util.List;

public class NewsApiResponse implements Serializable {
    String status;
    int totalResults;
    List<NewsHeadline> articles;

    public String getStatus() {
        return status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public List<NewsHeadline> getArticles() {
        return articles;
    }
}
