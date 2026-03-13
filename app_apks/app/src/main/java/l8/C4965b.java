package l8;

import K7.AbstractC1085z;
import X6.AbstractC2354b5;
import X6.O3;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C3323u1;
import h8.C4284b;
import h8.C4288f;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import l8.InterfaceC4964a;
import m8.AbstractC5027b;
import m8.C5029d;
import m8.C5031f;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: l8.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C4965b implements InterfaceC4964a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile InterfaceC4964a f39920c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W6.a f39921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f39922b;

    /* JADX INFO: renamed from: l8.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements InterfaceC4964a.InterfaceC0523a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f39923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C4965b f39924b;

        public a(C4965b c4965b, String str) {
            this.f39923a = str;
            Objects.requireNonNull(c4965b);
            this.f39924b = c4965b;
        }
    }

    public C4965b(W6.a aVar) {
        AbstractC6056k.l(aVar);
        this.f39921a = aVar;
        this.f39922b = new ConcurrentHashMap();
    }

    public static InterfaceC4964a h(C4288f c4288f, Context context, L8.d dVar) {
        AbstractC6056k.l(c4288f);
        AbstractC6056k.l(context);
        AbstractC6056k.l(dVar);
        AbstractC6056k.l(context.getApplicationContext());
        if (f39920c == null) {
            synchronized (C4965b.class) {
                try {
                    if (f39920c == null) {
                        Bundle bundle = new Bundle(1);
                        if (c4288f.y()) {
                            dVar.a(C4284b.class, new Executor() { // from class: l8.d
                                @Override // java.util.concurrent.Executor
                                public final /* synthetic */ void execute(Runnable runnable) {
                                    runnable.run();
                                }
                            }, new L8.b() { // from class: l8.c
                                @Override // L8.b
                                public final /* synthetic */ void a(L8.a aVar) {
                                    C4965b.i(aVar);
                                }
                            });
                            bundle.putBoolean("dataCollectionDefaultEnabled", c4288f.x());
                        }
                        f39920c = new C4965b(C3323u1.s(context, bundle).t());
                    }
                } finally {
                }
            }
        }
        return f39920c;
    }

    public static /* synthetic */ void i(L8.a aVar) {
        boolean z10 = ((C4284b) aVar.a()).f36289a;
        synchronized (C4965b.class) {
            ((C4965b) AbstractC6056k.l(f39920c)).f39921a.i(z10);
        }
    }

    @Override // l8.InterfaceC4964a
    public void a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (AbstractC5027b.a(str) && AbstractC5027b.b(str2, bundle) && AbstractC5027b.e(str, str2, bundle)) {
            if ("clx".equals(str) && Constants.FIREBASE_APPLICATION_EXCEPTION.equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f39921a.e(str, str2, bundle);
        }
    }

    @Override // l8.InterfaceC4964a
    public void b(String str, String str2, Object obj) {
        if (AbstractC5027b.a(str) && AbstractC5027b.d(str, str2)) {
            this.f39921a.h(str, str2, obj);
        }
    }

    @Override // l8.InterfaceC4964a
    public Map c(boolean z10) {
        return this.f39921a.d(null, null, z10);
    }

    @Override // l8.InterfaceC4964a
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || AbstractC5027b.b(str2, bundle)) {
            this.f39921a.a(str, str2, bundle);
        }
    }

    @Override // l8.InterfaceC4964a
    public void d(InterfaceC4964a.c cVar) {
        String str;
        AbstractC1085z abstractC1085z = AbstractC5027b.f40202a;
        if (cVar == null || (str = cVar.f39905a) == null || str.isEmpty()) {
            return;
        }
        Object obj = cVar.f39907c;
        if ((obj == null || AbstractC2354b5.b(obj) != null) && AbstractC5027b.a(str) && AbstractC5027b.d(str, cVar.f39906b)) {
            String str2 = cVar.f39915k;
            if (str2 == null || (AbstractC5027b.b(str2, cVar.f39916l) && AbstractC5027b.e(str, cVar.f39915k, cVar.f39916l))) {
                String str3 = cVar.f39912h;
                if (str3 == null || (AbstractC5027b.b(str3, cVar.f39913i) && AbstractC5027b.e(str, cVar.f39912h, cVar.f39913i))) {
                    String str4 = cVar.f39910f;
                    if (str4 == null || (AbstractC5027b.b(str4, cVar.f39911g) && AbstractC5027b.e(str, cVar.f39910f, cVar.f39911g))) {
                        W6.a aVar = this.f39921a;
                        Bundle bundle = new Bundle();
                        String str5 = cVar.f39905a;
                        if (str5 != null) {
                            bundle.putString("origin", str5);
                        }
                        String str6 = cVar.f39906b;
                        if (str6 != null) {
                            bundle.putString("name", str6);
                        }
                        Object obj2 = cVar.f39907c;
                        if (obj2 != null) {
                            O3.a(bundle, obj2);
                        }
                        String str7 = cVar.f39908d;
                        if (str7 != null) {
                            bundle.putString("trigger_event_name", str7);
                        }
                        bundle.putLong("trigger_timeout", cVar.f39909e);
                        String str8 = cVar.f39910f;
                        if (str8 != null) {
                            bundle.putString("timed_out_event_name", str8);
                        }
                        Bundle bundle2 = cVar.f39911g;
                        if (bundle2 != null) {
                            bundle.putBundle("timed_out_event_params", bundle2);
                        }
                        String str9 = cVar.f39912h;
                        if (str9 != null) {
                            bundle.putString("triggered_event_name", str9);
                        }
                        Bundle bundle3 = cVar.f39913i;
                        if (bundle3 != null) {
                            bundle.putBundle("triggered_event_params", bundle3);
                        }
                        bundle.putLong("time_to_live", cVar.f39914j);
                        String str10 = cVar.f39915k;
                        if (str10 != null) {
                            bundle.putString("expired_event_name", str10);
                        }
                        Bundle bundle4 = cVar.f39916l;
                        if (bundle4 != null) {
                            bundle.putBundle("expired_event_params", bundle4);
                        }
                        bundle.putLong("creation_timestamp", cVar.f39917m);
                        bundle.putBoolean("active", cVar.f39918n);
                        bundle.putLong("triggered_timestamp", cVar.f39919o);
                        aVar.g(bundle);
                    }
                }
            }
        }
    }

    @Override // l8.InterfaceC4964a
    public int e(String str) {
        return this.f39921a.c(str);
    }

    @Override // l8.InterfaceC4964a
    public List f(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.f39921a.b(str, str2)) {
            AbstractC1085z abstractC1085z = AbstractC5027b.f40202a;
            AbstractC6056k.l(bundle);
            InterfaceC4964a.c cVar = new InterfaceC4964a.c();
            cVar.f39905a = (String) AbstractC6056k.l((String) O3.b(bundle, "origin", String.class, null));
            cVar.f39906b = (String) AbstractC6056k.l((String) O3.b(bundle, "name", String.class, null));
            cVar.f39907c = O3.b(bundle, "value", Object.class, null);
            cVar.f39908d = (String) O3.b(bundle, "trigger_event_name", String.class, null);
            cVar.f39909e = ((Long) O3.b(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            cVar.f39910f = (String) O3.b(bundle, "timed_out_event_name", String.class, null);
            cVar.f39911g = (Bundle) O3.b(bundle, "timed_out_event_params", Bundle.class, null);
            cVar.f39912h = (String) O3.b(bundle, "triggered_event_name", String.class, null);
            cVar.f39913i = (Bundle) O3.b(bundle, "triggered_event_params", Bundle.class, null);
            cVar.f39914j = ((Long) O3.b(bundle, "time_to_live", Long.class, 0L)).longValue();
            cVar.f39915k = (String) O3.b(bundle, "expired_event_name", String.class, null);
            cVar.f39916l = (Bundle) O3.b(bundle, "expired_event_params", Bundle.class, null);
            cVar.f39918n = ((Boolean) O3.b(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            cVar.f39917m = ((Long) O3.b(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            cVar.f39919o = ((Long) O3.b(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(cVar);
        }
        return arrayList;
    }

    @Override // l8.InterfaceC4964a
    public InterfaceC4964a.InterfaceC0523a g(String str, InterfaceC4964a.b bVar) {
        AbstractC6056k.l(bVar);
        if (AbstractC5027b.a(str) && !j(str)) {
            W6.a aVar = this.f39921a;
            Object c5029d = "fiam".equals(str) ? new C5029d(aVar, bVar) : "clx".equals(str) ? new C5031f(aVar, bVar) : null;
            if (c5029d != null) {
                this.f39922b.put(str, c5029d);
                return new a(this, str);
            }
        }
        return null;
    }

    public final boolean j(String str) {
        if (str.isEmpty()) {
            return false;
        }
        Map map = this.f39922b;
        return map.containsKey(str) && map.get(str) != null;
    }
}
