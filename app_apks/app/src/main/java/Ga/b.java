package Ga;

import android.os.Bundle;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static final String a(Bundle bundle) {
        AbstractC4862t.e(bundle, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (String str : bundle.keySet()) {
            sb2.append(str + ": " + bundle.get(str) + ',');
        }
        sb2.append("]");
        String string = sb2.toString();
        AbstractC4862t.d(string, "toString(...)");
        return string;
    }
}
