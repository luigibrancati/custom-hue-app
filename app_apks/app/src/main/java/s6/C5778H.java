package s6;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: renamed from: s6.H, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5778H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f44135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f44136c;

    public /* synthetic */ C5778H(String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, byte[] bArr) {
        this.f44134a = str;
        this.f44135b = z10;
        this.f44136c = z13;
    }

    public final boolean a() {
        return this.f44136c;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [android.os.IBinder, com.google.android.gms.dynamic.IObjectWrapper] */
    public final C5771A b(Context context) {
        return new C5771A(this.f44134a, this.f44135b, false, ObjectWrapper.wrap(context), false, true, false);
    }
}
