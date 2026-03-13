package org.chromium.support_lib_boundary;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class ProcessGlobalConfigConstants {
    public static final String CACHE_DIRECTORY_BASE_PATH = "CACHE_DIRECTORY_BASE_PATH";
    public static final String CONFIGURE_PARTITIONED_COOKIES = "CONFIGURE_PARTITIONED_COOKIES";
    public static final String DATA_DIRECTORY_BASE_PATH = "DATA_DIRECTORY_BASE_PATH";
    public static final String DATA_DIRECTORY_SUFFIX = "DATA_DIRECTORY_SUFFIX";

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ProcessGlobalConfigMapKey {
    }
}
