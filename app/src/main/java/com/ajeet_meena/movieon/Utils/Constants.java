package com.ajeet_meena.movieon.Utils;

import com.ajeet_meena.movieon.MyApplication;
import com.ajeet_meena.movieon.R;

/**
 * Created by Ajeet Kumar Meena on 19-06-2016.
 */

public class Constants {
    public static final String BASE_IMAGE_URL = "https://image.tmdb.org/t/p/w342";
    public static final String BASE_BACKDROP_IMAGE_URL = "https://image.tmdb.org/t/p/w780";
    private static final String SORT_BY_POPULARITY_ASC = "popularity.asc";
    private static final String SORT_BY_POPULARITY_DESC = "popularity.desc";
    private static final String SORT_BY_RELEASE_DATE_ASC = "release_date.asc";
    private static final String SORT_BY_RELEASE_DATE_DESC = "release_date.desc";
    private static final String SORT_BY_REVENUE_ASC = "revenue.asc";
    private static final String SORT_BY_REVENUE_DESC = "revenue.desc";
    private static final String SORT_BY_VOTE_AVERAGE_ASC = "vote_average.asc";
    private static final String SORT_BY_VOTE_AVERAGE_DESC = "vote_average.desc";
    private static final String SORT_BY_VOTE_COUNT_ASC = "vote_count.asc";
    private static final String SORT_BY_VOTE_COUNT_DESC = "vote_count.desc";
    public static final String[] FILTERS = {"Popularity Ascending", "Popularity Descending",
            "Release Date Ascending", "Release Date Descending", "Revenue Ascending", "Revenue Descending",
            "Vote Average Ascending", "Vote Average Descending", "Vote Count Ascending", "Vote Count Descending"};
    public static final String[] FILTERS_KEY = {SORT_BY_POPULARITY_ASC, SORT_BY_POPULARITY_DESC, SORT_BY_RELEASE_DATE_ASC,
            SORT_BY_RELEASE_DATE_DESC, SORT_BY_REVENUE_ASC, SORT_BY_REVENUE_DESC, SORT_BY_VOTE_AVERAGE_ASC, SORT_BY_VOTE_AVERAGE_DESC, SORT_BY_VOTE_COUNT_ASC, SORT_BY_VOTE_COUNT_DESC};
    public static final String API_KEY = MyApplication.getInstance().getResources().getString(R.string.api_key);
}
