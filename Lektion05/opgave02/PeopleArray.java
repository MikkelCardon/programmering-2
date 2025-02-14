package opgave02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PeopleArray<T> {
    private List<T> people = new ArrayList<>();

    public void addPerson(T t) {
        people.add(t);
    }

    public void printPeople() {
        System.out.println(people);
    }

    /**
     * Returns from the list the first person
     * that satisfies the predicate.
     * Returns null, if no person satisfies the predicate.
     */
    public T findFirst(Predicate<T> filter) {
        for (T t : people) {
            if (filter.test(t)) {
                return t;
            }
        }
        return null;
    }

    public List<T> findAll(Predicate<T> filter){
        List<T> res = new ArrayList<>();
        for (T t : people) {
            if(filter.test(t)){
                res.add(t);
            }
        }
        return res;
    }
}
