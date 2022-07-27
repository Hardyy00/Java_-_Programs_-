package Challenge32;

public class Node extends ListItem{

    public Node(Object item){
        super(item);
    }

    @Override
    ListItem nextItem() {
        return this.rightItem ;
    }

    @Override
    ListItem previousItem() {
        return this.leftItem ;
    }

    @Override
    ListItem setRightItem(ListItem item) {
        this.rightItem = item;
        return this.rightItem;
    }

    @Override
    ListItem setLeftItem(ListItem item) {
        this.leftItem = item;
        return this.leftItem;
    }

    @Override
    public int compareTo(ListItem item){
        if(item != null){
            return ((String)super.getValue()).compareTo((String) item.getValue());
        }

        return -1;
    }
}
