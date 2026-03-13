package org.apache.tika.utils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class CompareUtils {
    public static int compareClassName(Object obj, Object obj2) {
        String name = obj.getClass().getName();
        String name2 = obj2.getClass().getName();
        boolean zStartsWith = name.startsWith("org.apache.tika.");
        return zStartsWith == name2.startsWith("org.apache.tika.") ? name.compareTo(name2) : zStartsWith ? 1 : -1;
    }
}
