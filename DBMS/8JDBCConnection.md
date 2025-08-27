## 🌐 JDBC Connection Basics
* **JDBC** (Java Database Connectivity) = ek bridge hai jo **Java program ko database se connect karta hai**.
* Connection establish karne ke liye hume **3 cheezein chahiye** hoti hain:
  * **Driver** (software bridge between Java & DB)
  > **Java bolega → driver translate karega → DB samjhega.**
  * **JDBC URL** (path to DB)
  * **Username & Password** (to log in)

### 🔑 JDBC URL
> Phone call ke liye tumhe number chahiye na?
Waise hi DB ke liye ek URL chahiye hota hai.

#### Format:
```ruby
jdbc:oracle:thin:@host:port:servicename
```
* `jdbc` → **protocol** (Java DB connection)
* `oracle:thin` → **driver type**
* `@host` → computer ka address (**IP** ya `localhost`)
* `port` → gate number (Oracle ka default = 1521)
* `servicename` → **DB ka naam** (like `orcl`)

Example:
```ruby
jdbc:oracle:thin:@localhost:1521:orcl
```

* General form:
```ruby
jdbc:<subprotocol>:<subname>
```
* Example for Oracle:
```ruby
jdbc:oracle:thin:@site:port:database
```
* Agar tum JDBC-ODBC Bridge use karte ho:
```ruby
jdbc:odbc:datasource:odbcoptions
```
##### 💡 Simple: “URL is like Google Maps address of your database.”


## 🖥️ Host Details
* Agar **Oracle DB** tumhare **same computer pe** hai → use `@localhost`.
* Agar **DB dusre system pe** hai → uska **IP address** lagana hoga.
  
Example:
```graphql
jdbc:oracle:thin:@192.168.10.5
```


## ⚙️ Service Name & Port
* Oracle database run on 
  * **service name** 
  * **port number** 
* Ye dono cheezein tum `tnsnames.ora` file se dekh sakte ho.
* Example tnsnames.ora entry:
```SCSS
(HOST = L-156012383)(PORT = 1521)
(SERVICE_NAME = orcl)
```
##### 👉 Yaha service name = `orcl`, port no = `1521`.


### 🧑‍💻 JDBC URL Example
```ruby
jdbc:oracle:thin:@192.168.49.107:1521:orcl
```

## ⚡ Making the Connection
Steps:
#### 1. Driver Register karo
```java
Class.forName("oracle.jdbc.driver.OracleDriver");
```
* Ye driver ko **register** kar deta hai DriverManager ke saath.

#### 2. Connection banao
```java
Connection conn = DriverManager.getConnection(
    "jdbc:oracle:thin:@myhost:1521:orcl",
    "scott",
    "tiger");
```
* Yaha → URL, username, password pass karte hain.

💡 **DriverManager** ek traffic police jaisa hai → jo decide karta hai kaunsa driver kis URL ko samjhta hai aur uske according connection de deta hai.