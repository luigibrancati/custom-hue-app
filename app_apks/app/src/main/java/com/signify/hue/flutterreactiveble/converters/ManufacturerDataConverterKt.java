package com.signify.hue.flutterreactiveble.converters;

import android.util.SparseArray;
import gc.C4179C;
import gc.C4202o;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¨\u0006\u0004"}, d2 = {"extractManufacturerData", "", "manufacturerData", "Landroid/util/SparseArray;", "reactive_ble_mobile_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class ManufacturerDataConverterKt {
    public static final byte[] extractManufacturerData(SparseArray<byte[]> sparseArray) {
        ArrayList arrayList = new ArrayList();
        if (sparseArray != null && sparseArray.size() > 0) {
            int iKeyAt = sparseArray.keyAt(0);
            byte[] bArr = sparseArray.get(iKeyAt);
            arrayList.add(Byte.valueOf((byte) iKeyAt));
            arrayList.add(Byte.valueOf((byte) (iKeyAt >> 8)));
            AbstractC4862t.b(bArr);
            arrayList.addAll(2, C4202o.e(bArr));
        }
        return C4179C.P0(arrayList);
    }
}
