package com.google.firebase.perf.util;

import android.os.Bundle;
import b9.C2898a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2898a f31853b = C2898a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f31854a;

    public f() {
        this(new Bundle());
    }

    public boolean a(String str) {
        return str != null && this.f31854a.containsKey(str);
    }

    public g b(String str) {
        if (!a(str)) {
            return g.a();
        }
        try {
            return g.b((Boolean) this.f31854a.get(str));
        } catch (ClassCastException e10) {
            f31853b.b("Metadata key %s contains type other than boolean: %s", str, e10.getMessage());
            return g.a();
        }
    }

    public g c(String str) {
        if (!a(str)) {
            return g.a();
        }
        Object obj = this.f31854a.get(str);
        if (obj == null) {
            return g.a();
        }
        if (obj instanceof Float) {
            return g.e(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return g.e((Double) obj);
        }
        f31853b.b("Metadata key %s contains type other than double: %s", str);
        return g.a();
    }

    public final g d(String str) {
        if (!a(str)) {
            return g.a();
        }
        try {
            return g.b((Integer) this.f31854a.get(str));
        } catch (ClassCastException e10) {
            f31853b.b("Metadata key %s contains type other than int: %s", str, e10.getMessage());
            return g.a();
        }
    }

    public g e(String str) {
        return d(str).d() ? g.e(Long.valueOf(((Integer) r0.c()).intValue())) : g.a();
    }

    public f(Bundle bundle) {
        this.f31854a = (Bundle) bundle.clone();
    }
}
