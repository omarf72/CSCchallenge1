// Item.java
public class Item {
    private String name;
    private String category;
    private String studentFirstName;
    private String studentLastName;
    private String studentEmail;
    private double price;


    public Item(String name, String category, String studentFirstName, String studentLastName, String studentEmail, Double price)
    {
        this.name = name;
        this.category = category;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentEmail = studentEmail;
        this.price = price;
    }

    // Getters and setters for name, category, and price
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    @Override
    public String toString() {
        return "Item information name: " + name + ", category: " + category + ", student name who is selling it: " + studentFirstName + " " + studentLastName+ ", price: " + price
                + "";
    }

    


    
}
