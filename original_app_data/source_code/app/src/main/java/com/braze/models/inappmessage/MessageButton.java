package com.braze.models.inappmessage;

import Od.F;
import android.graphics.Color;
import android.net.Uri;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.models.IPutIntoJson;
import com.braze.models.inappmessage.MessageButton;
import com.braze.support.BrazeLogger;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONException;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0017\u0018\u0000 =2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u0001>B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\bBc\b\u0012\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\n\u0012\b\b\u0001\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0005J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"R$\u0010\r\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b$\u0010%R(\u0010\u000f\u001a\u0004\u0018\u00010&2\b\u0010\u001f\u001a\u0004\u0018\u00010&8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b(\u0010)R$\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010\u0011\u001a\u00020\n8G@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010 \u001a\u0004\b4\u0010\"\"\u0004\b5\u00106R\"\u0010\u0012\u001a\u00020\n8G@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010 \u001a\u0004\b7\u0010\"\"\u0004\b8\u00106R\"\u0010\u0015\u001a\u00020\n8G@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010 \u001a\u0004\b9\u0010\"\"\u0004\b:\u00106R\u0011\u0010<\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b;\u0010,¨\u0006?"}, d2 = {"Lcom/braze/models/inappmessage/MessageButton;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "Lcom/braze/models/inappmessage/IInAppMessageThemeable;", "<init>", "()V", "jsonObject", "darkThemeObject", "(Lorg/json/JSONObject;Lorg/json/JSONObject;)V", "darkThemeJsonObject", "", "id", "Lcom/braze/enums/inappmessage/ClickAction;", "clickAction", "", "uri", "text", "backgroundColor", "textColor", "", "openUriInWebview", "borderColor", "(Lorg/json/JSONObject;Lorg/json/JSONObject;ILcom/braze/enums/inappmessage/ClickAction;Ljava/lang/String;Ljava/lang/String;IIZI)V", "Lfc/H;", "enableDarkTheme", "forJsonPut", "()Lorg/json/JSONObject;", "Lorg/json/JSONObject;", "Lcom/braze/models/theme/b;", "darkTheme", "Lcom/braze/models/theme/b;", "value", "I", "getId", "()I", "Lcom/braze/enums/inappmessage/ClickAction;", "getClickAction", "()Lcom/braze/enums/inappmessage/ClickAction;", "Landroid/net/Uri;", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "Z", "getOpenUriInWebview", "()Z", "setOpenUriInWebview", "(Z)V", "getBackgroundColor", "setBackgroundColor", "(I)V", "getTextColor", "setTextColor", "getBorderColor", "setBorderColor", "getStringId", "stringId", "Companion", "com/braze/models/inappmessage/k", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class MessageButton implements IPutIntoJson<JSONObject>, IInAppMessageThemeable {
    public static final k Companion = new k();
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) MessageButton.class);
    private int backgroundColor;
    private int borderColor;
    private ClickAction clickAction;
    private com.braze.models.theme.b darkTheme;
    private int id;
    private JSONObject jsonObject;
    private boolean openUriInWebview;
    private String text;
    private int textColor;
    private Uri uri;

    public MessageButton() {
        this.id = -1;
        this.clickAction = ClickAction.NONE;
        int color = Color.parseColor("#1B78CF");
        this.backgroundColor = color;
        this.textColor = -1;
        this.borderColor = color;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String enableDarkTheme$lambda$2$lambda$1() {
        return "Cannot apply dark theme with a null themes wrapper";
    }

    @Override // com.braze.models.inappmessage.IInAppMessageThemeable
    public void enableDarkTheme() {
        com.braze.models.theme.b bVar = this.darkTheme;
        if (bVar == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: g5.z
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return MessageButton.enableDarkTheme$lambda$2$lambda$1();
                }
            }, 14, (Object) null);
            return;
        }
        Integer num = bVar.f28192a;
        if (num != null) {
            this.backgroundColor = num.intValue();
        }
        Integer num2 = bVar.f28193b;
        if (num2 != null) {
            this.textColor = num2.intValue();
        }
        Integer num3 = bVar.f28194c;
        if (num3 != null) {
            this.borderColor = num3.intValue();
        }
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBorderColor() {
        return this.borderColor;
    }

    public final ClickAction getClickAction() {
        return this.clickAction;
    }

    public final int getId() {
        return this.id;
    }

    public final boolean getOpenUriInWebview() {
        return this.openUriInWebview;
    }

    public final String getStringId() {
        return String.valueOf(this.id);
    }

    public final String getText() {
        return this.text;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final Uri getUri() {
        return this.uri;
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut, reason: avoid collision after fix types in other method */
    public JSONObject getJsonKey() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.id);
            jSONObject.put("click_action", this.clickAction.toString());
            Uri uri = this.uri;
            if (uri != null) {
                jSONObject.put("uri", String.valueOf(uri));
            }
            jSONObject.putOpt("text", this.text);
            jSONObject.put("bg_color", this.backgroundColor);
            jSONObject.put("text_color", this.textColor);
            jSONObject.put("use_webview", this.openUriInWebview);
            jSONObject.put("border_color", this.borderColor);
            return jSONObject;
        } catch (JSONException unused) {
            return this.jsonObject;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MessageButton(JSONObject jsonObject, JSONObject jSONObject) {
        ClickAction clickAction;
        String upperCase;
        int i10;
        AbstractC4862t.e(jsonObject, "jsonObject");
        int iOptInt = jsonObject.optInt("id", -1);
        ClickAction clickAction2 = ClickAction.NONE;
        try {
            String string = jsonObject.getString("click_action");
            AbstractC4862t.d(string, "getString(...)");
            Locale US = Locale.US;
            AbstractC4862t.d(US, "US");
            upperCase = string.toUpperCase(US);
            AbstractC4862t.d(upperCase, "toUpperCase(...)");
        } catch (Exception unused) {
            clickAction = clickAction2;
        }
        for (ClickAction clickAction3 : ClickAction.values()) {
            if (AbstractC4862t.a(clickAction3.name(), upperCase)) {
                clickAction = clickAction3;
                String strOptString = jsonObject.optString("uri");
                String strOptString2 = jsonObject.optString("text");
                AbstractC4862t.d(strOptString2, "optString(...)");
                this(jsonObject, jSONObject, iOptInt, clickAction, strOptString, strOptString2, jsonObject.optInt("bg_color"), jsonObject.optInt("text_color"), jsonObject.optBoolean("use_webview", false), jsonObject.optInt("border_color"));
                return;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private MessageButton(JSONObject jSONObject, JSONObject jSONObject2, int i10, ClickAction clickAction, String str, String str2, int i11, int i12, boolean z10, int i13) {
        this.id = -1;
        this.clickAction = ClickAction.NONE;
        int color = Color.parseColor("#1B78CF");
        this.backgroundColor = color;
        this.textColor = -1;
        this.borderColor = color;
        this.jsonObject = jSONObject;
        this.id = i10;
        this.clickAction = clickAction;
        if (clickAction == ClickAction.URI && str != null && !F.k0(str)) {
            this.uri = Uri.parse(str);
        }
        this.text = str2;
        this.backgroundColor = i11;
        this.textColor = i12;
        this.openUriInWebview = z10;
        this.borderColor = i13;
        this.darkTheme = jSONObject2 != null ? new com.braze.models.theme.b(jSONObject2) : null;
    }
}
