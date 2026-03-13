package com.google.firebase.perf.util;

import b9.C2898a;
import c9.g;
import com.google.firebase.perf.metrics.Trace;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2898a f31864a = C2898a.e();

    public static Trace a(Trace trace, g.a aVar) {
        if (aVar.d() > 0) {
            trace.putMetric(b.FRAMES_TOTAL.toString(), aVar.d());
        }
        if (aVar.c() > 0) {
            trace.putMetric(b.FRAMES_SLOW.toString(), aVar.c());
        }
        if (aVar.b() > 0) {
            trace.putMetric(b.FRAMES_FROZEN.toString(), aVar.b());
        }
        f31864a.a("Screen trace: " + trace.e() + " _fr_tot:" + aVar.d() + " _fr_slo:" + aVar.c() + " _fr_fzn:" + aVar.b());
        return trace;
    }
}
