# List
* `List` **Collection** ka child hai.
* Elements ko **sequence** mein store karta hai. **Order matters**
* Elements ko **index (0-based) ke through access ya insert** kar sakte ho.
* Duplicates allowed ✅
* **Iterator se traverse** kar sakte ho.

💡 So basically, List = **ordered collection jisme duplicates allowed hai aur index se access possible hai.**

# ArrayList
* **Implements**: List interface
* **Dynamic array**: Size grow/shrink ho sakta hai (unlike normal array)
* **Better than arrays**: Powerful insertion & search methods
* **Fast**: Iteration aur random access dono tez
* **Ordered collection**: Index ke order me store hota hai, but not sorted

#### Example use:
```java
ArrayList<Integer> list = new ArrayList<>();
list.add(0, 42);   // insert at index 0
int total = list.get(0); // access element at index 0
```

#### Demo program points:
* `add()` → elements add karna
* `size()` → number of elements
* `contains()` → check element exist karta hai ya nahi
* `remove()` → remove element


#### 💡 Short trick:
**ArrayList = dynamic, ordered list jisme fast access & flexible size hai ✅**

# Iterator - Quick Notes
* **Iterator** = **object** jo collection ke elements ko **traverse** karne me help karta hai
* **Selective removal**: Iterator se elements ko iterate karte waqt **remove bhi kar sakte ho**
* Java me do interfaces hain element access ke liye:
    1. **Enumeration** (old, obsolete)
    2. **Iterator** (modern, recommended) ✅

**Iterator ke advantages over Enumeration:**
* Elements ko **safely remove** kar sakte ho iteration ke dauran
* Method names **simple & clear**

#### Important methods:
| Method      | Kya karta hai                                                                         |
| ----------- | ------------------------------------------------------------------------------------- |
| `hasNext()` | Agar **next element hai** → **true return** karta hai                                         |
| `next()`    | **Next element return** karta hai, agar next nahi → NoSuchElementException                |
| `remove()`  | **Current element remove** karta hai, agar `next()` call nahi hua → IllegalStateException |

#### Example:
```java
ArrayList<Integer> ai = new ArrayList<>();
Iterator<Integer> i = ai.iterator();
while (i.hasNext()) {
    System.out.println(i.next());
}
```

#### 💡 Short trick:
Iterator = **safe aur flexible way to traverse & remove elements from a collection ✅**

```java
   Collection (ArrayList, List, etc.)
        |
     iterator()  
        ↓
  Iterator Object
        |
  +-----+------+
  |            |
hasNext()?     No → Stop
  |
 Yes
  ↓
 next() → current element access
  |
 remove()? (optional)
  ↓
  Element removed from collection
  |
Loop back to hasNext()
```

#### 💡 Flow in words:
* `iterator()` → collection se iterator banao
* `hasNext()` → check karo next element hai ya nahi
* `next()` → element lo
* `remove()` → agar chaho to current element delete kar do
* Repeat until `hasNext()` false ho jaye


# ListIterator 
* **Special iterator** for **List collections**
* Can **traverse forward & backward** ✅
* Methods:
    * `next()` → next element
    * `previous()` → previous element
    * `nextIndex()` → index of next element
    * `previousIndex()` → index of previous element

##### Example use:
```java
ArrayList aList = new ArrayList();
aList.add("1"); aList.add("2"); aList.add("3");
ListIterator li = aList.listIterator();
li.next(); // move forward
li.previous(); // move backward
```

# Iterator vs For-each
* **For-each**: simple, clean, but **cannot remove elements**
* **Iterator**:
    * Can **remove current element safely**
    * Can **iterate multiple collections in parallel**

### Enhanced for loop:
```java
for(emp t: e) {
    System.out.println(t);
}
```

* Short, readable version of old-school iterator loop

### 💡 Short trick:
ListIterator = flexible bi-directional iterator for Lists, 
**Iterator > for-each** if removal or parallel iteration needed ✅


# LinkedList
* Implements **List + Queue interfaces**
* **Useful methods**:
    * `addFirst(x)` → start me add karo
    * `addLast(x)` → end me add karo
    * `getFirst()` / `getLast()` → first/last element get karo
    * `removeFirst()` / `removeLast()` → first/last element remove karo
* **Best for**: frequent insertion/deletion

# Vector
* Implements **List, growable array** of objects
* Similar to **ArrayList, but synchronized** → thread safe
* Creation:
```java
Vector v1 = new Vector(); // old/new methods
List v2 = new Vector();   // only List methods
```

# Points to Remember
* **Order** important? → Use **List**
* **Position-based insert/delete/update**? → Use **List**
* **Insertion/deletion frequent**? → **LinkedList** better
* **Search fast** chahiye? → **ArrayList** better
* **Thread safety chahiye**? → **Vector**
* **Thread safety not** important? → **ArrayList** or **LinkedList**

#### 💡 Short trick:
* **ArrayList** = fast search, slower insert/delete
* **LinkedList** = fast insert/delete, slower search
* **Vector** = synchronized ArrayList ✅