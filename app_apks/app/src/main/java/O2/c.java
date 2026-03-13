package O2;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10868f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10870h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f10877o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10863a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10864b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f10865c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f10866d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f10867e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10869g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f10871i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10872j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10873k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10874l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10875m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10876n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10878p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f10879q = false;

    public static int B(int i10, String str, String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    public c A(boolean z10) {
        this.f10873k = z10 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f10871i) {
            return this.f10870h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f10879q;
    }

    public int c() {
        if (this.f10869g) {
            return this.f10868f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f10867e;
    }

    public float e() {
        return this.f10877o;
    }

    public int f() {
        return this.f10876n;
    }

    public int g() {
        return this.f10878p;
    }

    public int h(String str, String str2, Set set, String str3) {
        if (this.f10863a.isEmpty() && this.f10864b.isEmpty() && this.f10865c.isEmpty() && this.f10866d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iB = B(B(B(0, this.f10863a, str, 1073741824), this.f10864b, str2, 2), this.f10866d, str3, 4);
        if (iB == -1 || !set.containsAll(this.f10865c)) {
            return 0;
        }
        return iB + (this.f10865c.size() * 4);
    }

    public int i() {
        int i10 = this.f10874l;
        if (i10 == -1 && this.f10875m == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f10875m == 1 ? 2 : 0);
    }

    public boolean j() {
        return this.f10871i;
    }

    public boolean k() {
        return this.f10869g;
    }

    public boolean l() {
        return this.f10872j == 1;
    }

    public boolean m() {
        return this.f10873k == 1;
    }

    public c n(int i10) {
        this.f10870h = i10;
        this.f10871i = true;
        return this;
    }

    public c o(boolean z10) {
        this.f10874l = z10 ? 1 : 0;
        return this;
    }

    public c p(boolean z10) {
        this.f10879q = z10;
        return this;
    }

    public c q(int i10) {
        this.f10868f = i10;
        this.f10869g = true;
        return this;
    }

    public c r(String str) {
        this.f10867e = str == null ? null : J7.c.e(str);
        return this;
    }

    public c s(float f10) {
        this.f10877o = f10;
        return this;
    }

    public c t(int i10) {
        this.f10876n = i10;
        return this;
    }

    public c u(boolean z10) {
        this.f10875m = z10 ? 1 : 0;
        return this;
    }

    public c v(int i10) {
        this.f10878p = i10;
        return this;
    }

    public void w(String[] strArr) {
        this.f10865c = new HashSet(Arrays.asList(strArr));
    }

    public void x(String str) {
        this.f10863a = str;
    }

    public void y(String str) {
        this.f10864b = str;
    }

    public void z(String str) {
        this.f10866d = str;
    }
}
