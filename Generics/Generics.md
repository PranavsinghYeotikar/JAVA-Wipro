# Generics
* Generics ek **mechanism** hai jisse **ek hi code different data types ke saath kaam kar sakta hai**, bina har type ke liye alag code likhe.

**Example**:
Before Generics:
```java
List myIntegerList = new LinkedList();
myIntegerList.add(new Integer(0));
Integer x = (Integer) myIntegerList.iterator().next(); // typecast must, warna runtime exception
```

After Generics:
```java
List<Integer> myIntegerList = new LinkedList<Integer>();
myIntegerList.add(new Integer(0));
Integer x = myIntegerList.iterator().next(); // no typecast needed
```
* Type safety automatic, compiler check karta hai.

### Problem jo Generics solve karta hai:
* Collection ke **elements ka type unknown hota tha** → compiler check nahi kar pata tha.
* Har assignment me **type casting zaruri thi.**
* Runtime me **ClassCastException ka risk** tha.

#### Generics solution:
* Compiler ko bata do collection ka type.
* Compiler automatically typecast kar deta hai.
* Agar galat type add karne ki koshish karo, compiler hi detect kar lega.

Basically, **Generics = Type safety + Cleaner code + Compile time error detection.**

# Using Generic Class
* **Type-specific object banana**
    * Generic class ko instantiate karke, object ko specific type ka bana sakte ho.

    **Example**:
    ```java
    Vector<String> vs = new Vector<String>();
    vs.add(new Integer(5));   // Compile error! 🚫
    vs.add(new String("hello"));  
    String s = vs.get(0);     // No casting needed 😎
    ```

    → **Compiler type check karega**, galat type add nahi hone dega.

2. **Multiple type parameters aur custom types**
   * Generics me **multiple type arguments bhi ho sakte hain.**
   * Type argument custom class bhi ho sakta hai.

    **Example**:
    ```java
    HashMap<String, Mammal> map = new HashMap<String, Mammal>();
    map.put("monkey", new Mammal("monkey"));
    Mammal w = map.get("monkey");   // No casting needed
    ```

    → Clean, type-safe, aur compile-time safe.

##### One line takeaway:
**Generics** = **Code ko type-safe aur clean banate hai, chahe custom class ho ya built-in collection.**

> Generics use karna matlab `List<Integer> myIntegerList = new LinkedList<Integer>();` yaisa likhna, yaisa nahi `List<> myIntegerList = new LinkedList<>();`


# Raw Type
* Raw type = **Generic class ko bina type argument ke use karna**.
* Pre-J2SE 5.0 classes ab bhi kaam karti hai J2SE 5.0+ JVM me, as raw type.
* **Example**:
```java
  List<String> ls = new LinkedList<String>(); // Generic type with type argument
  List lraw = new LinkedList();               // Raw type, no type argument
```
* **Raw types help old Java code ke sath compatibility maintain karne me**.
* **Note**: Runtime me generic type info exist nahi karta → `ArrayList<String>` aur `ArrayList<Integer>` **same class** hote hain.

> Matlab `ArrayList<String>` na likhte hue sirph yeh likhna `ArrayList<>` let compiler do that

# Type Erasure
* Type Erasure = **Java compiler generics ka type info remove kar deta hai runtime ke liye.**
* Matlab: JVM ko pata nahi hota ki list me kaunsa type hai.
* Example:
```java
ArrayList<Integer> ai = new ArrayList<Integer>();
ArrayList<String> as = new ArrayList<String>();
Boolean b1 = (ai.getClass() == as.getClass());
System.out.println("Do ArrayList<Integer> and ArrayList<String> share same class? " + b1);
```
* Output
```vbnet
Do ArrayList<Integer> and ArrayList<String> share same class? true

```
* **Reason**: Runtime me dono, same ArrayList class represent karte hain → type info erase ho gaya.

> `javac` **type info erase/remove** kar deta hai

#### Shortcut explanation:
* **Raw type** = no type argument → **old code compatible.**
* **Type Erasure** = runtime me generics ka type info nahi hota → **JVM sabko same class samajhta hai.**

# Interoperability with Pre J2SE 5 Code
* **Raw type use** karne par **compiler ke paas type info nahi hota**, isliye woh sirf **“unchecked” ya “unsafe” warning** deta hai.
* Agar **warnings ignore** karo, **runtime me ClassCastException** ho sakta hai
* Example
```java
List<String> ls = new LinkedList<String>();
List lraw = ls;
lraw.add(new Integer(4)); // Compiler Warning
String s = ls.iterator().next(); // Runtime error
```
* Yaha warning sirf hint hai, lekin **runtime error ho sakta hai**.

# Recommendations
* **Raw type avoid karo**, jab tak zarurat na ho.
* Agar pre-J2SE 5.0 classes ya libraries use karni hi ho, to **unsafe warnings ko dhyan se handle karo**, ye sirf warning hai, error nahi.

### Shortcut:
* **Raw type** = old code compatible, lekin **unsafe** → runtime error ka risk.
* Best practice = **hamesha generics use karo**.



# AutoBoxing and AutoUnboxing
* Boxing = **primitive value ko wrapper object me convert karna**.
    * Java 5 se automatic boxing hota hai.
    * Example:
    ```java
    int i = 11;
    Integer iReference = i; // automatic boxing
    ```
    > **int** ko automatic **Integer** mein **convert karna**

* Unboxing = **wrapper object se primitive value nikalna**.
    * Java 5 se automatic unboxing hota hai.
    * Example:
    ```java
    int j = iReference; // automatic unboxing
    ```

* Collections ke saath:
    * Agar **int chahiye** jaha **Integer expected hai** → **compiler automatically Integer banadega.**
    * Agar **Integer hai jaha int chahiye** → **compiler automatically int nikal dega**.

> Jaha jo chahiye waha compiler barabar woh daal deta hai

#### Shortcut:
  * **Autoboxing** = **primitive → wrapper** object automatically.
  * **Auto-unboxing** = **wrapper object → primitive** automatically.
  * Isse **code clean aur simple** ho jata hai, typecasting ki zarurat nahi.