package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.f2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3397f2 extends AbstractC3432m2 {
    public C3397f2() {
        super(null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3432m2
    public final void a() {
        if (!j()) {
            for (int i10 = 0; i10 < c(); i10++) {
                ((W0) ((C3402g2) g(i10)).a()).i();
            }
            Iterator it = d().iterator();
            while (it.hasNext()) {
                ((W0) ((Map.Entry) it.next()).getKey()).i();
            }
        }
        super.a();
    }
}
