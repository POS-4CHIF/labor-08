package at.michaelkoenig.labor08.uebung2;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.TreeSet;

public class ObservableTreeSet<T> extends TreeSet<T> {
    private TreeSet<ObservableTreeSetObserver> observers;

    public void registerObserver(ObservableTreeSetObserver o) {
        observers.add(o);
    }

    public void unregisterObserver(ObservableTreeSetObserver o) {
        observers.remove(o);
    }

    private void notifyOnChange(String message) {
        for (ObservableTreeSetObserver observer : observers) {
            observer.onChange(new ObservableTreeSetEvent(this, LocalDateTime.now(), message));
        }
    }


    public boolean add(T e) {
        boolean ret = super.add(e);
        notifyOnChange("add");
        return ret;
    }

    public boolean remove(Object e) {
        boolean ret = super.remove(e);
        notifyOnChange("remove");
        return ret;
    }

    public T pollFirst() {
        T ret = super.pollFirst();
        notifyOnChange("pollFirst");
        return ret;
    }

    public T pollLast() {
        T ret = super.pollLast();
        notifyOnChange("pollLast");
        return ret;
    }

    public boolean addAll(Collection<? extends T> c) {
        boolean ret = super.addAll(c);
        notifyOnChange("addAll");
        return ret;
    }

    public boolean removeAll(Collection<?> c) {
        boolean ret = super.removeAll(c);
        notifyOnChange("removeAll");
        return ret;
    }

    public boolean retainAll(Collection<?> c) {
        boolean ret = super.retainAll(c);
        notifyOnChange("retainAll");
        return ret;
    }

}
