package opgave03.models;

import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class BagClass<E> implements Bag<E>, Iterable<E>{
    private HashMap<E, Integer> hashMap = new HashMap<>();

    @Override
    public void add(E element) {
        //Merge tager 3 parameter
        //1. elementer der skal kigges efter
        //2. hvad værdi skal være hvis intet match
        //3. hvordan eksisterende værdi skal sættes sammen med ny værdi ved match
        hashMap.merge(element, 1 , Integer::sum);
    }

    @Override
    public void remove(E element) {
        if (hashMap.containsKey(element)){
           int value = hashMap.get(element);

           if (value == 1){
               hashMap.remove(element);
           }
           else{
               hashMap.put(element, value-1);
           }
        }
    }

    @Override
    public int getCount(E element) {
        if (hashMap.containsKey(element)){
            return hashMap.get(element);
        }
        return -1;
    }

    @Override
    public Iterator<E> iterator() {
        return hashMap.keySet().iterator();

//        return new Iterator<E>() {
//            E[] array = hashMap.keySet().toArray((E[]) new E[0]);
//            int index = 0;
//
//            @Override
//            public boolean hasNext() {
//                return array[index] != null;
//            }
//
//            @Override
//            public E next() {
//                if (!hasNext()){
//                    throw new NoSuchElementException();
//                }
//                E element = array[index];
//                index++;
//                return element;
//            }
//        };
    }


}
