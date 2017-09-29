package ua.com.andrewserbin.repository;

import org.junit.Test;
import ua.com.andrewserbin.domain.Tweet;
import ua.com.andrewserbin.domain.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

/**
 * Created by Andrii_Serbin on 29-Sep-17.
 */
public class InMemTweetRepositoryTest {
    @Test
    public void allTweets() throws Exception {
        List<Tweet> expected = Arrays.asList(
                new Tweet(1L, 1, 1, "First Message", new User("John", null)),
                new Tweet(2L, 2, 2, "Second Message", null));
        TweetRepository tweetRepository = new InMemTweetRepository();
        
        List<Tweet> actual = new ArrayList<>();
        tweetRepository.allTweets().forEach(actual::add);

        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void getTweet() throws Exception {
        Tweet expected = new Tweet(1L, 1, 1, "First Message", new User("John", null));
        TweetRepository tweetRepository = new InMemTweetRepository();

        Tweet actual = tweetRepository.getTweet();

        assertEquals(expected, actual);
    }
}