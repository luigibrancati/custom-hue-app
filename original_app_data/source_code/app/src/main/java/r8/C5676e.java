package r8;

import gc.C4207u;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import o9.AbstractC5240d;
import o9.AbstractC5241e;
import o9.InterfaceC5242f;
import w8.p;

/* JADX INFO: renamed from: r8.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5676e implements InterfaceC5242f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f43824a;

    public C5676e(p userMetadata) {
        AbstractC4862t.e(userMetadata, "userMetadata");
        this.f43824a = userMetadata;
    }

    @Override // o9.InterfaceC5242f
    public void a(AbstractC5241e rolloutsState) {
        AbstractC4862t.e(rolloutsState, "rolloutsState");
        p pVar = this.f43824a;
        Set<AbstractC5240d> setB = rolloutsState.b();
        AbstractC4862t.d(setB, "getRolloutAssignments(...)");
        ArrayList arrayList = new ArrayList(C4207u.v(setB, 10));
        for (AbstractC5240d abstractC5240d : setB) {
            arrayList.add(w8.j.b(abstractC5240d.d(), abstractC5240d.b(), abstractC5240d.c(), abstractC5240d.f(), abstractC5240d.e()));
        }
        pVar.r(arrayList);
        g.f().b("Updated Crashlytics Rollout State");
    }
}
