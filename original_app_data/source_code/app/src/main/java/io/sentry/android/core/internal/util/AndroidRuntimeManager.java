package io.sentry.android.core.internal.util;

import android.os.StrictMode;
import io.sentry.util.runtime.IRuntimeManager;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class AndroidRuntimeManager implements IRuntimeManager {
    public static /* synthetic */ Object a(Runnable runnable) {
        runnable.run();
        return null;
    }

    @Override // io.sentry.util.runtime.IRuntimeManager
    public <T> T runWithRelaxedPolicy(IRuntimeManager.IRuntimeManagerCallback<T> iRuntimeManagerCallback) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        try {
            return iRuntimeManagerCallback.run();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    @Override // io.sentry.util.runtime.IRuntimeManager
    public void runWithRelaxedPolicy(final Runnable runnable) {
        runWithRelaxedPolicy(new IRuntimeManager.IRuntimeManagerCallback() { // from class: io.sentry.android.core.internal.util.e
            @Override // io.sentry.util.runtime.IRuntimeManager.IRuntimeManagerCallback
            public final Object run() {
                return AndroidRuntimeManager.a(runnable);
            }
        });
    }
}
