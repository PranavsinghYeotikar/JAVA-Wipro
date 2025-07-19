# Preparation before writing a JAVA program
* ## Set Environment Variables
  * #### PATH
    * This is must step
    * This let us to run the `javac` and `java` from anywhere in terminal.
    * ```   
        PATH = C:\Program Files\Java\jdk-XX\bin
  * #### CLASSPATH
    * Tells the JAVA to look for user defined classes and packages. 
* ## Project Directory Structure Creation
  1) **JAVA is package-sensetive**
   
   <br>

  2) **Best Practice to make directory**
       * **Package**
         * FolderName == PackageName
         * Ex `com.company.app → com/company/app/`
       * **Clean Structure**
        ![alt text](src/Prep1.png) 

    <br>

  3) **Separate `out` and `src`**
    ![alt text](src/prep2.png)
    * `src` -> source code folder
    * `out` -> output(compiled bytecode) folder
    * _Why?_
        1) Cleanliness
        2) IDE can debug easily as it know which code is where
        3) `javac` wont have to see `.class` just go in `src`
        4) `.jar` banana easy because directly uses `out` folder
   
   <br>

   4) Keep `resources/` out of `src/`
      ![alt text](src/prep3.png)  
      * `resources/` contains images, xml, configs files 
      * These **non-code things** are loaded on runtime, _no need to compile them_
      * _Why `resources/`?_
        1) `javac` can directly look `.java` files, no need to see other non-coding files
        2) **Fast Loading** as all are separated, no confusion
        3) Code becomes **modular and reusable**
        4) Easy maintainence
    
   <br>

    5) **External Library**
        * These are those library we take from outside, **to add features**
        * ex 
          * `ysql-connector.jar` – MySQL se connect hone ke liye
          * `gson.jar` – JSON parsing
          * `log4j.jar` – Logging ke liye
          * `pdfbox.jar` – PDF banana ya read karne ke liye
         * `.jar` == **JAVA Archive** files
         * Keep these `.jar` files in `libs/` folder
         ![alt text](src/prep4.png)
         * _Why `libs/`?_
           1) Clean setup
           2) Better manangement
           3) Better dependency management, as we can see which project is using which library  

<br>
<br>
<br>

# Good Programming Practice
* #### Class Names
  * ex `Student`, `Trees`
* #### Variable Names
  * ex `age`, `width`, `elementName`
* #### Method Name
  * ex `run()`, `getElementName()`, `switchONtheButton()`
* #### Block Comments
  * Must be written in the starting of program and before any method
* #### Declaration
  * Declare one thing at a single line
    ```
    int height;
    int width;
    ```

<br>
<br>
<br>

# JAVA API  
* Ready-made library of tools and classes.
* Can use it instead of writing your owns

* #### How it is made?
  * It is **package of prewritten classes and methods**.
  * Language in which made = **JAVA**
  * ex `java.util`, `java.lang`, `java.io`
  * ex 
    ```
    String name = "Panya";
    System.out.println(name.toUpperCase());  // Output: PANYA
    ```
  * Here `toUpperCase()` is a method came from JAVA API.
  
* #### Benefits
  * Time saver
  * Reusable
  * Reliable
  * Clean Code
  
<br>
<br>
<br>

# JAVA Buzzwords
These are properties of JAVA
1) #### Simple 
   * Easy to learn, clean
2) #### Object-Oriented
   * Every thing is done using object
3) #### Robust
   * Strong error handling system, no memory leak
4) #### Secure
   * Code is runned on JVM, it is virus-proof
5) #### Platform Independent
6) #### High Performance
   * Interpreter + Just-in-Time Compiler, makes execution very fast
7) #### Distributed
   * Can make remote apps
8) #### Multithreaded
9) #### Dynamic	
    * Runtime pe naye classes, methods load kar sakte ho
10) #### Architecture Neutral
    * Bytecode specific machine ke liye nahi, har architecture pe chalega
11) #### Interpreted	
    * Java code pehle compile hota hai .class me, fir JVM use interpret karta hai
12) #### Portable	
    * Bina code change kare can run on any system
 
**Java is a platform-independent, object-oriented, secure and robust language with strong multithreading capabilities and a rich API ecosystem.**

<br>
<br>
<br>

# Types of Variables
## 1) Local Variable

* Attached with some **object**
* Har object apna version rakhta hai

##### Why we need it?
  * Object-oriented programming mein, **state ko store** karne ke liye. 
  * Har object apna data rakhe — isliye

##### How it helps?
  * **Encapsulation allow** karta hai — har object apna data rakhta hai, kisi aur object se independent

##### Memory behavior?
  * **Heap memory** mein store hota hai. 
  * Har object banne pe naya memory allocate hota hai.
  
#### Syntax
##### Rules
  * Declaration class ke andar, methods ke bahar.
  * Access modifiers allowed (private, public, etc.)
  * Default values milte hain agar initialize na kiya ho.

#### Working under the scene
* JVM har object ke liye ek memory block banata hai jisme yeh variables ke slots hote hain.

#### Use Case
* Kisi bhi real-world entity ka state store karna:
`Student, Car, Employee, BankAccount`.
* Har object apna alag data rakhega.

#### Common Errors
  ##### NullPointerException — object not initialized
   ##### Shadowing — same name causes confusion
   and there debug tip