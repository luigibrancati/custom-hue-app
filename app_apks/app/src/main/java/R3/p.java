package R3;

import I3.AbstractC0890u;
import android.net.NetworkRequest;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f14538b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f14539c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14540a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final String a() {
            return p.f14539c;
        }

        public a() {
        }
    }

    static {
        String strI = AbstractC0890u.i("NetworkRequestCompat");
        AbstractC4862t.d(strI, "tagWithPrefix(...)");
        f14539c = strI;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public p() {
        AbstractC4854k abstractC4854k = null;
        this(abstractC4854k, 1, abstractC4854k);
    }

    public final NetworkRequest b() {
        return (NetworkRequest) this.f14540a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && AbstractC4862t.a(this.f14540a, ((p) obj).f14540a);
    }

    public int hashCode() {
        Object obj = this.f14540a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "NetworkRequestCompat(wrapped=" + this.f14540a + ')';
    }

    public p(Object obj) {
        this.f14540a = obj;
    }

    public /* synthetic */ p(Object obj, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? null : obj);
    }
}
