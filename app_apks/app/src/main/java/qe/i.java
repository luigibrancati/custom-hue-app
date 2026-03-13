package qe;

import Fe.InterfaceC0844f;
import kotlin.jvm.internal.AbstractC4862t;
import pe.B;
import pe.x;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends B {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x f43463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f43464c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ byte[] f43465d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f43466e;

        public a(x xVar, int i10, byte[] bArr, int i11) {
            this.f43463b = xVar;
            this.f43464c = i10;
            this.f43465d = bArr;
            this.f43466e = i11;
        }

        @Override // pe.B
        public long a() {
            return this.f43464c;
        }

        @Override // pe.B
        public x b() {
            return this.f43463b;
        }

        @Override // pe.B
        public void e(InterfaceC0844f sink) {
            AbstractC4862t.e(sink, "sink");
            sink.write(this.f43465d, this.f43466e, this.f43464c);
        }
    }

    public static final long a(B b10) {
        AbstractC4862t.e(b10, "<this>");
        return -1L;
    }

    public static final boolean b(B b10) {
        AbstractC4862t.e(b10, "<this>");
        return false;
    }

    public static final boolean c(B b10) {
        AbstractC4862t.e(b10, "<this>");
        return false;
    }

    public static final B d(byte[] bArr, x xVar, int i10, int i11) {
        AbstractC4862t.e(bArr, "<this>");
        m.e(bArr.length, i10, i11);
        return new a(xVar, i11, bArr, i10);
    }
}
