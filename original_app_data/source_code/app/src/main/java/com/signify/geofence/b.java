package com.signify.geofence;

import android.content.Context;
import android.content.SharedPreferences;
import gc.C4179C;
import gc.C4206t;
import gc.y;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import u9.e;
import vc.l;
import za.k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f32463c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f32464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f32465b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: com.signify.geofence.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/signify/geofence/b$b", "LB9/a;", "", "Lza/k;", "geofence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0388b extends B9.a<List<? extends k>> {
    }

    public b(Context context) {
        AbstractC4862t.e(context, "context");
        this.f32464a = new e();
        SharedPreferences sharedPreferences = context.getSharedPreferences(c.INSTANCE.d(), 0);
        AbstractC4862t.d(sharedPreferences, "getSharedPreferences(...)");
        this.f32465b = sharedPreferences;
    }

    public static final boolean c(String str, k params) {
        AbstractC4862t.e(params, "params");
        return AbstractC4862t.a(params.d(), str);
    }

    public final void b(final String regionId) {
        AbstractC4862t.e(regionId, "regionId");
        List listX0 = C4179C.X0(d());
        y.I(listX0, new l() { // from class: za.l
            @Override // vc.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(com.signify.geofence.b.c(regionId, (k) obj));
            }
        });
        f(listX0);
    }

    public final List d() {
        List list = (List) this.f32464a.j(this.f32465b.getString("geofence_params_list", null), new C0388b().d());
        return list == null ? C4206t.k() : list;
    }

    public final void e(k geofenceParams) {
        AbstractC4862t.e(geofenceParams, "geofenceParams");
        List listX0 = C4179C.X0(d());
        Iterator it = listX0.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            } else if (AbstractC4862t.a(((k) it.next()).d(), geofenceParams.d())) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            listX0.add(geofenceParams);
        } else {
            listX0.set(i10, geofenceParams);
        }
        f(listX0);
    }

    public final void f(List list) {
        this.f32465b.edit().putString("geofence_params_list", this.f32464a.q(list)).apply();
    }
}
