// Item.java
public class Item {
    private String name;
    private String category;
    private String studentName;
    private double price;


    public Item(String name,String category,String studentName,Double price)
    {
        this.name=name;
        this.category=category;
        this.studentName=studentName;
        this.price=price;
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

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Item [name=" + name + ", category=" + category + ", studentName=" + studentName + ", price=" + price
                + "]";
    }


    
}
