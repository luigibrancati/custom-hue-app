package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import c9.h;
import com.google.firebase.perf.util.l;
import e9.g;
import h9.k;
import java.io.IOException;
import pe.C;
import pe.C5464A;
import pe.D;
import pe.InterfaceC5469e;
import pe.InterfaceC5470f;
import pe.v;
import pe.x;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class FirebasePerfOkHttpClient {
    public static void a(C c10, h hVar, long j10, long j11) {
        C5464A c5464aK = c10.K();
        if (c5464aK == null) {
            return;
        }
        hVar.v(c5464aK.k().s().toString());
        hVar.j(c5464aK.i());
        if (c5464aK.a() != null) {
            long jA = c5464aK.a().a();
            if (jA != -1) {
                hVar.m(jA);
            }
        }
        D dB = c10.b();
        if (dB != null) {
            long jA2 = dB.a();
            if (jA2 != -1) {
                hVar.q(jA2);
            }
            x xVarB = dB.b();
            if (xVarB != null) {
                hVar.o(xVarB.toString());
            }
        }
        hVar.k(c10.g());
        hVar.n(j10);
        hVar.t(j11);
        hVar.b();
    }

    @Keep
    public static void enqueue(InterfaceC5469e interfaceC5469e, InterfaceC5470f interfaceC5470f) {
        l lVar = new l();
        interfaceC5469e.g0(new g(interfaceC5470f, k.k(), lVar, lVar.e()));
    }

    @Keep
    public static C execute(InterfaceC5469e interfaceC5469e) throws IOException {
        h hVarC = h.c(k.k());
        l lVar = new l();
        long jE = lVar.e();
        try {
            C cL = interfaceC5469e.l();
            a(cL, hVarC, jE, lVar.c());
            return cL;
        } catch (IOException e10) {
            C5464A c5464aD = interfaceC5469e.d();
            if (c5464aD != null) {
                v vVarK = c5464aD.k();
                if (vVarK != null) {
                    hVarC.v(vVarK.s().toString());
                }
                if (c5464aD.i() != null) {
                    hVarC.j(c5464aD.i());
                }
            }
            hVarC.n(jE);
            hVarC.t(lVar.c());
            e9.h.d(hVarC);
            throw e10;
        }
    }
}
