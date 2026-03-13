package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.protobuf.DescriptorProtos$FileOptions;
import io.flutter.Build;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzcq extends zzbm implements InterfaceC3287q0 {
    public zzcq() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static InterfaceC3287q0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3287q0 ? (InterfaceC3287q0) iInterfaceQueryLocalInterface : new C3278p0(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        InterfaceC3304s0 c3295r0 = null;
        InterfaceC3322u0 c3313t0 = null;
        InterfaceC3304s0 c3295r02 = null;
        InterfaceC3304s0 c3295r03 = null;
        InterfaceC3304s0 c3295r04 = null;
        InterfaceC3304s0 c3295r05 = null;
        InterfaceC3346x0 c3330v0 = null;
        InterfaceC3346x0 c3330v02 = null;
        InterfaceC3346x0 c3330v03 = null;
        InterfaceC3304s0 c3295r06 = null;
        InterfaceC3304s0 c3295r07 = null;
        InterfaceC3304s0 c3295r08 = null;
        InterfaceC3304s0 c3295r09 = null;
        InterfaceC3304s0 c3295r010 = null;
        InterfaceC3304s0 c3295r011 = null;
        InterfaceC3362z0 c3354y0 = null;
        InterfaceC3304s0 c3295r012 = null;
        InterfaceC3304s0 c3295r013 = null;
        InterfaceC3304s0 c3295r014 = null;
        InterfaceC3304s0 c3295r015 = null;
        InterfaceC3304s0 c3295r016 = null;
        switch (i10) {
            case 1:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                A0 a02 = (A0) O.b(parcel, A0.CREATOR);
                long j10 = parcel.readLong();
                O.f(parcel);
                initialize(iObjectWrapperAsInterface, a02, j10);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) O.b(parcel, Bundle.CREATOR);
                boolean zA = O.a(parcel);
                boolean zA2 = O.a(parcel);
                long j11 = parcel.readLong();
                O.f(parcel);
                logEvent(string, string2, bundle, zA, zA2, j11);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) O.b(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c3295r0 = iInterfaceQueryLocalInterface instanceof InterfaceC3304s0 ? (InterfaceC3304s0) iInterfaceQueryLocalInterface : new C3295r0(strongBinder);
                }
                long j12 = parcel.readLong();
                O.f(parcel);
                logEventAndBundle(string3, string4, bundle2, c3295r0, j12);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zA3 = O.a(parcel);
                long j13 = parcel.readLong();
                O.f(parcel);
                setUserProperty(string5, string6, iObjectWrapperAsInterface2, zA3, j13);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zA4 = O.a(parcel);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c3295r016 = iInterfaceQueryLocalInterface2 instanceof InterfaceC3304s0 ? (InterfaceC3304s0) iInterfaceQueryLocalInterface2 : new C3295r0(strongBinder2);
                }
                O.f(parcel);
                getUserProperties(string7, string8, zA4, c3295r016);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c3295r015 = iInterfaceQueryLocalInterface3 instanceof InterfaceC3304s0 ? (InterfaceC3304s0) iInterfaceQueryLocalInterface3 : new C3295r0(strongBinder3);
                }
                O.f(parcel);
                getMaxUserProperties(string9, c3295r015);
                break;
            case 7:
                String string10 = parcel.readString();
                long j14 = parcel.readLong();
                O.f(parcel);
                setUserId(string10, j14);
                break;
            case 8:
                Bundle bundle3 = (Bundle) O.b(parcel, Bundle.CREATOR);
                long j15 = parcel.readLong();
                O.f(parcel);
                setConditionalUserProperty(bundle3, j15);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) O.b(parcel, Bundle.CREATOR);
                O.f(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c3295r014 = iInterfaceQueryLocalInterface4 instanceof InterfaceC3304s0 ? (InterfaceC3304s0) iInterfaceQueryLocalInterface4 : new C3295r0(strongBinder4);
                }
                O.f(parcel);
                getConditionalUserProperties(string13, string14, c3295r014);
                break;
            case 11:
                boolean zA5 = O.a(parcel);
                long j16 = parcel.readLong();
                O.f(parcel);
                setMeasurementEnabled(zA5, j16);
                break;
            case 12:
                long j17 = parcel.readLong();
                O.f(parcel);
                resetAnalyticsData(j17);
                break;
            case 13:
                long j18 = parcel.readLong();
                O.f(parcel);
                setMinimumSessionDuration(j18);
                break;
            case 14:
                long j19 = parcel.readLong();
                O.f(parcel);
                setSessionTimeoutDuration(j19);
                break;
            case 15:
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j20 = parcel.readLong();
                O.f(parcel);
                setCurrentScreen(iObjectWrapperAsInterface3, string15, string16, j20);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c3295r013 = iInterfaceQueryLocalInterface5 instanceof InterfaceC3304s0 ? (InterfaceC3304s0) iInterfaceQueryLocalInterface5 : new C3295r0(strongBinder5);
                }
                O.f(parcel);
                getCurrentScreenName(c3295r013);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c3295r012 = iInterfaceQueryLocalInterface6 instanceof InterfaceC3304s0 ? (InterfaceC3304s0) iInterfaceQueryLocalInterface6 : new C3295r0(strongBinder6);
                }
                O.f(parcel);
                getCurrentScreenClass(c3295r012);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    c3354y0 = iInterfaceQueryLocalInterface7 instanceof InterfaceC3362z0 ? (InterfaceC3362z0) iInterfaceQueryLocalInterface7 : new C3354y0(strongBinder7);
                }
                O.f(parcel);
                setInstanceIdProvider(c3354y0);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c3295r011 = iInterfaceQueryLocalInterface8 instanceof InterfaceC3304s0 ? (InterfaceC3304s0) iInterfaceQueryLocalInterface8 : new C3295r0(strongBinder8);
                }
                O.f(parcel);
                getCachedAppInstanceId(c3295r011);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c3295r010 = iInterfaceQueryLocalInterface9 instanceof InterfaceC3304s0 ? (InterfaceC3304s0) iInterfaceQueryLocalInterface9 : new C3295r0(strongBinder9);
                }
                O.f(parcel);
                getAppInstanceId(c3295r010);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c3295r09 = iInterfaceQueryLocalInterface10 instanceof InterfaceC3304s0 ? (InterfaceC3304s0) iInterfaceQueryLocalInterface10 : new C3295r0(strongBinder10);
                }
                O.f(parcel);
                getGmpAppId(c3295r09);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c3295r08 = iInterfaceQueryLocalInterface11 instanceof InterfaceC3304s0 ? (InterfaceC3304s0) iInterfaceQueryLocalInterface11 : new C3295r0(strongBinder11);
                }
                O.f(parcel);
                generateEventId(c3295r08);
                break;
            case 23:
                String string17 = parcel.readString();
                long j21 = parcel.readLong();
                O.f(parcel);
                beginAdUnitExposure(string17, j21);
                break;
            case 24:
                String string18 = parcel.readString();
                long j22 = parcel.readLong();
                O.f(parcel);
                endAdUnitExposure(string18, j22);
                break;
            case 25:
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long j23 = parcel.readLong();
                O.f(parcel);
                onActivityStarted(iObjectWrapperAsInterface4, j23);
                break;
            case 26:
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long j24 = parcel.readLong();
                O.f(parcel);
                onActivityStopped(iObjectWrapperAsInterface5, j24);
                break;
            case 27:
                IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) O.b(parcel, Bundle.CREATOR);
                long j25 = parcel.readLong();
                O.f(parcel);
                onActivityCreated(iObjectWrapperAsInterface6, bundle5, j25);
                break;
            case 28:
                IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long j26 = parcel.readLong();
                O.f(parcel);
                onActivityDestroyed(iObjectWrapperAsInterface7, j26);
                break;
            case 29:
                IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long j27 = parcel.readLong();
                O.f(parcel);
                onActivityPaused(iObjectWrapperAsInterface8, j27);
                break;
            case Build.API_LEVELS.API_30 /* 30 */:
                IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long j28 = parcel.readLong();
                O.f(parcel);
                onActivityResumed(iObjectWrapperAsInterface9, j28);
                break;
            case 31:
                IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c3295r07 = iInterfaceQueryLocalInterface12 instanceof InterfaceC3304s0 ? (InterfaceC3304s0) iInterfaceQueryLocalInterface12 : new C3295r0(strongBinder12);
                }
                long j29 = parcel.readLong();
                O.f(parcel);
                onActivitySaveInstanceState(iObjectWrapperAsInterface10, c3295r07, j29);
                break;
            case 32:
                Bundle bundle6 = (Bundle) O.b(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c3295r06 = iInterfaceQueryLocalInterface13 instanceof InterfaceC3304s0 ? (InterfaceC3304s0) iInterfaceQueryLocalInterface13 : new C3295r0(strongBinder13);
                }
                long j30 = parcel.readLong();
                O.f(parcel);
                performAction(bundle6, c3295r06, j30);
                break;
            case 33:
                int i12 = parcel.readInt();
                String string19 = parcel.readString();
                IObjectWrapper iObjectWrapperAsInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                O.f(parcel);
                logHealthData(i12, string19, iObjectWrapperAsInterface11, iObjectWrapperAsInterface12, iObjectWrapperAsInterface13);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c3330v03 = iInterfaceQueryLocalInterface14 instanceof InterfaceC3346x0 ? (InterfaceC3346x0) iInterfaceQueryLocalInterface14 : new C3330v0(strongBinder14);
                }
                O.f(parcel);
                setEventInterceptor(c3330v03);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c3330v02 = iInterfaceQueryLocalInterface15 instanceof InterfaceC3346x0 ? (InterfaceC3346x0) iInterfaceQueryLocalInterface15 : new C3330v0(strongBinder15);
                }
                O.f(parcel);
                registerOnMeasurementEventListener(c3330v02);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c3330v0 = iInterfaceQueryLocalInterface16 instanceof InterfaceC3346x0 ? (InterfaceC3346x0) iInterfaceQueryLocalInterface16 : new C3330v0(strongBinder16);
                }
                O.f(parcel);
                unregisterOnMeasurementEventListener(c3330v0);
                break;
            case 37:
                HashMap mapE = O.e(parcel);
                O.f(parcel);
                initForTests(mapE);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c3295r05 = iInterfaceQueryLocalInterface17 instanceof InterfaceC3304s0 ? (InterfaceC3304s0) iInterfaceQueryLocalInterface17 : new C3295r0(strongBinder17);
                }
                int i13 = parcel.readInt();
                O.f(parcel);
                getTestFlag(c3295r05, i13);
                break;
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                boolean zA6 = O.a(parcel);
                O.f(parcel);
                setDataCollectionEnabled(zA6);
                break;
            case DescriptorProtos$FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c3295r04 = iInterfaceQueryLocalInterface18 instanceof InterfaceC3304s0 ? (InterfaceC3304s0) iInterfaceQueryLocalInterface18 : new C3295r0(strongBinder18);
                }
                O.f(parcel);
                isDataCollectionEnabled(c3295r04);
                break;
            case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case 47:
            case 49:
            default:
                return false;
            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                Bundle bundle7 = (Bundle) O.b(parcel, Bundle.CREATOR);
                O.f(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j31 = parcel.readLong();
                O.f(parcel);
                clearMeasurementEnabled(j31);
                break;
            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                Bundle bundle8 = (Bundle) O.b(parcel, Bundle.CREATOR);
                long j32 = parcel.readLong();
                O.f(parcel);
                setConsent(bundle8, j32);
                break;
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                Bundle bundle9 = (Bundle) O.b(parcel, Bundle.CREATOR);
                long j33 = parcel.readLong();
                O.f(parcel);
                setConsentThirdParty(bundle9, j33);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c3295r03 = iInterfaceQueryLocalInterface19 instanceof InterfaceC3304s0 ? (InterfaceC3304s0) iInterfaceQueryLocalInterface19 : new C3295r0(strongBinder19);
                }
                O.f(parcel);
                getSessionId(c3295r03);
                break;
            case 48:
                Intent intent = (Intent) O.b(parcel, Intent.CREATOR);
                O.f(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                C0 c02 = (C0) O.b(parcel, C0.CREATOR);
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                long j34 = parcel.readLong();
                O.f(parcel);
                setCurrentScreenByScionActivityInfo(c02, string20, string21, j34);
                break;
            case 51:
                C0 c03 = (C0) O.b(parcel, C0.CREATOR);
                long j35 = parcel.readLong();
                O.f(parcel);
                onActivityStartedByScionActivityInfo(c03, j35);
                break;
            case 52:
                C0 c04 = (C0) O.b(parcel, C0.CREATOR);
                long j36 = parcel.readLong();
                O.f(parcel);
                onActivityStoppedByScionActivityInfo(c04, j36);
                break;
            case 53:
                C0 c05 = (C0) O.b(parcel, C0.CREATOR);
                Bundle bundle10 = (Bundle) O.b(parcel, Bundle.CREATOR);
                long j37 = parcel.readLong();
                O.f(parcel);
                onActivityCreatedByScionActivityInfo(c05, bundle10, j37);
                break;
            case 54:
                C0 c06 = (C0) O.b(parcel, C0.CREATOR);
                long j38 = parcel.readLong();
                O.f(parcel);
                onActivityDestroyedByScionActivityInfo(c06, j38);
                break;
            case 55:
                C0 c07 = (C0) O.b(parcel, C0.CREATOR);
                long j39 = parcel.readLong();
                O.f(parcel);
                onActivityPausedByScionActivityInfo(c07, j39);
                break;
            case 56:
                C0 c08 = (C0) O.b(parcel, C0.CREATOR);
                long j40 = parcel.readLong();
                O.f(parcel);
                onActivityResumedByScionActivityInfo(c08, j40);
                break;
            case 57:
                C0 c09 = (C0) O.b(parcel, C0.CREATOR);
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c3295r02 = iInterfaceQueryLocalInterface20 instanceof InterfaceC3304s0 ? (InterfaceC3304s0) iInterfaceQueryLocalInterface20 : new C3295r0(strongBinder20);
                }
                long j41 = parcel.readLong();
                O.f(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(c09, c3295r02, j41);
                break;
            case 58:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 != null) {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    c3313t0 = iInterfaceQueryLocalInterface21 instanceof InterfaceC3322u0 ? (InterfaceC3322u0) iInterfaceQueryLocalInterface21 : new C3313t0(strongBinder21);
                }
                O.f(parcel);
                retrieveAndUploadBatches(c3313t0);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
