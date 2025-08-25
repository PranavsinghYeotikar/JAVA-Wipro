# Set Interface
* `Set` **ek collection** hai jo **unordered hai** (koi order nahi).
* **Duplicates allowed nahi** – agar same element dubara add karo, purana replace ho jayega.
* Sirf **1 null value allow** hai.
* **Traverse** karne ke liye **Iterator use kar** sakte ho.
* `Set` ke koi legacy class nahi, unlike `List` jisme `Vector` tha.
* Popular implementations: `HashSet`, `LinkedHashSet`, `TreeSet`.

# TreeSet:
* **Duplicates** bilkul **nahi**.
* **Sorted order** mein iterate karta hai (default ascending).
* **Thread-safe nahi**, agar multiple thread access karenge to **external sync** chahiye.
* Internally, `TreeSet` **TreeMap** pe based hai.

**Example**
```java
TreeSet<String> t1 = new TreeSet<String>();
t1.add("One");
t1.add("Two");
t1.add("Three");
```

##### Iterate karne ke liye:
```java
Iterator it = t1.iterator();
while(it.hasNext()){
    System.out.print(it.next()+"\t");
}
```
* Output: Five Four One Three Two (sorted order, ascending by default).

Basically, **Set** = **no duplicates, unordered**, aur **TreeSet = sorted Set**.


# Comparable Interface:
* Ye **user-defined objects ko sort karne ke liye use** hota hai.
* Package: `java.lang`
* Method: `compareTo(Object obj)` → current object ko doosre object se compare karta hai.
* Return value:
    * `0` → equal
    * `1` → current object bigger
    * `-1` → current object smaller

##### Example (Student marks ke basis pe sort):
```java
class Student implements Comparable{  
    int rollno;  
    String name;  
    int marks;  

    Student(int rollno,String name,int marks){  
        this.rollno=rollno;  
        this.name=name;  
        this.marks=marks;  
    }  

    public int compareTo(Object obj){  
        Student s=(Student)obj;  
        if(marks==s.marks) return 0;  
        else if(marks>s.marks) return 1;  
        else return -1;  
    }  
}
```

##### Use with TreeSet:
```java
TreeSet<Student> ts = new TreeSet<>();
ts.add(new Student(1,"Ajay",66));
ts.add(new Student(2,"Abhi",96));
ts.add(new Student(3,"Sanjai",45));
```

* TreeSet automatically marks ke ascending order mein students ko store karega.

##### TL;DR:
* `Comparable` = user-defined object sorting.
* `compareTo()` = kaun bada/chhota/equals.
* TreeSet use karke automatic sorted collection milega.

> **Comparable** → interface → **compare user defined object**
> **compareTo()** → method → do **actual comparsion**
> **TreeSet** → khud hi use karta hai comparable and compareTo() → **sort**


# HashSet:
* **No duplicates** → same element 2nd time add nahi hoga.
* **Unordered & unsorted** → iterate karte waqt order ka guarantee nahi.
* **Fast access** → internally HashTable/hashcode use karta hai.
* **Use case** → jab sirf **unique elements chahiye** aur **order matter nahi** karta.

##### Example:
```java
Set<Integer> s = new HashSet<>();
s.add(1);
s.add(2);
s.add(3);
s.add(4);
s.add(5);

for(Integer i : s)
    System.out.print(i + " ");
```
* Output example: `2 4 1 3 5` (order random, unpredictable)

#### Extra tip:
* Agar duplicate add karoge → add() false return karega.
* **HashSet = unique + fast + no order**