# Change langue of system
You can search sound like: "Internationalization in java"

## About
Create new file langues:<br>
New -> Properties File ->  File Name(MessageBundle_en_US) -> Finish

```java
#key = value
greeting = Hello World!
```

In main or play on some where else

```java
   int lang;
   Scanner s = new Scanner(System.in);
   ResourceBundle bundle;
   do {
    System.out.println("1. English");
    System.out.println("2. Vietnamese");
    System.out.println("3. Exit program");
    System.out.print("Please choose your language: ");
    lang = s.nextInt();
    switch (lang) {
     case 1:
       //internationalization.message is package name
       //MessageBundle is properties file name
       bundle = ResourceBundle.getBundle("internationalization.message.MessageBundle", Locale.US);
       System.out.println("Message in " + Locale.US
                                + ": " + bundle.getString("greeting"));
       break;
     case 2:
       //changing the default locale to Vietnamese
       Locale.setDefault(new Locale("vi", "VN"));
       bundle = ResourceBundle.getBundle("internationalization.message.MessageBundle");
       System.out.println("Message in " + Locale.getDefault()
                                + ": " + bundle.getString("greeting"));
       break;
    }
   } while (lang != 3);
```
