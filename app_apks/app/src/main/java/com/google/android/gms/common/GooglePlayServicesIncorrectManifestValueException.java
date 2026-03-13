package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@KeepName
public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int i10) {
        int i11 = a.f29014a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 104 + String.valueOf(i10).length() + 194);
        sb2.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
        sb2.append(i11);
        sb2.append(" but found ");
        sb2.append(i10);
        sb2.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        super(i10, sb2.toString());
    }
}
