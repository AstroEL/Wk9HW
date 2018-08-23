
public class Quiz {

  	/**********************************************************************************
	 * Multiple Choice: 2 points each
	 **********************************************************************************/
	
	/* 1. What does the C in CRUD stand for?
	 * 	a. concat
	 * 	b. create
	 * 	c. correct
	 * 	d. compute
	 */
	 char answer1 = 'b';
	  
	/* 2. What does the R in CRUD stand for?
	 * 	a. rewrite
	 * 	b. retrieve
	 * 	c. remember
	 * 	d. read
	 */
	 char answer2 = 'd';
	  
	/* 3. Which SQL command is used to create new data?
	 * 	a. CREATE
	 * 	b. INSERT INTO
	 * 	c. MAKE NEW
	 * 	d. CREATE INTO
	 */
	 char answer3 = 'b'; 
	 
	/* 
	 * 4. How can you see what rows will be deleted before deleting them?
	 * a. Run a SELECT query with the same WHERE clause first.
	 * b. Add `VERIFY` to the end of your DELETE command.
	 * c. Enable MySQL's safe delete feature.
	 * d. Omit the WHERE clause from your DELETE command.
	 */ 
	 char answer4 = 'a';
	 
	/* 
	 * 5. Given a table named `customers` which of the following is a correct UPDATE command?
	 * a. UPDATE first_name FROM 'BOB' SET customers TO CHANGE;
	 * b. UPDATE first_name FROM customers WHERE id = 2003;
	 * c. UPDATE customers CHANGE first_name TO 'BOB' WHERE id = 2003;
	 * d. UPDATE customers SET first_name = 'Bob' WHERE id = 2003;
	 */ 
	 char answer5 = 'd';
	 
	/* 
	 * 6. In a SELECT, how can we show the result set by descending birth_date?
	 * a. Add `SELECT * DESC BY birth_date`
	 * b. Add `LIST birth_date DESC;`
	 * c. Add `GROUP BY birth_date DESC;`
	 * d. Add `ORDER BY birth_date DESC;`
	 */ 
	 char answer6 = 'd';
	 
	/* 
	 * 7. What does SQL stand for?
	 * a. Semantic Query Language
	 * b. Sweet Query Language
	 * c. Structured Query Language
	 * d. Sombrero Query Language
	 */ 
	 char answer7 = 'c';
	 
	/* 
	 * 8. An INNER JOIN only returns rows where _______.
	 * a. The left tables contains a value
	 * b. both tables contain a value
	 * c. The right table contains a value
	 * d. The right or the left table contains a value
	 */ 
	 char answer8 = 'b';
	 
	/* 
	 * 9. A LEFT JOIN only returns rows where _______.
	 * a. The left tables contains a value
	 * b. both tables contain a value
	 * c. The right table contains a value
	 * d. The right or the left table contains a value
	 */ 
	 char answer9 = 'a';
	 
	/* 
	 * 10. A FULL OUTER JOIN only returns rows where _______.
	 * a. The left tables contains a value
	 * b. The right or the left table contains a value
	 * c. The right table contains a value
	 * d. both tables contain a value
	 */ 
	 char answer10 = 'b';
	 
	/* 
	 * 11. What must you have in order to use GROUP BY in your query?
	 * a. An aggregate function.
	 * b. A HAVING clause.
	 * c. At least 100 rows of data returned in your result set.
	 * d. MySQL version 8 or later.
	 */ 
	 char answer11 = 'a';
	 
	/* 
	 * 12. What does a HAVING clause do?
	 * a. It is a function that can be used in place of a WHERE clause.
	 * b. HAVING is not a SQL command.
	 * c. Functions like a WHERE clause, but for aggregated data using GROUP BY.
	 * d. Shows all tables with a specific column name.
	 */ 
	 char answer12 = 'c';
	 
	/* 
	 * 13. What is wrong with the following query?
	 * `SELECT c.first_name, p.phone_number FROM customer INNER JOIN ON phonenumbers p.customer_id = c.id;
	 * a. The ON is in the wrong spot; it should come before the condition.
	 * b. You always have to use the full name of the table in the SELECT clause.
	 * c. No aliases where provided, but they were used in the SELECT clause.
	 * d. Both a and c.
	 */ 
	 char answer13 = 'd';
	 
	/* 
	 * 14. Which command is used to make a new database?
	 * a. CREATE DATABASE [database name];
	 * b. MAKE DATABASE [database name];
	 * c. NEW DATABASE [database name];
	 * d. DATABASE [database name];
	 */ 
	 char answer14 = 'a';

	/* 
	 * 15. Which of the following correctly sets a tables primary key?
	 * a. PRIMARY KEY AS id;
	 * b. PRIMARY KEY = id;
	 * c. PRIMARY KEY id;
	 * d. PRIMARY KEY (id);
	 */ 
	 char answer15 = 'd';
	 
	/* 
	 * 16. Which of the following correctly sets a foreign key that points to the id column on the customers table?
	 * a. ADD FOREIGN KEY (customer_id) REFERENCES customers(id);
	 * b. FOREIGN KEY (customer_id) REFERENCES customers(id);
	 * c. ADD FOREIGN KEY (customer_id) REFERS TO customers(id);
	 * d. FOREIGN KEY (customer_id) REFERS TO customers(id);
	 */ 
	 char answer16 = 'b';
	 
