package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class G3 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I3 f29202a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G3(I3 i32, Handler handler) {
        super(null);
        Objects.requireNonNull(i32);
        this.f29202a = i32;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f29202a.b().set(true);
    }
}
