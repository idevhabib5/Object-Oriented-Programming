class address {
    private int house;
    private int street;
    private String city;
    private String code;

    address() {
    }

    address(int h, int st, String ci, String c) {
        this.city = ci;
        this.code = c;
        this.street = st;
        this.house = h;
    }

    int getHouse() {
        return house;

    }

    int getStreet() {
        return street;

    }

    String getCity() {
        return city;
    }

    String getCode() {
        return code;
    }

    void setHouse(int h) {
        this.house = h;

    }

    void setStreet(int st) {
        this.street = st;
    }

    void setCity(String city) {
        this.city = city;
    }

    void setCode(String c) {
        this.code = c;
    }

    public String toString() {
        return "House is: " + house + "\nStreet is: " + street + "\nCity is: " + city + "\n Code is: " + code;
    }

}

class person {
    private String name;
    private String id;
    private address ad;

    person() {
    }

    person(String na, String id, address ad) {
        this.name = na;
        this.id = id;
        this.ad = ad;
    }

    void setName(String name) {
        this.name = name;
    }

    void setId(String id) {
        this.id = id;
    }

    void setAddress(address ad) {
        this.ad = ad;
    }

    String getName() {
        return name;
    }

    String getID() {
        return id;
    }

    address getAddress() {
        return ad;
    }

    // Public String toString(){
    // return "Name is: "+name+"\n Id is:"+id+"House is:
    // "+ad.getHouse()+"\nad.Street is: "+ad.getStreet()+"\nCity is:
    // "+ad.getCity()+"\n Code is: "+ad.getCode();
    // }
    void display() {
        System.out.println("Name is: " + name + "\n Id is:" + id + "House is: " + ad.getHouse() + "\nad.Street is: "
                + ad.getStreet() + "\nCity is: " + ad.getCity() + "\n Code is: " + ad.getCode());

    }

}

class book {
    // Create a class Book that contains an author of type Person (Note: Use the
    // Person class created in the
    // first exercise). Other data members are bookName and publisher. Modify the
    // address of the author in
    // runner class.

}

public class lab6 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        address ad1 = new address(12, 124, "Islamabad", "44000");
        System.out.println(ad1.toString());
        person p1 = new person("Habib", "333934", ad1);
        p1.display();
        p1.getAddress().setCity("Lahore");
        p1.getAddress().setCode("76844");
        // p1.getAddress().address(45, 3456, "RAwalpindi", "4577707");
        p1.display();

    }

}
