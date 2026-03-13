package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Z3 extends AbstractC3228j4 {
    public Z3(C3174d4 c3174d4, String str, Long l10, boolean z10) {
        super(c3174d4, str, l10, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3228j4
    public final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String str = this.f29514b;
        String string = obj.toString();
        StringBuilder sb2 = new StringBuilder(str.length() + 25 + string.length());
        sb2.append("Invalid long value for ");
        sb2.append(str);
        sb2.append(": ");
        sb2.append(string);
        Log.e("PhenotypeFlag", sb2.toString());
        return null;
    }
}
