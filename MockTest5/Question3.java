class Person {
  
    private String name;
    private int age;
    private String address;

 
    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

}

public class Question3 {
    public static void main(String[] args) {
        Person person = new Person();
 
        person.setName("Anupam Dhauria");
        person.setAge(27);
        person.setAddress("Jamshedpur");

        
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
    }
}

