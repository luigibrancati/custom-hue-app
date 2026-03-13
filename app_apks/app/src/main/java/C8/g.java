package C8;

import C8.g;
import android.content.Context;
import android.content.SharedPreferences;
import b7.C2878l;
import b7.InterfaceC2877k;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import u8.C5992i;
import u8.G;
import u8.H;
import u8.I;
import u8.M;
import u8.X;
import z8.C6552b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f1185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f1186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final G f1187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C8.a f1188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f1189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final H f1190g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f1191h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicReference f1192i;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements InterfaceC2877k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v8.i f1193a;

        public a(v8.i iVar) {
            this.f1193a = iVar;
        }

        @Override // b7.InterfaceC2877k
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Task a(Void r52) throws Throwable {
            JSONObject jSONObject = (JSONObject) this.f1193a.f45904d.d().submit(new Callable() { // from class: C8.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    g.a aVar = this.f1183a;
                    return g.this.f1189f.a(g.this.f1185b, true);
                }
            }).get();
            if (jSONObject != null) {
                d dVarB = g.this.f1186c.b(jSONObject);
                g.this.f1188e.c(dVarB.f1172c, jSONObject);
                g.this.q(jSONObject, "Loaded settings: ");
                g gVar = g.this;
                gVar.r(gVar.f1185b.f1201f);
                g.this.f1191h.set(dVarB);
                ((C2878l) g.this.f1192i.get()).e(dVarB);
            }
            return Tasks.e(null);
        }
    }

    public g(Context context, k kVar, G g10, h hVar, C8.a aVar, l lVar, H h10) {
        AtomicReference atomicReference = new AtomicReference();
        this.f1191h = atomicReference;
        this.f1192i = new AtomicReference(new C2878l());
        this.f1184a = context;
        this.f1185b = kVar;
        this.f1187d = g10;
        this.f1186c = hVar;
        this.f1188e = aVar;
        this.f1189f = lVar;
        this.f1190g = h10;
        atomicReference.set(b.b(g10));
    }

    public static g l(Context context, String str, M m10, C6552b c6552b, String str2, String str3, A8.g gVar, H h10) {
        String strG = m10.g();
        X x10 = new X();
        return new g(context, new k(str, m10.h(), m10.i(), m10.j(), m10, C5992i.h(C5992i.m(context), str, str3, str2), str3, str2, I.b(strG).j()), x10, new h(x10), new C8.a(gVar), new c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), c6552b), h10);
    }

    @Override // C8.j
    public Task a() {
        return ((C2878l) this.f1192i.get()).a();
    }

    @Override // C8.j
    public d b() {
        return (d) this.f1191h.get();
    }

    public boolean k() {
        return !n().equals(this.f1185b.f1201f);
    }

    public final d m(e eVar) throws Throwable {
        d dVar = null;
        try {
            if (!e.SKIP_CACHE_LOOKUP.equals(eVar)) {
                JSONObject jSONObjectB = this.f1188e.b();
                if (jSONObjectB != null) {
                    d dVarB = this.f1186c.b(jSONObjectB);
                    if (dVarB == null) {
                        r8.g.f().e("Failed to parse cached settings data.", null);
                        return null;
                    }
                    q(jSONObjectB, "Loaded cached settings: ");
                    long currentTimeMillis = this.f1187d.getCurrentTimeMillis();
                    if (!e.IGNORE_CACHE_EXPIRATION.equals(eVar) && dVarB.a(currentTimeMillis)) {
                        r8.g.f().i("Cached settings have expired.");
                        return null;
                    }
                    try {
                        r8.g.f().i("Returning cached settings.");
                        return dVarB;
                    } catch (Exception e10) {
                        e = e10;
                        dVar = dVarB;
                        r8.g.f().e("Failed to get cached settings", e);
                        return dVar;
                    }
                }
                r8.g.f().b("No cached settings data found.");
            }
            return null;
        } catch (Exception e11) {
            e = e11;
        }
    }

    public final String n() {
        return C5992i.q(this.f1184a).getString("existing_instance_identifier", "");
    }

    public Task o(e eVar, v8.i iVar) throws Throwable {
        d dVarM;
        if (!k() && (dVarM = m(eVar)) != null) {
            this.f1191h.set(dVarM);
            ((C2878l) this.f1192i.get()).e(dVarM);
            return Tasks.e(null);
        }
        d dVarM2 = m(e.IGNORE_CACHE_EXPIRATION);
        if (dVarM2 != null) {
            this.f1191h.set(dVarM2);
            ((C2878l) this.f1192i.get()).e(dVarM2);
        }
        return this.f1190g.k().s(iVar.f45901a, new a(iVar));
    }

    public Task p(v8.i iVar) {
        return o(e.USE_CACHE, iVar);
    }

    public final void q(JSONObject jSONObject, String str) {
        r8.g.f().b(str + jSONObject.toString());
    }

    public final boolean r(String str) {
        SharedPreferences.Editor editorEdit = C5992i.q(this.f1184a).edit();
        editorEdit.putString("existing_instance_identifier", str);
        editorEdit.apply();
        return true;
    }
}
