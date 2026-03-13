package ka;

import android.bluetooth.BluetoothAdapter;
import ka.InterfaceC4817a;

/* JADX INFO: renamed from: ka.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4818b implements W3.c {

    /* JADX INFO: renamed from: ka.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C4818b f39483a = new C4818b();
    }

    public static C4818b a() {
        return a.f39483a;
    }

    public static BluetoothAdapter c() {
        return InterfaceC4817a.c.a();
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public BluetoothAdapter get() {
        return c();
    }
}
