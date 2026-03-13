package M0;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.app.u;
import androidx.core.graphics.drawable.IconCompat;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f8880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f8881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Intent[] f8882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ComponentName f8883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f8884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f8885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CharSequence f8886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public IconCompat f8887h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public u[] f8888i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Set f8889j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public L0.c f8890k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f8891l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8892m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public PersistableBundle f8893n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f8894o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8895p;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static void a(ShortcutInfo.Builder builder, int i10) {
            builder.setExcludedFromSurfaces(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f8896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f8897b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Set f8898c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Map f8899d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Uri f8900e;

        public b(Context context, String str) {
            c cVar = new c();
            this.f8896a = cVar;
            cVar.f8880a = context;
            cVar.f8881b = str;
        }

        public c a() {
            if (TextUtils.isEmpty(this.f8896a.f8884e)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            c cVar = this.f8896a;
            Intent[] intentArr = cVar.f8882c;
            if (intentArr == null || intentArr.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            if (this.f8897b) {
                if (cVar.f8890k == null) {
                    cVar.f8890k = new L0.c(cVar.f8881b);
                }
                this.f8896a.f8891l = true;
            }
            if (this.f8898c != null) {
                c cVar2 = this.f8896a;
                if (cVar2.f8889j == null) {
                    cVar2.f8889j = new HashSet();
                }
                this.f8896a.f8889j.addAll(this.f8898c);
            }
            if (this.f8899d != null) {
                c cVar3 = this.f8896a;
                if (cVar3.f8893n == null) {
                    cVar3.f8893n = new PersistableBundle();
                }
                for (String str : this.f8899d.keySet()) {
                    Map map = (Map) this.f8899d.get(str);
                    this.f8896a.f8893n.putStringArray(str, (String[]) map.keySet().toArray(new String[0]));
                    for (String str2 : map.keySet()) {
                        List list = (List) map.get(str2);
                        this.f8896a.f8893n.putStringArray(str + "/" + str2, list == null ? new String[0] : (String[]) list.toArray(new String[0]));
                    }
                }
            }
            if (this.f8900e != null) {
                c cVar4 = this.f8896a;
                if (cVar4.f8893n == null) {
                    cVar4.f8893n = new PersistableBundle();
                }
                this.f8896a.f8893n.putString("extraSliceUri", T0.b.a(this.f8900e));
            }
            return this.f8896a;
        }

        public b b(IconCompat iconCompat) {
            this.f8896a.f8887h = iconCompat;
            return this;
        }

        public b c(Intent intent) {
            return d(new Intent[]{intent});
        }

        public b d(Intent[] intentArr) {
            this.f8896a.f8882c = intentArr;
            return this;
        }

        public b e(CharSequence charSequence) {
            this.f8896a.f8885f = charSequence;
            return this;
        }

        public b f(CharSequence charSequence) {
            this.f8896a.f8884e = charSequence;
            return this;
        }
    }

    public boolean a(int i10) {
        return (this.f8895p & i10) != 0;
    }

    public ShortcutInfo b() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f8880a, this.f8881b).setShortLabel(this.f8884e).setIntents(this.f8882c);
        IconCompat iconCompat = this.f8887h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.t(this.f8880a));
        }
        if (!TextUtils.isEmpty(this.f8885f)) {
            intents.setLongLabel(this.f8885f);
        }
        if (!TextUtils.isEmpty(this.f8886g)) {
            intents.setDisabledMessage(this.f8886g);
        }
        ComponentName componentName = this.f8883d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f8889j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f8892m);
        PersistableBundle persistableBundle = this.f8893n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        u[] uVarArr = this.f8888i;
        if (uVarArr != null && uVarArr.length > 0) {
            int length = uVarArr.length;
            Person[] personArr = new Person[length];
            for (int i10 = 0; i10 < length; i10++) {
                personArr[i10] = this.f8888i[i10].i();
            }
            intents.setPersons(personArr);
        }
        L0.c cVar = this.f8890k;
        if (cVar != null) {
            intents.setLocusId(cVar.b());
        }
        intents.setLongLived(this.f8891l);
        if (Build.VERSION.SDK_INT >= 33) {
            a.a(intents, this.f8895p);
        }
        return intents.build();
    }
}
