package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f31697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f31699c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f31701e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f31700d = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f31702f = false;

    public a0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f31697a = sharedPreferences;
        this.f31698b = str;
        this.f31699c = str2;
        this.f31701e = executor;
    }

    public static a0 d(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        a0 a0Var = new a0(sharedPreferences, str, str2, executor);
        a0Var.e();
        return a0Var;
    }

    public boolean b(String str) {
        boolean zC;
        if (TextUtils.isEmpty(str) || str.contains(this.f31699c)) {
            return false;
        }
        synchronized (this.f31700d) {
            zC = c(this.f31700d.add(str));
        }
        return zC;
    }

    public final boolean c(boolean z10) {
        if (z10 && !this.f31702f) {
            j();
        }
        return z10;
    }

    public final void e() {
        synchronized (this.f31700d) {
            try {
                this.f31700d.clear();
                String string = this.f31697a.getString(this.f31698b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.f31699c)) {
                    String[] strArrSplit = string.split(this.f31699c, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f31700d.add(str);
                        }
                    }
                }
            } finally {
            }
        }
    }

    public String f() {
        String str;
        synchronized (this.f31700d) {
            str = (String) this.f31700d.peek();
        }
        return str;
    }

    public boolean g(Object obj) {
        boolean zC;
        synchronized (this.f31700d) {
            zC = c(this.f31700d.remove(obj));
        }
        return zC;
    }

    public String h() {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = this.f31700d.iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            sb2.append(this.f31699c);
        }
        return sb2.toString();
    }

    public final void i() {
        synchronized (this.f31700d) {
            this.f31697a.edit().putString(this.f31698b, h()).commit();
        }
    }

    public final void j() {
        this.f31701e.execute(new Runnable() { // from class: com.google.firebase.messaging.Z
            @Override // java.lang.Runnable
            public final void run() {
                this.f31675a.i();
            }
        });
    }
}
