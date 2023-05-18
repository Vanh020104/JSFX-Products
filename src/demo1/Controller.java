package demo1;

public final class Controller {
    private String name;
    private String price;
    private String quantity;
    private String describe;
    private String category;
    public Controller(String name,String price,String quantity,String describe,String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.describe = describe;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public  String toString(){
        return "Products: " + "\n"  + name + "\n" + price + "\n" + quantity + "\n" + describe + "\n" + category;
    }
}
