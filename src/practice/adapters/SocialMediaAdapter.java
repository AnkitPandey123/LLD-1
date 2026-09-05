package practice.adapters;

import practice.models.SocialMediaPost;

import java.util.List;

public interface SocialMediaAdapter {

    List<? extends SocialMediaPost> getPosts(Long userId, Long timestamp);

    void post(Long userId, String message);
}
