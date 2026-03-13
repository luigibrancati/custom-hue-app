package m3;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.AbstractC4862t;
import l3.InterfaceC4879e;

/* JADX INFO: renamed from: m3.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5018j implements InterfaceC4879e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f40193a;

    public C5018j(SQLiteProgram delegate) {
        AbstractC4862t.e(delegate, "delegate");
        this.f40193a = delegate;
    }

    @Override // l3.InterfaceC4879e
    public void I(int i10, double d10) {
        this.f40193a.bindDouble(i10, d10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f40193a.close();
    }

    @Override // l3.InterfaceC4879e
    public void r(int i10, long j10) {
        this.f40193a.bindLong(i10, j10);
    }

    @Override // l3.InterfaceC4879e
    public void s(int i10, byte[] value) {
        AbstractC4862t.e(value, "value");
        this.f40193a.bindBlob(i10, value);
    }

    @Override // l3.InterfaceC4879e
    public void s0(int i10, String value) {
        AbstractC4862t.e(value, "value");
        this.f40193a.bindString(i10, value);
    }

    @Override // l3.InterfaceC4879e
    public void t(int i10) {
        this.f40193a.bindNull(i10);
    }
}
