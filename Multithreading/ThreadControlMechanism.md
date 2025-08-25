# Thread Control Management

### Do tareeke hai check karne ke liye ki thread khatam hua ya nahi:
* **isAlive()** → agar thread chal raha hai toh `true`, warna `false`.
* **join()** → **main thread wait** karega **jab tak wo thread finish** na ho jaye.

### Code me kya ho raha hai:
* `DemoThread` banaya jisme `run()` me countdown (5 → 1) chal raha hai, har second me ek print.
* Teen threads (`One`, `Two`, `Three`) start ho gaye ek saath.
* `isAlive()` pehle check karta hai → tab sab chal rahe hote hain toh `true`.
* Fir `join()` lagaya → matlab **main thread ruk gaya jab tak teenon khatam nahi ho jate**.
* Jab sab threads exit kar gaye → `isAlive()` fir `false` dikhata hai.
* Last me `Main thread exiting`.

#### Ek line me samajh le:
* `isAlive()` bas bata deta hai chal raha hai ya nahi,
* `join()` main thread ko bolta hai – “ruk ja bhai, jab tak me finish na ho jaun.” 🚦