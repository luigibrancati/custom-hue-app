package com.braze.models.theme;

import com.braze.support.JsonUtils;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f28192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f28193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f28194c;

    public b(JSONObject buttonThemeJson) {
        AbstractC4862t.e(buttonThemeJson, "buttonThemeJson");
        Integer colorIntegerOrNull = JsonUtils.getColorIntegerOrNull(buttonThemeJson, "bg_color");
        Integer colorIntegerOrNull2 = JsonUtils.getColorIntegerOrNull(buttonThemeJson, "text_color");
        Integer colorIntegerOrNull3 = JsonUtils.getColorIntegerOrNull(buttonThemeJson, "border_color");
        this.f28192a = colorIntegerOrNull;
        this.f28193b = colorIntegerOrNull2;
        this.f28194c = colorIntegerOrNull3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return AbstractC4862t.a(this.f28192a, bVar.f28192a) && AbstractC4862t.a(this.f28193b, bVar.f28193b) && AbstractC4862t.a(this.f28194c, bVar.f28194c);
    }

    public final int hashCode() {
        Integer num = this.f28192a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f28193b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f28194c;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "MessageButtonTheme(backgroundColor=" + this.f28192a + ", textColor=" + this.f28193b + ", borderColor=" + this.f28194c + ")";
    }
}
