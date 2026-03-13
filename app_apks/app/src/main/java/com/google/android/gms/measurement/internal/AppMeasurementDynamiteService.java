package com.google.android.gms.measurement.internal;

import X6.C2416j3;
import X6.F4;
import X6.G;
import X6.H3;
import X6.H4;
import X6.I;
import X6.I5;
import X6.K6;
import X6.R4;
import X6.RunnableC2385f4;
import X6.RunnableC2392g3;
import X6.RunnableC2401h4;
import X6.RunnableC2409i4;
import X6.RunnableC2410i5;
import X6.RunnableC2496t4;
import X6.X3;
import X6.a7;
import X6.b7;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import b0.C2777a;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.A0;
import com.google.android.gms.internal.measurement.C0;
import com.google.android.gms.internal.measurement.InterfaceC3304s0;
import com.google.android.gms.internal.measurement.InterfaceC3322u0;
import com.google.android.gms.internal.measurement.InterfaceC3346x0;
import com.google.android.gms.internal.measurement.InterfaceC3362z0;
import com.google.android.gms.internal.measurement.zzcq;
import io.sentry.protocol.App;
import java.util.Map;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends zzcq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2416j3 f30371a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f30372b = new C2777a();

    public final void K(InterfaceC3304s0 interfaceC3304s0, String str) {
        zzb();
        this.f30371a.C().a0(interfaceC3304s0, str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void beginAdUnitExposure(String str, long j10) {
        zzb();
        this.f30371a.M().i(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        zzb();
        this.f30371a.B().O(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void clearMeasurementEnabled(long j10) {
        zzb();
        this.f30371a.B().n0(null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void endAdUnitExposure(String str, long j10) {
        zzb();
        this.f30371a.M().j(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void generateEventId(InterfaceC3304s0 interfaceC3304s0) {
        zzb();
        long jP0 = this.f30371a.C().p0();
        zzb();
        this.f30371a.C().b0(interfaceC3304s0, jP0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void getAppInstanceId(InterfaceC3304s0 interfaceC3304s0) {
        zzb();
        this.f30371a.b().t(new RunnableC2392g3(this, interfaceC3304s0));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void getCachedAppInstanceId(InterfaceC3304s0 interfaceC3304s0) {
        zzb();
        K(interfaceC3304s0, this.f30371a.B().D());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void getConditionalUserProperties(String str, String str2, InterfaceC3304s0 interfaceC3304s0) {
        zzb();
        this.f30371a.b().t(new RunnableC2410i5(this, interfaceC3304s0, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void getCurrentScreenClass(InterfaceC3304s0 interfaceC3304s0) {
        zzb();
        K(interfaceC3304s0, this.f30371a.B().R());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void getCurrentScreenName(InterfaceC3304s0 interfaceC3304s0) {
        zzb();
        K(interfaceC3304s0, this.f30371a.B().Q());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void getGmpAppId(InterfaceC3304s0 interfaceC3304s0) {
        zzb();
        K(interfaceC3304s0, this.f30371a.B().S());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void getMaxUserProperties(String str, InterfaceC3304s0 interfaceC3304s0) {
        zzb();
        this.f30371a.B().L(str);
        zzb();
        this.f30371a.C().c0(interfaceC3304s0, 25);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void getSessionId(InterfaceC3304s0 interfaceC3304s0) {
        zzb();
        R4 r4B = this.f30371a.B();
        r4B.f18400a.b().t(new RunnableC2496t4(r4B, interfaceC3304s0));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void getTestFlag(InterfaceC3304s0 interfaceC3304s0, int i10) {
        zzb();
        if (i10 == 0) {
            this.f30371a.C().a0(interfaceC3304s0, this.f30371a.B().j0());
            return;
        }
        if (i10 == 1) {
            this.f30371a.C().b0(interfaceC3304s0, this.f30371a.B().k0().longValue());
            return;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                this.f30371a.C().c0(interfaceC3304s0, this.f30371a.B().l0().intValue());
                return;
            } else {
                if (i10 != 4) {
                    return;
                }
                this.f30371a.C().e0(interfaceC3304s0, this.f30371a.B().i0().booleanValue());
                return;
            }
        }
        a7 a7VarC = this.f30371a.C();
        double dDoubleValue = this.f30371a.B().m0().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", dDoubleValue);
        try {
            interfaceC3304s0.Z(bundle);
        } catch (RemoteException e10) {
            a7VarC.f18400a.a().r().b("Error returning double value to wrapper", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void getUserProperties(String str, String str2, boolean z10, InterfaceC3304s0 interfaceC3304s0) {
        zzb();
        this.f30371a.b().t(new RunnableC2401h4(this, interfaceC3304s0, str, str2, z10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void initForTests(Map map) {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void initialize(IObjectWrapper iObjectWrapper, A0 a02, long j10) {
        C2416j3 c2416j3 = this.f30371a;
        if (c2416j3 == null) {
            this.f30371a = C2416j3.O((Context) AbstractC6056k.l((Context) ObjectWrapper.unwrap(iObjectWrapper)), a02, Long.valueOf(j10));
        } else {
            c2416j3.a().r().a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void isDataCollectionEnabled(InterfaceC3304s0 interfaceC3304s0) {
        zzb();
        this.f30371a.b().t(new I5(this, interfaceC3304s0));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        zzb();
        this.f30371a.B().q(str, str2, bundle, z10, z11, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC3304s0 interfaceC3304s0, long j10) {
        zzb();
        AbstractC6056k.f(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", App.TYPE);
        this.f30371a.b().t(new H3(this, interfaceC3304s0, new I(str2, new G(bundle), App.TYPE, j10), str));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void logHealthData(int i10, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        zzb();
        this.f30371a.a().y(i10, true, false, str, iObjectWrapper == null ? null : ObjectWrapper.unwrap(iObjectWrapper), iObjectWrapper2 == null ? null : ObjectWrapper.unwrap(iObjectWrapper2), iObjectWrapper3 != null ? ObjectWrapper.unwrap(iObjectWrapper3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j10) {
        zzb();
        onActivityCreatedByScionActivityInfo(C0.d((Activity) AbstractC6056k.l((Activity) ObjectWrapper.unwrap(iObjectWrapper))), bundle, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void onActivityCreatedByScionActivityInfo(C0 c02, Bundle bundle, long j10) {
        zzb();
        F4 f42 = this.f30371a.B().f18490c;
        if (f42 != null) {
            this.f30371a.B().h0();
            f42.e(c02, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j10) {
        zzb();
        onActivityDestroyedByScionActivityInfo(C0.d((Activity) AbstractC6056k.l((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void onActivityDestroyedByScionActivityInfo(C0 c02, long j10) {
        zzb();
        F4 f42 = this.f30371a.B().f18490c;
        if (f42 != null) {
            this.f30371a.B().h0();
            f42.b(c02);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void onActivityPaused(IObjectWrapper iObjectWrapper, long j10) {
        zzb();
        onActivityPausedByScionActivityInfo(C0.d((Activity) AbstractC6056k.l((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void onActivityPausedByScionActivityInfo(C0 c02, long j10) {
        zzb();
        F4 f42 = this.f30371a.B().f18490c;
        if (f42 != null) {
            this.f30371a.B().h0();
            f42.a(c02);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void onActivityResumed(IObjectWrapper iObjectWrapper, long j10) {
        zzb();
        onActivityResumedByScionActivityInfo(C0.d((Activity) AbstractC6056k.l((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void onActivityResumedByScionActivityInfo(C0 c02, long j10) {
        zzb();
        F4 f42 = this.f30371a.B().f18490c;
        if (f42 != null) {
            this.f30371a.B().h0();
            f42.d(c02);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, InterfaceC3304s0 interfaceC3304s0, long j10) {
        zzb();
        onActivitySaveInstanceStateByScionActivityInfo(C0.d((Activity) AbstractC6056k.l((Activity) ObjectWrapper.unwrap(iObjectWrapper))), interfaceC3304s0, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void onActivitySaveInstanceStateByScionActivityInfo(C0 c02, InterfaceC3304s0 interfaceC3304s0, long j10) {
        zzb();
        F4 f42 = this.f30371a.B().f18490c;
        Bundle bundle = new Bundle();
        if (f42 != null) {
            this.f30371a.B().h0();
            f42.c(c02, bundle);
        }
        try {
            interfaceC3304s0.Z(bundle);
        } catch (RemoteException e10) {
            this.f30371a.a().r().b("Error returning bundle value to wrapper", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void onActivityStarted(IObjectWrapper iObjectWrapper, long j10) {
        zzb();
        onActivityStartedByScionActivityInfo(C0.d((Activity) AbstractC6056k.l((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void onActivityStartedByScionActivityInfo(C0 c02, long j10) {
        zzb();
        if (this.f30371a.B().f18490c != null) {
            this.f30371a.B().h0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void onActivityStopped(IObjectWrapper iObjectWrapper, long j10) {
        zzb();
        onActivityStoppedByScionActivityInfo(C0.d((Activity) AbstractC6056k.l((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void onActivityStoppedByScionActivityInfo(C0 c02, long j10) {
        zzb();
        if (this.f30371a.B().f18490c != null) {
            this.f30371a.B().h0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void performAction(Bundle bundle, InterfaceC3304s0 interfaceC3304s0, long j10) {
        zzb();
        interfaceC3304s0.Z(null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void registerOnMeasurementEventListener(InterfaceC3346x0 interfaceC3346x0) {
        X3 b7Var;
        zzb();
        Map map = this.f30372b;
        synchronized (map) {
            try {
                b7Var = (X3) map.get(Integer.valueOf(interfaceC3346x0.e()));
                if (b7Var == null) {
                    b7Var = new b7(this, interfaceC3346x0);
                    map.put(Integer.valueOf(interfaceC3346x0.e()), b7Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f30371a.B().J(b7Var);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void resetAnalyticsData(long j10) {
        zzb();
        this.f30371a.B().G(j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void retrieveAndUploadBatches(final InterfaceC3322u0 interfaceC3322u0) {
        zzb();
        this.f30371a.B().r0(new Runnable() { // from class: X6.j6
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    interfaceC3322u0.d();
                } catch (RemoteException e10) {
                    ((C2416j3) AbstractC6056k.l(this.f19034a.f30371a)).a().r().b("Failed to call IDynamiteUploadBatchesCallback", e10);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void setConditionalUserProperty(Bundle bundle, long j10) {
        zzb();
        if (bundle == null) {
            this.f30371a.a().o().a("Conditional user property must not be null");
        } else {
            this.f30371a.B().N(bundle, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void setConsentThirdParty(Bundle bundle, long j10) {
        zzb();
        this.f30371a.B().o0(bundle, -20, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j10) {
        zzb();
        setCurrentScreenByScionActivityInfo(C0.d((Activity) AbstractC6056k.l((Activity) ObjectWrapper.unwrap(iObjectWrapper))), str, str2, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void setCurrentScreenByScionActivityInfo(C0 c02, String str, String str2, long j10) {
        zzb();
        this.f30371a.I().t(c02, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void setDataCollectionEnabled(boolean z10) {
        zzb();
        R4 r4B = this.f30371a.B();
        r4B.j();
        r4B.f18400a.b().t(new RunnableC2385f4(r4B, z10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void setDefaultEventParameters(Bundle bundle) {
        zzb();
        final R4 r4B = this.f30371a.B();
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        r4B.f18400a.b().t(new Runnable() { // from class: X6.N4
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                r4B.U(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void setEventInterceptor(InterfaceC3346x0 interfaceC3346x0) {
        zzb();
        K6 k62 = new K6(this, interfaceC3346x0);
        if (this.f30371a.b().p()) {
            this.f30371a.B().I(k62);
        } else {
            this.f30371a.b().t(new H4(this, k62));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void setInstanceIdProvider(InterfaceC3362z0 interfaceC3362z0) {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void setMeasurementEnabled(boolean z10, long j10) {
        zzb();
        this.f30371a.B().n0(Boolean.valueOf(z10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void setMinimumSessionDuration(long j10) {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void setSessionTimeoutDuration(long j10) {
        zzb();
        R4 r4B = this.f30371a.B();
        r4B.f18400a.b().t(new RunnableC2409i4(r4B, j10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void setSgtmDebugInfo(Intent intent) {
        zzb();
        R4 r4B = this.f30371a.B();
        Uri data = intent.getData();
        if (data == null) {
            r4B.f18400a.a().u().a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            C2416j3 c2416j3 = r4B.f18400a;
            c2416j3.a().u().a("[sgtm] Preview Mode was not enabled.");
            c2416j3.w().Q(null);
        } else {
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            C2416j3 c2416j32 = r4B.f18400a;
            c2416j32.a().u().b("[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
            c2416j32.w().Q(queryParameter2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void setUserId(final String str, long j10) {
        zzb();
        final R4 r4B = this.f30371a.B();
        if (str != null && TextUtils.isEmpty(str)) {
            r4B.f18400a.a().r().a("User ID must be non-empty or null");
        } else {
            r4B.f18400a.b().t(new Runnable() { // from class: X6.O4
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    C2416j3 c2416j3 = r4B.f18400a;
                    if (c2416j3.L().x(str)) {
                        c2416j3.L().p();
                    }
                }
            });
            r4B.z(null, "_id", str, true, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z10, long j10) {
        zzb();
        this.f30371a.B().z(str, str2, ObjectWrapper.unwrap(iObjectWrapper), z10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void unregisterOnMeasurementEventListener(InterfaceC3346x0 interfaceC3346x0) {
        X3 b7Var;
        zzb();
        Map map = this.f30372b;
        synchronized (map) {
            b7Var = (X3) map.remove(Integer.valueOf(interfaceC3346x0.e()));
        }
        if (b7Var == null) {
            b7Var = new b7(this, interfaceC3346x0);
        }
        this.f30371a.B().K(b7Var);
    }

    public final void zzb() {
        if (this.f30371a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public void setConsent(Bundle bundle, long j10) {
    }
}
