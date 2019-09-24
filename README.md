# Java Print | Printf | Println


Example Application: prints

## Simple Print

There is no line break.

```java
System.out.print("Simple Print - Hello World\n");
```

## Simple Println

It has line break.

```java
System.out.println("Simple Println - Hello World");
```


## Print with Integer

Format Specifier: %d

```java
System.out.println("Print Number: " + 999);
```


## Print with Long

Format Specifier: %d

```java
System.out.println("Print Long: " + 10L);
```

## Print with Char

Format Specifier: %c

```java
char c = 'A';
System.out.println("Print Char: " + c);
```
		
## Print with String (java.lang.String)

Format Specifier: %s

```java
System.out.println("Print String: " + "String Value");
```

## Print with model / Print custom class

[Model Person](/src/model/Person.java)
```java
Person person = new Person();
person.setName("Name");
person.setAge(30);
System.out.println("Print Class Model: " + person.toString());
```

## Print with StringFormat

Use format specifier to replace with variable.

```java
String format = "Custom Format: [Number: %d] - [Text: %s] - [Person Name: %s, Person Age: %d]";
Object[] params = new Object[] { 999, "Simple text", person.getName(), person.getAge() };
System.out.println(String.format(format, params));
```
		
## Print with Printf and StringFormat

Use format specifier to replace with variable.

```java
String format = "Custom Format: [Number: %d] - [Text: %s] - [Person Name: %s, Person Age: %d]";
Object[] params = new Object[] { 999, "Simple text", person.getName(), person.getAge() };
System.out.printf(format, params);
```
		
		
## Print with Date (Timestamp)

Format Specifier: %t

```java
Date date = new Date();
System.out.println("Date: "+ date);
```
		
## Print with Date Format (BR-PT) dd/MM/yyyy - hh:MM:ss
```java
SimpleDateFormat dateFormatBR = new SimpleDateFormat("dd/MM/yyyy - hh:MM:ss");
System.out.println("Date BR: "+ dateFormatBR.format(date));
```
		
## Print with keyboard text
```java
System.out.println("Insert Text Here: ");
Scanner in = new Scanner(System.in);
String text = in.nextLine();
	
System.out.println("Keyboard text: " + text);
```
		
## Some links for more in depth learning

* [JAVA PRINT](https://github.com/fefong/java_print);
* [JAVA SWITCH CASE](https://github.com/fefong/java_switch);
* [JAVA IF/ELSE](https://github.com/fefong/java_ifElse);
* [JAVA ARITHMETIC](https://github.com/fefong/java_calculator);
