package pe;

import Fe.InterfaceC0844f;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f42562a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public static /* synthetic */ B b(a aVar, byte[] bArr, x xVar, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                xVar = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return aVar.a(bArr, xVar, i10, i11);
        }

        public final B a(byte[] bArr, x xVar, int i10, int i11) {
            AbstractC4862t.e(bArr, "<this>");
            return qe.i.d(bArr, xVar, i10, i11);
        }

        public a() {
        }
    }

    public long a() {
        return qe.i.a(this);
    }

    public abstract x b();

    public boolean c() {
        return qe.i.b(this);
    }

    public boolean d() {
        return qe.i.c(this);
    }

    public abstract void e(InterfaceC0844f interfaceC0844f);
}
