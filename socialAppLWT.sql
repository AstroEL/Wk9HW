CREATE DATABASE IF NOT EXISTS socialApp;

USE socialApp;

DROP TABLE IF EXISTS comments;
DROP TABLE IF EXISTS posts;
DROP TABLE IF EXISTS users;

CREATE TABLE users (
	id int(11) NOT NULL auto_increment,
	user_name varchar(25) NOT NULL,
	email varchar(20) NOT NULL,
	password varchar(20) NOT NULL,
	first_name varchar(25) NOT NULL,
	last_name varchar(25) NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE posts (
	id int(11) NOT NULL auto_increment,
	user_ID int(11) NOT NULL,
	date datetime default current_timestamp,
	post_content varchar(255),
	PRIMARY KEY (id),
	FOREIGN KEY (user_ID) REFERENCES users(id)
);

CREATE TABLE comments (
	id int(11) NOT NULL auto_increment,
	post_ID int(11) NOT NULL,
	user_ID int(11) NOT NULL,
	date datetime default current_timestamp,
	comment_content varchar(255),
	PRIMARY KEY (id),
	FOREIGN KEY (post_ID) REFERENCES posts(id),
	FOREIGN KEY (user_ID) REFERENCES users(id)
);
