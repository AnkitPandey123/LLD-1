package practice.adapters;

import practice.api.TwitterApi;
import practice.models.SocialMediaPost;

import java.util.List;

public class TwitterAdapter implements SocialMediaAdapter {

    private TwitterApi twitterApi = new TwitterApi();

    @Override
    public List<? extends SocialMediaPost> getPosts(Long userId, Long timestamp) {
        // TODO: Use twitterApi.getTweets(userId) and convert the returned
        // TwitterTweet objects into SocialMediaPost objects.
        return twitterApi.getTweets(userId);
    }

    @Override
    public void post(Long userId, String message) {
        // TODO: Use twitterApi.tweet(userId, message) to send a tweet.
        twitterApi.tweet(userId, message);
    }
}
