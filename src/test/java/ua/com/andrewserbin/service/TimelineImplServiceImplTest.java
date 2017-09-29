package ua.com.andrewserbin.service;

import org.junit.Test;
import ua.com.andrewserbin.domain.Timeline;
import ua.com.andrewserbin.domain.TimelineImpl;
import ua.com.andrewserbin.domain.Tweet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by Andrii_Serbin on 29-Sep-17.
 */
public class TimelineImplServiceImplTest {

    @Test
    public void likeTweet() throws Exception {
        Integer expectedLikesCount = 2;
        Tweet tweet = new Tweet(1L, 1, 1, "qwe", null);
        TimelineService timelineService = new TimelineServiceImpl(null);

        timelineService.likeTweet(tweet);
        Integer actualLikesCount = tweet.getLikesCount();

        assertEquals(expectedLikesCount, actualLikesCount);
    }
    
    @Test
    public void addTweet() throws Exception {
        Tweet tweet = new Tweet(1L, 1, 2, "Txt", null);
        Timeline timeline = mock(TimelineImpl.class);
        TimelineService timelineService = new TimelineServiceImpl(timeline);
        timelineService.addTweet(tweet);
        
        verify(timeline).addTweet(tweet);
    }

    @Test
    public void addTweetRetweetIncrement() throws Exception {
        Integer expectedRetweetCount = 3;
        Tweet tweet = new Tweet(1L, 1, 2, "Txt", null);
        Timeline timeline = mock(TimelineImpl.class);
        TimelineService timelineService = new TimelineServiceImpl(timeline);
        timelineService.addTweet(tweet);

        Integer actualRetweetCount = tweet.getRetweetCount();

        assertEquals(expectedRetweetCount, actualRetweetCount);
    }

    @Test
    public void allTweets() throws Exception {
        List<Tweet> expected = Arrays.asList(new Tweet(1L, 1, 2, "Txt", null));
        Timeline timeline = mock(TimelineImpl.class);
        when(timeline.allTweets()).thenReturn(expected);
        TimelineService timelineService = new TimelineServiceImpl(timeline);

        List<Tweet> actual = new ArrayList<>();
        timelineService.allTweets().forEach(actual::add);

        assertArrayEquals(expected.toArray(), actual.toArray());
    }

}