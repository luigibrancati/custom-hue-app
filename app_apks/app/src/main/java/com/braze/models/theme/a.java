package com.braze.models.theme;

import com.braze.support.JsonUtils;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f28185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f28186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f28187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f28188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f28189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f28190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f28191g;

    public a(JSONObject messageThemeJson) {
        AbstractC4862t.e(messageThemeJson, "messageThemeJson");
        Integer colorIntegerOrNull = JsonUtils.getColorIntegerOrNull(messageThemeJson, "bg_color");
        Integer colorIntegerOrNull2 = JsonUtils.getColorIntegerOrNull(messageThemeJson, "text_color");
        Integer colorIntegerOrNull3 = JsonUtils.getColorIntegerOrNull(messageThemeJson, "close_btn_color");
        Integer colorIntegerOrNull4 = JsonUtils.getColorIntegerOrNull(messageThemeJson, "icon_color");
        Integer colorIntegerOrNull5 = JsonUtils.getColorIntegerOrNull(messageThemeJson, "icon_bg_color");
        Integer colorIntegerOrNull6 = JsonUtils.getColorIntegerOrNull(messageThemeJson, "header_text_color");
        Integer colorIntegerOrNull7 = JsonUtils.getColorIntegerOrNull(messageThemeJson, "frame_color");
        this.f28185a = colorIntegerOrNull;
        this.f28186b = colorIntegerOrNull2;
        this.f28187c = colorIntegerOrNull3;
        this.f28188d = colorIntegerOrNull4;
        this.f28189e = colorIntegerOrNull5;
        this.f28190f = colorIntegerOrNull6;
        this.f28191g = colorIntegerOrNull7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC4862t.a(this.f28185a, aVar.f28185a) && AbstractC4862t.a(this.f28186b, aVar.f28186b) && AbstractC4862t.a(this.f28187c, aVar.f28187c) && AbstractC4862t.a(this.f28188d, aVar.f28188d) && AbstractC4862t.a(this.f28189e, aVar.f28189e) && AbstractC4862t.a(this.f28190f, aVar.f28190f) && AbstractC4862t.a(this.f28191g, aVar.f28191g);
    }

    public final int hashCode() {
        Integer num = this.f28185a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f28186b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f28187c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f28188d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f28189e;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f28190f;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f28191g;
        return iHashCode6 + (num7 != null ? num7.hashCode() : 0);
    }

    public final String toString() {
        return "InAppMessageTheme(backgroundColor=" + this.f28185a + ", textColor=" + this.f28186b + ", closeButtonColor=" + this.f28187c + ", iconColor=" + this.f28188d + ", iconBackgroundColor=" + this.f28189e + ", headerTextColor=" + this.f28190f + ", frameColor=" + this.f28191g + ")";
    }
}
