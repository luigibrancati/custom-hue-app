package qe;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: qe.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5518a {
    public static final String[] a(pe.m mVar, String[] socketEnabledCipherSuites) {
        AbstractC4862t.e(mVar, "<this>");
        AbstractC4862t.e(socketEnabledCipherSuites, "socketEnabledCipherSuites");
        return mVar.d() != null ? m.y(mVar.d(), socketEnabledCipherSuites, pe.i.f42735b.c()) : socketEnabledCipherSuites;
    }
}
