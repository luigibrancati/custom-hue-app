package w8;

import gc.Q;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: w8.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6166c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f46336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f46337c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6166c(String sessionId, long j10) {
        this(sessionId, j10, null, 4, null);
        AbstractC4862t.e(sessionId, "sessionId");
    }

    public final Map a() {
        return this.f46337c;
    }

    public final String b() {
        return this.f46335a;
    }

    public final long c() {
        return this.f46336b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6166c)) {
            return false;
        }
        C6166c c6166c = (C6166c) obj;
        return AbstractC4862t.a(this.f46335a, c6166c.f46335a) && this.f46336b == c6166c.f46336b && AbstractC4862t.a(this.f46337c, c6166c.f46337c);
    }

    public int hashCode() {
        return (((this.f46335a.hashCode() * 31) + Long.hashCode(this.f46336b)) * 31) + this.f46337c.hashCode();
    }

    public String toString() {
        return "EventMetadata(sessionId=" + this.f46335a + ", timestamp=" + this.f46336b + ", additionalCustomKeys=" + this.f46337c + ')';
    }

    public C6166c(String sessionId, long j10, Map additionalCustomKeys) {
        AbstractC4862t.e(sessionId, "sessionId");
        AbstractC4862t.e(additionalCustomKeys, "additionalCustomKeys");
        this.f46335a = sessionId;
        this.f46336b = j10;
        this.f46337c = additionalCustomKeys;
    }

    public /* synthetic */ C6166c(String str, long j10, Map map, int i10, AbstractC4854k abstractC4854k) {
        this(str, j10, (i10 & 4) != 0 ? Q.i() : map);
    }
}
