## 🔹 1. Database Objects (DB mein kya hota hai)
* **Table** – Data store karne ki basic unit (rows & columns).
* **View** – Virtual table (ek ya zyada tables se banta hai).
* **Sequence** – Auto-number generate karta hai (jaise roll number).
* **Index** – Query fast banata hai (speed boost).
* **Synonym** – Table ya object ka alternative naam.

## 🔹 2. Naming Rules (Naam rakhne ke rules)
* Naam **letter se start** hona chahiye.
* Length: **1–30 characters**.
* Sirf: A–Z, 0–9, _, $, # allowed.
* Dusre object ke naam se match nahi hona chahiye.
* **Reserved keywords** (jaise `SELECT`, `DATE`) use **nahi** kar sakte.

## 🔹 3. CREATE TABLE
```sql
CREATE TABLE table_name (
   column_name datatype [DEFAULT value],
   ...
);
```
* **Datatype**: `NUMBER`, `VARCHAR2`, `DATE`, `CHAR`, `CLOB`, `BLOB`, etc.
* **DEFAULT**: Agar value na do toh automatically kuch set ho (like `hire_date DATE DEFAULT SYSDATE`).

## 🔹 4. Constraints (We can apply this on tables)
* Constraints ensure karte hain ki data sahi rahe:

1. **NOT NULL** → Column khali nahi ho sakta.
2. **UNIQUE** → Column ke values repeat nahi honi chahiye.
3. **PRIMARY KEY** → Unique + Not Null (jaise Aadhaar ID).
4. **FOREIGN KEY** → Dusre table ke column se linked hota hai (relationship).
5. **CHECK** → Value condition follow kare (jaise marks > 0).

## 🔹 5. Example Table
```sql
CREATE TABLE customers (
   customer_id NUMBER(6) CONSTRAINT cust_id_pk PRIMARY KEY,
   cust_first_name VARCHAR2(20) NOT NULL,
   cust_last_name  VARCHAR2(20) NOT NULL,
   credit_limit NUMBER(9,2),
   CONSTRAINT credit_check CHECK (credit_limit <= 5000)
);
```

## 🔹 6. ALTER TABLE (Table modify karna)
* Add column → `ALTER TABLE t1 ADD (age NUMBER);`
* Modify column → `ALTER TABLE t1 MODIFY (name VARCHAR2(50));`
* Drop column → `ALTER TABLE t1 DROP COLUMN age;`
* Read-only mode → `ALTER TABLE t1 READ ONLY;`

## 🔹 7. DROP TABLE
* `DROP TABLE table_name;` → Table hata deta hai (Recycle Bin mein chala jata hai).
* `DROP TABLE table_name PURGE;` → Permanent delete (Recycle Bin skip).

## 🔹 8. CREATE TABLE AS Subquery
* Ek existing table ke data ke basis par naya table banana:
```sql
CREATE TABLE ord2458 AS
SELECT order_id, order_date, order_status
FROM orders
WHERE order_id = 2458;
```

### ⚡ In short:
DDL ke through hum tables create, modify, delete karte hain aur constraints ke through data ki accuracy + rules maintain karte hain.