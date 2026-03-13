package M8;

import M8.j;
import android.content.Context;
import android.util.Base64OutputStream;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import h8.C4288f;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import n8.InterfaceC5149a;
import o8.C5233c;
import o8.E;
import o8.InterfaceC5234d;
import o8.q;
import o8.w;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class f implements i, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O8.b f9391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f9392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O8.b f9393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f9394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f9395e;

    public f(final Context context, final String str, Set set, O8.b bVar, Executor executor) {
        this(new w(new O8.b() { // from class: M8.c
            @Override // O8.b
            public final Object get() {
                return f.d(context, str);
            }
        }), set, executor, bVar, context);
    }

    public static /* synthetic */ String c(f fVar) {
        String string;
        synchronized (fVar) {
            try {
                o oVar = (o) fVar.f9391a.get();
                List listG = oVar.g();
                oVar.f();
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < listG.size(); i10++) {
                    p pVar = (p) listG.get(i10);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", pVar.c());
                    jSONObject.put("dates", new JSONArray((Collection) pVar.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    public static /* synthetic */ o d(Context context, String str) {
        return new o(context, str);
    }

    public static /* synthetic */ f e(E e10, InterfaceC5234d interfaceC5234d) {
        return new f((Context) interfaceC5234d.get(Context.class), ((C4288f) interfaceC5234d.get(C4288f.class)).s(), interfaceC5234d.c(g.class), interfaceC5234d.e(j9.i.class), (Executor) interfaceC5234d.g(e10));
    }

    public static /* synthetic */ Void f(f fVar) {
        synchronized (fVar) {
            ((o) fVar.f9391a.get()).o(System.currentTimeMillis(), ((j9.i) fVar.f9393c.get()).a());
        }
        return null;
    }

    public static C5233c g() {
        final E eA = E.a(InterfaceC5149a.class, Executor.class);
        return C5233c.d(f.class, i.class, j.class).b(q.k(Context.class)).b(q.k(C4288f.class)).b(q.o(g.class)).b(q.m(j9.i.class)).b(q.l(eA)).f(new o8.g() { // from class: M8.b
            @Override // o8.g
            public final Object a(InterfaceC5234d interfaceC5234d) {
                return f.e(eA, interfaceC5234d);
            }
        }).d();
    }

    @Override // M8.i
    public Task a() {
        return !U0.n.a(this.f9392b) ? Tasks.e("") : Tasks.b(this.f9395e, new Callable() { // from class: M8.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f.c(this.f9389a);
            }
        });
    }

    @Override // M8.j
    public synchronized j.a b(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        o oVar = (o) this.f9391a.get();
        if (!oVar.m(jCurrentTimeMillis)) {
            return j.a.NONE;
        }
        oVar.k();
        return j.a.GLOBAL;
    }

    public Task h() {
        return this.f9394d.size() <= 0 ? Tasks.e(null) : !U0.n.a(this.f9392b) ? Tasks.e(null) : Tasks.b(this.f9395e, new Callable() { // from class: M8.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f.f(this.f9390a);
            }
        });
    }

    public f(O8.b bVar, Set set, Executor executor, O8.b bVar2, Context context) {
        this.f9391a = bVar;
        this.f9394d = set;
        this.f9395e = executor;
        this.f9393c = bVar2;
        this.f9392b = context;
    }
}
