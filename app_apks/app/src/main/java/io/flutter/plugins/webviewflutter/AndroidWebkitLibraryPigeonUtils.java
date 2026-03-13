package io.flutter.plugins.webviewflutter;

import android.util.Log;
import gc.C4205s;
import gc.C4206t;
import io.sentry.protocol.FeatureFlag;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001J\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, d2 = {"Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonUtils;", "", "<init>", "()V", "createConnectionError", "Lio/flutter/plugins/webviewflutter/AndroidWebKitError;", "channelName", "", "wrapResult", "", FeatureFlag.JsonKeys.RESULT, "wrapError", "exception", "", "webview_flutter_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class AndroidWebkitLibraryPigeonUtils {
    public static final AndroidWebkitLibraryPigeonUtils INSTANCE = new AndroidWebkitLibraryPigeonUtils();

    private AndroidWebkitLibraryPigeonUtils() {
    }

    public final AndroidWebKitError createConnectionError(String channelName) {
        AbstractC4862t.e(channelName, "channelName");
        return new AndroidWebKitError("channel-error", "Unable to establish connection on channel: '" + channelName + "'.", "");
    }

    public final List<Object> wrapError(Throwable exception) {
        AbstractC4862t.e(exception, "exception");
        if (exception instanceof AndroidWebKitError) {
            AndroidWebKitError androidWebKitError = (AndroidWebKitError) exception;
            return C4206t.n(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
        }
        return C4206t.n(exception.getClass().getSimpleName(), exception.toString(), "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception));
    }

    public final List<Object> wrapResult(Object result) {
        return C4205s.d(result);
    }
}
