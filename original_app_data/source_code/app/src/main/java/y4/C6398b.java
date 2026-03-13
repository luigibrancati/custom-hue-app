package y4;

import android.content.SharedPreferences;
import kotlin.jvm.internal.AbstractC4862t;
import q4.C5488d;

/* JADX INFO: renamed from: y4.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6398b implements D4.g {
    @Override // D4.g
    public D4.f a(D4.a amplitude, String str) {
        AbstractC4862t.e(amplitude, "amplitude");
        D4.b bVarL = amplitude.l();
        AbstractC4862t.c(bVarL, "null cannot be cast to non-null type com.amplitude.android.Configuration");
        C5488d c5488d = (C5488d) bVarL;
        SharedPreferences sharedPreferences = c5488d.C().getSharedPreferences("amplitude-identify-intercept-" + c5488d.l(), 0);
        String strL = c5488d.l();
        A4.a aVarA = c5488d.m().a(amplitude);
        AbstractC4862t.b(sharedPreferences);
        return new C6402f(strL, aVarA, sharedPreferences, C6401e.f48404a.c(c5488d), amplitude.n());
    }
}
