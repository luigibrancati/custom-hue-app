package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class SharedPreferencesC3188f0 implements SharedPreferences {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f29457a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f29458b = new HashSet();

    public final /* synthetic */ Map a() {
        return this.f29457a;
    }

    public final /* synthetic */ Set b() {
        return this.f29458b;
    }

    public final Object c(String str, Object obj) {
        Object obj2 = this.f29457a.get(str);
        return obj2 != null ? obj2 : obj;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return this.f29457a.containsKey(str);
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new SharedPreferencesEditorC3179e0(this, null);
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        return this.f29457a;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z10) {
        return ((Boolean) c(str, Boolean.valueOf(z10))).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f10) {
        return ((Float) c(str, Float.valueOf(f10))).floatValue();
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i10) {
        return ((Integer) c(str, Integer.valueOf(i10))).intValue();
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j10) {
        return ((Long) c(str, Long.valueOf(j10))).longValue();
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        return (String) c(str, str2);
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        return (Set) c(str, set);
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f29458b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f29458b.remove(onSharedPreferenceChangeListener);
    }
}
