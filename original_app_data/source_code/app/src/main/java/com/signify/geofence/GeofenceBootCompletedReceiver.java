package com.signify.geofence;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import za.m;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/signify/geofence/GeofenceBootCompletedReceiver;", "Lza/m;", "<init>", "()V", "Landroid/content/Intent;", "intent", "", "a", "(Landroid/content/Intent;)Z", "geofence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GeofenceBootCompletedReceiver extends m {
    public GeofenceBootCompletedReceiver() {
        super("GeofenceBootCompletedReceiver", true);
    }

    @Override // za.m
    public boolean a(Intent intent) {
        AbstractC4862t.e(intent, "intent");
        return AbstractC4862t.a(intent.getAction(), "android.intent.action.BOOT_COMPLETED") || AbstractC4862t.a(intent.getAction(), "android.intent.action.QUICKBOOT_POWERON");
    }
}
