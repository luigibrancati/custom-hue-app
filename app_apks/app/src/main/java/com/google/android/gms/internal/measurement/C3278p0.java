package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3278p0 extends N implements InterfaceC3287q0 {
    public C3278p0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public final void beginAdUnitExposure(String str, long j10) {
        Parcel parcelK = K();
        parcelK.writeString(str);
        parcelK.writeLong(j10);
        X(23, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelK = K();
        parcelK.writeString(str);
        parcelK.writeString(str2);
        O.c(parcelK, bundle);
        X(9, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public final void endAdUnitExposure(String str, long j10) {
        Parcel parcelK = K();
        parcelK.writeString(str);
        parcelK.writeLong(j10);
        X(24, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public final void generateEventId(InterfaceC3304s0 interfaceC3304s0) {
        Parcel parcelK = K();
        O.d(parcelK, interfaceC3304s0);
        X(22, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public final void getAppInstanceId(InterfaceC3304s0 interfaceC3304s0) {
        Parcel parcelK = K();
        O.d(parcelK, interfaceC3304s0);
        X(20, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public final void getCachedAppInstanceId(InterfaceC3304s0 interfaceC3304s0) {
        Parcel parcelK = K();
        O.d(parcelK, interfaceC3304s0);
        X(19, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public final void getConditionalUserProperties(String str, String str2, InterfaceC3304s0 interfaceC3304s0) {
        Parcel parcelK = K();
        parcelK.writeString(str);
        parcelK.writeString(str2);
        O.d(parcelK, interfaceC3304s0);
        X(10, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public final void getCurrentScreenClass(InterfaceC3304s0 interfaceC3304s0) {
        Parcel parcelK = K();
        O.d(parcelK, interfaceC3304s0);
        X(17, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public final void getCurrentScreenName(InterfaceC3304s0 interfaceC3304s0) {
        Parcel parcelK = K();
        O.d(parcelK, interfaceC3304s0);
        X(16, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public final void getGmpAppId(InterfaceC3304s0 interfaceC3304s0) {
        Parcel parcelK = K();
        O.d(parcelK, interfaceC3304s0);
        X(21, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public final void getMaxUserProperties(String str, InterfaceC3304s0 interfaceC3304s0) {
        Parcel parcelK = K();
        parcelK.writeString(str);
        O.d(parcelK, interfaceC3304s0);
        X(6, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public final void getSessionId(InterfaceC3304s0 interfaceC3304s0) {
        Parcel parcelK = K();
        O.d(parcelK, interfaceC3304s0);
        X(46, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public final void getUserProperties(String str, String str2, boolean z10, InterfaceC3304s0 interfaceC3304s0) {
        Parcel parcelK = K();
        parcelK.writeString(str);
        parcelK.writeString(str2);
        ClassLoader classLoader = O.f29293a;
        parcelK.writeInt(z10 ? 1 : 0);
        O.d(parcelK, interfaceC3304s0);
        X(5, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public final void initialize(IObjectWrapper iObjectWrapper, A0 a02, long j10) {
        Parcel parcelK = K();
        O.d(parcelK, iObjectWrapper);
        O.c(parcelK, a02);
        parcelK.writeLong(j10);
        X(1, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        Parcel parcelK = K();
        parcelK.writeString(str);
        parcelK.writeString(str2);
        O.c(parcelK, bundle);
        parcelK.writeInt(z10 ? 1 : 0);
        parcelK.writeInt(z11 ? 1 : 0);
        parcelK.writeLong(j10);
        X(2, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public final void logHealthData(int i10, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel parcelK = K();
        parcelK.writeInt(5);
        parcelK.writeString(str);
        O.d(parcelK, iObjectWrapper);
        O.d(parcelK, iObjectWrapper2);
        O.d(parcelK, iObjectWrapper3);
        X(33, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public final void onActivityCreatedByScionActivityInfo(C0 c02, Bundle bundle, long j10) {
        Parcel parcelK = K();
        O.c(parcelK, c02);
        O.c(parcelK, bundle);
        parcelK.writeLong(j10);
        X(53, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public final void onActivityDestroyedByScionActivityInfo(C0 c02, long j10) {
        Parcel parcelK = K();
        O.c(parcelK, c02);
        parcelK.writeLong(j10);
        X(54, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public final void onActivityPausedByScionActivityInfo(C0 c02, long j10) {
        Parcel parcelK = K();
        O.c(parcelK, c02);
        parcelK.writeLong(j10);
        X(55, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public final void onActivityResumedByScionActivityInfo(C0 c02, long j10) {
        Parcel parcelK = K();
        O.c(parcelK, c02);
        parcelK.writeLong(j10);
        X(56, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public final void onActivitySaveInstanceStateByScionActivityInfo(C0 c02, InterfaceC3304s0 interfaceC3304s0, long j10) {
        Parcel parcelK = K();
        O.c(parcelK, c02);
        O.d(parcelK, interfaceC3304s0);
        parcelK.writeLong(j10);
        X(57, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public final void onActivityStartedByScionActivityInfo(C0 c02, long j10) {
        Parcel parcelK = K();
        O.c(parcelK, c02);
        parcelK.writeLong(j10);
        X(51, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public final void onActivityStoppedByScionActivityInfo(C0 c02, long j10) {
        Parcel parcelK = K();
        O.c(parcelK, c02);
        parcelK.writeLong(j10);
        X(52, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public final void registerOnMeasurementEventListener(InterfaceC3346x0 interfaceC3346x0) {
        Parcel parcelK = K();
        O.d(parcelK, interfaceC3346x0);
        X(35, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public final void resetAnalyticsData(long j10) {
        Parcel parcelK = K();
        parcelK.writeLong(j10);
        X(12, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public final void retrieveAndUploadBatches(InterfaceC3322u0 interfaceC3322u0) {
        Parcel parcelK = K();
        O.d(parcelK, interfaceC3322u0);
        X(58, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public final void setConditionalUserProperty(Bundle bundle, long j10) {
        Parcel parcelK = K();
        O.c(parcelK, bundle);
        parcelK.writeLong(j10);
        X(8, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public final void setConsentThirdParty(Bundle bundle, long j10) {
        Parcel parcelK = K();
        O.c(parcelK, bundle);
        parcelK.writeLong(j10);
        X(45, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public final void setCurrentScreenByScionActivityInfo(C0 c02, String str, String str2, long j10) {
        Parcel parcelK = K();
        O.c(parcelK, c02);
        parcelK.writeString(str);
        parcelK.writeString(str2);
        parcelK.writeLong(j10);
        X(50, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public final void setDataCollectionEnabled(boolean z10) {
        Parcel parcelK = K();
        ClassLoader classLoader = O.f29293a;
        parcelK.writeInt(z10 ? 1 : 0);
        X(39, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel parcelK = K();
        O.c(parcelK, bundle);
        X(42, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public final void setMeasurementEnabled(boolean z10, long j10) {
        Parcel parcelK = K();
        ClassLoader classLoader = O.f29293a;
        parcelK.writeInt(z10 ? 1 : 0);
        parcelK.writeLong(j10);
        X(11, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public final void setSessionTimeoutDuration(long j10) {
        Parcel parcelK = K();
        parcelK.writeLong(j10);
        X(14, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public final void setUserId(String str, long j10) {
        Parcel parcelK = K();
        parcelK.writeString(str);
        parcelK.writeLong(j10);
        X(7, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3287q0
    public final void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z10, long j10) {
        Parcel parcelK = K();
        parcelK.writeString(str);
        parcelK.writeString(str2);
        O.d(parcelK, iObjectWrapper);
        parcelK.writeInt(z10 ? 1 : 0);
        parcelK.writeLong(j10);
        X(4, parcelK);
    }
}
