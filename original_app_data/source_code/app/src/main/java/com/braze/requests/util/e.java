package com.braze.requests.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.dispatch.h;
import com.braze.managers.j1;
import com.braze.support.StringUtils;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static SharedPreferences a(h dispatchDataProvider, String filePrefix, String specificName) throws NoSuchAlgorithmException {
        AbstractC4862t.e(dispatchDataProvider, "dispatchDataProvider");
        AbstractC4862t.e(filePrefix, "filePrefix");
        AbstractC4862t.e(specificName, "specificName");
        j1 j1Var = (j1) dispatchDataProvider.f();
        Context contextB = j1Var.b();
        SharedPreferences sharedPreferences = contextB.getSharedPreferences(filePrefix + "." + specificName + StringUtils.getCacheFileSuffix(contextB, j1Var.c(), j1Var.a()), 0);
        AbstractC4862t.d(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }
}