	/* 
	 * 17. When creating a new table, what are the columns and constraints seperated by?
	 * a. periods
	 * b. semicolons
	 * c. commas
	 * d. nothing
	 */ 
	 char answer17 = 'c';
	 
	/* 
	 * 18. What happens if you try to enter data with a foreign key value that doesn't exist in the referenced table?
	 * a. MySQL will change the value to an existing value implicitly.
	 * b. It will create a row in the references table with that value.
	 * c. It will cause a join to be null on that value for that row.
	 * d. MySQL throws an error.
	 */ 
	 char answer18 = 'd';
	 
	/* 
	 * 19. How do you delete a table?
	 * a. DELETE TABLE [table name];
	 * b. DROP TABLE [table name];
	 * c. DROP [table name];
	 * d. DELETE [table name];
	 */ 
	 char answer19 = 'b';
	 
	/* 
	 * 20. What do you add to a column if it cannot have an empty value?
	 * a. NEVER EMPTY
	 * b. NOT NULL
	 * c. NOT EMPTY
	 * d. NEVER NOT SOMETIMES EMPTY OR NULL
	 */ 
	 char answer20 = 'b';
	 
	/**********************************************************************************
	 * true or false: 2 points each
	 **********************************************************************************/
	 
	// 21. `SELECT * FROM employees WHERE last_name LIKE 'A%';` returns all employees with a last_name that starts with `a`;
	boolean answer21 = true;
	 
	// 22. The INSERT INTO command inserts rows into a table.
	boolean answer22 = true;
	
	// 23. The CREATE TABLE command creates a new table.
	boolean answer23 = true;
	
	// 24. `SELECT first_name FROM customers WHERE last_name = "smith";` will not work because last_name isn't mentioned in the SELECT statement.
	boolean answer24 = false;
	
	// 25. SQL stands for Structured Query Language.
	boolean answer25 = true;
	
	// 26. All relational databases use the exact same SQL syntax.
	boolean answer26 = true;
	
	// 27. CRUD stands for Create, Retrieve, Update, and Delete.
	boolean answer27 = false;
	
	// 28. HAVING can only be used after GROUP BY.
	boolean answer28 = true;
	
	// 29. HAVING and WHERE are interchangeable.
	boolean answer29 = true;
	
	// 30. When we see duplicated rows, like address1, address2, address3, we need to normalize our tables.
	boolean answer30 = true;
	
	// 31. `DELETE TABLE [table name];` deletes a table.
	boolean answer31 = false;
	
	// 32. `DELETE DATABASE [database name];` deletes a database;
	boolean answer32 = false;
	
	// 33. ERD stand for Every Relationship Diagram.
	boolean answer33 = false;
	
	// 34. `UPDATE COLUMN` is used to change a fields value.
	boolean answer34 = false;
	
	// 35. `INSERT INTO [database name]` will create a new table.
	boolean answer35 = false;
	
	// 36. Foreign key data types must match the data type of the column they point to.
	boolean answer36 = true;
	
	// 37. CONCAT() is an aggregate function.
	boolean answer37 = true;
	
	// 38. The best way to create a many to many relationship is using two tables. 
	boolean answer38 = true;
	
	// 39.A composite key is a primary key made of multiple columns instead of one.
	boolean answer39 = true;
	
	// 40. You can create a many to many relationship with two tables, but you will have a lot of data duplication.
	boolean answer40 = false;
	
	
	/**********************************************************************************
	 * Essay Questions: 5 points each
	 * 
	 * Use the employees database schema to answer these questions.
	 **********************************************************************************/
	
	/* 41. Write a query that shows all employees with a last_name that starts with `a`.
	 * SELECT * FROM employees WHERE last_name LIKE "A%"; 
	 */
	
	/* 42. Write a query that shows all titles and last names for employees who have a last_name that ends with `s`.
	 * SELECT e.first_name, t.title FROM employees e
	 * INNER JOIN titles t ON t.emp_no = e.emp_no
	 * WHERE e.last_name LKE "%s";
	 */
	
	/* 43. Write a query that shows all salaries, titles, and first names for employees in the marketing department.
	 * SELECT d.dept_name, e.first_name, t.title, s.salary FROM employees e
	 * JOIN dept_emp de ON de.emp_no = e.emp_no
	 * JOIN departments d ON d.dept_no = de.dept_no
	 * JOIN salaries s ON s.emp_no = e.emp_no
	 * JOIN titles t ON t.emp_no = e.emp_no
	 * WHERE d.dept_name = "Marketing";
	 */
	
	/* 44. Write a query that shows the max salary by department.
	 * SELECT d.dept_name AS "Department", FORMAT(SUM(s.salary), 2) AS "Total Salary"
	 * FROM salaries s
	 * JOIN dept_emp de ON de.emp_no = s.emp_no
	 * JOIN departments d ON d.dept_no = de.dept_no
	 * GROUP BY d.dept_name;
	 */


}
