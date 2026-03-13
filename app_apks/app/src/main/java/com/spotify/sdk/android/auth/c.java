package com.spotify.sdk.android.auth;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.spotify.sdk.android.auth.d;
import io.sentry.protocol.SentryThread;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f32684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f32685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f32686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f32687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f32688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f32689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f32690h;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f32691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d.c f32692b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f32693c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f32694d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String[] f32695e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f32696f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f32697g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Map f32698h = new HashMap();

        public b(String str, d.c cVar, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("Client ID can't be null");
            }
            if (cVar == null) {
                throw new IllegalArgumentException("Response type can't be null");
            }
            if (str2 == null || str2.length() == 0) {
                throw new IllegalArgumentException("Redirect URI can't be null or empty");
            }
            this.f32691a = str;
            this.f32692b = cVar;
            this.f32693c = str2;
        }

        public c a() {
            return new c(this.f32691a, this.f32692b, this.f32693c, this.f32694d, this.f32695e, this.f32696f, this.f32698h, this.f32697g, null);
        }

        public b b(String[] strArr) {
            this.f32695e = strArr;
            return this;
        }

        public b c(boolean z10) {
            this.f32696f = z10;
            return this;
        }
    }

    public /* synthetic */ c(String str, d.c cVar, String str2, String str3, String[] strArr, boolean z10, Map map, String str4, a aVar) {
        this(str, cVar, str2, str3, strArr, z10, map, str4);
    }

    public String a() {
        return TextUtils.isEmpty(this.f32690h) ? "android-sdk" : this.f32690h;
    }

    public String b() {
        return this.f32683a;
    }

    public String c() {
        return this.f32685c;
    }

    public String d() {
        return this.f32684b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String[] e() {
        return this.f32687e;
    }

    public String f() {
        return this.f32686d;
    }

    public final String g() {
        StringBuilder sb2 = new StringBuilder();
        for (String str : this.f32687e) {
            sb2.append(str);
            sb2.append(StringUtils.SPACE);
        }
        return sb2.toString().trim();
    }

    public Uri h() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https").authority("accounts.spotify.com").appendPath("authorize").appendQueryParameter("client_id", this.f32683a).appendQueryParameter("response_type", this.f32684b).appendQueryParameter("redirect_uri", this.f32685c).appendQueryParameter("show_dialog", String.valueOf(this.f32688f)).appendQueryParameter("utm_source", "spotify-sdk").appendQueryParameter("utm_medium", "android-sdk").appendQueryParameter("utm_campaign", a());
        String[] strArr = this.f32687e;
        if (strArr != null && strArr.length > 0) {
            builder.appendQueryParameter("scope", g());
        }
        String str = this.f32686d;
        if (str != null) {
            builder.appendQueryParameter(SentryThread.JsonKeys.STATE, str);
        }
        if (this.f32689g.size() > 0) {
            for (Map.Entry entry : this.f32689g.entrySet()) {
                builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return builder.build();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f32683a);
        parcel.writeString(this.f32684b);
        parcel.writeString(this.f32685c);
        parcel.writeString(this.f32686d);
        parcel.writeStringArray(this.f32687e);
        parcel.writeByte(this.f32688f ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f32690h);
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f32689g.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        parcel.writeBundle(bundle);
    }

    public c(Parcel parcel) {
        this.f32683a = parcel.readString();
        this.f32684b = parcel.readString();
        this.f32685c = parcel.readString();
        this.f32686d = parcel.readString();
        this.f32687e = parcel.createStringArray();
        this.f32688f = parcel.readByte() == 1;
        this.f32689g = new HashMap();
        this.f32690h = parcel.readString();
        Bundle bundle = parcel.readBundle(getClass().getClassLoader());
        for (String str : bundle.keySet()) {
            this.f32689g.put(str, bundle.getString(str));
        }
    }

    public c(String str, d.c cVar, String str2, String str3, String[] strArr, boolean z10, Map map, String str4) {
        this.f32683a = str;
        this.f32684b = cVar.toString();
        this.f32685c = str2;
        this.f32686d = str3;
        this.f32687e = strArr;
        this.f32688f = z10;
        this.f32689g = map;
        this.f32690h = str4;
    }
}
