package Fe;

import gc.C4202o;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class E {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f4064h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f4065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public E f4070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public E f4071g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public E() {
        this.f4065a = new byte[8192];
        this.f4069e = true;
        this.f4068d = false;
    }

    public final void a() {
        int i10;
        E e10 = this.f4071g;
        if (e10 == this) {
            throw new IllegalStateException("cannot compact");
        }
        AbstractC4862t.b(e10);
        if (e10.f4069e) {
            int i11 = this.f4067c - this.f4066b;
            E e11 = this.f4071g;
            AbstractC4862t.b(e11);
            int i12 = 8192 - e11.f4067c;
            E e12 = this.f4071g;
            AbstractC4862t.b(e12);
            if (e12.f4068d) {
                i10 = 0;
            } else {
                E e13 = this.f4071g;
                AbstractC4862t.b(e13);
                i10 = e13.f4066b;
            }
            if (i11 > i12 + i10) {
                return;
            }
            E e14 = this.f4071g;
            AbstractC4862t.b(e14);
            f(e14, i11);
            b();
            F.b(this);
        }
    }

    public final E b() {
        E e10 = this.f4070f;
        if (e10 == this) {
            e10 = null;
        }
        E e11 = this.f4071g;
        AbstractC4862t.b(e11);
        e11.f4070f = this.f4070f;
        E e12 = this.f4070f;
        AbstractC4862t.b(e12);
        e12.f4071g = this.f4071g;
        this.f4070f = null;
        this.f4071g = null;
        return e10;
    }

    public final E c(E segment) {
        AbstractC4862t.e(segment, "segment");
        segment.f4071g = this;
        segment.f4070f = this.f4070f;
        E e10 = this.f4070f;
        AbstractC4862t.b(e10);
        e10.f4071g = segment;
        this.f4070f = segment;
        return segment;
    }

    public final E d() {
        this.f4068d = true;
        return new E(this.f4065a, this.f4066b, this.f4067c, true, false);
    }

    public final E e(int i10) {
        E eC;
        if (i10 <= 0 || i10 > this.f4067c - this.f4066b) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i10 >= 1024) {
            eC = d();
        } else {
            eC = F.c();
            byte[] bArr = this.f4065a;
            byte[] bArr2 = eC.f4065a;
            int i11 = this.f4066b;
            C4202o.n(bArr, bArr2, 0, i11, i11 + i10, 2, null);
        }
        eC.f4067c = eC.f4066b + i10;
        this.f4066b += i10;
        E e10 = this.f4071g;
        AbstractC4862t.b(e10);
        e10.c(eC);
        return eC;
    }

    public final void f(E sink, int i10) {
        AbstractC4862t.e(sink, "sink");
        if (!sink.f4069e) {
            throw new IllegalStateException("only owner can write");
        }
        int i11 = sink.f4067c;
        if (i11 + i10 > 8192) {
            if (sink.f4068d) {
                throw new IllegalArgumentException();
            }
            int i12 = sink.f4066b;
            if ((i11 + i10) - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f4065a;
            C4202o.n(bArr, bArr, 0, i12, i11, 2, null);
            sink.f4067c -= sink.f4066b;
            sink.f4066b = 0;
        }
        byte[] bArr2 = this.f4065a;
        byte[] bArr3 = sink.f4065a;
        int i13 = sink.f4067c;
        int i14 = this.f4066b;
        C4202o.i(bArr2, bArr3, i13, i14, i14 + i10);
        sink.f4067c += i10;
        this.f4066b += i10;
    }

    public E(byte[] data, int i10, int i11, boolean z10, boolean z11) {
        AbstractC4862t.e(data, "data");
        this.f4065a = data;
        this.f4066b = i10;
        this.f4067c = i11;
        this.f4068d = z10;
        this.f4069e = z11;
    }
}
