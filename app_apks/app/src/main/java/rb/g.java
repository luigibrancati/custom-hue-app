package rb;

import android.view.MotionEvent;
import com.google.android.filament.View;
import gc.C4179C;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import zb.AbstractC6555a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f43953c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f43954d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f43955e = g.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f43956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f43957b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public g(View view) {
        AbstractC4862t.e(view, "view");
        this.f43956a = view;
        this.f43957b = new ArrayList();
    }

    public static final int f(h a10, h b10) {
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        return Float.compare(a10.a(), b10.a());
    }

    public static final int g(vc.p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    public final void c(C5694c collider) {
        AbstractC4862t.e(collider, "collider");
        this.f43957b.add(collider);
    }

    public final List d(MotionEvent motionEvent) {
        AbstractC4862t.e(motionEvent, "motionEvent");
        return e(Cb.f.a(this.f43956a, motionEvent));
    }

    public final List e(cb.h ray) {
        AbstractC4862t.e(ray, "ray");
        List<C5694c> list = this.f43957b;
        ArrayList arrayList = new ArrayList();
        for (C5694c c5694c : list) {
            h hVar = null;
            h hVar2 = new h(null, 1, null);
            AbstractC5695d abstractC5695dB = c5694c.b();
            if (abstractC5695dB == null || !abstractC5695dB.d(AbstractC6555a.o(ray), hVar2)) {
                hVar2 = null;
            }
            if (hVar2 != null) {
                Ab.f node = c5694c.f43943a;
                AbstractC4862t.d(node, "node");
                hVar2.g(node);
                if (hVar2.f().c0()) {
                    hVar = hVar2;
                }
            }
            if (hVar != null) {
                arrayList.add(hVar);
            }
        }
        final vc.p pVar = new vc.p() { // from class: rb.e
            @Override // vc.p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(g.f((h) obj, (h) obj2));
            }
        };
        return C4179C.J0(arrayList, new Comparator() { // from class: rb.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return g.g(pVar, obj, obj2);
            }
        });
    }

    public final void h(C5694c collider) {
        AbstractC4862t.e(collider, "collider");
        this.f43957b.remove(collider);
    }
}
