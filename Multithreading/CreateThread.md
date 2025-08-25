# Extending Thread
* Agar tu **`Thread` class ko extend** karta hai, to tu apna **custom thread bana sakta hai**.
* Bas **apni class me `run()` method override karna** hota hai, jisme tu wo kaam likhega jo thread chalne par hona chahiye.
* Lekin dhyaan: `run()` ko seedha call mat karna → hamesha `start()` use karna. **`start()` hi ek naya thread create karke `run()` chalata hai.**

#### Example 1 (basic)
```java
public class ThreadDemo1 extends Thread {
    public void run() {
        System.out.println("thread is running...");
    }
    public static void main(String args[]) {
        ThreadDemo1 t = new ThreadDemo1();
        t.start(); // naya thread start hoga
    }
}
```

#### Example 2 (loop)
* Yeh sirf dikhane ke liye ki thread multiple kaam kar raha hai.
```java
public void run() {
    for(int i=1; i<=100; i++) {
        System.out.println("thread is running..." + i);
    }
}
```

### Main Thread
* Jab program start hota hai, **ek main thread already hota** hai (jo `main()` method chalata hai).
* Agar tu uska **info** dekhna chahe, to `Thread.currentThread()` use kar.
* Example me humne us thread ka naam change kiya aur `sleep()` bhi lagaya.

### Samajhne ka funda
* **Thread = chota worker** jo parallel kaam kar raha hota hai.
* `run()` = uska kaam
* `start()` = usko job pe bhejna
* `main thread` = pehle se existing boss thread

Bhai ek line me bole to:
*👉 `Thread` extend karke tu apna chota worker bana, uske `run()` me kaam likh, aur `start()` se usko kaam pe bhej. 🚀*