package v6;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: renamed from: v6.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6066v extends AbstractDialogInterfaceOnClickListenerC6068x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f45883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f45884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f45885c;

    public C6066v(Intent intent, Activity activity, int i10) {
        this.f45883a = intent;
        this.f45884b = activity;
        this.f45885c = i10;
    }

    @Override // v6.AbstractDialogInterfaceOnClickListenerC6068x
    public final void a() {
        Intent intent = this.f45883a;
        if (intent != null) {
            this.f45884b.startActivityForResult(intent, this.f45885c);
        }
    }
}
