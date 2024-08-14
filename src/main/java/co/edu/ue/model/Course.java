package co.edu.ue.model;


public class Course {

    private String name;
    private String description;
    private Long id;
    private Long price;
    private Boolean active;

    public Course(Long id, String name, String description, Long price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.active = true;
    }

    public Course(){
    }

    public void disable(){
        this.active = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Course [name=" + name + ", description=" + description + ", id=" + id + ", price=" + price + "]";
    }

    
    

}
