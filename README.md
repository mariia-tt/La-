# Software Design Patterns Practice

## Task 1: Builder Pattern Analysis
Check `User` class. Why this is call bloated? How to resolve this issue with the Builder pattern? Check Lombok `@Builder` annotation. Check Lombok `@Singular` anotation. Check Lombok `@SuperBuilder` annotation. Check compiled code of generated `UserBuilder`.

## Task 2: Mail System Implementation
Implement Client, MailInfo, MailSender qand MailBox classes that will allow you to send letters to customers. Letters should be sent according to the information aboutthe client (for example, gender and age) and the code of the letter (for example, there can be a letter with birthday greetings and a letter about gift). The system should be flexible to add new letter type (use Strategy here).
Don't limit yourself to these classes only, use as many classes or interfaces as you consider necessary.

`Client`
* id (this parameter should be assigned automatically in order from 0);
* name;  
* age;
* sex;

`MailInfo`
* client (Client object);
* mailCode (a parameter that specifies the type of email, for example, a birthday greeting or a gift letter).

`MailSender`
* sendMail(MailInfo).

`MailBox`
* infos (the place where all the information to be sent should be stored);
* addMailInfo(MaiInfo);
* sendAll().

## Task 3: Proxy Pattern Implementation  
Currently `RealImage` is pretty heavy, as it loads inside constructor. Implement `ProxyImage` that will fix that with a Proxy pattern.