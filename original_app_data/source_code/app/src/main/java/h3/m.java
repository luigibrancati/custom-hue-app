package h3;

import k3.InterfaceC4794d;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class m {
    public static final int a(InterfaceC4794d interfaceC4794d, String name) {
        AbstractC4862t.e(interfaceC4794d, "<this>");
        AbstractC4862t.e(name, "name");
        int iB = k.b(interfaceC4794d, name);
        if (iB >= 0) {
            return iB;
        }
        int iB2 = k.b(interfaceC4794d, '`' + name + '`');
        return iB2 >= 0 ? iB2 : b(interfaceC4794d, name);
    }

    public static final int b(InterfaceC4794d interfaceC4794d, String str) {
        return -1;
    }
}
