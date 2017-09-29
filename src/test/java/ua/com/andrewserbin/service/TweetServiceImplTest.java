package ua.com.andrewserbin.service;

import org.junit.Test;
import ua.com.andrewserbin.domain.Tweet;
import ua.com.andrewserbin.repository.InMemTweetRepository;
import ua.com.andrewserbin.repository.TweetRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Andrii_Serbin on 29-Sep-17.
 */
public class TweetServiceImplTest {
    @Test
    public void allTweets() throws Exception {
        List<Tweet> expected = Arrays.asList(new Tweet(1L, 1, 2, "Txt", null));
        TweetRepository tweetRepository = mock(InMemTweetRepository.class);
        when(tweetRepository.allTweets()).thenReturn(expected);
        TweetService tweetService = new TweetServiceImpl(tweetRepository);
        
        List<Tweet> actual = new ArrayList<>();
        tweetService.allTweets().forEach(actual::add);

        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void getTweet() throws Exception {
        Tweet expected = new Tweet(1L, 1, 2, "Txt", null);
        TweetRepository tweetRepository = mock(InMemTweetRepository.class);
        when(tweetRepository.getTweet()).thenReturn(expected);
        TweetService tweetService = new TweetServiceImpl(tweetRepository);
        
        Tweet actual = tweetService.getTweet();

        assertEquals(expected, actual);
    }
}