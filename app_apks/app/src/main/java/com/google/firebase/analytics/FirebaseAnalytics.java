package com.google.firebase.analytics;

import P8.g;
import X6.S4;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.C0;
import com.google.android.gms.internal.measurement.C3323u1;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import io.sentry.TransactionOptions;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k8.C4808a;
import k8.C4811d;
import k8.CallableC4809b;
import k8.CallableC4810c;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile FirebaseAnalytics f31587c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3323u1 f31588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ExecutorService f31589b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum a {
        GRANTED,
        DENIED
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum b {
        AD_STORAGE,
        ANALYTICS_STORAGE,
        AD_USER_DATA,
        AD_PERSONALIZATION
    }

    public FirebaseAnalytics(C3323u1 c3323u1) {
        AbstractC6056k.l(c3323u1);
        this.f31588a = c3323u1;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f31587c == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f31587c == null) {
                        f31587c = new FirebaseAnalytics(C3323u1.s(context, null));
                    }
                } finally {
                }
            }
        }
        return f31587c;
    }

    @Keep
    public static S4 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C3323u1 c3323u1S = C3323u1.s(context, bundle);
        if (c3323u1S == null) {
            return null;
        }
        return new C4811d(c3323u1S);
    }

    public Task a() {
        try {
            return Tasks.b(l(), new CallableC4809b(this));
        } catch (RuntimeException e10) {
            this.f31588a.d(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return Tasks.d(e10);
        }
    }

    public Task b() {
        try {
            return Tasks.b(l(), new CallableC4810c(this));
        } catch (RuntimeException e10) {
            this.f31588a.d(5, "Failed to schedule task for getSessionId", null, null, null);
            return Tasks.d(e10);
        }
    }

    public void c(String str, Bundle bundle) {
        this.f31588a.w(str, bundle);
    }

    public void d() {
        this.f31588a.G();
    }

    public void e(boolean z10) {
        this.f31588a.E(Boolean.valueOf(z10));
    }

    public void f(Map map) {
        Bundle bundle = new Bundle();
        a aVar = (a) map.get(b.AD_STORAGE);
        if (aVar != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (iOrdinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        a aVar2 = (a) map.get(b.ANALYTICS_STORAGE);
        if (aVar2 != null) {
            int iOrdinal2 = aVar2.ordinal();
            if (iOrdinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (iOrdinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        a aVar3 = (a) map.get(b.AD_USER_DATA);
        if (aVar3 != null) {
            int iOrdinal3 = aVar3.ordinal();
            if (iOrdinal3 == 0) {
                bundle.putString("ad_user_data", "granted");
            } else if (iOrdinal3 == 1) {
                bundle.putString("ad_user_data", "denied");
            }
        }
        a aVar4 = (a) map.get(b.AD_PERSONALIZATION);
        if (aVar4 != null) {
            int iOrdinal4 = aVar4.ordinal();
            if (iOrdinal4 == 0) {
                bundle.putString("ad_personalization", "granted");
            } else if (iOrdinal4 == 1) {
                bundle.putString("ad_personalization", "denied");
            }
        }
        this.f31588a.F(bundle);
    }

    public void g(Bundle bundle) {
        if (bundle != null) {
            bundle = new Bundle(bundle);
        }
        this.f31588a.i(bundle);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) Tasks.a(g.p().getId(), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    public void h(long j10) {
        this.f31588a.H(j10);
    }

    public void i(String str) {
        this.f31588a.C(str);
    }

    public void j(String str, String str2) {
        this.f31588a.y(null, str, str2, false);
    }

    public final /* synthetic */ C3323u1 k() {
        return this.f31588a;
    }

    public final ExecutorService l() {
        FirebaseAnalytics firebaseAnalytics;
        ExecutorService executorService;
        synchronized (FirebaseAnalytics.class) {
            try {
                if (this.f31589b == null) {
                    firebaseAnalytics = this;
                    firebaseAnalytics.f31589b = new C4808a(firebaseAnalytics, 0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                } else {
                    firebaseAnalytics = this;
                }
                executorService = firebaseAnalytics.f31589b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f31588a.D(C0.d(activity), str, str2);
    }
}
