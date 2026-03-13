package D2;

import G1.AbstractC0853a;
import G1.C;
import i2.AbstractC4338s;
import i2.InterfaceC4337q;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f2168a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f2169b = new C(new byte[65025], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2170c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2172e;

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        this.f2171d = 0;
        do {
            int i13 = this.f2171d;
            int i14 = i10 + i13;
            f fVar = this.f2168a;
            if (i14 >= fVar.f2179g) {
                break;
            }
            int[] iArr = fVar.f2182j;
            this.f2171d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public f b() {
        return this.f2168a;
    }

    public C c() {
        return this.f2169b;
    }

    public boolean d(InterfaceC4337q interfaceC4337q) {
        int i10;
        AbstractC0853a.g(interfaceC4337q != null);
        if (this.f2172e) {
            this.f2172e = false;
            this.f2169b.W(0);
        }
        while (!this.f2172e) {
            if (this.f2170c < 0) {
                if (!this.f2168a.c(interfaceC4337q) || !this.f2168a.a(interfaceC4337q, true)) {
                    return false;
                }
                f fVar = this.f2168a;
                int iA = fVar.f2180h;
                if ((fVar.f2174b & 1) == 1 && this.f2169b.j() == 0) {
                    iA += a(0);
                    i10 = this.f2171d;
                } else {
                    i10 = 0;
                }
                if (!AbstractC4338s.f(interfaceC4337q, iA)) {
                    return false;
                }
                this.f2170c = i10;
            }
            int iA2 = a(this.f2170c);
            int i11 = this.f2170c + this.f2171d;
            if (iA2 > 0) {
                C c10 = this.f2169b;
                c10.d(c10.j() + iA2);
                if (!AbstractC4338s.e(interfaceC4337q, this.f2169b.f(), this.f2169b.j(), iA2)) {
                    return false;
                }
                C c11 = this.f2169b;
                c11.Z(c11.j() + iA2);
                this.f2172e = this.f2168a.f2182j[i11 + (-1)] != 255;
            }
            if (i11 == this.f2168a.f2179g) {
                i11 = -1;
            }
            this.f2170c = i11;
        }
        return true;
    }

    public void e() {
        this.f2168a.b();
        this.f2169b.W(0);
        this.f2170c = -1;
        this.f2172e = false;
    }

    public void f() {
        if (this.f2169b.f().length == 65025) {
            return;
        }
        C c10 = this.f2169b;
        c10.Y(Arrays.copyOf(c10.f(), Math.max(65025, this.f2169b.j())), this.f2169b.j());
    }
}
