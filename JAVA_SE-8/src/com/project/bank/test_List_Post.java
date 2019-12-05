package com.project.bank;

import java.util.*;
import java.util.Iterator;

public class Post {
	//public static char[] toString;
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
public  class test_List_Post {
public static void main(String[] args) {
	ArrayList<Post> listpost = new ArrayList<Post>();
	
//how to add a post
	listpost.add (new Post(101,"oneplus",1));
	listpost.add (new Post(102,"Samsumg",1));
	listpost.add (new Post(103,"oppoo",1));
	listpost.add (new Post(104,"apple",1));
	listpost.add (new Post(105,"Xiomi",1));
	System.out.println(listpost);
	//how to delete a post
	
	Iterator<Post> itrpost = listpost.iterator();
	while(itrpost.hasNext()) {
		Post posts = itrpost.next();
		if(posts.getMessage().equals("oppoo")) {
			itrpost.remove();
		}
		
	}
	System.out.println(listpost); 
//printing via list iterator
	ListIterator<Post> listitrpost = listpost.listIterator(listpost.size());
	while(listitrpost.hasPrevious()) {
		Post posts = listitrpost.previous();
		/*if(posts.getMessage().equals("oppoo")) {
			itrpost.remove();
		}*/
		System.out.println(listpost);
	}






}
}

