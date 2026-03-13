package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.J;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class M implements L {
    public static int i(int i10, Object obj, Object obj2) {
        K k10 = (K) obj;
        android.support.v4.media.session.a.a(obj2);
        if (k10.isEmpty()) {
            return 0;
        }
        Iterator it = k10.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static K j(Object obj, Object obj2) {
        K kR = (K) obj;
        K k10 = (K) obj2;
        if (!k10.isEmpty()) {
            if (!kR.o()) {
                kR = kR.r();
            }
            kR.q(k10);
        }
        return kR;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
    public J.a b(Object obj) {
        android.support.v4.media.session.a.a(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
    public Map c(Object obj) {
        return (K) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
    public Object d(Object obj) {
        return K.i().r();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
    public Map e(Object obj) {
        return (K) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
    public Object f(Object obj) {
        ((K) obj).p();
        return obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
    public int g(int i10, Object obj, Object obj2) {
        return i(i10, obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
    public boolean h(Object obj) {
        return !((K) obj).o();
    }
}
