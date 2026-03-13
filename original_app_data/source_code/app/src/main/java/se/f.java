package se;

import Fe.AbstractC0851m;
import Fe.C0843e;
import Fe.H;
import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC4862t;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class f extends AbstractC0851m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f44550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44551c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(H delegate, l onException) {
        super(delegate);
        AbstractC4862t.e(delegate, "delegate");
        AbstractC4862t.e(onException, "onException");
        this.f44550b = onException;
    }

    @Override // Fe.AbstractC0851m, Fe.H
    public void J(C0843e source, long j10) throws EOFException {
        AbstractC4862t.e(source, "source");
        if (this.f44551c) {
            source.skip(j10);
            return;
        }
        try {
            super.J(source, j10);
        } catch (IOException e10) {
            this.f44551c = true;
            this.f44550b.invoke(e10);
        }
    }

    @Override // Fe.AbstractC0851m, Fe.H, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
        try {
            super.close();
        } catch (IOException e10) {
            this.f44551c = true;
            this.f44550b.invoke(e10);
        }
    }

    @Override // Fe.AbstractC0851m, Fe.H, java.io.Flushable
    public void flush() {
        if (this.f44551c) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e10) {
            this.f44551c = true;
            this.f44550b.invoke(e10);
        }
    }
}
