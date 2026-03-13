package io.sentry.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class CollectionUtils {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface Mapper<T, R> {
        R map(T t10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface Predicate<T> {
        boolean test(T t10);
    }

    private CollectionUtils() {
    }

    public static <T> boolean contains(T[] tArr, T t10) {
        for (T t11 : tArr) {
            if (t10.equals(t11)) {
                return true;
            }
        }
        return false;
    }

    public static <T> List<T> filterListEntries(List<T> list, Predicate<T> predicate) {
        ArrayList arrayList = new ArrayList(list.size());
        for (T t10 : list) {
            if (predicate.test(t10)) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static <K, V> Map<K, V> filterMapEntries(Map<K, V> map, Predicate<Map.Entry<K, V>> predicate) {
        HashMap map2 = new HashMap();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (predicate.test(entry)) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        return map2;
    }

    public static <T, R> List<R> map(List<T> list, Mapper<T, R> mapper) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mapper.map(it.next()));
        }
        return arrayList;
    }

    public static <T> List<T> newArrayList(List<T> list) {
        if (list != null) {
            return new ArrayList(list);
        }
        return null;
    }

    public static <K, V> Map<K, V> newConcurrentHashMap(Map<K, V> map) {
        if (map == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return concurrentHashMap;
    }

    public static <K, V> Map<K, V> newHashMap(Map<K, V> map) {
        if (map != null) {
            return new HashMap(map);
        }
        return null;
    }

    public static <T> ListIterator<T> reverseListIterator(CopyOnWriteArrayList<T> copyOnWriteArrayList) {
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList(copyOnWriteArrayList);
        return copyOnWriteArrayList2.listIterator(copyOnWriteArrayList2.size());
    }

    public static int size(Iterable<?> iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator<?> it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
        }
        return i10;
    }
}
