package dd;

import fc.C4032o;
import id.AbstractC4376a;
import jd.AbstractC4763d;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: dd.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3916u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f33461b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33462a;

    /* JADX INFO: renamed from: dd.u$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final C3916u a(String name, String desc) {
            AbstractC4862t.e(name, "name");
            AbstractC4862t.e(desc, "desc");
            return new C3916u(name + '#' + desc, null);
        }

        public final C3916u b(AbstractC4763d signature) {
            AbstractC4862t.e(signature, "signature");
            if (signature instanceof AbstractC4763d.b) {
                return d(signature.c(), signature.b());
            }
            if (signature instanceof AbstractC4763d.a) {
                return a(signature.c(), signature.b());
            }
            throw new C4032o();
        }

        public final C3916u c(hd.c nameResolver, AbstractC4376a.c signature) {
            AbstractC4862t.e(nameResolver, "nameResolver");
            AbstractC4862t.e(signature, "signature");
            return d(nameResolver.getString(signature.r()), nameResolver.getString(signature.q()));
        }

        public final C3916u d(String name, String desc) {
            AbstractC4862t.e(name, "name");
            AbstractC4862t.e(desc, "desc");
            return new C3916u(name + desc, null);
        }

        public final C3916u e(C3916u signature, int i10) {
            AbstractC4862t.e(signature, "signature");
            return new C3916u(signature.a() + '@' + i10, null);
        }

        public a() {
        }
    }

    public /* synthetic */ C3916u(String str, AbstractC4854k abstractC4854k) {
        this(str);
    }

    public final String a() {
        return this.f33462a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3916u) && AbstractC4862t.a(this.f33462a, ((C3916u) obj).f33462a);
    }

    public int hashCode() {
        return this.f33462a.hashCode();
    }

    public String toString() {
        return "MemberSignature(signature=" + this.f33462a + ')';
    }

    public C3916u(String str) {
        this.f33462a = str;
    }
}
