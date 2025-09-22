package introducing_classes.entities;


public class Contact {
    private String name;
    private String phone;

//    def __init__(self, name, phone = "default"):
//        self.name = name
//        self.phone = phone

    public Contact(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    public Contact(String name){
        this.name = name;
        this.phone = "default";
    }

    public String format(){
        return name + ": " + phone;
    }
}
