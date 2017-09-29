package ua.com.andrewserbin.service;

import ua.com.andrewserbin.domain.Tweet;

public interface TimelineService {

    void addTweet(Tweet tweet);

    Iterable<Tweet> allTweets();
    
    void likeTweet(Tweet tweet);
}
