package com.signify.geofence;

import Rd.AbstractC2130h;
import Rd.M;
import Rd.X;
import android.app.IntentService;
import android.content.Intent;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.signify.geofence.c;
import fc.AbstractC4036s;
import fc.C4015H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.m;
import vc.p;
import za.j;
import za.k;
import za.t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003¨\u0006\u000b"}, d2 = {"Lcom/signify/geofence/GeofenceRecreationService;", "Landroid/app/IntentService;", "<init>", "()V", "Lfc/H;", "onCreate", "Landroid/content/Intent;", "intent", "onHandleIntent", "(Landroid/content/Intent;)V", "a", "geofence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GeofenceRecreationService extends IntentService {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f32438j;

        public b(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new b(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((b) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f32438j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                this.f32438j = 1;
                if (X.a(2000L, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            return C4015H.f34254a;
        }
    }

    public GeofenceRecreationService() {
        super("GeofenceRecreationService");
    }

    public final void a() {
        j jVar = new j();
        startForeground(jVar.e(), jVar.c(this, t.f48877d), RecognitionOptions.PDF417);
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        a();
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        if (AbstractC4862t.a(intent != null ? intent.getStringExtra("geofence_recreate_action") : null, "android.location.MODE_CHANGED")) {
            AbstractC2130h.b(null, new b(null), 1, null);
        }
        c.Companion aVar = c.INSTANCE;
        long j10 = getSharedPreferences(aVar.d(), 0).getLong(aVar.c(), 0L);
        List<k> listD = new com.signify.geofence.b(this).d();
        a aVar2 = new a(this);
        for (k kVar : listD) {
            aVar2.l(j10, kVar.d(), kVar.a(), kVar.b(), kVar.c(), (32 & 32) != 0 ? null : null);
        }
    }
}
