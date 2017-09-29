package ua.com.andrewserbin.repository;

import org.springframework.stereotype.Repository;
import ua.com.andrewserbin.domain.Tweet;
import ua.com.andrewserbin.domain.User;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

public class InMemTweetRepository implements TweetRepository {

    private List<Tweet> tweets;
    {
        tweets = Arrays.asList(
                new Tweet(1L, 1, 1, "First Message", new User("John", null)),
                new Tweet(2L, 2, 2, "Second Message", null)
        );
    }

    @Override
    public Iterable<Tweet> allTweets() {
        return tweets;
    }

    @Override
    public Tweet getTweet() {
        return tweets.get(0);
    }
}
