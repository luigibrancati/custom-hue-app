package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3501a2 implements InterfaceC3562k3 {
    public static void i(List list, int i10) {
        String str = "Element at index " + (list.size() - i10) + " is null.";
        int size = list.size();
        while (true) {
            size--;
            if (size < i10) {
                throw new NullPointerException(str);
            }
            list.remove(size);
        }
    }

    public static void m(Iterable iterable, List list) {
        Charset charset = T2.f30091a;
        iterable.getClass();
        if (iterable instanceof InterfaceC3609s3) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            }
            if (list instanceof C3621u3) {
                ((C3621u3) list).e(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    i(list, size2);
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i10 = 0; i10 < size3; i10++) {
            Object obj2 = list2.get(i10);
            if (obj2 == null) {
                i(list, size2);
            }
            list.add(obj2);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC3501a2 clone();
}
