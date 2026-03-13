package X6;

import android.text.TextUtils;

/* JADX INFO: renamed from: X6.f1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2382f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P3 f18816a;

    public C2382f1(P3 p32) {
        this.f18816a = p32;
    }

    public static C2382f1 c(String str) {
        return new C2382f1((TextUtils.isEmpty(str) || str.length() > 1) ? P3.UNINITIALIZED : S3.j(str.charAt(0)));
    }

    public final P3 a() {
        return this.f18816a;
    }

    public final String b() {
        return String.valueOf(S3.m(this.f18816a));
    }
}
