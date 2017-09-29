package ua.com.andrewserbin.service;

import ua.com.andrewserbin.domain.Tweet;
import ua.com.andrewserbin.repository.TweetRepository;

public interface TweetService {

    Iterable<Tweet> allTweets();

    TweetRepository getTweetRepository();

    Tweet getTweet();
}
