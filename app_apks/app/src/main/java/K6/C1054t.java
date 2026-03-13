package K6;

import R6.C2077l;
import android.app.Activity;
import b7.C2878l;
import com.google.android.gms.tasks.Task;
import t6.AbstractC5846d;
import t6.C5843a;
import u6.AbstractC5970p;
import u6.InterfaceC5968n;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: K6.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1054t extends AbstractC5846d implements R6.q {
    public C1054t(Activity activity) {
        super(activity, C1042g.f7548m, (C5843a.d) C5843a.d.f44753a, AbstractC5846d.a.f44766c);
    }

    @Override // R6.q
    public final Task h(final C2077l c2077l) {
        return l(AbstractC5970p.a().b(new InterfaceC5968n() { // from class: K6.u
            @Override // u6.InterfaceC5968n
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                C2878l c2878l = (C2878l) obj2;
                G g10 = (G) obj;
                C2077l c2077l2 = c2077l;
                AbstractC6056k.b(c2077l2 != null, "locationSettingsRequest can't be null");
                ((o0) g10.C()).x1(c2077l2, new BinderC1057w(c2878l), null);
            }
        }).e(2426).a());
    }
}
