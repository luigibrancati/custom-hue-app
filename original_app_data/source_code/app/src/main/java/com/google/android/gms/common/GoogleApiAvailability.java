package com.google.android.gms.common;

import B6.i;
import B6.l;
import H6.d;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.m;
import androidx.fragment.app.ActivityC2740v;
import com.google.android.gms.common.api.GoogleApiActivity;
import io.sentry.protocol.SentryStackFrame;
import q6.AbstractC5501a;
import q6.b;
import s6.AbstractC5788g;
import s6.C5783b;
import s6.C5791j;
import s6.DialogFragmentC5784c;
import s6.HandlerC5792k;
import u6.AbstractC5926H;
import u6.C5927I;
import u6.InterfaceC5958h;
import v6.AbstractC6056k;
import v6.AbstractC6065u;
import v6.AbstractDialogInterfaceOnClickListenerC6068x;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class GoogleApiAvailability extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f29012c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f29010e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final GoogleApiAvailability f29011f = new GoogleApiAvailability();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f29009d = a.f29014a;

    public static GoogleApiAvailability m() {
        return f29011f;
    }

    @Override // com.google.android.gms.common.a
    public Intent b(Context context, int i10, String str) {
        return super.b(context, i10, str);
    }

    @Override // com.google.android.gms.common.a
    public PendingIntent c(Context context, int i10, int i11) {
        return super.c(context, i10, i11);
    }

    @Override // com.google.android.gms.common.a
    public final String e(int i10) {
        return super.e(i10);
    }

    @Override // com.google.android.gms.common.a
    public int g(Context context) {
        return super.g(context);
    }

    @Override // com.google.android.gms.common.a
    public int h(Context context, int i10) {
        return super.h(context, i10);
    }

    @Override // com.google.android.gms.common.a
    public final boolean j(int i10) {
        return super.j(i10);
    }

    public Dialog k(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return p(activity, i10, AbstractDialogInterfaceOnClickListenerC6068x.b(activity, b(activity, i10, "d"), i11), onCancelListener, null);
    }

    public PendingIntent l(Context context, C5783b c5783b) {
        return c5783b.k() ? c5783b.h() : c(context, c5783b.e(), 0);
    }

    public boolean n(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogK = k(activity, i10, i11, onCancelListener);
        if (dialogK == null) {
            return false;
        }
        v(activity, dialogK, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void o(Context context, int i10) {
        r(context, i10, null, d(context, i10, 0, "n"));
    }

    public final Dialog p(Context context, int i10, AbstractDialogInterfaceOnClickListenerC6068x abstractDialogInterfaceOnClickListenerC6068x, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(AbstractC6065u.c(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strE = AbstractC6065u.e(context, i10);
        DialogInterface.OnClickListener onClickListener2 = abstractDialogInterfaceOnClickListenerC6068x;
        if (strE != null) {
            if (abstractDialogInterfaceOnClickListenerC6068x == null) {
                onClickListener2 = onClickListener;
            }
            builder.setPositiveButton(strE, onClickListener2);
        }
        String strA = AbstractC6065u.a(context, i10);
        if (strA != null) {
            builder.setTitle(strA);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder.create();
    }

    public final boolean q(Activity activity, InterfaceC5958h interfaceC5958h, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogP = p(activity, i10, AbstractDialogInterfaceOnClickListenerC6068x.c(interfaceC5958h, b(activity, i10, "d"), 2), onCancelListener, null);
        if (dialogP == null) {
            return false;
        }
        v(activity, dialogP, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final void r(Context context, int i10, String str, PendingIntent pendingIntent) {
        int i11;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null), new IllegalArgumentException());
        if (i10 == 18) {
            w(context);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strB = AbstractC6065u.b(context, i10);
        String strD = AbstractC6065u.d(context, i10);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) AbstractC6056k.l(context.getSystemService("notification"));
        m.e eVarN = new m.e(context).B(true).g(true).o(strB).N(new m.c().b(strD));
        boolean zC = i.c(context);
        int i12 = R.drawable.stat_sys_warning;
        if (zC) {
            AbstractC6056k.p(l.b());
            int i13 = context.getApplicationInfo().icon;
            if (i13 != 0) {
                i12 = i13;
            }
            eVarN.L(i12).F(2);
            if (i.d(context)) {
                eVarN.a(AbstractC5501a.f43269a, resources.getString(b.f43284o), pendingIntent);
            } else {
                eVarN.m(pendingIntent);
            }
        } else {
            eVarN.L(R.drawable.stat_sys_warning).P(resources.getString(b.f43277h)).U(System.currentTimeMillis()).m(pendingIntent).n(strD);
        }
        if (l.e()) {
            AbstractC6056k.p(l.e());
            synchronized (f29010e) {
                str2 = this.f29012c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(b.f43276g);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            eVarN.i(str2);
        }
        Notification notificationD = eVarN.d();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            AbstractC5788g.f44161b.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, notificationD);
    }

    public final boolean s(Context context, C5783b c5783b, int i10) {
        PendingIntent pendingIntentL;
        if (D6.b.a(context) || (pendingIntentL = l(context, c5783b)) == null) {
            return false;
        }
        r(context, c5783b.e(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, pendingIntentL, i10, true), d.f5324a | 134217728));
        return true;
    }

    public final Dialog t(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(AbstractC6065u.c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        v(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    public final C5927I u(Context context, AbstractC5926H abstractC5926H) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme(SentryStackFrame.JsonKeys.PACKAGE);
        C5927I c5927i = new C5927I(abstractC5926H);
        L0.a.m(context, c5927i, intentFilter, 2);
        c5927i.a(context);
        if (i(context, "com.google.android.gms")) {
            return c5927i;
        }
        abstractC5926H.a();
        c5927i.b();
        return null;
    }

    public final void v(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof ActivityC2740v) {
                C5791j.z(dialog, onCancelListener).y(((ActivityC2740v) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        DialogFragmentC5784c.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    public final void w(Context context) {
        new HandlerC5792k(this, context).sendEmptyMessageDelayed(1, 120000L);
    }
}
