package b0;

import gc.C4202o;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: b0.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2781e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f24886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24889d;

    public C2781e() {
        this(0, 1, null);
    }

    public final void a(Object obj) {
        Object[] objArr = this.f24886a;
        int i10 = this.f24888c;
        objArr[i10] = obj;
        int i11 = this.f24889d & (i10 + 1);
        this.f24888c = i11;
        if (i11 == this.f24887b) {
            b();
        }
    }

    public final void b() {
        Object[] objArr = this.f24886a;
        int length = objArr.length;
        int i10 = this.f24887b;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        Object[] objArr2 = new Object[i12];
        C4202o.m(objArr, objArr2, 0, i10, length);
        C4202o.m(this.f24886a, objArr2, i11, 0, this.f24887b);
        this.f24886a = objArr2;
        this.f24887b = 0;
        this.f24888c = length;
        this.f24889d = i12 - 1;
    }

    public final Object c(int i10) {
        if (i10 < 0 || i10 >= f()) {
            C2783g c2783g = C2783g.f24894a;
            throw new ArrayIndexOutOfBoundsException();
        }
        Object obj = this.f24886a[this.f24889d & (this.f24887b + i10)];
        AbstractC4862t.b(obj);
        return obj;
    }

    public final boolean d() {
        return this.f24887b == this.f24888c;
    }

    public final Object e() {
        int i10 = this.f24887b;
        if (i10 == this.f24888c) {
            C2783g c2783g = C2783g.f24894a;
            throw new ArrayIndexOutOfBoundsException();
        }
        Object[] objArr = this.f24886a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f24887b = (i10 + 1) & this.f24889d;
        return obj;
    }

    public final int f() {
        return this.f24889d & (this.f24888c - this.f24887b);
    }

    public C2781e(int i10) {
        if (!(i10 >= 1)) {
            c0.d.a("capacity must be >= 1");
        }
        if (!(i10 <= 1073741824)) {
            c0.d.a("capacity must be <= 2^30");
        }
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f24889d = i10 - 1;
        this.f24886a = new Object[i10];
    }

    public /* synthetic */ C2781e(int i10, int i11, AbstractC4854k abstractC4854k) {
        this((i11 & 1) != 0 ? 8 : i10);
    }
}
