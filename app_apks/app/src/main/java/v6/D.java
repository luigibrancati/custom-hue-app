package v6;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.Objects;
import s6.C5783b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class D extends M {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f45780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f45781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f45782f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(com.google.android.gms.common.internal.a aVar, int i10, Bundle bundle) {
        super(aVar, Boolean.TRUE);
        Objects.requireNonNull(aVar);
        this.f45782f = aVar;
        this.f45780d = i10;
        this.f45781e = bundle;
    }

    @Override // v6.M
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        int i10 = this.f45780d;
        if (i10 != 0) {
            this.f45782f.W(1, null);
            Bundle bundle = this.f45781e;
            f(new C5783b(i10, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (e()) {
                return;
            }
            this.f45782f.W(1, null);
            f(new C5783b(8, null));
        }
    }

    public abstract boolean e();

    public abstract void f(C5783b c5783b);
}
