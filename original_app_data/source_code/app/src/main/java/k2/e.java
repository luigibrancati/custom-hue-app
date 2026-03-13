package k2;

import G1.AbstractC0853a;
import G1.M;
import i2.InterfaceC4337q;
import i2.J;
import i2.K;
import i2.O;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f39236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O f39237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f39240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f39241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f39242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f39243h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f39244i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f39245j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f39246k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f39247l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long[] f39248m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f39249n;

    public e(int i10, d dVar, O o10) {
        this.f39236a = dVar;
        int iB = dVar.b();
        boolean z10 = true;
        if (iB != 1 && iB != 2) {
            z10 = false;
        }
        AbstractC0853a.a(z10);
        this.f39238c = d(i10, iB == 2 ? 1667497984 : 1651965952);
        this.f39240e = dVar.a();
        this.f39237b = o10;
        this.f39239d = iB == 2 ? d(i10, 1650720768) : -1;
        this.f39247l = -1L;
        this.f39248m = new long[512];
        this.f39249n = new int[512];
        this.f39241f = dVar.f39233e;
    }

    public static int d(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    public void a() {
        this.f39244i++;
    }

    public void b(long j10, boolean z10) {
        if (this.f39247l == -1) {
            this.f39247l = j10;
        }
        if (z10) {
            if (this.f39246k == this.f39249n.length) {
                long[] jArr = this.f39248m;
                this.f39248m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.f39249n;
                this.f39249n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.f39248m;
            int i10 = this.f39246k;
            jArr2[i10] = j10;
            this.f39249n[i10] = this.f39245j;
            this.f39246k = i10 + 1;
        }
        this.f39245j++;
    }

    public void c() {
        int i10;
        this.f39248m = Arrays.copyOf(this.f39248m, this.f39246k);
        this.f39249n = Arrays.copyOf(this.f39249n, this.f39246k);
        if (!k() || this.f39236a.f39235g == 0 || (i10 = this.f39246k) <= 0) {
            return;
        }
        this.f39241f = i10;
    }

    public final long e(int i10) {
        return (this.f39240e * ((long) i10)) / ((long) this.f39241f);
    }

    public long f() {
        return e(this.f39244i);
    }

    public long g() {
        return e(1);
    }

    public final K h(int i10) {
        return new K(((long) this.f39249n[i10]) * g(), this.f39248m[i10]);
    }

    public J.a i(long j10) {
        if (this.f39246k == 0) {
            return new J.a(new K(0L, this.f39247l));
        }
        int iG = (int) (j10 / g());
        int iG2 = M.g(this.f39249n, iG, true, true);
        if (this.f39249n[iG2] == iG) {
            return new J.a(h(iG2));
        }
        K kH = h(iG2);
        int i10 = iG2 + 1;
        return i10 < this.f39248m.length ? new J.a(kH, h(i10)) : new J.a(kH);
    }

    public boolean j(int i10) {
        return this.f39238c == i10 || this.f39239d == i10;
    }

    public boolean k() {
        return (this.f39238c & 1651965952) == 1651965952;
    }

    public boolean l() {
        return Arrays.binarySearch(this.f39249n, this.f39244i) >= 0;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean m(InterfaceC4337q interfaceC4337q) {
        int i10 = this.f39243h;
        int iA = i10 - this.f39237b.a(interfaceC4337q, i10, false);
        this.f39243h = iA;
        boolean z10 = iA == 0;
        if (z10) {
            if (this.f39242g > 0) {
                this.f39237b.d(f(), l() ? 1 : 0, this.f39242g, 0, null);
            }
            a();
        }
        return z10;
    }

    public void n(int i10) {
        this.f39242g = i10;
        this.f39243h = i10;
    }

    public void o(long j10) {
        if (this.f39246k == 0) {
            this.f39244i = 0;
        } else {
            this.f39244i = this.f39249n[M.h(this.f39248m, j10, true, true)];
        }
    }
}
