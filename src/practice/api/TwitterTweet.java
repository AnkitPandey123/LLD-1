package practice.api;

import practice.models.SocialMediaPost;

public class TwitterTweet extends SocialMediaPost {

    public TwitterTweet(String id, String tweet, Long userId)
    {
        super(id, tweet, userId, 0L);
    }
}
