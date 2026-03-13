package io.flutter.embedding.engine.dart;

import android.os.Handler;
import android.os.Looper;
import io.flutter.embedding.engine.dart.DartMessenger;
import io.flutter.util.HandlerCompat;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class PlatformTaskQueue implements DartMessenger.DartMessengerTaskQueue {
    private final Handler handler = HandlerCompat.createAsyncHandler(Looper.getMainLooper());

    @Override // io.flutter.embedding.engine.dart.DartMessenger.DartMessengerTaskQueue
    public void dispatch(Runnable runnable) {
        this.handler.post(runnable);
    }
}
