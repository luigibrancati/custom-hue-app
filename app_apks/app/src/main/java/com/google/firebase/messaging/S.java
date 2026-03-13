package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import b7.InterfaceC2874h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class S {
    public static SharedPreferences b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static boolean c(Context context) {
        return b(context).getBoolean("proxy_notification_initialized", false);
    }

    public static boolean d(SharedPreferences sharedPreferences, boolean z10) {
        return sharedPreferences.contains("proxy_retention") && sharedPreferences.getBoolean("proxy_retention", false) == z10;
    }

    public static void e(Context context, boolean z10) {
        SharedPreferences.Editor editorEdit = b(context).edit();
        editorEdit.putBoolean("proxy_notification_initialized", z10);
        editorEdit.apply();
    }

    public static void f(final Context context, G g10, final boolean z10) {
        if (B6.l.g() && !d(b(context), z10)) {
            g10.k(z10).i(new X2.g(), new InterfaceC2874h() { // from class: com.google.firebase.messaging.Q
                @Override // b7.InterfaceC2874h
                public final void onSuccess(Object obj) {
                    S.g(context, z10);
                }
            });
        }
    }

    public static void g(Context context, boolean z10) {
        SharedPreferences.Editor editorEdit = b(context).edit();
        editorEdit.putBoolean("proxy_retention", z10);
        editorEdit.apply();
    }
}
