## Restricting Data (WHERE Clause)
* `WHERE` clause use karke hum decide karte hain **kaunsa data chahiye**.
#### Syntax:
```sql
SELECT column_name 
FROM table_name
WHERE condition;
```

Example:
```sql
SELECT order_id, order_date 
FROM orders 
WHERE order_status = 1;
```

👉 Sirf un orders ka data aayega jinka `status = 1` hai.



## 📌 Conditions aur Operators
### 1. Comparison Operators
* `=` (equal)
* `<>` (not equal)
* `<, >, <=, >=`

@. `BETWEEN` → Range ke liye
```sql
WHERE product_id BETWEEN 3100 AND 3108;
```

3. `IN` → Multiple values check karne ke liye
```sql
WHERE order_id IN (2458, 2397, 2454);
```

4. `LIKE` → Pattern match ke liye
* % → many characters
* _ → single character
```sql
WHERE first_name LIKE 'S%';  -- starts with S
```

5. `IS NULL` → `NULL` values ke liye
```sql
WHERE sales_rep_id IS NULL;
```


### 🔗 Logical Operators
* `AND` → Dono condition true honi chahiye.
* `OR` → Koi ek condition true ho to chalega.
* `NOT` → Opposite check karega.

### 🎯 Rules of Precedence
Jaise Maths mein BODMAS hota hai, waise SQL mein bhi priority hoti hai:
1. Arithmetic operators
2. Concatenation (`||`)
3. Comparison (=, <, >)
4. `IS NULL`, `LIKE`, `IN`
5. `BETWEEN`
6. `NOT`
7. `AND`
8. `OR`

Parentheses `()` use karke tum **khud order decide kar sakte** ho.


# 📊 Sorting Data (`ORDER BY`)
* Rows ko order karne ke liye `ORDER BY` use hota hai.
* Default → Ascending (`ASC`)
* Descending → `DESC`

Example:
```sql
SELECT order_id, order_date 
FROM orders 
ORDER BY order_date DESC;
```
* Multiple columns pe sort bhi kar sakte ho:
```sql
ORDER BY department_id, salary DESC;
```

### ⚡ Substitution Variables
* Query ko flexible banane ke liye use hota hai.
* `&` → Single ampersand → Har bar input magega.
* `&&` → Double ampersand → Ek hi value baar-baar use karega.

Example:
```sql
SELECT product_id, warehouse_id
FROM inventories
WHERE product_id = &product_id;
```

👉 Jab run karoge, tumse product_id maangega.


### 📝 Summary

`WHERE` clause → Rows filter karne ke liye.

`ORDER BY` → Sorting ke liye.

Operators → `=, <>, BETWEEN, IN, LIKE, IS NULL` + `AND, OR, NOT`.

Substitution variables (`&,` `&&`) → Runtime input ke liye.