# Thread Priority 

* **Har thread ka ek priority number hota hai (1 se 10 tak).**
    * `1` = sabse low
    * `5` = normal (default)
    * `10` = sabse high

* **Higher priority thread ko zyada CPU time milta hai** as compared to lower priority. Matlab agar ek thread high priority ka hai, toh wo CPU pe zyada control lega.
* **Equal priority threads** → CPU inko **round robin (time-slicing) se chalata hai**. Matlab thoda-thoda time dega **dono ko barabar**.

<br>

#### Methods:
* `getPriority()` → **priority check** karne ke liye
* `setPriority(int level)` → **priority set** karne ke liye

<br>

* **Jab new thread banta hai** → wo apne parent thread ki priority inherit karta hai.

#### Example:
```java
t1.setPriority(Thread.MAX_PRIORITY); // 10
t2.setPriority(Thread.MIN_PRIORITY); // 1
```

Yaha `t1` ko CPU zyada time dega aur `t2` ko kam.

* **Preemptive multitasking**:
Agar ek **low priority thread chal raha hai** aur **achanak ek high priority thread ready ho jaye**, toh CPU us **low priority wale ko side mein karke high priority wale ko chalata hai**.

<br>

#### 👉 Short mein:
* Priority ka matlab hai **kaun thread zyada important hai CPU ke liye**. 
    * High priority = zyada chalne ka chance, 
    * low priority = kam chance. 
    * Equal priority = barabar time sharing.

Chaahe high priority set kar lo, lekin OS pe depend karta hai ki wo kitna strictly follow kare.