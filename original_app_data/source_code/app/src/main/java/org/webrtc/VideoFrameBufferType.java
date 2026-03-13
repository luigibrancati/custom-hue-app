package org.webrtc;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.TYPE_USE})
@Retention(RetentionPolicy.SOURCE)
public @interface VideoFrameBufferType {
    public static final int I010 = 5;
    public static final int I210 = 6;
    public static final int I410 = 7;
    public static final int I420 = 1;
    public static final int I420A = 2;
    public static final int I422 = 3;
    public static final int I444 = 4;
    public static final int NATIVE = 0;
    public static final int NV12 = 8;
}
