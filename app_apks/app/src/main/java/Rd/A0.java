package Rd;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class A0 extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient InterfaceC2166z0 f15107a;

    public A0(String str, Throwable th, InterfaceC2166z0 interfaceC2166z0) {
        super(str);
        this.f15107a = interfaceC2166z0;
        if (th != null) {
            initCause(th);
        }
    }

    public final InterfaceC2166z0 a() {
        InterfaceC2166z0 interfaceC2166z0 = this.f15107a;
        return interfaceC2166z0 == null ? L0.f15142a : interfaceC2166z0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof A0)) {
            return false;
        }
        A0 a02 = (A0) obj;
        return AbstractC4862t.a(a02.getMessage(), getMessage()) && AbstractC4862t.a(a02.a(), a()) && AbstractC4862t.a(a02.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        AbstractC4862t.b(message);
        int iHashCode = message.hashCode() * 31;
        InterfaceC2166z0 interfaceC2166z0A = a();
        int iHashCode2 = (iHashCode + (interfaceC2166z0A != null ? interfaceC2166z0A.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + a();
    }
}
