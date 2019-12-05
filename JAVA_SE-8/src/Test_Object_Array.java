
import java.util.Arrays;
import java.util.Scanner;

class Post {
	private int id;
	private String message;
	private int likes;

	// constructors...
	public Post() {
		super();
	}

	public Post(int id, String message, int likes) {
		super();
		this.id = id;
		this.message = message;
		this.likes = likes;
	}

	// getter and setter methods...
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

	// toString method
	@Override
	public String toString() {
		return "Post [Postid=" + id + ", Message=" + message + ", Likes=" + likes + "]";
	}
}

public class Test_Object_Array {
	public static void main(String[] args) {
		// creating an object array
		Post[] posts;

		// memory allocation
		posts = new Post[10];
		System.out.println(Arrays.toString(posts));

		// initialization
		//3posts[0] = new Post(101, "Likes Apple", 1);
		//posts[1] = new Post(102, "Likes Samsung", 1);
		//posts[2] = new Post(103, "Likes Oneplus", 1);

		int choice, id, find;
		// String message;
		// double llikes;

		Scanner sc = new Scanner(System.in);

		System.out.println("Select Option");
		System.out.println("1. create Post\n 2.find post \n3.delete\n4.increment\n5.Listall\n 6.Exit  ");
		Post post = new Post();

		choice = sc.nextInt();
		switch (choice) {
		case 1:

			// create
			Post newpost = new Post(0, "ello", 1);
			for (int index = 0; index < posts.length; index++) {
				System.out.println(posts[index]);
				if (posts[index] == null) {
					posts[index] = newpost;
					break;
				}
			}
			System.out.println(Arrays.toString(posts));
		case 2:

			// inc likes
			for (int index = 0; index < posts.length; index++) {
				System.out.println(posts[index]);
				if (posts[index] != null && posts[index].getId() == 102) {
					int likes = posts[index].getLikes();
					likes++;
					posts[index].setLikes(likes);
				}
			}
			System.out.println(Arrays.toString(posts));
			break;

			
		case 3:
			// delete 101
			
			find = sc.nextInt();
			for (int index = 0; index < posts.length; index++) {
				System.out.println(posts[index]);
				if (posts[index].getId() == find) {
					posts[index] = null;
				}
			}
			for (int index = 0; index < posts.length; index++) {
				System.out.println(posts[index]);
			}
			
			
			//System.out.println(Arrays.toString(posts));
			break;
		case 4:
			// find
			find = sc.nextInt();
			for (int index = 0; index < posts.length; index++) {
				System.out.println(posts[index]);
				if (posts[index] != null && posts[index].getId() == find) {
					System.out.println(posts[index]);
				}
			}
			break;
		case 5:
			// list all
			System.out.println(Arrays.toString(posts));

		}
	}
}
