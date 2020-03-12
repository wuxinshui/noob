package java8.listgroup;

public class Product {
    private String id;
    private String code;
    private String name;

    public Product(String id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    // public Product() {
    // }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
