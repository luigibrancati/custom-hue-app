package com.google.android.gms.internal.play_billing;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class O0 {
    public static boolean a(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = C3624v0.f30257a;
            }
        } else {
            if (!(iterable instanceof N0)) {
                return false;
            }
            comparator2 = ((N0) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
