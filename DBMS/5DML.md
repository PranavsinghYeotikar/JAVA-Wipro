## 🌟 What is DML?
DML matlab **Data Manipulation Language**. Iska use hum database me data **insert, update, delete karne ke liye** karte hain.
Soch database ek Excel sheet hai → DML se hum usme rows add, badal ya hata sakte hain.


## 🛠️ Main DML Commands:
### INSERT → Naya data add karna
```sql
INSERT INTO students (id, name, age)
VALUES (1, 'Ravi', 20);
```
➝ Matlab ek new student add kiya.


### UPDATE → Purane data ko modify karna
```sql
UPDATE students
SET age = 21
WHERE id = 1;
```
➝ Ravi ki age 20 se 21 kar di.

### DELETE → Data delete karna
```sql
DELETE FROM students
WHERE id = 1;
```
➝ Ravi ko list se hata diya.

### TRUNCATE (DDL ka part hai par similar lagta hai)
```sql
TRUNCATE TABLE students;
```
➝ Poora table khali, lekin structure (columns) safe.



## 🔄 Transactions (Important Part)
* Jab hum **multiple DML commands ek sath chalate hain**, usse **Transaction bolte** hain.
* Ye ek unit of work hoti hai, jo **ya to poori hogi** **ya rollback** ho jayegi.

#### Commands:
* `COMMIT` → Changes permanently save ho jate hain.
* `ROLLBACK` → Changes wapas undo ho jate hain.
* `SAVEPOINT` → Transaction me ek marker jaisa, jahan tak rollback kar sakte ho.

## ⚡ Extra Concepts:
* **READ CONSISTENCY**: Ek banda data update kar raha hai to dusra banda purana data hi dekhega, taaki confusion na ho.
* **FOR UPDATE**: Jab tum SELECT karte ho aur saath me "FOR UPDATE" lagate ho, tab woh rows lock ho jaati hain, taaki koi aur banda unhe modify na kare.

### 📝 Summary Easy Form:

**INSERT** → Add

**UPDATE** → Modify

**DELETE** → Remove

**TRUNCATE** → Empty full table

**COMMIT** → Save

**ROLLBACK** → Undo

**SAVEPOINT** → Bookmark for rollback