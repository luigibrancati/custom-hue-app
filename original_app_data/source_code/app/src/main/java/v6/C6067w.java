package v6;

import android.content.Intent;
import u6.InterfaceC5958h;

/* JADX INFO: renamed from: v6.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6067w extends AbstractDialogInterfaceOnClickListenerC6068x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f45886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5958h f45887b;

    public C6067w(Intent intent, InterfaceC5958h interfaceC5958h, int i10) {
        this.f45886a = intent;
        this.f45887b = interfaceC5958h;
    }

    @Override // v6.AbstractDialogInterfaceOnClickListenerC6068x
    public final void a() {
        Intent intent = this.f45886a;
        if (intent != null) {
            this.f45887b.startActivityForResult(intent, 2);
        }
    }
}
