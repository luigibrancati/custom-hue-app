package Z;

import Z.d;
import android.hardware.camera2.params.SessionConfiguration;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20076a;

    public a(List list) {
        this.f20076a = list;
    }

    @Override // Z.d
    public d.a a(SessionConfiguration sessionConfiguration) {
        Iterator it = this.f20076a.iterator();
        while (it.hasNext()) {
            d.a aVarA = ((d) it.next()).a(sessionConfiguration);
            if (aVarA.a() != 0) {
                return aVarA;
            }
        }
        return new d.a(0, 0, 0L);
    }
}
