package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import c6.d;
import c6.h;
import c6.m;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public class CctBackendFactory implements d {
    @Override // c6.d
    public m create(h hVar) {
        return new Z5.d(hVar.b(), hVar.e(), hVar.d());
    }
}
