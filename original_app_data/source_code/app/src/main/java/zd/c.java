package zd;

import Bd.n;
import Lc.G;
import fc.C4034q;
import fd.m;
import gd.AbstractC4211c;
import gd.C4209a;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import sd.AbstractC5823c;
import yd.q;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends q implements Ic.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f48896o = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f48897n;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final c a(kd.c fqName, n storageManager, G module, InputStream inputStream, boolean z10) throws IOException {
            AbstractC4862t.e(fqName, "fqName");
            AbstractC4862t.e(storageManager, "storageManager");
            AbstractC4862t.e(module, "module");
            AbstractC4862t.e(inputStream, "inputStream");
            C4034q c4034qA = AbstractC4211c.a(inputStream);
            m mVar = (m) c4034qA.a();
            C4209a c4209a = (C4209a) c4034qA.b();
            if (mVar != null) {
                return new c(fqName, storageManager, module, mVar, c4209a, z10, null);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + C4209a.f35617h + ", actual " + c4209a + ". Please update Kotlin");
        }

        public a() {
        }
    }

    public /* synthetic */ c(kd.c cVar, n nVar, G g10, m mVar, C4209a c4209a, boolean z10, AbstractC4854k abstractC4854k) {
        this(cVar, nVar, g10, mVar, c4209a, z10);
    }

    @Override // Oc.z, Oc.AbstractC1816j
    public String toString() {
        return "builtins package fragment for " + e() + " from " + AbstractC5823c.p(this);
    }

    public c(kd.c cVar, n nVar, G g10, m mVar, C4209a c4209a, boolean z10) {
        super(cVar, nVar, g10, mVar, c4209a, null);
        this.f48897n = z10;
    }
}
