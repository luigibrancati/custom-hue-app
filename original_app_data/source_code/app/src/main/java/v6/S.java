package v6;

import android.content.ComponentName;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComponentName f45799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f45800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f45801e;

    public S(String str, String str2, int i10, boolean z10) {
        AbstractC6056k.f(str);
        this.f45797a = str;
        AbstractC6056k.f(str2);
        this.f45798b = str2;
        this.f45799c = null;
        this.f45800d = 4225;
        this.f45801e = z10;
    }

    public final String a() {
        return this.f45797a;
    }

    public final String b() {
        return this.f45798b;
    }

    public final ComponentName c() {
        return this.f45799c;
    }

    public final boolean d() {
        return this.f45801e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s10 = (S) obj;
        return AbstractC6055j.a(this.f45797a, s10.f45797a) && AbstractC6055j.a(this.f45798b, s10.f45798b) && AbstractC6055j.a(this.f45799c, s10.f45799c) && this.f45801e == s10.f45801e;
    }

    public final int hashCode() {
        return AbstractC6055j.b(this.f45797a, this.f45798b, this.f45799c, 4225, Boolean.valueOf(this.f45801e));
    }

    public final String toString() {
        String str = this.f45797a;
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.f45799c;
        AbstractC6056k.l(componentName);
        return componentName.flattenToString();
    }
}
