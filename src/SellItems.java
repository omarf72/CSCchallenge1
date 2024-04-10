public class SellItems {

    private String name;
    private String catergory;
    private Double price;


    //they should be prompted to enter in a name for the item, a category
//for the item, and a price for the item.

    public SellItems( String name, String catergory, Double price)
    {
        this.name=name;
        this.catergory=catergory;
        this.price=price;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getCatergory() {
        return catergory;
    }


    public void setCatergory(String catergory) {
        this.catergory = catergory;
    }


    public Double getPrice() {
        return price;
    }


    public void setPrice(Double price) {
        this.price = price;
    }

    
    
}
