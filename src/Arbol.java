public class Arbol {
    private Integer alto;
    private Integer horizontal;
    private String color;

    public Arbol(Integer alto, Integer horizontal, String color) {
        this.alto = alto;
        this.horizontal = horizontal;
        this.color = color;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public Integer getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(Integer horizontal) {
        this.horizontal = horizontal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return
                "alto: " + alto +
                ", horizontal: " + horizontal +
                ", color: " + color;
    }
}
