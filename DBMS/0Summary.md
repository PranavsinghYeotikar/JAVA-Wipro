Quick recap (ekdum pocket-note 📝 style):
1. Connect → `DriverManager.getConnection()`
2. Statement → `createStatement()`
3. Query → `executeQuery()` / `executeUpdate()` / `execute()`
4. ResultSet → `next()` + `getXXX()`
5. Null check → `wasNull()`
6. Close → `rs.close()`, `stmt.close()`, `con.close()`