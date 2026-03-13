package t9;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import o8.C5233c;
import o8.InterfaceC5234d;
import o8.g;
import o8.i;

/* JADX INFO: renamed from: t9.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C5860b implements i {
    public static /* synthetic */ Object b(String str, C5233c c5233c, InterfaceC5234d interfaceC5234d) {
        try {
            AbstractC5861c.b(str);
            return c5233c.h().a(interfaceC5234d);
        } finally {
            AbstractC5861c.a();
        }
    }

    @Override // o8.i
    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final C5233c c5233cR : componentRegistrar.getComponents()) {
            final String strI = c5233cR.i();
            if (strI != null) {
                c5233cR = c5233cR.r(new g() { // from class: t9.a
                    @Override // o8.g
                    public final Object a(InterfaceC5234d interfaceC5234d) {
                        return C5860b.b(strI, c5233cR, interfaceC5234d);
                    }
                });
            }
            arrayList.add(c5233cR);
        }
        return arrayList;
    }
}
