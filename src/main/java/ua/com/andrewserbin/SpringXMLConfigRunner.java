package ua.com.andrewserbin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.com.andrewserbin.domain.Tweet;
import ua.com.andrewserbin.domain.User;
import ua.com.andrewserbin.service.TimelineService;
import ua.com.andrewserbin.service.TweetService;

/**
 * Created by Andrii_Serbin on 15-Sep-17.
 */
public class SpringXMLConfigRunner {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("repoContext.xml",
                        "userContext.xml", "serviceContext.xml");
        
        User user = (User) context.getBean("user");
        
        TimelineService timelineService = (TimelineService) context.getBean("timelineService");
        Tweet tweet = (Tweet) context.getBean("tweet");
        timelineService.addTweet(tweet);
        user.getTimeline().allTweets().forEach(System.out::println);
        
        TweetService tweetService = (TweetService) context.getBean("tweetService");
        timelineService.likeTweet(tweet);
        user.getTimeline().allTweets().forEach(System.out::println);
        
        timelineService.addTweet(tweetService.getTweet());
        user.getTimeline().allTweets().forEach(System.out::println);
    }
}
