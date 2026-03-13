package kc;

import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: kc.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4837a {

    /* JADX INFO: renamed from: kc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0516a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC6082a f39540a;

        public C0516a(InterfaceC6082a interfaceC6082a) {
            this.f39540a = interfaceC6082a;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f39540a.invoke();
        }
    }

    public static final Thread a(boolean z10, boolean z11, ClassLoader classLoader, String str, int i10, InterfaceC6082a block) {
        AbstractC4862t.e(block, "block");
        C0516a c0516a = new C0516a(block);
        if (z11) {
            c0516a.setDaemon(true);
        }
        if (i10 > 0) {
            c0516a.setPriority(i10);
        }
        if (str != null) {
            c0516a.setName(str);
        }
        if (classLoader != null) {
            c0516a.setContextClassLoader(classLoader);
        }
        if (z10) {
            c0516a.start();
        }
        return c0516a;
    }

    public static /* synthetic */ Thread b(boolean z10, boolean z11, ClassLoader classLoader, String str, int i10, InterfaceC6082a interfaceC6082a, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            classLoader = null;
        }
        if ((i11 & 8) != 0) {
            str = null;
        }
        if ((i11 & 16) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        String str2 = str;
        return a(z10, z11, classLoader, str2, i12, interfaceC6082a);
    }
}
