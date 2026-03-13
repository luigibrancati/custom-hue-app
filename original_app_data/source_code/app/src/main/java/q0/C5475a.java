package q0;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import n0.AbstractC5069g;
import o0.InterfaceC5187d;
import z0.EnumC6497k;
import z0.InterfaceC6489c;

/* JADX INFO: renamed from: q0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5475a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0573a f42975a = new C0573a(null, null, null, 0, 15, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f42976b = new b();

    /* JADX INFO: renamed from: q0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0573a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public InterfaceC6489c f42977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public EnumC6497k f42978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public InterfaceC5187d f42979c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f42980d;

        public /* synthetic */ C0573a(InterfaceC6489c interfaceC6489c, EnumC6497k enumC6497k, InterfaceC5187d interfaceC5187d, long j10, AbstractC4854k abstractC4854k) {
            this(interfaceC6489c, enumC6497k, interfaceC5187d, j10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0573a)) {
                return false;
            }
            C0573a c0573a = (C0573a) obj;
            return AbstractC4862t.a(this.f42977a, c0573a.f42977a) && this.f42978b == c0573a.f42978b && AbstractC4862t.a(this.f42979c, c0573a.f42979c) && AbstractC5069g.d(this.f42980d, c0573a.f42980d);
        }

        public int hashCode() {
            return (((((this.f42977a.hashCode() * 31) + this.f42978b.hashCode()) * 31) + this.f42979c.hashCode()) * 31) + AbstractC5069g.e(this.f42980d);
        }

        public String toString() {
            return "DrawParams(density=" + this.f42977a + ", layoutDirection=" + this.f42978b + ", canvas=" + this.f42979c + ", size=" + ((Object) AbstractC5069g.f(this.f42980d)) + ')';
        }

        public C0573a(InterfaceC6489c interfaceC6489c, EnumC6497k enumC6497k, InterfaceC5187d interfaceC5187d, long j10) {
            this.f42977a = interfaceC6489c;
            this.f42978b = enumC6497k;
            this.f42979c = interfaceC5187d;
            this.f42980d = j10;
        }

        public /* synthetic */ C0573a(InterfaceC6489c interfaceC6489c, EnumC6497k enumC6497k, InterfaceC5187d interfaceC5187d, long j10, int i10, AbstractC4854k abstractC4854k) {
            this((i10 & 1) != 0 ? d.a() : interfaceC6489c, (i10 & 2) != 0 ? EnumC6497k.Ltr : enumC6497k, (i10 & 4) != 0 ? g.f42985a : interfaceC5187d, (i10 & 8) != 0 ? AbstractC5069g.f40490a.b() : j10, null);
        }
    }

    /* JADX INFO: renamed from: q0.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f42981a = AbstractC5476b.b(this);

        public b() {
        }
    }
}
