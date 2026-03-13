package ma;

import java.util.Map;
import ka.P;
import ma.b;
import na.C5152b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f40257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f40258b;

    public o(C5152b c5152b, X3.a aVar) {
        this.f40257a = c5152b;
        this.f40258b = aVar;
    }

    public P a(String str) {
        b bVar = (b) this.f40257a.get(str);
        if (bVar != null) {
            return bVar.a();
        }
        synchronized (this.f40257a) {
            try {
                b bVar2 = (b) this.f40257a.get(str);
                if (bVar2 != null) {
                    return bVar2.a();
                }
                b bVarBuild = ((b.a) this.f40258b.get()).a(str).build();
                P pA = bVarBuild.a();
                this.f40257a.put(str, bVarBuild);
                return pA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
