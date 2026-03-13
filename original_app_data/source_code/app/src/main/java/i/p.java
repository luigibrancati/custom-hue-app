package i;

import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static U0.h a(U0.h hVar, U0.h hVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i10 = 0;
        while (i10 < hVar.g() + hVar2.g()) {
            Locale localeC = i10 < hVar.g() ? hVar.c(i10) : hVar2.c(i10 - hVar.g());
            if (localeC != null) {
                linkedHashSet.add(localeC);
            }
            i10++;
        }
        return U0.h.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    public static U0.h b(U0.h hVar, U0.h hVar2) {
        return (hVar == null || hVar.f()) ? U0.h.e() : a(hVar, hVar2);
    }
}
