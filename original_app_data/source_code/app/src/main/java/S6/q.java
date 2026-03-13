package S6;

import T6.InterfaceC2231d;
import T6.M;
import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.GoogleMapOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s6.C5786e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends E6.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ViewGroup f15407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f15408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public E6.c f15409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final GoogleMapOptions f15410h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f15411i = new ArrayList();

    public q(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.f15407e = viewGroup;
        this.f15408f = context;
        this.f15410h = googleMapOptions;
    }

    @Override // E6.a
    public final void a(E6.c cVar) {
        this.f15409g = cVar;
        r();
    }

    public final void q(g gVar) {
        if (b() != null) {
            ((p) b()).a(gVar);
        } else {
            this.f15411i.add(gVar);
        }
    }

    public final void r() {
        if (this.f15409g == null || b() != null) {
            return;
        }
        try {
            Context context = this.f15408f;
            f.a(context);
            InterfaceC2231d interfaceC2231dK5 = M.a(context, null).K5(ObjectWrapper.wrap(context), this.f15410h);
            if (interfaceC2231dK5 == null) {
                return;
            }
            this.f15409g.a(new p(this.f15407e, interfaceC2231dK5));
            List list = this.f15411i;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((p) b()).a((g) it.next());
            }
            list.clear();
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        } catch (C5786e unused) {
        }
    }
}
