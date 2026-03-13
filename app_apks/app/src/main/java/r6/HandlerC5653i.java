package r6;

import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: r6.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC5653i extends I6.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5647c f43773b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC5653i(C5647c c5647c, Looper looper) {
        super(looper);
        this.f43773b = c5647c;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C5647c.g(this.f43773b, message);
    }
}
