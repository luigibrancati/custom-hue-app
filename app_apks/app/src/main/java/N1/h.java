package N1;

import I1.j;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static I1.j a(O1.j jVar, String str, O1.i iVar, int i10, Map map) {
        return new j.b().i(iVar.b(str)).h(iVar.f10812a).g(iVar.f10813b).f(b(jVar, iVar)).b(i10).e(map).a();
    }

    public static String b(O1.j jVar, O1.i iVar) {
        String strK = jVar.k();
        return strK != null ? strK : iVar.b(((O1.b) jVar.f10818c.get(0)).f10762a).toString();
    }
}
