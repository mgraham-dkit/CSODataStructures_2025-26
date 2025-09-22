package introducing_classes.apps;

import introducing_classes.entities.Contact;

public class ContactDisplay {
    public static void main(String[] args) {
        Contact friend1 = new Contact("Helen", "82749261");
        System.out.println(friend1.format());
    }
}
