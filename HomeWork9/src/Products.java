public class Products {
    private int code;
    private String name;

    public Products(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public Products() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {// переопределили toString, чтобы вывести на консоль объект
        return "Products{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}
