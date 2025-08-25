## 🔹 SELECT Statement Basics
* `SELECT` ka use **database se data nikalne ke liye** hota hai.
* Isme tum batate ho:
    * **Kaunsi columns chahiye** → `SELECT` ke baad likho.
    * **Kis table se chahiye** → `FROM` ke baad likho.

#### 👉 Example:
```sql
SELECT * 
FROM inventories;
```
Matlab → **sab** column aur sab row 
chahiye inventories table se.

```sql
SELECT product_id, quantity_on_hand
FROM inventories;
```
Matlab → **sirf product_id aur quantity_on_hand** column hi dikhao.

### 🔹 Rules of Writing
* SQL **case-insensitive** hai → SELECT, select, SeLeCt sab same.
* **Semicolon `;` lagana** chahiye (specially jab multiple queries run karte ho).
* Readability ke liye **har clause alag line pe** likhna better hai.

### 🔹 Arithmetic Operations in `SELECT`
Columns pe direct maths kar sakte ho:
```sql
SELECT product_id, quantity_on_hand, quantity_on_hand+200
FROM inventories;
```

Ye har product ki quantity mein 200 add karke dikhayega.

Operator precedence bhi hota hai (BODMAS jaisa).

<br>

### 🔹 NULL Values
* Agar **data nahi mila**, **to us column ka value NULL** hota hai.
* **NULL ≠ 0**, **NULL ≠ blank space**.
* Arithmetic mein agar NULL aaya → pura result NULL ho jaayega.

### 🔹 Column Aliases
Kabhi column ka naam long/technical hota hai, to tum alias de sakte ho.
```sql
SELECT order_id AS "Order", ROUND(order_date) AS "Date of Order"
FROM orders;
```
> Here **Column Aliases** is `order_id AS "Order"` and `ROUND(order_date) AS "Date of Order"`
>
> We write `AS` to replace name of column `ROUND(order_date)` with this `Date of Order`
Ab result mein heading readable ho jaayegi.


### 🔹 Concatenation (||)
**String ko jodne ke liye || use** hota hai:
```sql
SELECT first_name || ' ' || last_name AS "Full Name"
FROM customers;
```

### 🔹 Literals
**Direct text ya numbers output mein** daalna ho to **single quotes** use karo:
```sql
SELECT product_id || ' is in Warehouse ' || warehouse_id AS "Product-Warehouse"
FROM inventories;
```

### 🔹 DISTINCT
By default **duplicate rows** bhi aa jaate hain. **Agar unique chahiye**:
```sql
SELECT DISTINCT department_id
FROM employees;
```

### 🔹 Table Structure Dekhna
* SQL Developer mein table select karke Columns tab dekh lo.
  
* Ya phir query likho:
```sql
DESCRIBE orders;
```

****

# 📝 Quick Recap (Cheat Sheet)
`SELECT * FROM table`; → sab kuch laao.

`SELECT col1, col2 FROM table;` → specific columns.

**Maths allowed**: salary*12.

**NULL + kuch bhi = NULL**.

**Alias**: `AS "NewName"`.

**Concatenation**: `||`.

**Literal text**: `'some text'`.

**DISTINCT** → duplicate hatane ke liye.

`DESCRIBE tablename;` → table ka structure.