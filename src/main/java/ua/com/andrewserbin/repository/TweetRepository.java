package ua.com.andrewserbin.repository;

import ua.com.andrewserbin.domain.Tweet;

public interface TweetRepository {

    Iterable<Tweet> allTweets();

    Tweet getTweet();
}
