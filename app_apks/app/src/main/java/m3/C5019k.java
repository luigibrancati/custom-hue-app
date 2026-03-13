package m3;

import android.database.sqlite.SQLiteStatement;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: m3.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5019k extends C5018j implements l3.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SQLiteStatement f40194b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5019k(SQLiteStatement delegate) {
        super(delegate);
        AbstractC4862t.e(delegate, "delegate");
        this.f40194b = delegate;
    }

    @Override // l3.g
    public int E() {
        return this.f40194b.executeUpdateDelete();
    }

    @Override // l3.g
    public void l() {
        this.f40194b.execute();
    }
}
