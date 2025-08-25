## Oracle Database 11g ke Focus Areas
* **Infrastructure grids** → bade bade servers ko **connect** karke **data handle** karna
* **Information management** → data ko **store, organize aur secure** karna
* **Application development** → Java, .NET, PL/SQL, XML ke sath **integrate** karna
* **Performance & Security** → fast aur safe database

## RDBMS vs ORDBMS
* **RDBMS** → Data tables (rows & columns) mein hota hai.
* **ORDBMS** → RDBMS + extra features (**multimedia support, user-defined data types**).

👉 Ye model Dr. E.F. Codd ne 1970 mein diya tha.



# Entity Relationship Model (ER Model)
Database design karne ka ek tarika hai.
* **Entities** = Objects (EMPLOYEE, DEPARTMENT)
* **Attributes** = Details (name, salary, location)
* **Relationships** = Connection (ek department ke under multiple employees)
* **Primary Key (#)** = Unique ID
* **Foreign Key** = Doosre table ka reference

## Tables ko kaise connect karte hain?
* **Har row ka ek Primary Key** hota hai (unique ID).
* Ek table doosre se **Foreign Key ke through link hota hai**.
👉 Example: Employee table mein department_id foreign key hai jo Departments table se linked hai.

# SQL (Structured Query Language)
* SQL ek **standard language** hai jisse hum **database se baat** karte hain.

### Categories of SQL Commands:
* **DML (Data Manipulation Language)** → SELECT, INSERT, UPDATE, DELETE
* **DDL (Data Definition Language)** → CREATE, ALTER, DROP, RENAME, TRUNCATE
* **TCL (Transaction Control)** → COMMIT, ROLLBACK, SAVEPOINT
* **DCL (Data Control Language)** → GRANT, REVOKE

👉 Example query:
```sql
SELECT department_name 
FROM departments;
```
Ye sirf department names laayega.

## Tools for SQL
* **SQL Developer** → Graphical tool (easy, user-friendly).
* **SQL*Plus** → Command line tool (text based).