package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3273o4 implements B5 {
    public static void m(List list, int i10) {
        int size = list.size() - i10;
        StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 26);
        sb2.append("Element at index ");
        sb2.append(size);
        sb2.append(" is null.");
        String string = sb2.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i10) {
                throw new NullPointerException(string);
            }
            list.remove(size2);
        }
    }

    public static void q(Iterable iterable, List list) {
        Charset charset = AbstractC3211h5.f29486a;
        iterable.getClass();
        if (iterable instanceof J5) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof L5) {
                ((L5) list).e(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    m(list, size2);
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
                m(list, size2);
            }
            list.add(obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.B5
    public final /* synthetic */ B5 J0(byte[] bArr, N4 n42) {
        return p(bArr, 0, bArr.length, n42);
    }

    @Override // com.google.android.gms.internal.measurement.B5
    public final /* synthetic */ B5 Y(byte[] bArr) {
        return o(bArr, 0, bArr.length);
    }

    @Override // 
    public abstract AbstractC3273o4 n();

    public AbstractC3273o4 o(byte[] bArr, int i10, int i11) {
        throw null;
    }

    public AbstractC3273o4 p(byte[] bArr, int i10, int i11, N4 n42) {
        throw null;
    }
}
