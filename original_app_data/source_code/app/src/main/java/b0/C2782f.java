package b0;

import gc.C4202o;
import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: renamed from: b0.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2782f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f24890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24893d;

    public C2782f() {
        this(0, 1, null);
    }

    public final void a(int i10) {
        int[] iArr = this.f24890a;
        int i11 = this.f24892c;
        iArr[i11] = i10;
        int i12 = this.f24893d & (i11 + 1);
        this.f24892c = i12;
        if (i12 == this.f24891b) {
            c();
        }
    }

    public final void b() {
        this.f24892c = this.f24891b;
    }

    public final void c() {
        int[] iArr = this.f24890a;
        int length = iArr.length;
        int i10 = this.f24891b;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i12];
        C4202o.k(iArr, iArr2, 0, i10, length);
        C4202o.k(this.f24890a, iArr2, i11, 0, this.f24891b);
        this.f24890a = iArr2;
        this.f24891b = 0;
        this.f24892c = length;
        this.f24893d = i12 - 1;
    }

    public final boolean d() {
        return this.f24891b == this.f24892c;
    }

    public final int e() {
        int i10 = this.f24891b;
        if (i10 == this.f24892c) {
            C2783g c2783g = C2783g.f24894a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i11 = this.f24890a[i10];
        this.f24891b = (i10 + 1) & this.f24893d;
        return i11;
    }

    public C2782f(int i10) {
        if (!(i10 >= 1)) {
            c0.d.a("capacity must be >= 1");
        }
        if (!(i10 <= 1073741824)) {
            c0.d.a("capacity must be <= 2^30");
        }
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f24893d = i10 - 1;
        this.f24890a = new int[i10];
    }

    public /* synthetic */ C2782f(int i10, int i11, AbstractC4854k abstractC4854k) {
        this((i11 & 1) != 0 ? 8 : i10);
    }
}
