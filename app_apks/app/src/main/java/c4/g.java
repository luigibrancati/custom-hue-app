package c4;

import Fe.H;
import Fe.InterfaceC0845g;
import Fe.v;
import a4.InterfaceC2641a;
import android.graphics.drawable.ColorDrawable;
import j4.AbstractC4689h;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f25611a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f25612b = new c(new ColorDrawable(), false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H f25613c = v.a();

    @Override // c4.e
    public Object a(InterfaceC2641a interfaceC2641a, InterfaceC0845g interfaceC0845g, AbstractC4689h abstractC4689h, i iVar, InterfaceC4988e interfaceC4988e) throws IOException {
        try {
            interfaceC0845g.f0(f25613c);
            sc.c.a(interfaceC0845g, null);
            return f25612b;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                sc.c.a(interfaceC0845g, th);
                throw th2;
            }
        }
    }

    @Override // c4.e
    public boolean b(InterfaceC0845g source, String str) {
        AbstractC4862t.e(source, "source");
        return false;
    }
}
