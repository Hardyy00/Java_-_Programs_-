package Challenge32;

public abstract class ListItem {

    protected ListItem rightItem;
    protected  ListItem leftItem;

    protected Object value;

    public ListItem(Object value){
        this.value = value;
        this.rightItem = null;
        this.leftItem = null;
    }

    abstract ListItem nextItem();
    abstract ListItem previousItem();

    abstract ListItem setRightItem(ListItem item);
    abstract ListItem setLeftItem(ListItem item);

    public Object getValue(){
        return this.value;
    }

    public void setValue(Object value){
        this.value = value;
    }

    public abstract int compareTo(ListItem item);
}
