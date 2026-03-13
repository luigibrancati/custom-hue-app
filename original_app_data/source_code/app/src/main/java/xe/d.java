package xe;

import Fe.C0846h;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.metadata.TikaCoreProperties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f48122d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0846h f48123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0846h f48124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0846h f48125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0846h f48126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0846h f48127i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0846h f48128j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0846h f48129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0846h f48130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f48131c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    static {
        C0846h.a aVar = C0846h.f4117d;
        f48123e = aVar.d(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        f48124f = aVar.d(":status");
        f48125g = aVar.d(":method");
        f48126h = aVar.d(":path");
        f48127i = aVar.d(":scheme");
        f48128j = aVar.d(":authority");
    }

    public d(C0846h name, C0846h value) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(value, "value");
        this.f48129a = name;
        this.f48130b = value;
        this.f48131c = name.size() + 32 + value.size();
    }

    public final C0846h a() {
        return this.f48129a;
    }

    public final C0846h b() {
        return this.f48130b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return AbstractC4862t.a(this.f48129a, dVar.f48129a) && AbstractC4862t.a(this.f48130b, dVar.f48130b);
    }

    public int hashCode() {
        return (this.f48129a.hashCode() * 31) + this.f48130b.hashCode();
    }

    public String toString() {
        return this.f48129a.R() + ": " + this.f48130b.R();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(String name, String value) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(value, "value");
        C0846h.a aVar = C0846h.f4117d;
        this(aVar.d(name), aVar.d(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(C0846h name, String value) {
        this(name, C0846h.f4117d.d(value));
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(value, "value");
    }
}
