package qe;

import java.text.Normalizer;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h {
    public static final String a(String string) {
        AbstractC4862t.e(string, "string");
        String strNormalize = Normalizer.normalize(string, Normalizer.Form.NFC);
        AbstractC4862t.d(strNormalize, "normalize(...)");
        return strNormalize;
    }
}
