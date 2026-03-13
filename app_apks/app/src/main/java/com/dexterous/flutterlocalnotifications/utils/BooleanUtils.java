package com.dexterous.flutterlocalnotifications.utils;

import androidx.annotation.Keep;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Keep
public class BooleanUtils {
    public static boolean getValue(Boolean bool) {
        return bool != null && bool.booleanValue();
    }
}
