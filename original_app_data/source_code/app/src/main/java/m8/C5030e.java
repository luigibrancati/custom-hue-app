package m8;

import W6.a;
import android.os.Bundle;
import io.sentry.protocol.Message;
import java.util.Objects;

/* JADX INFO: renamed from: m8.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5030e implements a.InterfaceC0241a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5031f f40213a;

    public C5030e(C5031f c5031f) {
        Objects.requireNonNull(c5031f);
        this.f40213a = c5031f;
    }

    @Override // X6.X3
    public final void a(String str, String str2, Bundle bundle, long j10) {
        if (str == null || !AbstractC5027b.c(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j10);
        bundle2.putBundle(Message.JsonKeys.PARAMS, bundle);
        this.f40213a.a().a(3, bundle2);
    }
}
