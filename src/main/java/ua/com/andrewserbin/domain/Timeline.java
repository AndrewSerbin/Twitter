package ua.com.andrewserbin.domain;

/**
 * Created by Andrii_Serbin on 29-Sep-17.
 */
public interface Timeline {
    
    Iterable<Tweet> allTweets();
    
    void addTweet(Tweet tweet);
}
