package jd;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: jd.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4763d {

    /* JADX INFO: renamed from: jd.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC4763d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f39161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f39162b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String name, String desc) {
            super(null);
            AbstractC4862t.e(name, "name");
            AbstractC4862t.e(desc, "desc");
            this.f39161a = name;
            this.f39162b = desc;
        }

        @Override // jd.AbstractC4763d
        public String a() {
            return c() + ':' + b();
        }

        @Override // jd.AbstractC4763d
        public String b() {
            return this.f39162b;
        }

        @Override // jd.AbstractC4763d
        public String c() {
            return this.f39161a;
        }

        public final String d() {
            return c();
        }

        public final String e() {
            return b();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC4862t.a(c(), aVar.c()) && AbstractC4862t.a(b(), aVar.b());
        }

        public int hashCode() {
            return (c().hashCode() * 31) + b().hashCode();
        }
    }

    /* JADX INFO: renamed from: jd.d$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC4763d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f39163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f39164b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String name, String desc) {
            super(null);
            AbstractC4862t.e(name, "name");
            AbstractC4862t.e(desc, "desc");
            this.f39163a = name;
            this.f39164b = desc;
        }

        @Override // jd.AbstractC4763d
        public String a() {
            return c() + b();
        }

        @Override // jd.AbstractC4763d
        public String b() {
            return this.f39164b;
        }

        @Override // jd.AbstractC4763d
        public String c() {
            return this.f39163a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC4862t.a(c(), bVar.c()) && AbstractC4862t.a(b(), bVar.b());
        }

        public int hashCode() {
            return (c().hashCode() * 31) + b().hashCode();
        }
    }

    public /* synthetic */ AbstractC4763d(AbstractC4854k abstractC4854k) {
        this();
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public final String toString() {
        return a();
    }

    public AbstractC4763d() {
    }
}
