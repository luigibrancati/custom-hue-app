package H;

import E.AbstractC0807p0;
import E.F0;
import J.b;
import L.I;
import fc.C4032o;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f4786b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f4787a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public static /* synthetic */ b c(a aVar, F0 f02, I i10, J.c cVar, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                cVar = new J.a(i10);
            }
            return aVar.b(f02, i10, cVar);
        }

        public final b a(F0 f02, I cameraInfoInternal) {
            AbstractC4862t.e(f02, "<this>");
            AbstractC4862t.e(cameraInfoInternal, "cameraInfoInternal");
            return c(this, f02, cameraInfoInternal, null, 2, null);
        }

        public final b b(F0 f02, I cameraInfoInternal, J.c resolver) {
            AbstractC4862t.e(f02, "<this>");
            AbstractC4862t.e(cameraInfoInternal, "cameraInfoInternal");
            AbstractC4862t.e(resolver, "resolver");
            AbstractC0807p0.a("ResolvedFeatureGroup", "resolveFeatureGroup: sessionConfig = " + f02 + ", lensFacing = " + cameraInfoInternal.f());
            if (f02.h().isEmpty() && f02.g().isEmpty()) {
                return null;
            }
            J.b bVarA = resolver.a(f02);
            if (bVarA instanceof b.a) {
                b bVarA2 = ((b.a) bVarA).a();
                AbstractC0807p0.a("ResolvedFeatureGroup", "resolvedFeatureGroup = " + bVarA2);
                return bVarA2;
            }
            if (bVarA instanceof b.C0100b) {
                throw new IllegalArgumentException("Feature group is not supported");
            }
            if (bVarA instanceof b.c) {
                throw new IllegalArgumentException(((b.c) bVarA).a() + " is not supported");
            }
            if (!(bVarA instanceof b.d)) {
                throw new C4032o();
            }
            StringBuilder sb2 = new StringBuilder();
            b.d dVar = (b.d) bVarA;
            sb2.append(dVar.b());
            sb2.append(" must be added for ");
            sb2.append(dVar.a());
            throw new IllegalArgumentException(sb2.toString());
        }

        public a() {
        }
    }

    public b(Set features) {
        AbstractC4862t.e(features, "features");
        this.f4787a = features;
    }

    public static final b b(F0 f02, I i10) {
        return f4786b.a(f02, i10);
    }

    public final Set a() {
        return this.f4787a;
    }

    public String toString() {
        return "ResolvedFeatureGroup(features=" + this.f4787a + ')';
    }
}
