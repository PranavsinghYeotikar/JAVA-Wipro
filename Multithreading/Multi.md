# Need for Multithreading
* **Better Performance / Speed** – **Tasks parallel mein chalte** hain, kaam jaldi hota hai.
* **Responsiveness** – Program hang nahi hota (e.g., typing ke time background mein spell-check).
* **Resource Sharing** – **Threads ek hi memory space share karte** hain, process ke comparison mein lightweight hote hain.
* **Efficient CPU Utilization** – **CPU** idle nahi baithega, **threads continuously use karte rahte** hain.
* **Real-world Scenarios** – Games (**multiple players** + sound + graphics), Servers (multiple users ek hi time).

# Multitasking vs Multithreading
* **Multitasking** = **ek hi waqt mein alag–alag programs chalana** (Word + Media Player + Browser).

* **Multithreading** = **ek hi program ke andar multiple chhote tasks** (threads) parallel chalana (Word typing + Spell check).

### Examples
* Race game: **tumhari car + doosri cars = alag-alag threads**.
* Painter analogy: 1 painter = single thread, **10 painters ek saath** = multiple threads → **fast kaam**.
* MS Word: Tum type kar rahe ho aur background mein spell-check chal raha hai → threads ka magic.

⚡ Short mein: **Multithreading ek program ko multitasker banata hai**.

****
👉 Short mein:

* **Multitasking** = **Multiple programs** ek saath.

* **Multithreading** = **Ek hi program ke andar multiple tasks** ek saath.

| **Feature**              | **Multitasking** 🖥️                                   | **Multithreading** 🔄                                                  |
| ------------------------ | ------------------------------------------------------ | ---------------------------------------------------------------------- |
| **Definition**           | Running **multiple programs** at the same time         | Running **multiple threads** inside a **single program**               |
| **Unit of Execution**    | **Process** (heavyweight)                              | **Thread** (lightweight)                                               |
| **Memory Usage**         | Each process has its **own memory space**              | Threads **share same memory** of the process                           |
| **Overhead**             | More (context switching between processes is costly)   | Less (threads switch faster, as they share memory)                     |
| **Example in Real Life** | Listening to music 🎶 while writing a document 📄      | Typing in Word ✍️ + spell-check running 🔍 together                    |
| **CPU Utilization**      | Good (but some cycles wasted if process idle)          | Better (threads keep CPU engaged efficiently)                          |
| **Communication**        | Harder (between processes → needs IPC)                 | Easier (threads directly share variables/resources)                    |
| **Performance**          | Slower compared to threads (heavy context switching)   | Faster & more responsive (light context switching)                     |
| **Use Cases**            | Running apps like Word, Browser, Media Player together | Games, servers, editors (where multiple tasks inside one app must run) |
