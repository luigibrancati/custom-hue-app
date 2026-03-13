package fc;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: fc.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4026i implements Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f34264e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C4026i f34265f = C4027j.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f34269d;

    /* JADX INFO: renamed from: fc.i$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public C4026i(int i10, int i11, int i12) {
        this.f34266a = i10;
        this.f34267b = i11;
        this.f34268c = i12;
        this.f34269d = b(i10, i11, i12);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C4026i other) {
        AbstractC4862t.e(other, "other");
        return this.f34269d - other.f34269d;
    }

    public final int b(int i10, int i11, int i12) {
        if (i10 >= 0 && i10 < 256 && i11 >= 0 && i11 < 256 && i12 >= 0 && i12 < 256) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C4026i c4026i = obj instanceof C4026i ? (C4026i) obj : null;
        return c4026i != null && this.f34269d == c4026i.f34269d;
    }

    public int hashCode() {
        return this.f34269d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f34266a);
        sb2.append('.');
        sb2.append(this.f34267b);
        sb2.append('.');
        sb2.append(this.f34268c);
        return sb2.toString();
    }

    public C4026i(int i10, int i11) {
        this(i10, i11, 0);
    }
}
