/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;

/**
 *
 * @author harshalneelkamal
 */
public class AnalysisHelper {
    // find user with Most Likes
    // TODO
    
    //1 - average number of likes per comment
    public void avgLikesPerComment() {
         Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        int likeNumber = 0;
        int commentNumber = comments.size();
        for (Comment c : comments.values()) {
            likeNumber += c.getLikes();
        }
        System.out.println("*******");
        System.out.println("\n1. Average likes per comment: " + likeNumber / commentNumber);
        System.out.println(" ");
    }
   
    
    //2  - post with most likes comments     
            public void postWithMostLikes() {

        Map<Integer, Integer> likesList = new HashMap<Integer, Integer>();
        Map<Integer, Post> posts11 =  DataStore.getInstance().getPosts() ;
        int finalLike = 0;

        System.out.println("*******");
        System.out.println("\n2. Post with most Like Commnets:");

        for (Post post : DataStore.getInstance().getPosts().values()) {
            for (Comment comm : post.getComments()) {

                if (comm.getLikes() > finalLike) {

                    finalLike = comm.getLikes();}
            }

            likesList.put(post.getPostId(), finalLike);
            finalLike = 0;
        }
        
         Map<Integer, Integer> result1 = likesList.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        
         
         int count  = 0 ; 
    for (Map.Entry<Integer, Integer> entry : result1.entrySet()) {
           if (count >= 1) {
               return;
           }           
           
           //System.out.println("2. Post with most like comments:");
           System.out.println("Post Id = " + entry.getKey() );
           System.out.println("Total number of Likes " + entry.getValue());
           System.out.println("Posting User Id = " + posts11.get(entry.getKey()).getUserId() );
          // System.out.println("Comment are " + posts11.get(entry.getKey()).getComments() );
          System.out.println(" ");
           count++;
       }
    }
            
    
     
    

}
