package opgave03;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListTest implements RecentlyUsedList{
    private ArrayList<String> array = new ArrayList<>();

    @Override
    public void add(String element) {
        if (!array.contains(element)){
            array.addFirst(element);
        } else {
            int index = array.indexOf(element);
            array.addFirst(remove(index));
        }

        if (array.size() == 6){
            remove(array.size()-1);
        }
    }

    @Override
    public String remove(int index) {
        if (0 > index || index > array.size()-1){
            throw new IllegalArgumentException();
        }
        return array.remove(index);
    }

    @Override
    public String[] getRecentlyUsed() {
        return (String[]) array.toArray(new String[0]);
    }
}
