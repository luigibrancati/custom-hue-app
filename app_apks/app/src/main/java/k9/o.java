package k9;

import android.content.Context;
import android.util.Log;
import b7.InterfaceC2869c;
import b7.InterfaceC2877k;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import h8.C4288f;
import i8.C4366a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f39280n = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f39281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4288f f39282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i8.c f39283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f39284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l9.e f39285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l9.e f39286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l9.e f39287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.c f39288h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l9.l f39289i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.e f39290j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final P8.h f39291k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l9.m f39292l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m9.e f39293m;

    public o(Context context, C4288f c4288f, P8.h hVar, i8.c cVar, Executor executor, l9.e eVar, l9.e eVar2, l9.e eVar3, com.google.firebase.remoteconfig.internal.c cVar2, l9.l lVar, com.google.firebase.remoteconfig.internal.e eVar4, l9.m mVar, m9.e eVar5) {
        this.f39281a = context;
        this.f39282b = c4288f;
        this.f39291k = hVar;
        this.f39283c = cVar;
        this.f39284d = executor;
        this.f39285e = eVar;
        this.f39286f = eVar2;
        this.f39287g = eVar3;
        this.f39288h = cVar2;
        this.f39289i = lVar;
        this.f39290j = eVar4;
        this.f39292l = mVar;
        this.f39293m = eVar5;
    }

    public static /* synthetic */ Void a(o oVar, u uVar) {
        oVar.f39290j.m(uVar);
        return null;
    }

    public static /* synthetic */ Void c(o oVar, e eVar) {
        oVar.f39290j.n(eVar.f39267a);
        return null;
    }

    public static /* synthetic */ s e(Task task, Task task2) {
        return (s) task.m();
    }

    public static /* synthetic */ Task h(final o oVar, Task task, Task task2, Task task3) {
        oVar.getClass();
        if (!task.q() || task.m() == null) {
            return Tasks.e(Boolean.FALSE);
        }
        com.google.firebase.remoteconfig.internal.b bVar = (com.google.firebase.remoteconfig.internal.b) task.m();
        return (!task2.q() || r(bVar, (com.google.firebase.remoteconfig.internal.b) task2.m())) ? oVar.f39286f.i(bVar).j(oVar.f39284d, new InterfaceC2869c() { // from class: k9.n
            @Override // b7.InterfaceC2869c
            public final Object a(Task task4) {
                return Boolean.valueOf(this.f39279a.s(task4));
            }
        }) : Tasks.e(Boolean.FALSE);
    }

    public static o p(C4288f c4288f) {
        return ((z) c4288f.k(z.class)).g();
    }

    public static boolean r(com.google.firebase.remoteconfig.internal.b bVar, com.google.firebase.remoteconfig.internal.b bVar2) {
        return bVar2 == null || !bVar.h().equals(bVar2.h());
    }

    public static List z(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public void A(JSONArray jSONArray) {
        if (this.f39283c == null) {
            return;
        }
        try {
            this.f39283c.m(z(jSONArray));
        } catch (C4366a e10) {
            Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e10);
        } catch (JSONException e11) {
            Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e11);
        }
    }

    public Task i() {
        final Task taskE = this.f39285e.e();
        final Task taskE2 = this.f39286f.e();
        return Tasks.j(taskE, taskE2).k(this.f39284d, new InterfaceC2869c() { // from class: k9.f
            @Override // b7.InterfaceC2869c
            public final Object a(Task task) {
                return o.h(this.f39269a, taskE, taskE2, task);
            }
        });
    }

    public d j(c cVar) {
        return this.f39292l.b(cVar);
    }

    public Task k() {
        Task taskE = this.f39286f.e();
        Task taskE2 = this.f39287g.e();
        Task taskE3 = this.f39285e.e();
        final Task taskB = Tasks.b(this.f39284d, new Callable() { // from class: k9.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f39276a.o();
            }
        });
        return Tasks.j(taskE, taskE2, taskE3, taskB, this.f39291k.getId(), this.f39291k.a(false)).j(this.f39284d, new InterfaceC2869c() { // from class: k9.k
            @Override // b7.InterfaceC2869c
            public final Object a(Task task) {
                return o.e(taskB, task);
            }
        });
    }

    public Task l() {
        return this.f39288h.i().s(p8.y.a(), new InterfaceC2877k() { // from class: k9.m
            @Override // b7.InterfaceC2877k
            public final Task a(Object obj) {
                return Tasks.e(null);
            }
        });
    }

    public Task m() {
        return l().s(this.f39284d, new InterfaceC2877k() { // from class: k9.l
            @Override // b7.InterfaceC2877k
            public final Task a(Object obj) {
                return this.f39278a.i();
            }
        });
    }

    public Map n() {
        return this.f39289i.d();
    }

    public s o() {
        return this.f39290j.d();
    }

    public m9.e q() {
        return this.f39293m;
    }

    public final boolean s(Task task) {
        if (!task.q()) {
            return false;
        }
        this.f39285e.d();
        com.google.firebase.remoteconfig.internal.b bVar = (com.google.firebase.remoteconfig.internal.b) task.m();
        if (bVar == null) {
            Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            return true;
        }
        A(bVar.e());
        this.f39293m.d(bVar);
        return true;
    }

    public Task t(final u uVar) {
        return Tasks.b(this.f39284d, new Callable() { // from class: k9.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return o.a(this.f39274a, uVar);
            }
        });
    }

    public void u(boolean z10) {
        this.f39292l.e(z10);
    }

    public Task v(final e eVar) {
        return Tasks.b(this.f39284d, new Callable() { // from class: k9.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return o.c(this.f39272a, eVar);
            }
        });
    }

    public Task w(Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                map2.put((String) entry.getKey(), new String((byte[]) value));
            } else {
                map2.put((String) entry.getKey(), value.toString());
            }
        }
        return x(map2);
    }

    public final Task x(Map map) {
        try {
            return this.f39287g.i(com.google.firebase.remoteconfig.internal.b.l().b(map).a()).s(p8.y.a(), new InterfaceC2877k() { // from class: k9.g
                @Override // b7.InterfaceC2877k
                public final Task a(Object obj) {
                    return Tasks.e(null);
                }
            });
        } catch (JSONException e10) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e10);
            return Tasks.e(null);
        }
    }

    public void y() {
        this.f39286f.e();
        this.f39287g.e();
        this.f39285e.e();
    }
}
