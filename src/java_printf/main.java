package java_printf;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.Person;

/**
 * Example Application: prints
 * 
 * @author Felipe Fong
 */
public class main {

	public static void main(String[] args) {

		// Simple Print
		System.out.print("Simple Print - Hello World\n");

		// Simple Println
		System.out.println("Simple Println - Hello World");

		// Print with Integer
		System.out.println("Print Number: " + 999);

		// Print with Long
		System.out.println("Print Long: " + 10L);

		// Print with Char
		char c = 'A';
		System.out.println("Print Char: " + c);

		// Print with String (java.lang.String)
		System.out.println("Print String: " + "String Value");

		// Print with model
		Person person = new Person();
		person.setName("Name");
		person.setAge(30);
		System.out.println("Print Class Model: " + person.toString());

		// Print with StringFormat
		String format = "Custom Format: [Number: %d] - [Text: %s] - [Person Name: %s, Person Age: %d]";
		Object[] params = new Object[] { 999, "Simple text", person.getName(), person.getAge() };

		System.out.println(String.format(format, params));

		// PrintF with StringFormat
		System.out.printf(format, params);
		System.out.println("\n");

		// Print with Date (Timestamp)
		Date date = new Date();
		System.out.println("Date: " + date);

		// Print with Date Format (BR-PT) dd/MM/yyyy - hh:MM:ss
		SimpleDateFormat dateFormatBR = new SimpleDateFormat("dd/MM/yyyy - hh:MM:ss");
		System.out.println("Date BR: " + dateFormatBR.format(date));

		// Get Text
		System.out.println("Insert Text Here: ");
		Scanner in = new Scanner(System.in);
		String text = in.nextLine();

		// Print with keyboard text
		System.out.println("Keyboard text: " + text);

	}
}
