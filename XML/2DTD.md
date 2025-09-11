# 📘 DTD (Document Type Definition)
## 1. XML Validity
* Ek **well-formed XML** = **sahi syntax follow** karta hai (`<tag>` properly close etc).
* Ek **valid XML** = well-formed + ek DTD/Schema ke **rules follow** karta hai.
* DTD ka kaam = **XML document ke legal structure batana** (kaunse tags allowed, order kya hai, attributes kaise hone chahiye).

## 2. DTD Kya Hai?
Ek grammar hai XML ke liye.
Batata hai:
  * Kaunse tags allowed hain
  * Kis order me aayenge
  * Tag ke andar text ya aur tags allowed hain ya nahi
  
**DTD XML ke andar bhi likh sakt**e ho (internal DTD) **ya alag file** me bana sakte ho (external DTD).

## 3. Syntax (DTD Declaration)

DTD declare karne ke liye use hota hai `<!DOCTYPE>`:
```xml
<!DOCTYPE rootname [ DTD yaha likho ]>       <!-- internal -->
<!DOCTYPE rootname SYSTEM "file.dtd">        <!-- external -->
```



## 4. Types of DTD
1. **Internal DTD** – XML file ke andar likha hota hai.
2. **External DTD** – Alag file me `.dtd` hota hai aur XML usko refer karta hai.



## 5. Declaring Elements
Use: `<!ELEMENT>`

Examples:
```xml
<!ELEMENT book (#PCDATA)>      <!-- book me sirf text allowed -->
<!ELEMENT employee ANY>        <!-- employee me kuch bhi ho sakta -->
<!ELEMENT fulltime EMPTY>      <!-- empty element -->
<!ELEMENT email (TO+, FROM, CC*, SUBJECT?, BODY?)>
```

👉 Symbols:
* `+` = one or more (kam se kam 1 baar).

* `*` = zero or more (optional, multiple ho sakte).
* `?` = zero or one (optional, max ek hi).
* `,` = sequence (order matter karta hai).
* `|` = choice (ya to ye, ya wo).

## 6. Special Content
* **#PCDATA** → parsed character data (normal text).
* **ANY** → kuch bhi (avoid karna chahiye).
* **EMPTY** → koi content nahi (jaise `<tag/>`).
* Mixed content → text + child elements dono (jaise `<employee>Jane <benefit>Medical</benefit></employee>`).

## 7. Attributes in DTD
Declare karne ke liye use hota hai: `<!ATTLIST>`

Example:
```xml
<!ATTLIST book publisher CDATA "O'Reilly">
```

##### 👉 Attributes ke liye rules:
* **Types**: CDATA, ID, IDREF, NMTOKEN, ENUM (list of values), ENTITY, NOTATION.
* **Defaults**:
    * `"value"` = default value.
    * `#IMPLIED` = optional.
    * `#REQUIRED` = mandatory.
    * `#FIXED "value"` = fixed value.

## 8. Entities
**Entities** = shortcodes / **variables jinke jagah pe content aata** hai.
* **Internal entity** → XML ke andar defined:
```xml
<!ENTITY trainer "XML Basics">
<course>&trainer;</course>   <!-- expands to XML Basics -->
```
* **External entity** (text) → alag file se laata hai:
```xml
<!ENTITY greet SYSTEM "greet.txt">
```
* **External entity** (non-XML like images) → notation ke saath declare karna padta hai:
```xml
<!ENTITY myphoto SYSTEM "pic1.gif" NDATA GIF>
<!NOTATION GIF SYSTEM "image/gif">
```
##### 👉 Predefined entities:
* `&lt;` = <
* `&gt;` = >
* `&amp;` = &
* `&quot;` = "
* `&apos;` = '

## 9. Notations
Non-XML data formats describe karne ke liye.

Example:
```xml
<!NOTATION GIF SYSTEM "image/gif">
```

Yeh batata hai ki file ek GIF image hai.

#### ✅ Summary

* **DTD = XML ke rules & grammar**.
* Do tarike: Internal / External.
* Main declarations:
    * `<!ELEMENT>` (tags define karna)
    * `<!ATTLIST>` (attributes define karna)
    * `<!ENTITY>` (shortcuts / data reuse)
    * `<!NOTATION>` (non-XML data describe karna)

##### 💡 Ek line me yaad rakh:
“DTD ek traffic police jaisa hai jo decide karta hai XML document me kaunse tags, kis order me, aur kis type ke data ke saath allowed hain.” 🚦