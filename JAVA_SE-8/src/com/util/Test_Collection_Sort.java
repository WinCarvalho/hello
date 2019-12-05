package com.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Post implements Comparable<Post> {

@Override
public int compareTo(Post otherPost) {
return message.compareTo(otherPost.getMessage());
}

/*
@Override
public int compareTo(Post otherPost) {
if(id>otherPost.id)
return 1;
else if(id == otherPost.id)
return 0;
else
return -1;
}
*/

private int id;
private String message;
private int likes;

public Post() {
super();
}

public Post(int id, String message, int likes) {
super();
this.id = id;
this.message = message;
this.likes = likes;
}

public int getId() {
return id;
}

public void setId(int id) {
this.id = id;
}

public String getMessage() {
return message;
}

public void setMessage(String message) {
this.message = message;
}

public int getLikes() {
return likes;
}

public void setLikes(int likes) {
this.likes = likes;
}

@Override
public String toString() {
return "Post [id=" + id + ", message=" + message + ", likes=" + likes + "]";
}


}


public class Test_Collection_Sort {

public static void main(String[] args) {

List<Integer> lstInteger = Arrays.asList(22, 44, 11, 33, 77, 55, 66);
System.out.println(lstInteger);
Collections.sort(lstInteger);
System.out.println(lstInteger);

List<String> lstString = Arrays.asList("Amar", "Akbar", "Anthony", "Vishal");
System.out.println(lstString);
Collections.sort(lstString);
System.out.println(lstString);

List<Post> lstPost = new ArrayList<Post>();
lstPost.add(new Post(101, "Likes Apple", 1));
lstPost.add(new Post(103, "Likes Oneplus", 1));
lstPost.add(new Post(102, "Likes Samsung", 1));

System.out.println(lstPost);
// Error: The method sort(List<T>) in the type Collections is not applicable
// for the arguments (List<Post>)
Collections.sort(lstPost);
System.out.println(lstPost);
}
}