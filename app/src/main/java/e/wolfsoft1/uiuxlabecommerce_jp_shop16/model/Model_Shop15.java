package e.wolfsoft1.uiuxlabecommerce_jp_shop16.model;

public class Model_Shop15 {
    private final String jumper_name;
    private final Integer jumper_image;
    private final String price;
    private final String description;
    private final String style;

    public Model_Shop15(Integer jumper_image, String jumper_name, String price, String description, String style) {
        this.jumper_image = jumper_image;
        this.jumper_name = jumper_name;
        this.price = price;
        this.description = description;
        this.style = style;
    }

    public String getJumper_name() {
        return jumper_name;
    }

    public Integer jumper_image() {
        return jumper_image;
    }

    public String getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getStyle() {
        return style;
    }
}
