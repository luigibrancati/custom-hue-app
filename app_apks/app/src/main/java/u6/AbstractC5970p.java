package u6;

import b7.C2878l;
import s6.C5785d;
import t6.C5843a;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: u6.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5970p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5785d[] f45212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f45213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45214c;

    /* JADX INFO: renamed from: u6.p$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public InterfaceC5968n f45215a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C5785d[] f45217c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f45216b = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f45218d = 0;

        public /* synthetic */ a(byte[] bArr) {
        }

        public AbstractC5970p a() {
            AbstractC6056k.b(this.f45215a != null, "execute parameter required");
            return new C5940W(this, this.f45217c, this.f45216b, this.f45218d);
        }

        public a b(InterfaceC5968n interfaceC5968n) {
            this.f45215a = interfaceC5968n;
            return this;
        }

        public a c(boolean z10) {
            this.f45216b = z10;
            return this;
        }

        public a d(C5785d... c5785dArr) {
            this.f45217c = c5785dArr;
            return this;
        }

        public a e(int i10) {
            this.f45218d = i10;
            return this;
        }

        public final /* synthetic */ InterfaceC5968n f() {
            return this.f45215a;
        }
    }

    @Deprecated
    public AbstractC5970p() {
        this.f45212a = null;
        this.f45213b = false;
        this.f45214c = 0;
    }

    public static a a() {
        return new a(null);
    }

    public abstract void b(C5843a.b bVar, C2878l c2878l);

    public boolean c() {
        return this.f45213b;
    }

    public final C5785d[] d() {
        return this.f45212a;
    }

    public final int e() {
        return this.f45214c;
    }

    public AbstractC5970p(C5785d[] c5785dArr, boolean z10, int i10) {
        this.f45212a = c5785dArr;
        boolean z11 = false;
        if (c5785dArr != null && z10) {
            z11 = true;
        }
        this.f45213b = z11;
        this.f45214c = i10;
    }
}
