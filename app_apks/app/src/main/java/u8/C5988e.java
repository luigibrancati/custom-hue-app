package u8;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: renamed from: u8.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C5988e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f45327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f45328b;

    public C5988e(Float f10, boolean z10) {
        this.f45328b = z10;
        this.f45327a = f10;
    }

    public static C5988e a(Context context) {
        boolean zE = false;
        Float fD = null;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                zE = e(intentRegisterReceiver);
                fD = d(intentRegisterReceiver);
            }
        } catch (IllegalStateException e10) {
            r8.g.f().e("An error occurred getting battery state.", e10);
        }
        return new C5988e(fD, zE);
    }

    public static Float d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    public static boolean e(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    public Float b() {
        return this.f45327a;
    }

    public int c() {
        Float f10;
        if (!this.f45328b || (f10 = this.f45327a) == null) {
            return 1;
        }
        return ((double) f10.floatValue()) < 0.99d ? 2 : 3;
    }
}
