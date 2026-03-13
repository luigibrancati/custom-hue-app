package io.flutter.plugins.firebase.messaging;

import android.app.Activity;
import io.flutter.plugin.common.PluginRegistry;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class FlutterFirebasePermissionManager implements PluginRegistry.RequestPermissionsResultListener {
    private final int permissionCode = 240;
    private boolean requestInProgress = false;
    private RequestPermissionsSuccessCallback successCallback;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @FunctionalInterface
    public interface RequestPermissionsSuccessCallback {
        void onSuccess(int i10);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        RequestPermissionsSuccessCallback requestPermissionsSuccessCallback;
        int i11 = 0;
        if (!this.requestInProgress || i10 != 240 || (requestPermissionsSuccessCallback = this.successCallback) == null) {
            return false;
        }
        this.requestInProgress = false;
        if (iArr.length > 0 && iArr[0] == 0) {
            i11 = 1;
        }
        requestPermissionsSuccessCallback.onSuccess(i11);
        return true;
    }

    public void requestPermissions(Activity activity, RequestPermissionsSuccessCallback requestPermissionsSuccessCallback, ErrorCallback errorCallback) {
        if (this.requestInProgress) {
            errorCallback.onError("A request for permissions is already running, please wait for it to finish before doing another request.");
            return;
        }
        if (activity == null) {
            errorCallback.onError("Unable to detect current Android Activity.");
            return;
        }
        this.successCallback = requestPermissionsSuccessCallback;
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.POST_NOTIFICATIONS");
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        if (this.requestInProgress) {
            return;
        }
        androidx.core.app.a.v(activity, strArr, 240);
        this.requestInProgress = true;
    }
}
