package com.mastek.fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.mastek.fileIO.model.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	final List<Person> list = new ArrayList<>();
		list.add(new Person(1, "Abhijit", 20));
		list.add(new Person(2, "Abhi", 21));
		list.add(new Person(3, "Ajit", 20));
		list.add(new Person(4, "Amit", 19));

		try (FileOutputStream fos = new FileOutputStream("ser.dat");
				FileInputStream fis = new FileInputStream("ser.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				ObjectInputStream ois = new ObjectInputStream(fis);

		) {

//			1. write list object to file
			oos.writeObject(list);
//			oos.writeObject(new Person(4, "Amit", 19));
// 			2. read list object from file
			List<Person> copylist=(List<Person>) ois.readObject();
			copylist.forEach(System.out::println);
//			Person p=(Person)ois.readObject();
//			System.out.println(p);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
    }

