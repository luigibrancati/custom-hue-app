package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3605s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3594q f30239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C3594q f30240c;

    public /* synthetic */ C3605s(String str, AbstractC3611t abstractC3611t) {
        C3594q c3594q = new C3594q();
        this.f30239b = c3594q;
        this.f30240c = c3594q;
        str.getClass();
        this.f30238a = str;
    }

    public final C3605s a(Object obj) {
        C3594q c3594q = new C3594q();
        this.f30240c.f30228b = c3594q;
        this.f30240c = c3594q;
        c3594q.f30227a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f30238a);
        sb2.append('{');
        C3594q c3594q = this.f30239b.f30228b;
        String str = "";
        while (c3594q != null) {
            Object obj = c3594q.f30227a;
            sb2.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r1.length() - 1);
            }
            c3594q = c3594q.f30228b;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }
}
