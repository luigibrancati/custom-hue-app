package K6;

import R6.C2074i;
import R6.InterfaceC2072g;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import b7.C2878l;
import com.google.android.gms.tasks.Task;
import java.util.List;
import t6.AbstractC5846d;
import t6.C5843a;
import u6.AbstractC5970p;
import u6.InterfaceC5968n;

/* JADX INFO: renamed from: K6.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1050o extends AbstractC5846d implements InterfaceC2072g {
    public C1050o(Activity activity) {
        super(activity, C1042g.f7548m, (C5843a.d) C5843a.d.f44753a, AbstractC5846d.a.f44766c);
    }

    @Override // R6.InterfaceC2072g
    public final Task a(final List list) {
        return o(AbstractC5970p.a().b(new InterfaceC5968n() { // from class: K6.p
            @Override // u6.InterfaceC5968n
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                ((G) obj).n0(Q.d(list), (C2878l) obj2);
            }
        }).e(2425).a());
    }

    @Override // R6.InterfaceC2072g
    public final Task g(final C2074i c2074i, final PendingIntent pendingIntent) {
        return o(AbstractC5970p.a().b(new InterfaceC5968n() { // from class: K6.q
            @Override // u6.InterfaceC5968n
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                ((G) obj).m0(c2074i, pendingIntent, (C2878l) obj2);
            }
        }).e(2424).a());
    }

    public C1050o(Context context) {
        super(context, C1042g.f7548m, C5843a.d.f44753a, AbstractC5846d.a.f44766c);
    }
}
