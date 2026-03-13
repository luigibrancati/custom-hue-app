package d3;

import k3.InterfaceC4793c;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final e a(InterfaceC4793c driver, String fileName, int i10, int i11) {
        AbstractC4862t.e(driver, "driver");
        AbstractC4862t.e(fileName, "fileName");
        return new j(driver, fileName, i10, i11);
    }

    public static final e b(InterfaceC4793c driver, String fileName) {
        AbstractC4862t.e(driver, "driver");
        AbstractC4862t.e(fileName, "fileName");
        return new j(driver, fileName);
    }
}
