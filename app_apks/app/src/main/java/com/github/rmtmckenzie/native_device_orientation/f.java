package com.github.rmtmckenzie.native_device_orientation;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.github.rmtmckenzie.native_device_orientation.a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class f implements com.github.rmtmckenzie.native_device_orientation.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final IntentFilter f28909f = new IntentFilter("android.intent.action.CONFIGURATION_CHANGED");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f28910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f28911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a.InterfaceC0355a f28912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BroadcastReceiver f28913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f28914e = null;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            e eVarA = f.this.f28910a.a(f.this.f28911b);
            if (eVarA.equals(f.this.f28914e)) {
                return;
            }
            f.this.f28914e = eVarA;
            f.this.f28912c.a(eVarA);
        }
    }

    public f(g gVar, Activity activity, a.InterfaceC0355a interfaceC0355a) {
        this.f28910a = gVar;
        this.f28911b = activity;
        this.f28912c = interfaceC0355a;
    }

    @Override // com.github.rmtmckenzie.native_device_orientation.a
    public void a() {
        BroadcastReceiver broadcastReceiver = this.f28913d;
        if (broadcastReceiver == null) {
            return;
        }
        this.f28911b.unregisterReceiver(broadcastReceiver);
        this.f28913d = null;
    }

    @Override // com.github.rmtmckenzie.native_device_orientation.a
    public void b() {
        if (this.f28913d != null) {
            return;
        }
        a aVar = new a();
        this.f28913d = aVar;
        this.f28911b.registerReceiver(aVar, f28909f);
        e eVarA = this.f28910a.a(this.f28911b);
        this.f28914e = eVarA;
        this.f28912c.a(eVarA);
    }
}
