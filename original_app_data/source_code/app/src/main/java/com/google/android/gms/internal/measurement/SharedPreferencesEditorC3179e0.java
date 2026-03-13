package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class SharedPreferencesEditorC3179e0 implements SharedPreferences.Editor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f29446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f29447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f29448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SharedPreferencesC3188f0 f29449d;

    public /* synthetic */ SharedPreferencesEditorC3179e0(SharedPreferencesC3188f0 sharedPreferencesC3188f0, byte[] bArr) {
        Objects.requireNonNull(sharedPreferencesC3188f0);
        this.f29449d = sharedPreferencesC3188f0;
        this.f29446a = false;
        this.f29447b = new HashSet();
        this.f29448c = new HashMap();
    }

    public final void a(String str, Object obj) {
        if (obj != null) {
            this.f29448c.put(str, obj);
        } else {
            remove(str);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f29446a = true;
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        if (this.f29446a) {
            this.f29449d.a().clear();
        }
        SharedPreferencesC3188f0 sharedPreferencesC3188f0 = this.f29449d;
        Set set = this.f29447b;
        sharedPreferencesC3188f0.a().keySet().removeAll(set);
        Map map = this.f29448c;
        for (Map.Entry entry : map.entrySet()) {
            sharedPreferencesC3188f0.a().put((String) entry.getKey(), entry.getValue());
        }
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : sharedPreferencesC3188f0.b()) {
            K7.Y it = K7.U.k(set, map.keySet()).iterator();
            while (it.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(sharedPreferencesC3188f0, (String) it.next());
            }
        }
        return (!this.f29446a && set.isEmpty() && map.isEmpty()) ? false : true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z10) {
        a(str, Boolean.valueOf(z10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f10) {
        a(str, Float.valueOf(f10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i10) {
        a(str, Integer.valueOf(i10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j10) {
        a(str, Long.valueOf(j10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        a(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        a(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.f29447b.add(str);
        return this;
    }
}
