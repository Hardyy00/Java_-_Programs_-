package Challenge32;

public class MyLinkedList implements NodeList{

    private ListItem root;

    public MyLinkedList() {
       this.root = null;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {

        if(this.root == null){
            this.root = item;
            return true;
        }

        ListItem currentItem = this.getRoot();
        while(currentItem != null){
            int comparison = currentItem.compareTo(item);
            if(comparison < 0){
                // Current item is less than adding item, so adding item will move int right

                if(currentItem.nextItem() == null){
                    currentItem.setRightItem(item);
                    return true;
                } else{
                    currentItem = currentItem.nextItem();
                }
            } else if(comparison > 0){

                if(currentItem.previousItem() == null){
                    currentItem.setLeftItem(item).setRightItem(currentItem);
                    this.root = item;
                }else {
                    currentItem.previousItem().setRightItem(item).setLeftItem(currentItem.previousItem());
                    item.setRightItem(currentItem).setLeftItem(item);
                }
                return true;

            } else {
                System.out.println("'"+item.getValue() + "' already exist in the list.");
                return false;
            }
        }

        return false;

    }

    @Override
    public boolean remove(ListItem item) {
        return false;
    }

    @Override
    public void traverse() {
        if(this.root == null){
            System.out.println("List is Empty");

        }else {

            ListItem currentItem = this.root;
            while (currentItem != null) {
                System.out.println(currentItem.getValue());
                currentItem = currentItem.nextItem();
            }
        }

    }
}
