# Metadata 
* **Metadata = Data about Data.**
Matlab jo data humare DB mein hai uske baare ka extra info.
## Types:
### 1. **DatabaseMetaData** :
* **Database ke baare mein info deta hai** (kis DBMS kaun sa hai, driver kaun sa hai, transactions supported hain ya nahi, etc.).
* Connection object se milta hai:
```java
DatabaseMetaData dbmd = conn.getMetaData();
```
* Isse humko DB ke features ke baare mein info milta hai:
  * `getDatabaseProductName()` → DB ka naam
  * `getDriverName()` → JDBC driver ka naam
  * `supportsTransactions()` → Transactions supported hai ya nahi
  * `supportsFullOuterJoins()` → Full outer join support hai ya nahi
  * `getColumns()` → Table ke columns ki detail
  
Basically DB ki "report card" jaisi cheez.

### 2. **ResultSetMetaData** :
* **Query ka result set ke baare mein info** deta hai (kitne columns hai, column name/type kya hai, etc.).
* Jab tu query chalata hai aur `ResultSet` milta hai, uske baare mein details yeh object deta hai.
```java
ResultSetMetaData rsmd = rs.getMetaData();
```
* Isse pata chalega:
  * Kitne columns hain
  * Har column ka naam
  * Har column ka type (int, varchar, date, etc.)

Example:
```java
int cols = rsmd.getColumnCount();
for(int i=1; i<=cols; i++) {
  System.out.println(rsmd.getColumnName(i) + " " + rsmd.getColumnTypeName(i));
}
```

## Mapping Database Types to Java Types
SQL types aur Java types map hote hain:
* `NUMBER` → `int` ya `float`
* `VARCHAR` → `String`
* `DATE` → `java.sql.Date`
* `BIT` → `boolean`

### PreparedStatement
**Normal Statement** vs **PreparedStatement**:
* **Statement** → Har bar compile hota hai (slow).
* **PreparedStatement** → **Query pehle hi compile ho jati hai**, bas **values badal** ke **bar-bar chal sakti** hai (fast + secure).
* Banane ka tarika:
```java
PreparedStatement pstmt = conn.prepareStatement(
   "update STUDENT set SUPERVISOR = ? where ID = ?");
```
Notice ki yaha `?` aaya.
Ye **placeholder** hai — matlab **baad mein tu jo value dega, woh yahaan fit ho jaayegi**.
* Value set karne ka tarika:
```java
pstmt.setString(1, "Jeetendra");
pstmt.setInt(2, 101);
pstmt.executeUpdate();
```
(Index 1-based hota hai, pehle `?` ka index = 1, dusre `?` ka = 2).