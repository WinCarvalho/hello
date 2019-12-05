package com.inheretance;

//abstract.extends.
import java.util.Scanner;

abstract class Documents {
	protected String text; // when declared protected sub class can assces it

	// constructor
	public Documents() {
		super();
		text = "document";
		System.out.println("Document default");
	}

	public Documents(String text) {
		super();
		this.text = text;
		System.out.println("Document parameterised");
	}

	public abstract void open();

	public abstract void print();

	public abstract void close();
}

class Word extends Documents {

	public Word() {
		super();
		// text = " ";
		System.out.println("default ");
	}

	public Word(String text) {
		super(text); // passing text to document to hold the value
		this.text = text;
		System.out.println("parameterised ");
	}

	public void addPage() {
		System.out.println("page added");
	}

	@Override
	public void open() {
		System.out.println("Document is open");
	}

	@Override
	public void print() {
		System.out.println("Document is printed" + text);
	}

	@Override
	public void close() {
		System.out.println("Document is closed");
	}
}



class Excel extends Documents {

	public Excel() {
		super();
		System.out.println("default ");
	}

	public Excel(String text) {
		super(text);
		this.text = text;
		System.out.println("parameterised ");
	}

	public void addSheet() {
		System.out.println("page added");
	}

	@Override
	public void open() {
		System.out.println("Sheet is open");
	}

	@Override
	public void print() {
		System.out.println("Sheet is printed" + text);
	}

	@Override
	public void close() {
		System.out.println("Sheet is closed");
	}

}

class PowerPoint extends Documents {

	public PowerPoint() {
		super();
		System.out.println("default ");
	}

	public PowerPoint(String text) {
		super(text);
		this.text = text;
		System.out.println("parameterised ");
	}

	public void addslide() {
		System.out.println("page added");
	}

	@Override
	public void open() {
		System.out.println("Slide is open");
	}

	@Override
	public void print() {
		System.out.println("Slide is printed" + text);
	}

	@Override
	public void close() {
		System.out.println("Slide is closed");
	}
}

public class Test_Document {
	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);

		Documents document;
		Word word = new Word("plain text");
		Excel excel = new Excel("plain text");
		PowerPoint power = new PowerPoint("plain text");

		System.out.println("Enter Choice");
		System.out.println("1. Word");
		System.out.println("2. Excel");
		System.out.println("3. PowerPoint");
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			document = new Word();
			document.open();
			document.print();
			document.close();
			word.addPage();
			break;
		case 2:
			document = new Excel();
			document.open();
			document.print();
			document.close();
			excel.addSheet();
			break;
		case 3:
			document = new PowerPoint();
			document.open();
			document.print();
			document.close();
			power.addslide();
			break;
		case 4:
			break;
		}
	}
}
