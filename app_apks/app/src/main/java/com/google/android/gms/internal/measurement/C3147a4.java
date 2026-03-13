package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3147a4 extends AbstractC3228j4 {
    public C3147a4(C3174d4 c3174d4, String str, Boolean bool, boolean z10) {
        super(c3174d4, str, bool, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3228j4
    public final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (D3.f29157c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (D3.f29158d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String str2 = this.f29514b;
        String string = obj.toString();
        StringBuilder sb2 = new StringBuilder(str2.length() + 28 + string.length());
        sb2.append("Invalid boolean value for ");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(string);
        Log.e("PhenotypeFlag", sb2.toString());
        return null;
    }
}
