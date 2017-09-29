package ua.com.andrewserbin.service;

import ua.com.andrewserbin.domain.Timeline;
import ua.com.andrewserbin.domain.Tweet;

public class TimelineServiceImpl implements TimelineService {

    private Timeline timeline;

    public TimelineServiceImpl() {
    }

    public TimelineServiceImpl(Timeline timeline) {
        this.timeline = timeline;
    }

    @Override
    public void addTweet(Tweet tweet) {
        tweet.retweet();
        timeline.addTweet(tweet);
    }

    @Override
    public Iterable<Tweet> allTweets() {
        return timeline.allTweets();
    }

    @Override
    public void likeTweet(Tweet tweet) {
        tweet.like();
    }
}
