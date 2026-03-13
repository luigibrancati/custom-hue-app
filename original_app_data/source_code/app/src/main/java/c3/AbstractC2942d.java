package c3;

import Rd.W0;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4992i;

/* JADX INFO: renamed from: c3.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2942d {
    public static final InterfaceC4992i.b a(ThreadLocal threadLocal, Object obj) {
        AbstractC4862t.e(threadLocal, "<this>");
        return W0.a(threadLocal, obj);
    }

    public static final long b() {
        return Thread.currentThread().getId();
    }
}
