| Feature         | **HashMap**                  | **Hashtable**                   | **TreeMap**                           | **Properties**                                       |
| --------------- | ---------------------------- | ------------------------------- | ------------------------------------- | ---------------------------------------------------- |
| **Order**       | Unordered (random)           | Unordered                       | **Sorted (ascending key order)**      | Unordered                                            |
| **Null Key**    | ✅ 1 null key allowed         | ❌ Not allowed                   | ❌ Not allowed                         | ❌ Not allowed                                        |
| **Null Value**  | ✅ Multiple allowed           | ❌ Not allowed                   | ✅ Multiple allowed                    | ❌ Not allowed                                        |
| **Thread Safe** | ❌ Not synchronized           | ✅ Synchronized                  | ❌ Not synchronized                    | ✅ (since extends Hashtable)                          |
| **Performance** | Fast (O(1) for get/put)      | Slower (sync overhead)          | Slower than HashMap (O(log n))        | Moderate                                             |
| **Use Case**    | General purpose, fast lookup | Multi-thread safe maps (legacy) | Sorted data (like directory, ranking) | Storing system properties (String-String pairs only) |





# Map
* Data ko key-value ke form me store karta hai.
* **Key unique hoti hai**, same key do baar nahi ho sakti.
* **Value get karni ho** → bas **key do**, value mil jayegi.
* **Duplicate value allowed nahi** (yaani ek key ka value sirf ek hi ho sakta hai).
* Har **key sirf ek value ko point** karegi.

#### Main methods:
* `put()` → element add karne ke liye
* `get()` → value retrieve karne ke liye
* `remove()` → element delete karne ke liye
* `size()` → total elements count karne ke liye

**Example**:
```java
Map<Integer, String> map = new HashMap<>();
map.put(1, "Panya");
System.out.println(map.get(1)); // Panya
map.remove(1);
System.out.println(map.size()); // 0
```

# HashMap 
* **Storage** → Objects ko **hashcode** ke base pe store karta hai.
* **Order** → Unsorted & **unordered** (random order me aayega).
* **Nulls** → **1 null key allow** karta hai, multiple null values bhi chalti hain.
* **Thread Safety** → Not synchronized (**multi-thread** ke liye **safe nahi**).
* **Performance** → `get()` & `put()` operations ka time **almost constant** hota hai.

### Example Code ka kaam
* `hm.put()` → names ko account balance ke saath store kiya.
* `hm.entrySet()` → sab entries (key + value) nikali.
* `Iterator` se loop karke sab elements print kiye.
* John Doe ka balance update karke new value print ki.
  
👉 **Note**: Agar HashMap ki jagah **TreeMap** use karte, toh output sorted order me milta.


# Hashtable Class
* **Package** → java.util
* Implements → **Map & extends Dictionary**
* **Unique elements** → Sirf unique keys rakhta hai.
* Nulls → **Key** me **null allowed nahi**, **value** me bhi **null allowed nahi**.
* Thread Safety → Ye **synchronized hai** (**multi-thread safe**).

### Code Explanation
```java
Hashtable<String,Double> balance = new Hashtable<>();
balance.put("Arun", 3434.34);
balance.put("Radha", 123.22);
balance.put("Ram", 99.22);

Enumeration names = balance.keys();
while(names.hasMoreElements()) {
    String str = (String) names.nextElement();
    System.out.println(str + ": " + balance.get(str));
}
```

```yaml
Output Example
Arun: 3434.34
Radha: 123.22
Ram: 99.22
```

#### 👉 Simple bolun toh:
* **HashMap** → fast but not synchronized, ek null key allowed.
* **Hashtable** → thoda slow but synchronized, null bilkul allowed nahi.


# TreeMap
* **Implements** → `Map`
* **Order** → keys → sorted ascending order.
* **Retrieval** → Fast lookup (kyunki internally Red-Black Tree use hota hai).
* **Nulls** → key → no null
            → value → multiple null 

#### Example Output (sorted by keys):
```yaml
Avinash : 19900.25
Jayesh : 15000
Meenu : 18345.5
Nirav : 22000
Poorva : Zero
Priya : 12000
Suresh : 15357.75
Viren : 20000
Zakir : 16500.9
```


# Properties Class
* **Extends** → `Hashtable`
* **Specialization** → Sirf `String` keys aur `String` values ke liye.
* Mostly **used for** → System properties (like OS name, username, java version, etc.).

### Useful methods:
* `System.getProperties()` → saare system properties laata hai.
* `p.list(System.out)` → properties print karta hai.
* `p.getProperty("user.name")` → current username print karega.

#### Example Output:
```python
java.version = 17
os.name = Windows 10
user.name = Panya
...
```

#### 👉 Easy way yaad rakh:
* **HashMap** → Fast, random order, ek null key.
* **Hashtable** → Thread-safe, no null allowed.
* **TreeMap** → Sorted order keys, no null key.
* **Properties** → Sirf String key-value, system settings ke liye.