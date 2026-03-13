package X6;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class A2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f18148d;

    public A2(String str, String str2, Bundle bundle, long j10) {
        this.f18145a = str;
        this.f18146b = str2;
        this.f18148d = bundle;
        this.f18147c = j10;
    }

    public static A2 a(I i10) {
        return new A2(i10.f18343a, i10.f18345c, i10.f18344b.l(), i10.f18346d);
    }

    public final I b() {
        return new I(this.f18145a, new G(new Bundle(this.f18148d)), this.f18146b, this.f18147c);
    }

    public final String toString() {
        String str = this.f18146b;
        String string = this.f18148d.toString();
        int length = String.valueOf(str).length();
        String str2 = this.f18145a;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
        sb2.append("origin=");
        sb2.append(str);
        sb2.append(",name=");
        sb2.append(str2);
        sb2.append(",params=");
        sb2.append(string);
        return sb2.toString();
    }
}
