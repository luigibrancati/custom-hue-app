package b7;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u6.AbstractC5956g;
import u6.InterfaceC5958h;

/* JADX INFO: renamed from: b7.L, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2863L extends AbstractC5956g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f25403b;

    public C2863L(InterfaceC5958h interfaceC5958h) {
        super(interfaceC5958h);
        this.f25403b = new ArrayList();
        this.f45179a.a("TaskOnStopCallback", this);
    }

    public static C2863L l(Activity activity) {
        C2863L c2863l;
        InterfaceC5958h interfaceC5958hC = AbstractC5956g.c(activity);
        synchronized (interfaceC5958hC) {
            try {
                c2863l = (C2863L) interfaceC5958hC.b("TaskOnStopCallback", C2863L.class);
                if (c2863l == null) {
                    c2863l = new C2863L(interfaceC5958hC);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2863l;
    }

    @Override // u6.AbstractC5956g
    public final void k() {
        List list = this.f25403b;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    InterfaceC2858G interfaceC2858G = (InterfaceC2858G) ((WeakReference) it.next()).get();
                    if (interfaceC2858G != null) {
                        interfaceC2858G.zzb();
                    }
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(InterfaceC2858G interfaceC2858G) {
        List list = this.f25403b;
        synchronized (list) {
            list.add(new WeakReference(interfaceC2858G));
        }
    }
}
