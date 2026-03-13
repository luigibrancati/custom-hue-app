package X6;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class U6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.X2 f18603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f18605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EnumC2346a5 f18606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f18607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f18608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f18609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f18610i;

    public /* synthetic */ U6(long j10, com.google.android.gms.internal.measurement.X2 x22, String str, Map map, EnumC2346a5 enumC2346a5, long j11, long j12, long j13, int i10, byte[] bArr) {
        this.f18602a = j10;
        this.f18603b = x22;
        this.f18604c = str;
        this.f18605d = map;
        this.f18606e = enumC2346a5;
        this.f18607f = j11;
        this.f18608g = j12;
        this.f18609h = j13;
        this.f18610i = i10;
    }

    public final D6 a() {
        return new D6(this.f18604c, this.f18605d, this.f18606e, null);
    }

    public final C2522w6 b() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f18605d.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        long j10 = this.f18602a;
        com.google.android.gms.internal.measurement.X2 x22 = this.f18603b;
        String str = this.f18604c;
        EnumC2346a5 enumC2346a5 = this.f18606e;
        return new C2522w6(j10, x22.b(), str, bundle, enumC2346a5.zza(), this.f18608g, "");
    }

    public final long c() {
        return this.f18602a;
    }

    public final com.google.android.gms.internal.measurement.X2 d() {
        return this.f18603b;
    }

    public final String e() {
        return this.f18604c;
    }

    public final EnumC2346a5 f() {
        return this.f18606e;
    }

    public final long g() {
        return this.f18607f;
    }

    public final long h() {
        return this.f18609h;
    }

    public final int i() {
        return this.f18610i;
    }
}
