package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class S3 extends ContentObserver {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S3(U3 u32, Handler handler) {
        super(null);
        Objects.requireNonNull(u32);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        AbstractC3228j4.c();
    }
}
