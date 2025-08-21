# Java Collections Framework
```mermaid
flowchart TD
A[Java Collections Framework 🗃️] --> B[Definition 🧩]
A[Java Collections Framework 🗃️] --> C[Advantages ✅]

B[Definition 🧩] --> D[Objects ka group 📦]

C[Advantages ✅] --> E[Programming easy ✍️] --> F[Khud se code kam likhne ki zarurat] --> G[Learning easy 😌] --> H[Standard APIs, less tension] --> I[Code reuse ♻️] --> J[ No need custom API 🏗️]

C[Advantages ✅] --> K[Performance ⚡] --> L[Fast data structures]

C[Advantages ✅] --> M[API Compatibility 🔄] --> N[Collections share karna easy]
```

# Interfaces and their implementation
![Interfaces and their implementation](collection.png)
this is showing which collection has which data structure in it
* #### Set
  * HashSet, 
  * LinkedHashSet, 
  * SortedSet
    * TreeSet
* #### List
  * ArrayList, 
  * Vector, 
  * LinkedList
* #### Queue
  * PriorityQueue
* #### Map Interface
  * Hashtable, 
  * HashMap, 
  * LinkedHashMap,
  * SortedMap
    * TreeMap 

<p style="color:cyan">
<strong>Set</strong> = No duplicates <br>
<strong>List</strong> = Order matters, duplicates allowed <br>
<strong>Queue</strong> = FIFO <br>
<strong>Map</strong> = Key-Value pairs
</p>

# Collection Interfaces
![collection3](collection3.png)
* **Collection** → Base interface sab collections ke liye.
* **Set** → Unique elements only.
* **SortedSet** → Set + elements sorted.
* **List** → Ordered collection, duplicates allowed.
* **Queue** → Elements order of processing mein.
* **Map** → Key–Value pairs.
* **SortedMap** → Map + keys sorted order mein.
  
Bas itna yaad rakh le — 
**Collection = group**, 
**Map = key-value**, 
**Sorted = order maintained**.

# Represetation
![collection4](collection4.png)

# Collection Implementations
![collection5](collection5.png)
* #### **HashSet** 
  – Unordered & unsorted set, **no duplicates**. HashCode efficient ho to fast access milta hai. **Order ki tension nahi**. 🔑

* #### **TreeSet** 
  – **Sorted set**, elements automatically tree structure me arranged hote hain. 📈
* ##### **LinkedHashSet** 
  – **HashSet ka ordered version**, iteration insertion order me hota hai. 🔄
* #### **ArrayList** 
  – **Growable array**, fast iteration & **random access**. **Ordered by index**, but not sorted. RandomAccess interface support karta hai. ⚡
* #### **LinkedList** 
  – ArrayList jaisa **index order**, par **elements doubly-linked** hote hain. Insert/delete me ArrayList se better. 🔗

# Collection interface methods
![collection6](collection6.png)