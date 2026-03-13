package com.braze.support;

import Od.C1823c;
import com.braze.support.BrazeLogger;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f28650a = new x();

    public static final String a(String key) {
        AbstractC4862t.e(key, "key");
        try {
            InputStream inputStream = Runtime.getRuntime().exec(new String[]{"/system/bin/getprop", key}).getInputStream();
            AbstractC4862t.d(inputStream, "getInputStream(...)");
            return new BufferedReader(new InputStreamReader(inputStream, C1823c.f12394b), 8192).readLine();
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f28650a, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: s5.n1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.support.x.a();
                }
            }, 4, (Object) null);
            return "";
        }
    }

    public static final String a() {
        return "Caught exception while trying to read BrazeLogger tag from system properties.";
    }
}
