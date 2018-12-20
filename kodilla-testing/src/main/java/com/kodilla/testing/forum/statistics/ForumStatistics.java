package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int usersNumber;
    private int postsNumber;
    private int commentsNumber;
    private double postsAveragePerUser;
    private double commentsAveragePerUser;
    private double commentsAveragePerPost;

    public int getUsersNumber() {
        return usersNumber;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getPostsAveragePerUser() {
        return postsAveragePerUser;
    }

    public double getCommentsAveragePerUser() {
        return commentsAveragePerUser;
    }

    public double getCommentsAveragePerPost() {
        return commentsAveragePerPost;
    }



    public void calculateAdvStatistics(Statistics statistics){
        usersNumber = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();
        postsAveragePerUser = calculatePostsAveragePerUser();
        commentsAveragePerUser = calculateCommentsAveragePerUser();
        commentsAveragePerPost = calculateCommentsAveragePerPost();
    }

    private double calculatePostsAveragePerUser() {
        if (usersNumber > 0) {
            return (double) postsNumber / usersNumber;
        } else {
            return 0;
        }
    }

    private double calculateCommentsAveragePerUser() {
        if (usersNumber > 0) {
            return (double) commentsNumber / usersNumber;
        } else {
            return 0;
        }
    }

    private double calculateCommentsAveragePerPost() {
        if (postsNumber > 0) {
            return (double) commentsNumber / postsNumber;
        } else {
            return 0;
        }
    }

    public void showStatistics(){
        System.out.println("Forum statistics:");
        System.out.println("Total number of users: " + usersNumber);
        System.out.println("Total number of posts: " + postsNumber);
        System.out.println("Total number of comments: " + commentsNumber);
        System.out.println("Average posts per user" + postsAveragePerUser);
        System.out.println("Average comments per user" + commentsAveragePerUser);
        System.out.println("Average comments per post" + commentsAveragePerPost);
    }
}