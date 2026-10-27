# Kichik kutubxona

Java tilida yozilgan konsol kutubxona dasturi. Kitoblarni ko'rish, olish va qaytarish mumkin.

## OOP tushunchalari

- **Inkapsulyatsiya:** `Book` maydonlari `private`; holat metodlar orqali boshqariladi.
- **Kompozitsiya:** `Library` kitoblar ro'yxatini saqlaydi.
- **Mas'uliyatni ajratish:** `Main` foydalanuvchi bilan muloqot qiladi, `Book` va `Library` esa ma'lumot hamda qoidalarni boshqaradi.

## Ishga tushirish

JDK 17 yoki undan yangi versiya kerak. Loyiha papkasida terminal ochib:

```powershell
javac -encoding UTF-8 -d out src\*.java
java -cp out Main
```
