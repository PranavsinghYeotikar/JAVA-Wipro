# Creating Threads using Runnable
* Dusra tareeka thread banane ka hai → **`Runnable` interface implement karna**.
* Isme tu **`run()` method override karega** aur usme apna kaam likhega.
* Fir ek **`Thread` object banana** padta hai **jisme tu apna `Runnable` object pass karega**.
* Aur `start()` call karke **thread ko chalu** karega.

#### Example (Basic)
```java
public class ThreadDemo implements Runnable {
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {
        ThreadDemo obj = new ThreadDemo();  // runnable object
        Thread t1 = new Thread(obj);        // thread create with runnable
        t1.start();                         // thread start
    }
}
```


#### Loop Example
```java
public void run() {
    for(int i=1; i<=100; i++) {
        System.out.println("thread is running..." + i);
    }
}
```

### Important Point
* **Extends Thread** → use when tu **`Thread` class ke methods bhi modify/enhance karna** chahta hai.
* **Implements Runnable** → use when **sirf `run()` me kaam define karna hai**. Yeh **better practice** hai kyunki inheritance free rahega (tu apni class ko aur bhi kisi class se extend kar sakta hai).

*👉 Ek line funda:*
Thread banane ke do tareeke hote hai → ya to `Thread` extend kar, ya `Runnable` implement kar. 
Best practice = Runnable use kar, simple aur flexible hai.