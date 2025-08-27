# CallableStatement
* JDBC me CallableStatement **ek object hai** jo **hum stored procedure** (database ke andar likhe hue SQL programs) **ko call karne ke liye use karte hain**.
* Matlab simple SQL query ke bajay tu **ek pura stored procedure call kar sakta hai**.
* Ye **PreparedStatement jaisa** hi hota hai (parameters ? ke through pass karte hain), bas difference ye hai ki ye SQL statement contain nahi karta, balki procedure ka naam contain karta hai.

👉 Example:
```java
CallableStatement cstmt = conn.prepareCall("{call ADDITEM(?,?,?)}");
```
* Yaha `ADDITEM` ek stored procedure hai jo 3 parameters lega.
* Parameters ko hum `setXXX()` ya `registerOutParameter()` se define karte hain.


## Function vs Procedure
* **Function**: Always **ek value return** karega (e.g., salary calculation function).
* **Procedure**: Value **return nahi karta**, par **variables ko modify** kar sakta hai.

## CallableStatement banane ka process
Steps:
1. Driver register karo aur DB se connection lo.
2. `conn.prepareCall("{call procName(?,?)}");` likho.
   * Agar procedure return karta hai: `{? = call procName(…)}`
   * Agar sirf execute karna hai: `{call procName(…)}`
3. Input values set karo → `cstmt.setInt(1, 100);`
4. Output parameters register karo → `cstmt.registerOutParameter(2, Types.INTEGER);`
5. Execute karo → `cstmt.execute();`
6. Output fetch karo → `cstmt.getInt(2);`


## Example Code
```java
String query = "{ CALL LastOrderNumber(?) }";
CallableStatement cstmt = conn.prepareCall(query);

cstmt.registerOutParameter(1, Types.INTEGER);
cstmt.execute();

int lastOrderNumber = cstmt.getInt(1);
System.out.println("Last order number: " + lastOrderNumber);
```
Yaha stored procedure `LastOrderNumber` ek integer return karega.


## Transactions in JDBC
* By default JDBC me Auto Commit = true hota hai. Matlab:
    * Har ek SQL statement turant database me commit ho jata hai.

#### Agar tu khud transaction control karna chahta hai:
1. Auto commit off karo → `conn.setAutoCommit(false);`
2. Kuch SQL execute karo.
3. Agar sab sahi hai to `conn.commit();`
4. Agar koi error ho jaye to `conn.rollback();`

👉 Example:
```java
conn.setAutoCommit(false);
try {
   stmt.executeUpdate("INSERT INTO Orders VALUES(101,'Panya')");
   stmt.executeUpdate("INSERT INTO Payments VALUES(101,5000)");
   conn.commit();
} catch(Exception e) {
   conn.rollback();  // dono statement cancel
}
```