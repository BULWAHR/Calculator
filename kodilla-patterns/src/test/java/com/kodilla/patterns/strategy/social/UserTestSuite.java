package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.media.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {

        User millennials = new Millenials("Mill 1");
        User yGeneration = new YGeneration("YGen 1");
        User zGeneration = new ZGeneration("ZGen 1");

        String facebook = millennials.sharePost();
        String snapchat = yGeneration.sharePost();
        String twitter = zGeneration.sharePost();

        Assert.assertEquals("Facebook", facebook);
        Assert.assertEquals("Twitter", twitter);
        Assert.assertEquals("Snapchat", snapchat);
    }

    @Test
    public void testIndividualSharingStrategy() {

        User ZGeneration = new ZGeneration("Z_Gentleman");
        ZGeneration.setSocialPublisher(new TwitterPublisher());

        String twitter = ZGeneration.sharePost();

        Assert.assertEquals("Twitter", twitter);
    }
}