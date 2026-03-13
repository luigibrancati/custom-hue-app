package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f22649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence[] f22650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f22651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f22653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f22654g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static RemoteInput a(w wVar) {
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(wVar.i()).setLabel(wVar.h()).setChoices(wVar.e()).setAllowFreeFormInput(wVar.c()).addExtras(wVar.g());
            Set setD = wVar.d();
            if (setD != null) {
                Iterator it = setD.iterator();
                while (it.hasNext()) {
                    b.a(builderAddExtras, (String) it.next(), true);
                }
            }
            c.a(builderAddExtras, wVar.f());
            return builderAddExtras.build();
        }

        public static Bundle b(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {
        public static RemoteInput.Builder a(RemoteInput.Builder builder, String str, boolean z10) {
            return builder.setAllowDataType(str, z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {
        public static RemoteInput.Builder a(RemoteInput.Builder builder, int i10) {
            return builder.setEditChoicesBeforeSending(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22655a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CharSequence f22658d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence[] f22659e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f22656b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bundle f22657c = new Bundle();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f22660f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f22661g = 0;

        public d(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.f22655a = str;
        }

        public w a() {
            return new w(this.f22655a, this.f22658d, this.f22659e, this.f22660f, this.f22661g, this.f22657c, this.f22656b);
        }

        public d b(String str, boolean z10) {
            if (z10) {
                this.f22656b.add(str);
                return this;
            }
            this.f22656b.remove(str);
            return this;
        }

        public d c(boolean z10) {
            this.f22660f = z10;
            return this;
        }

        public d d(CharSequence[] charSequenceArr) {
            this.f22659e = charSequenceArr;
            return this;
        }

        public d e(CharSequence charSequence) {
            this.f22658d = charSequence;
            return this;
        }
    }

    public w(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z10, int i10, Bundle bundle, Set set) {
        this.f22648a = str;
        this.f22649b = charSequence;
        this.f22650c = charSequenceArr;
        this.f22651d = z10;
        this.f22652e = i10;
        this.f22653f = bundle;
        this.f22654g = set;
        if (f() == 2 && !c()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static RemoteInput a(w wVar) {
        return a.a(wVar);
    }

    public static RemoteInput[] b(w[] wVarArr) {
        if (wVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[wVarArr.length];
        for (int i10 = 0; i10 < wVarArr.length; i10++) {
            remoteInputArr[i10] = a(wVarArr[i10]);
        }
        return remoteInputArr;
    }

    public static Bundle j(Intent intent) {
        return a.b(intent);
    }

    public boolean c() {
        return this.f22651d;
    }

    public Set d() {
        return this.f22654g;
    }

    public CharSequence[] e() {
        return this.f22650c;
    }

    public int f() {
        return this.f22652e;
    }

    public Bundle g() {
        return this.f22653f;
    }

    public CharSequence h() {
        return this.f22649b;
    }

    public String i() {
        return this.f22648a;
    }

    public boolean k() {
        if (c()) {
            return false;
        }
        return ((e() != null && e().length != 0) || d() == null || d().isEmpty()) ? false : true;
    }
}
