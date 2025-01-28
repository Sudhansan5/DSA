package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
  private String name;
  private int id;
  private int phone;

  Person(String name, int id, int phone) {
    this.name = name;
    this.id = id;
    this.phone = phone;
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoneNumber() {
        return phone;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phone = phoneNumber;
    }
}

class PersonCaller{
  public static void main(String[] args) {
    Person person1 = new Person("Sudhanshu", 5, 232);
    Person person2 = new Person("Saket", 7, 123123);
    List<Person> pr = new ArrayList<Person>();
    pr.add(person1);
    pr.add(person2);

      List<Person> result = pr.stream()
              .filter(person -> person.getId() == 5) // Filter with id == 5
              .findFirst()
              .stream() // Converts Optional to Stream
              .collect(Collectors.toList()); // Collect into a List

      System.out.println(result);
  }
}
