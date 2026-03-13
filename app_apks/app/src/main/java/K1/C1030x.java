package K1;

import G1.AbstractC0853a;
import a2.InterfaceC2611D;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;

/* JADX INFO: renamed from: K1.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1030x extends D1.x {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f7345j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f7346k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f7347l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final D1.o f7348m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f7349n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC2611D.b f7350o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f7351p;

    public C1030x(int i10, Throwable th, int i11) {
        this(i10, th, null, i11, null, -1, null, 4, null, false);
    }

    public static C1030x b(Throwable th, String str, int i10, D1.o oVar, int i11, InterfaceC2611D.b bVar, boolean z10, int i12) {
        if (oVar == null) {
            i11 = 4;
        }
        return new C1030x(1, th, null, i12, str, i10, oVar, i11, bVar, z10);
    }

    public static C1030x c(IOException iOException, int i10) {
        return new C1030x(0, iOException, i10);
    }

    public static C1030x d(RuntimeException runtimeException, int i10) {
        return new C1030x(2, runtimeException, i10);
    }

    public static String e(int i10, String str, String str2, int i11, D1.o oVar, int i12) {
        String str3;
        if (i10 == 0) {
            str3 = "Source error";
        } else if (i10 != 1) {
            str3 = i10 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i11 + ", format=" + oVar + ", format_supported=" + G1.M.c0(i12);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    public C1030x a(InterfaceC2611D.b bVar) {
        return new C1030x((String) G1.M.i(getMessage()), getCause(), this.f2113a, this.f7345j, this.f7346k, this.f7347l, this.f7348m, this.f7349n, bVar, this.f2114b, this.f7351p);
    }

    public C1030x(int i10, Throwable th, String str, int i11, String str2, int i12, D1.o oVar, int i13, InterfaceC2611D.b bVar, boolean z10) {
        this(e(i10, str, str2, i12, oVar, i13), th, i11, i10, str2, i12, oVar, i13, bVar, SystemClock.elapsedRealtime(), z10);
    }

    public C1030x(String str, Throwable th, int i10, int i11, String str2, int i12, D1.o oVar, int i13, InterfaceC2611D.b bVar, long j10, boolean z10) {
        super(str, th, i10, Bundle.EMPTY, j10);
        AbstractC0853a.a(!z10 || i11 == 1);
        AbstractC0853a.a(th != null || i11 == 3);
        this.f7345j = i11;
        this.f7346k = str2;
        this.f7347l = i12;
        this.f7348m = oVar;
        this.f7349n = i13;
        this.f7350o = bVar;
        this.f7351p = z10;
    }
}
