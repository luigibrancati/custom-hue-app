package io.flutter.plugin.common;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class FlutterException extends RuntimeException {
    private static final String TAG = "FlutterException#";
    public final String code;
    public final Object details;

    public FlutterException(String str, String str2, Object obj) {
        super(str2);
        this.code = str;
        this.details = obj;
    }
}
