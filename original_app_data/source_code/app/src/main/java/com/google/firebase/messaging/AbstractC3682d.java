package com.google.firebase.messaging;

import android.os.Bundle;
import b0.C2777a;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.firebase.messaging.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3682d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f31720a = TimeUnit.MINUTES.toMillis(3);

    /* JADX INFO: renamed from: com.google.firebase.messaging.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public static C2777a a(Bundle bundle) {
            C2777a c2777a = new C2777a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        c2777a.put(str, str2);
                    }
                }
            }
            return c2777a;
        }
    }
}
