package io.flutter.plugin.common;

import io.flutter.Log;
import io.flutter.plugin.common.MethodChannel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ErrorLogResult implements MethodChannel.Result {
    private int level;
    private String tag;

    public ErrorLogResult(String str) {
        this(str, Log.WARN);
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void error(String str, String str2, Object obj) {
        String str3;
        if (obj != null) {
            str3 = " details: " + obj;
        } else {
            str3 = "";
        }
        int i10 = this.level;
        if (i10 < Log.WARN) {
            return;
        }
        Log.println(i10, this.tag, str2 + str3);
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void notImplemented() {
        int i10 = this.level;
        if (i10 < Log.WARN) {
            return;
        }
        Log.println(i10, this.tag, "method not implemented");
    }

    public ErrorLogResult(String str, int i10) {
        this.tag = str;
        this.level = i10;
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void success(Object obj) {
    }
}
