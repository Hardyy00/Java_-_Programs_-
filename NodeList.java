package Challenge32;

public interface NodeList {

    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean remove(ListItem item);

    void traverse();


}
