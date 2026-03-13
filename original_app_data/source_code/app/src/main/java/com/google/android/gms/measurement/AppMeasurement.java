package com.google.android.gms.measurement;

import V6.a;
import V6.b;
import V6.c;
import X6.C2416j3;
import X6.O3;
import X6.S4;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.A0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class AppMeasurement {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile AppMeasurement f30366b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f30367a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        public String mName;

        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(Bundle bundle) {
            AbstractC6056k.l(bundle);
            this.mAppId = (String) O3.b(bundle, "app_id", String.class, null);
            this.mOrigin = (String) O3.b(bundle, "origin", String.class, null);
            this.mName = (String) O3.b(bundle, "name", String.class, null);
            this.mValue = O3.b(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) O3.b(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) O3.b(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) O3.b(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) O3.b(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) O3.b(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) O3.b(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) O3.b(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) O3.b(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) O3.b(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) O3.b(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) O3.b(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) O3.b(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public AppMeasurement(C2416j3 c2416j3) {
        this.f30367a = new a(c2416j3);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (f30366b == null) {
            synchronized (AppMeasurement.class) {
                if (f30366b == null) {
                    S4 s42 = (S4) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (s42 != null) {
                        f30366b = new AppMeasurement(s42);
                    } else {
                        f30366b = new AppMeasurement(C2416j3.O(context, new A0(0L, 0L, true, null, null), null));
                    }
                }
            }
        }
        return f30366b;
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f30367a.d(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f30367a.l(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f30367a.c(str);
    }

    @Keep
    public long generateEventId() {
        return this.f30367a.j();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f30367a.k();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List listM = this.f30367a.m(str, str2);
        ArrayList arrayList = new ArrayList(listM == null ? 0 : listM.size());
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty((Bundle) it.next()));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f30367a.g();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f30367a.f();
    }

    @Keep
    public String getGmpAppId() {
        return this.f30367a.h();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f30367a.e(str);
    }

    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z10) {
        return this.f30367a.i(str, str2, z10);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f30367a.a(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        AbstractC6056k.l(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            O3.a(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        c cVar = this.f30367a;
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        cVar.b(bundle);
    }

    public AppMeasurement(S4 s42) {
        this.f30367a = new b(s42);
    }
}
