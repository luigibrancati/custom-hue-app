package com.google.mlkit.vision.barcode.bundled.internal;

import U9.a;
import android.content.Context;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.B;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.N;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbp;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@DynamiteApi
public class ThickBarcodeScannerCreator extends zzbp {
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P
    public N newBarcodeScanner(IObjectWrapper iObjectWrapper, B b10) {
        return new a((Context) ObjectWrapper.unwrap(iObjectWrapper), b10);
    }
}
