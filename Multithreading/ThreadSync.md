# Thread Syncronization

* **Mutex / Monitor / Synchronization** ye sab ek hi kahani ke different naam hai. Matlab: agar ek thread (socho ek banda) shared data (ek trampoline 😅) use kar raha hai, toh doosra banda uss time us trampoline pe chadh nahi sakta.
> If one thread is using something others cannot at that time

* **Mutex (mutual exclusion)** : Ek lock jaisa system, jisme **ek time pe sirf ek thread ko entry milti hai**.
  
<br>

* **Race condition**: Agar synchronization na ho toh do threads ek hi data ko ek saath modify karenge, aur result bigad jayega (**jaise do log ek hi pen se ek hi paper pe likh rahe ho 😬**).

  
<br>

* **Synchronized methods**: Java ka shortcut hai monitor banane ka. **Agar tum kisi method ko `synchronized` kar do, toh ek time pe sirf ek thread us method ko access kar paayega**.
  
<br>

* **Monitor**: Basically ek guard jo object pe baithega aur bolega — “bhai pehle ye banda kaam khatam kare, phir tu aana.”
> A gaurd which tells thread when to come

<br>

👉 **Example**: Ek trampoline pe Duke (Java mascot) khel raha hai. Jab tak woh khel raha hai, doosre Duke line me wait karenge. Jaise hi pehla utarta hai, agla chadh jaata hai.

Bas itna yaad rakh — **synchronization = ek time pe ek banda** = data safe ✅ha


<br>

Example
```java
class Trampoline {
    synchronized void jump(String name) {
        System.out.println(name + " is jumping on trampoline 🏃‍♂️🤸‍♂️");
        try {
            Thread.sleep(1000); // trampoline time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " finished jumping, next please!");
    }
}

class Duke extends Thread {
    Trampoline t;
    String name;

    Duke(Trampoline t, String name) {
        this.t = t;
        this.name = name;
    }

    public void run() {
        t.jump(name);
    }
}

public class Main {
    public static void main(String[] args) {
        Trampoline trampoline = new Trampoline();

        Duke d1 = new Duke(trampoline, "Duke 1");
        Duke d2 = new Duke(trampoline, "Duke 2");
        Duke d3 = new Duke(trampoline, "Duke 3");

        d1.start();
        d2.start();
        d3.start();
    }
}
```

Output
```vbnet
Duke 1 is jumping on trampoline 🏃‍♂️🤸‍♂️
Duke 1 finished jumping, next please!
Duke 2 is jumping on trampoline 🏃‍♂️🤸‍♂️
Duke 2 finished jumping, next please!
Duke 3 is jumping on trampoline 🏃‍♂️🤸‍♂️
Duke 3 finished jumping, next please!
```