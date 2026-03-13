package pe;

import Fe.InterfaceC0845g;
import java.io.Closeable;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class D implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f42596a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public static /* synthetic */ D c(a aVar, byte[] bArr, x xVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                xVar = null;
            }
            return aVar.b(bArr, xVar);
        }

        public final D a(InterfaceC0845g interfaceC0845g, x xVar, long j10) {
            AbstractC4862t.e(interfaceC0845g, "<this>");
            return qe.k.a(interfaceC0845g, xVar, j10);
        }

        public final D b(byte[] bArr, x xVar) {
            AbstractC4862t.e(bArr, "<this>");
            return qe.k.c(bArr, xVar);
        }

        public a() {
        }
    }

    public abstract long a();

    public abstract x b();

    public abstract InterfaceC0845g c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        qe.k.b(this);
    }
}
