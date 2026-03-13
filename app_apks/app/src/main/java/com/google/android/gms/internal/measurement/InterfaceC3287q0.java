package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3287q0 extends IInterface {
    void beginAdUnitExposure(String str, long j10);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j10);

    void endAdUnitExposure(String str, long j10);

    void generateEventId(InterfaceC3304s0 interfaceC3304s0);

    void getAppInstanceId(InterfaceC3304s0 interfaceC3304s0);

    void getCachedAppInstanceId(InterfaceC3304s0 interfaceC3304s0);

    void getConditionalUserProperties(String str, String str2, InterfaceC3304s0 interfaceC3304s0);

    void getCurrentScreenClass(InterfaceC3304s0 interfaceC3304s0);

    void getCurrentScreenName(InterfaceC3304s0 interfaceC3304s0);

    void getGmpAppId(InterfaceC3304s0 interfaceC3304s0);

    void getMaxUserProperties(String str, InterfaceC3304s0 interfaceC3304s0);

    void getSessionId(InterfaceC3304s0 interfaceC3304s0);

    void getTestFlag(InterfaceC3304s0 interfaceC3304s0, int i10);

    void getUserProperties(String str, String str2, boolean z10, InterfaceC3304s0 interfaceC3304s0);

    void initForTests(Map map);

    void initialize(IObjectWrapper iObjectWrapper, A0 a02, long j10);

    void isDataCollectionEnabled(InterfaceC3304s0 interfaceC3304s0);

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10);

    void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC3304s0 interfaceC3304s0, long j10);

    void logHealthData(int i10, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3);

    void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j10);

    void onActivityCreatedByScionActivityInfo(C0 c02, Bundle bundle, long j10);

    void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j10);

    void onActivityDestroyedByScionActivityInfo(C0 c02, long j10);

    void onActivityPaused(IObjectWrapper iObjectWrapper, long j10);

    void onActivityPausedByScionActivityInfo(C0 c02, long j10);

    void onActivityResumed(IObjectWrapper iObjectWrapper, long j10);

    void onActivityResumedByScionActivityInfo(C0 c02, long j10);

    void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, InterfaceC3304s0 interfaceC3304s0, long j10);

    void onActivitySaveInstanceStateByScionActivityInfo(C0 c02, InterfaceC3304s0 interfaceC3304s0, long j10);

    void onActivityStarted(IObjectWrapper iObjectWrapper, long j10);

    void onActivityStartedByScionActivityInfo(C0 c02, long j10);

    void onActivityStopped(IObjectWrapper iObjectWrapper, long j10);

    void onActivityStoppedByScionActivityInfo(C0 c02, long j10);

    void performAction(Bundle bundle, InterfaceC3304s0 interfaceC3304s0, long j10);

    void registerOnMeasurementEventListener(InterfaceC3346x0 interfaceC3346x0);

    void resetAnalyticsData(long j10);

    void retrieveAndUploadBatches(InterfaceC3322u0 interfaceC3322u0);

    void setConditionalUserProperty(Bundle bundle, long j10);

    void setConsent(Bundle bundle, long j10);

    void setConsentThirdParty(Bundle bundle, long j10);

    void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j10);

    void setCurrentScreenByScionActivityInfo(C0 c02, String str, String str2, long j10);

    void setDataCollectionEnabled(boolean z10);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(InterfaceC3346x0 interfaceC3346x0);

    void setInstanceIdProvider(InterfaceC3362z0 interfaceC3362z0);

    void setMeasurementEnabled(boolean z10, long j10);

    void setMinimumSessionDuration(long j10);

    void setSessionTimeoutDuration(long j10);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j10);

    void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z10, long j10);

    void unregisterOnMeasurementEventListener(InterfaceC3346x0 interfaceC3346x0);
}
