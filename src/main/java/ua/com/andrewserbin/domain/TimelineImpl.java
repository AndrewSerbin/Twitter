package ua.com.andrewserbin.domain;

import java.util.ArrayList;
import java.util.List;

public class TimelineImpl implements Timeline {

    private List<Tweet> tweets;

    public TimelineImpl() {
        tweets = new ArrayList<>();
    }

    public TimelineImpl(List<Tweet> tweets) {
        this.tweets = tweets;
    }

    public void addTweet(Tweet tweet) {
        tweets.add(tweet);
    }

    public List<Tweet> allTweets() {
        return tweets;
    }

    public void setTweets(List<Tweet> tweets) {
        this.tweets = tweets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TimelineImpl)) return false;

        TimelineImpl timelineImpl = (TimelineImpl) o;

        return tweets != null ? tweets.equals(timelineImpl.tweets) : timelineImpl.tweets == null;

    }

    @Override
    public int hashCode() {
        return tweets != null ? tweets.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "TimelineImpl{" +
                "tweets=" + tweets +
                '}';
    }
}
