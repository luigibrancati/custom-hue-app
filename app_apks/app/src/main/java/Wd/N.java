package Wd;

import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4992i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class N implements InterfaceC4992i.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal f17910a;

    public N(ThreadLocal threadLocal) {
        this.f17910a = threadLocal;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof N) && AbstractC4862t.a(this.f17910a, ((N) obj).f17910a);
    }

    public int hashCode() {
        return this.f17910a.hashCode();
    }

    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f17910a + ')';
    }
}
