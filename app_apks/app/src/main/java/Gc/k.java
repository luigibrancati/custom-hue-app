package Gc;

import gc.C4206t;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class k implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f4727a = new k();

    @Override // Gc.e
    public List a() {
        return C4206t.k();
    }

    public Void b() {
        return null;
    }

    @Override // Gc.e
    public Object call(Object[] args) {
        AbstractC4862t.e(args, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // Gc.e
    public /* bridge */ /* synthetic */ Member getMember() {
        return (Member) b();
    }

    @Override // Gc.e
    public Type getReturnType() {
        Class TYPE = Void.TYPE;
        AbstractC4862t.d(TYPE, "TYPE");
        return TYPE;
    }
}
