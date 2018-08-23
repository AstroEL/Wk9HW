
public class CodingWK9 {
	/*
		You have been asked to create a database for a new social media application that your company is developing.
		The database must store user data such as username, email, password, etc...
		Users are able to post and comment. So your database must also store post and comment data.
		We need to know which user made which posts.
		We also need to know which user made which comments, and which post a comment is on.
		Posts and comments should both include the time they were created, and what the content of the post or comment is.
		
		X Assignment: create an Entity Relationship Diagram (ERD) using draw.io to model the database you will create.
		Write a SQL script to create the database. When finished, push a screenshot of your ERD and the SQL script to github.
		
		Hints: 
		You will only need three tables.
		Two tables will have foreign key references.
		One table will have two foreign key references.
	*/
	
	/*
	 * User
	 * 	- userID, userName, email, password, firstName, lastName, 
	 * Post
	 * 	- postID, date/time [YYYY-MM-DD HH:MM:SS], user_ID, userName, postContent
	 * Comment
	 *  - commentID, post_ID, user_ID, date/time [YYYY-MM-DD HH:MM:SS], commentContent
	 *  
	 *  
	 *  CREATE DATABASE IF NOT EXISTS socialApp;
	 *  
	 *  USE socialApp;
	 *  
	 *  DROP TABLE IF EXISTS comments;
	 *	DROP TABLE IF EXISTS posts;
	 *	DROP TABLE IF EXISTS users;
	 *
	 *  CREATE TABLE users (
	 *  	id int(11) NOT NULL auto_increment,
	 *  	user_name varchar(25) NOT NULL,
	 *  	email varchar(20) NOT NULL,
	 *  	first_name varchar(25) NOT NULL,
	 *  	last_name varchar(25) NOT NULL,
	 *  	PRIMARY KEY (id)
	 *  );
	 *  
	 *  CREATE TABLE posts (
	 *  	id int(11) NOT NULL auto_increment,
	 *  	user_ID int(11) NOT NULL,
	 *  	date datetime default current_timestamp,
	 *  	post_content varchar(255),
	 *  	PRIMARY KEY (id),
	 *  	FOREIGN KEY (user_ID) REFERENCES users (id)
	 *  );
	 *  
	 *  CREATE TABLE users (
	 *  	id int(11) NOT NULL auto_increment,
	 *  	post_ID int(11) NOT NULL,
	 *  	user_ID int(11) NOT NULL,
	 *  	date datetime default current_timestamp,
	 *  	comment_content varchar(255),
	 *  	PRIMARY KEY (id),
	 *  	FOREIGN KEY (post_ID) REFERENCES post (id),
	 *  	FOREIGN KEY (user_ID) REFERENCES users (id)
	 *  );
	 *  
	 *  
	 *  
	 */
}
