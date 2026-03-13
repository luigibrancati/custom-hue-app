package ka;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import ka.InterfaceC4817a;

/* JADX INFO: renamed from: ka.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4822f implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f39487a;

    public C4822f(X3.a aVar) {
        this.f39487a = aVar;
    }

    public static C4822f a(X3.a aVar) {
        return new C4822f(aVar);
    }

    public static BluetoothManager c(Context context) {
        return (BluetoothManager) W3.e.d(InterfaceC4817a.c.e(context));
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public BluetoothManager get() {
        return c((Context) this.f39487a.get());
    }
}
