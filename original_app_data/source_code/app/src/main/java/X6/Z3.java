package X6;

import android.content.Context;
import android.os.Bundle;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f18670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.A0 f18672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f18674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f18675g;

    public Z3(Context context, com.google.android.gms.internal.measurement.A0 a02, Long l10) {
        this.f18673e = true;
        AbstractC6056k.l(context);
        Context applicationContext = context.getApplicationContext();
        AbstractC6056k.l(applicationContext);
        this.f18669a = applicationContext;
        this.f18674f = l10;
        if (a02 != null) {
            this.f18672d = a02;
            this.f18673e = a02.f29138c;
            this.f18671c = a02.f29137b;
            this.f18675g = a02.f29140e;
            Bundle bundle = a02.f29139d;
            if (bundle != null) {
                this.f18670b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
