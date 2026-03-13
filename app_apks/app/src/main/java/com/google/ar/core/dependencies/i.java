package com.google.ar.core.dependencies;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i extends d implements j {
    public i() {
        super("com.google.android.play.core.install.protocol.IInstallServiceCallback");
    }

    @Override // com.google.ar.core.dependencies.d
    public final boolean a(int i10, Parcel parcel) {
        if (i10 == 1) {
            Bundle bundle = (Bundle) e.a(parcel, Bundle.CREATOR);
            e.d(parcel);
            b(bundle);
        } else if (i10 == 2) {
            Bundle bundle2 = (Bundle) e.a(parcel, Bundle.CREATOR);
            e.d(parcel);
            c(bundle2);
        } else {
            if (i10 != 3) {
                return false;
            }
            e.d(parcel);
        }
        return true;
    }
}
