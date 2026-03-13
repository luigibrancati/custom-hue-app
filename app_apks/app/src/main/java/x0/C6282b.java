package x0;

import io.sentry.protocol.Request;
import kotlin.Metadata;
import l0.InterfaceC4869e;
import v0.k;
import vc.l;

/* JADX INFO: renamed from: x0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lx0/b;", "Lv0/k;", "", "", "mergeDescendants", "Lkotlin/Function1;", "Lx0/i;", "Lfc/H;", "properties", "<init>", "(ZLvc/l;)V", Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Z", "getMergeDescendants", "()Z", "c", "Lvc/l;", "getProperties", "()Lvc/l;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class C6282b extends k implements InterfaceC4869e.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean mergeDescendants;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final l properties;

    public C6282b(boolean z10, l lVar) {
        this.mergeDescendants = z10;
        this.properties = lVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C6282b)) {
            return false;
        }
        C6282b c6282b = (C6282b) other;
        return this.mergeDescendants == c6282b.mergeDescendants && this.properties == c6282b.properties;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.mergeDescendants) * 31) + this.properties.hashCode();
    }
}
