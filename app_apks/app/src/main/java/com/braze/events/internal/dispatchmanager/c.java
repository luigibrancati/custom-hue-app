package com.braze.events.internal.dispatchmanager;

import com.braze.models.q;
import com.braze.requests.o;
import gc.C4206t;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f27718e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f27719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f27720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f27721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f27722d;

    public c(b commandType, List brazeEvents, q qVar, com.braze.requests.b bVar, int i10) {
        brazeEvents = (i10 & 2) != 0 ? C4206t.k() : brazeEvents;
        qVar = (i10 & 4) != 0 ? null : qVar;
        bVar = (i10 & 8) != 0 ? null : bVar;
        AbstractC4862t.e(commandType, "commandType");
        AbstractC4862t.e(brazeEvents, "brazeEvents");
        this.f27719a = commandType;
        this.f27720b = brazeEvents;
        this.f27721c = qVar;
        this.f27722d = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f27719a == cVar.f27719a && AbstractC4862t.a(this.f27720b, cVar.f27720b) && AbstractC4862t.a(this.f27721c, cVar.f27721c) && AbstractC4862t.a(this.f27722d, cVar.f27722d);
    }

    public final int hashCode() {
        int iHashCode = (this.f27720b.hashCode() + (this.f27719a.hashCode() * 31)) * 31;
        q qVar = this.f27721c;
        int iHashCode2 = (iHashCode + (qVar == null ? 0 : qVar.f28111a.hashCode())) * 31;
        o oVar = this.f27722d;
        return iHashCode2 + (oVar != null ? oVar.hashCode() : 0);
    }

    public final String toString() {
        return "DispatchCommandEvent(commandType=" + this.f27719a + ", brazeEvents=" + this.f27720b + ", sessionId=" + this.f27721c + ", brazeRequest=" + this.f27722d + ")";
    }
}
