package ua.com.andrewserbin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.andrewserbin.domain.Tweet;
import ua.com.andrewserbin.repository.TweetRepository;

public class TweetServiceImpl implements TweetService {

    private TweetRepository tweetRepository;

    public TweetServiceImpl() {
    }

    public TweetServiceImpl(TweetRepository tweetRepository) {
        this.tweetRepository = tweetRepository;
    }

    @Override
    public Iterable<Tweet> allTweets() {
        return tweetRepository.allTweets();
    }

    @Override
    public TweetRepository getTweetRepository() {
        return tweetRepository;
    }

    @Override
    public Tweet getTweet() {
        return tweetRepository.getTweet();
    }
}
