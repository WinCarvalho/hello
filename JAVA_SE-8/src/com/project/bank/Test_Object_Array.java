/*package com.project.bank;
import java.util.Scanner;
import java.util.Arrays;
class Post {
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
public class Test_Object_Array {
static Scanner ob = new Scanner(System.in);

public static String getInput(String message) {
System.out.print("\n"+message);
String input = ob.next();
return input;
}
public static void main(String[] args) {


// declaration an object array
Post[] posts;
// memory allocation
posts = new Post[(Integer.parseInt(args[0]))];
System.out.println(Arrays.toString(posts)); // null, null, null
/// initialization
//posts[0] = new Post(101, "Likes apple", 1);
posts[1] = new Post(102, "Likes Samsung", 1);
//posts[2] = new Post(103, "Likes oneplus", 1);
System.out.println(Arrays.toString(posts));


System.out.println("enter case");
int ch = ob.nextInt();
switch (ch) {
// create post
case 1:
//Post newpost = new Post(0, "hello", 2);
Post newpost = new Post();
int id1 = Integer.parseInt(getInput("Enter Id:"));
String message = getInput("Enter Message:");
newpost.setId(id1);
newpost.setMessage(message);
newpost.setLikes(1);

for (int index = 0; index < posts.length; index++) {
//System.out.println(posts[index]);
if (posts[index] == null) {
posts[index] = newpost;
break;
}
}
System.out.println(Arrays.toString(posts));
case 2:
System.out.println("enter id");
int id = ob.nextInt();
for (int index = 0; index < posts.length; index++) {
if (posts[index].getId() == id) {
System.out.println(posts[index]);
}
}
// delete
case 3:
for (int index = 0; index < posts.length; index++) {
System.out.println(posts[index]);
if (posts[index].getId() == 0) {
posts[index] = null;
break;
}
System.out.println(Arrays.toString(posts));
}
// increase likes
case 4:
for (int index = 0; index < posts.length; index++) {
System.out.println(posts[index]);
if (posts[index].getId() == 102) {
int likes = posts[index].getLikes();
likes++;
posts[index].setLikes(likes);
break;
}
System.out.println(Arrays.toString(posts));
}
}
}
}
*/