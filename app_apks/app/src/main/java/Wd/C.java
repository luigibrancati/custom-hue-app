package Wd;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class C {
    public static final B b(Object obj) {
        if (obj == AbstractC2322b.f17918a) {
            throw new IllegalStateException("Does not contain segment");
        }
        AbstractC4862t.c(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (B) obj;
    }

    public static final boolean c(Object obj) {
        return obj == AbstractC2322b.f17918a;
    }

    public static Object a(Object obj) {
        return obj;
    }
}
