package b0;

import c0.AbstractC2926a;
import gc.C4202o;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class r implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f24940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f24941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f24942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f24943d;

    public r() {
        this(0, 1, null);
    }

    public void a() {
        int i10 = this.f24943d;
        Object[] objArr = this.f24942c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f24943d = 0;
        this.f24940a = false;
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public r clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        AbstractC4862t.c(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        r rVar = (r) objClone;
        rVar.f24941b = (long[]) this.f24941b.clone();
        rVar.f24942c = (Object[]) this.f24942c.clone();
        return rVar;
    }

    public Object g(long j10) {
        int iB = AbstractC2926a.b(this.f24941b, this.f24943d, j10);
        if (iB < 0 || this.f24942c[iB] == s.f24944a) {
            return null;
        }
        return this.f24942c[iB];
    }

    public int i(long j10) {
        if (this.f24940a) {
            int i10 = this.f24943d;
            long[] jArr = this.f24941b;
            Object[] objArr = this.f24942c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != s.f24944a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f24940a = false;
            this.f24943d = i11;
        }
        return AbstractC2926a.b(this.f24941b, this.f24943d, j10);
    }

    public long j(int i10) {
        if (!(i10 >= 0 && i10 < this.f24943d)) {
            c0.d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (this.f24940a) {
            int i11 = this.f24943d;
            long[] jArr = this.f24941b;
            Object[] objArr = this.f24942c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != s.f24944a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f24940a = false;
            this.f24943d = i12;
        }
        return this.f24941b[i10];
    }

    public void m(long j10, Object obj) {
        int iB = AbstractC2926a.b(this.f24941b, this.f24943d, j10);
        if (iB >= 0) {
            this.f24942c[iB] = obj;
            return;
        }
        int i10 = ~iB;
        if (i10 < this.f24943d && this.f24942c[i10] == s.f24944a) {
            this.f24941b[i10] = j10;
            this.f24942c[i10] = obj;
            return;
        }
        if (this.f24940a) {
            int i11 = this.f24943d;
            long[] jArr = this.f24941b;
            if (i11 >= jArr.length) {
                Object[] objArr = this.f24942c;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj2 = objArr[i13];
                    if (obj2 != s.f24944a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj2;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f24940a = false;
                this.f24943d = i12;
                i10 = ~AbstractC2926a.b(this.f24941b, i12, j10);
            }
        }
        int i14 = this.f24943d;
        if (i14 >= this.f24941b.length) {
            int iF = AbstractC2926a.f(i14 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.f24941b, iF);
            AbstractC4862t.d(jArrCopyOf, "copyOf(...)");
            this.f24941b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f24942c, iF);
            AbstractC4862t.d(objArrCopyOf, "copyOf(...)");
            this.f24942c = objArrCopyOf;
        }
        int i15 = this.f24943d;
        if (i15 - i10 != 0) {
            long[] jArr2 = this.f24941b;
            int i16 = i10 + 1;
            C4202o.l(jArr2, jArr2, i16, i10, i15);
            Object[] objArr2 = this.f24942c;
            C4202o.m(objArr2, objArr2, i16, i10, this.f24943d);
        }
        this.f24941b[i10] = j10;
        this.f24942c[i10] = obj;
        this.f24943d++;
    }

    public void n(long j10) {
        int iB = AbstractC2926a.b(this.f24941b, this.f24943d, j10);
        if (iB < 0 || this.f24942c[iB] == s.f24944a) {
            return;
        }
        this.f24942c[iB] = s.f24944a;
        this.f24940a = true;
    }

    public void o(int i10) {
        if (this.f24942c[i10] != s.f24944a) {
            this.f24942c[i10] = s.f24944a;
            this.f24940a = true;
        }
    }

    public int p() {
        if (this.f24940a) {
            int i10 = this.f24943d;
            long[] jArr = this.f24941b;
            Object[] objArr = this.f24942c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != s.f24944a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f24940a = false;
            this.f24943d = i11;
        }
        return this.f24943d;
    }

    public Object q(int i10) {
        if (!(i10 >= 0 && i10 < this.f24943d)) {
            c0.d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (this.f24940a) {
            int i11 = this.f24943d;
            long[] jArr = this.f24941b;
            Object[] objArr = this.f24942c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != s.f24944a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f24940a = false;
            this.f24943d = i12;
        }
        return this.f24942c[i10];
    }

    public String toString() {
        if (p() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f24943d * 28);
        sb2.append('{');
        int i10 = this.f24943d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(j(i11));
            sb2.append('=');
            Object objQ = q(i11);
            if (objQ != sb2) {
                sb2.append(objQ);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        AbstractC4862t.d(string, "toString(...)");
        return string;
    }

    public r(int i10) {
        if (i10 == 0) {
            this.f24941b = AbstractC2926a.f25520b;
            this.f24942c = AbstractC2926a.f25521c;
        } else {
            int iF = AbstractC2926a.f(i10);
            this.f24941b = new long[iF];
            this.f24942c = new Object[iF];
        }
    }

    public /* synthetic */ r(int i10, int i11, AbstractC4854k abstractC4854k) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
