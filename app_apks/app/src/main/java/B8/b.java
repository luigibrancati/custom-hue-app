package B8;

import C8.j;
import Y5.h;
import android.content.Context;
import b6.u;
import com.google.android.gms.tasks.Task;
import java.nio.charset.Charset;
import u8.E;
import u8.S;
import x8.F;
import y8.C6454j;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C6454j f751c = new C6454j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f752d = d("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f753e = d("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f754f = new h() { // from class: B8.a
        @Override // Y5.h
        public final Object apply(Object obj) {
            return b.f751c.M((F) obj).getBytes(Charset.forName("UTF-8"));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f756b;

    public b(e eVar, h hVar) {
        this.f755a = eVar;
        this.f756b = hVar;
    }

    public static b b(Context context, j jVar, S s10) {
        u.f(context);
        Y5.j jVarG = u.c().g(new Z5.a(f752d, f753e));
        Y5.c cVarB = Y5.c.b("json");
        h hVar = f754f;
        return new b(new e(jVarG.a("FIREBASE_CRASHLYTICS_REPORT", F.class, cVarB, hVar), jVar.b(), s10), hVar);
    }

    public static String d(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str.length() + str2.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb2.append(str2.charAt(i10));
            }
        }
        return sb2.toString();
    }

    public Task c(E e10, boolean z10) {
        return this.f755a.i(e10, z10).a();
    }
}
