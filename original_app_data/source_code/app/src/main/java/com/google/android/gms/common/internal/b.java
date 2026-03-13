package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import s6.C5785d;
import v6.Q;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class b extends AbstractC6157a {
    public static final Parcelable.Creator<b> CREATOR = new Q();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Scope[] f29072o = new Scope[0];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C5785d[] f29073p = new C5785d[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f29077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IBinder f29078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Scope[] f29079f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bundle f29080g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Account f29081h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C5785d[] f29082i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C5785d[] f29083j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f29084k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f29085l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f29086m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f29087n;

    public b(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C5785d[] c5785dArr, C5785d[] c5785dArr2, boolean z10, int i13, boolean z11, String str2) {
        scopeArr = scopeArr == null ? f29072o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        c5785dArr = c5785dArr == null ? f29073p : c5785dArr;
        c5785dArr2 = c5785dArr2 == null ? f29073p : c5785dArr2;
        this.f29074a = i10;
        this.f29075b = i11;
        this.f29076c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f29077d = "com.google.android.gms";
        } else {
            this.f29077d = str;
        }
        if (i10 < 2) {
            this.f29081h = iBinder != null ? AccountAccessor.getAccountBinderSafe(IAccountAccessor.Stub.asInterface(iBinder)) : null;
        } else {
            this.f29078e = iBinder;
            this.f29081h = account;
        }
        this.f29079f = scopeArr;
        this.f29080g = bundle;
        this.f29082i = c5785dArr;
        this.f29083j = c5785dArr2;
        this.f29084k = z10;
        this.f29085l = i13;
        this.f29086m = z11;
        this.f29087n = str2;
    }

    public String d() {
        return this.f29087n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Q.a(this, parcel, i10);
    }
}
