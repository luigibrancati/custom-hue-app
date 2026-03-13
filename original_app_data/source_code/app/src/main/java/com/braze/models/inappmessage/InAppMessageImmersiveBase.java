package com.braze.models.inappmessage;

import Nd.t;
import Od.F;
import android.graphics.Color;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.events.internal.f0;
import com.braze.managers.m0;
import com.braze.managers.r;
import com.braze.models.inappmessage.InAppMessageImmersiveBase;
import com.braze.support.BrazeLogger;
import com.braze.support.s;
import gc.C4179C;
import gc.C4186J;
import gc.C4206t;
import gc.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\b\u001c\b'\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0001FB\t\b\u0014¢\u0006\u0004\b\u0003\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0003\u0010\tBI\b\u0012\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0003\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\r\u001a\u00020\f8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\u000e\u001a\u00020\f8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R(\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00150+8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010\u0010\u001a\u00020\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u00107\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\u0012\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010&¨\u0006G"}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageImmersiveBase;", "Lcom/braze/models/inappmessage/InAppMessageWithImageBase;", "Lcom/braze/models/inappmessage/IInAppMessageImmersive;", "<init>", "()V", "Lorg/json/JSONObject;", "jsonObject", "Lcom/braze/managers/m0;", "brazeManager", "(Lorg/json/JSONObject;Lcom/braze/managers/m0;)V", "", "header", "", "headerTextColor", "closeButtonColor", "Lcom/braze/enums/inappmessage/ImageStyle;", "imageStyle", "Lcom/braze/enums/inappmessage/TextAlign;", "headerTextAlign", "messageTextAlign", "(Lorg/json/JSONObject;Lcom/braze/managers/m0;Ljava/lang/String;IILcom/braze/enums/inappmessage/ImageStyle;Lcom/braze/enums/inappmessage/TextAlign;Lcom/braze/enums/inappmessage/TextAlign;)V", "Lcom/braze/models/inappmessage/MessageButton;", "messageButton", "", "logButtonClick", "(Lcom/braze/models/inappmessage/MessageButton;)Z", "Lfc/H;", "onAfterClosed", "enableDarkTheme", "forJsonPut", "()Lorg/json/JSONObject;", "I", "getHeaderTextColor", "()I", "setHeaderTextColor", "(I)V", "getCloseButtonColor", "setCloseButtonColor", "Ljava/lang/String;", "getHeader", "()Ljava/lang/String;", "setHeader", "(Ljava/lang/String;)V", "", "messageButtons", "Ljava/util/List;", "getMessageButtons", "()Ljava/util/List;", "setMessageButtons", "(Ljava/util/List;)V", "Lcom/braze/enums/inappmessage/ImageStyle;", "getImageStyle", "()Lcom/braze/enums/inappmessage/ImageStyle;", "setImageStyle", "(Lcom/braze/enums/inappmessage/ImageStyle;)V", "frameColor", "Ljava/lang/Integer;", "getFrameColor", "()Ljava/lang/Integer;", "setFrameColor", "(Ljava/lang/Integer;)V", "Lcom/braze/enums/inappmessage/TextAlign;", "getHeaderTextAlign", "()Lcom/braze/enums/inappmessage/TextAlign;", "setHeaderTextAlign", "(Lcom/braze/enums/inappmessage/TextAlign;)V", "wasButtonClickLogged", "Z", "buttonIdClicked", "Companion", "com/braze/models/inappmessage/f", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class InAppMessageImmersiveBase extends InAppMessageWithImageBase implements IInAppMessageImmersive {
    public static final f Companion = new f();
    private String buttonIdClicked;
    private int closeButtonColor;
    private Integer frameColor;
    private String header;
    private TextAlign headerTextAlign;
    private int headerTextColor;
    private ImageStyle imageStyle;
    private List<? extends MessageButton> messageButtons;
    private boolean wasButtonClickLogged;

    public InAppMessageImmersiveBase() {
        this.headerTextColor = Color.parseColor("#333333");
        this.closeButtonColor = Color.parseColor("#9B9B9B");
        this.messageButtons = C4206t.k();
        this.imageStyle = ImageStyle.TOP;
        this.headerTextAlign = TextAlign.CENTER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String enableDarkTheme$lambda$5() {
        return "Cannot apply dark theme with a null themes wrapper";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logButtonClick$lambda$1() {
        return "Trigger id not found (this is expected for test sends). Not logging button click.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logButtonClick$lambda$2() {
        return "Button click already logged for this message. Ignoring.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logButtonClick$lambda$3() {
        return "Cannot log a button click because the BrazeManager is null.";
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessageThemeable
    public void enableDarkTheme() {
        super.enableDarkTheme();
        com.braze.models.theme.a inAppMessageDarkThemeWrapper = getInAppMessageDarkThemeWrapper();
        if (inAppMessageDarkThemeWrapper == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: g5.w
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return InAppMessageImmersiveBase.enableDarkTheme$lambda$5();
                }
            }, 7, (Object) null);
            return;
        }
        Integer num = inAppMessageDarkThemeWrapper.f28191g;
        if (num != null) {
            setFrameColor(num);
        }
        Integer num2 = inAppMessageDarkThemeWrapper.f28187c;
        if (num2 != null) {
            setCloseButtonColor(num2.intValue());
        }
        Integer num3 = inAppMessageDarkThemeWrapper.f28190f;
        if (num3 != null) {
            setHeaderTextColor(num3.intValue());
        }
        Iterator<MessageButton> it = getMessageButtons().iterator();
        while (it.hasNext()) {
            it.next().enableDarkTheme();
        }
    }

    public int getCloseButtonColor() {
        return this.closeButtonColor;
    }

    public Integer getFrameColor() {
        return this.frameColor;
    }

    public String getHeader() {
        return this.header;
    }

    public TextAlign getHeaderTextAlign() {
        return this.headerTextAlign;
    }

    public int getHeaderTextColor() {
        return this.headerTextColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public ImageStyle getImageStyle() {
        return this.imageStyle;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public List<MessageButton> getMessageButtons() {
        return this.messageButtons;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public boolean logButtonClick(MessageButton messageButton) {
        AbstractC4862t.e(messageButton, "messageButton");
        m0 brazeManager = getBrazeManager();
        String triggerId = getTriggerId();
        if (triggerId == null || F.k0(triggerId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: g5.v
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return InAppMessageImmersiveBase.logButtonClick$lambda$1();
                }
            }, 7, (Object) null);
            return false;
        }
        if (this.wasButtonClickLogged) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: g5.t
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return InAppMessageImmersiveBase.logButtonClick$lambda$2();
                }
            }, 6, (Object) null);
            return false;
        }
        if (brazeManager == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: g5.u
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return InAppMessageImmersiveBase.logButtonClick$lambda$3();
                }
            }, 6, (Object) null);
            return false;
        }
        this.buttonIdClicked = messageButton.getStringId();
        com.braze.models.outgoing.event.a aVar = com.braze.models.outgoing.event.b.f28071g;
        aVar.getClass();
        AbstractC4862t.e(triggerId, "triggerId");
        AbstractC4862t.e(messageButton, "messageButton");
        com.braze.models.k kVarI = aVar.i(triggerId, messageButton.getStringId());
        if (kVarI != null) {
            ((r) brazeManager).a(kVarI);
        }
        this.wasButtonClickLogged = true;
        return true;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public void onAfterClosed() {
        String triggerId;
        String str;
        super.onAfterClosed();
        m0 brazeManager = getBrazeManager();
        if (!this.wasButtonClickLogged || (triggerId = getTriggerId()) == null || F.k0(triggerId) || (str = this.buttonIdClicked) == null || F.k0(str) || brazeManager == null) {
            return;
        }
        com.braze.triggers.events.d triggerEvent = new com.braze.triggers.events.d(getTriggerId(), this.buttonIdClicked);
        AbstractC4862t.e(triggerEvent, "triggerEvent");
        ((com.braze.events.d) ((r) brazeManager).f27969d).b(new f0(triggerEvent), f0.class);
    }

    public void setCloseButtonColor(int i10) {
        this.closeButtonColor = i10;
    }

    public void setFrameColor(Integer num) {
        this.frameColor = num;
    }

    public void setHeader(String str) {
        this.header = str;
    }

    public void setHeaderTextAlign(TextAlign textAlign) {
        AbstractC4862t.e(textAlign, "<set-?>");
        this.headerTextAlign = textAlign;
    }

    public void setHeaderTextColor(int i10) {
        this.headerTextColor = i10;
    }

    public void setImageStyle(ImageStyle imageStyle) {
        AbstractC4862t.e(imageStyle, "<set-?>");
        this.imageStyle = imageStyle;
    }

    public void setMessageButtons(List<? extends MessageButton> list) {
        AbstractC4862t.e(list, "<set-?>");
        this.messageButtons = list;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.braze.models.inappmessage.InAppMessageWithImageBase, com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public JSONObject getKey() {
        JSONObject jsonObject = getJsonObject();
        if (jsonObject != null) {
            return jsonObject;
        }
        JSONObject propertiesJSONObject = super.getKey();
        try {
            propertiesJSONObject.putOpt("header", getHeader());
            propertiesJSONObject.put("header_text_color", getHeaderTextColor());
            propertiesJSONObject.put("close_btn_color", getCloseButtonColor());
            propertiesJSONObject.putOpt("image_style", getImageStyle().toString());
            propertiesJSONObject.putOpt("text_align_header", getHeaderTextAlign().toString());
            Integer frameColor = getFrameColor();
            if (frameColor != null) {
                propertiesJSONObject.put("frame_color", frameColor.intValue());
            }
            JSONArray jSONArray = new JSONArray();
            Iterator<MessageButton> it = getMessageButtons().iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().getKey());
            }
            propertiesJSONObject.put("btns", jSONArray);
        } catch (JSONException unused) {
        }
        return propertiesJSONObject;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InAppMessageImmersiveBase(JSONObject inAppMessageJson, m0 brazeManager) {
        String str;
        int i10;
        TextAlign textAlign;
        Iterator it;
        JSONObject jSONObjectOptJSONObject;
        String upperCase;
        int i11;
        String upperCase2;
        TextAlign[] textAlignArrValues;
        int length;
        int i12;
        String upperCase3;
        int i13;
        AbstractC4862t.e(inAppMessageJson, "jsonObject");
        AbstractC4862t.e(brazeManager, "brazeManager");
        String strOptString = inAppMessageJson.optString("header");
        AbstractC4862t.d(strOptString, "optString(...)");
        int iOptInt = inAppMessageJson.optInt("header_text_color");
        int iOptInt2 = inAppMessageJson.optInt("close_btn_color");
        ImageStyle imageStyle = ImageStyle.TOP;
        try {
            String string = inAppMessageJson.getString("image_style");
            AbstractC4862t.d(string, "getString(...)");
            Locale US = Locale.US;
            AbstractC4862t.d(US, "US");
            upperCase3 = string.toUpperCase(US);
            AbstractC4862t.d(upperCase3, "toUpperCase(...)");
        } catch (Exception unused) {
        }
        for (ImageStyle imageStyle2 : ImageStyle.values()) {
            if (AbstractC4862t.a(imageStyle2.name(), upperCase3)) {
                imageStyle = imageStyle2;
                TextAlign textAlign2 = TextAlign.CENTER;
                try {
                    String string2 = inAppMessageJson.getString("text_align_header");
                    AbstractC4862t.d(string2, "getString(...)");
                    Locale US2 = Locale.US;
                    AbstractC4862t.d(US2, "US");
                    upperCase2 = string2.toUpperCase(US2);
                    AbstractC4862t.d(upperCase2, "toUpperCase(...)");
                    textAlignArrValues = TextAlign.values();
                    length = textAlignArrValues.length;
                    i12 = 0;
                } catch (Exception unused2) {
                    str = strOptString;
                }
                while (i12 < length) {
                    TextAlign textAlign3 = textAlignArrValues[i12];
                    str = strOptString;
                    if (AbstractC4862t.a(textAlign3.name(), upperCase2)) {
                        textAlign2 = textAlign3;
                        TextAlign textAlign4 = TextAlign.CENTER;
                        try {
                            String string3 = inAppMessageJson.getString("text_align_message");
                            AbstractC4862t.d(string3, "getString(...)");
                            Locale US3 = Locale.US;
                            AbstractC4862t.d(US3, "US");
                            upperCase = string3.toUpperCase(US3);
                            AbstractC4862t.d(upperCase, "toUpperCase(...)");
                        } catch (Exception unused3) {
                            i10 = iOptInt2;
                            textAlign = textAlign4;
                        }
                        for (TextAlign textAlign5 : TextAlign.values()) {
                            if (AbstractC4862t.a(textAlign5.name(), upperCase)) {
                                i10 = iOptInt2;
                                textAlign = textAlign5;
                                this(inAppMessageJson, brazeManager, str, iOptInt, i10, imageStyle, textAlign2, textAlign);
                                JSONArray jSONArrayOptJSONArray = inAppMessageJson.optJSONArray("btns");
                                String str2 = s.f28649a;
                                AbstractC4862t.e(inAppMessageJson, "inAppMessageJson");
                                JSONObject jSONObjectOptJSONObject2 = inAppMessageJson.optJSONObject("themes");
                                JSONArray jSONArray = (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("dark")) == null || (jSONArray = jSONObjectOptJSONObject.optJSONArray("btns")) == null) ? new JSONArray() : jSONArray;
                                ArrayList arrayList = new ArrayList();
                                if (jSONArrayOptJSONArray == null) {
                                    it = C4206t.k().iterator();
                                } else {
                                    it = t.I(t.y(C4179C.X(Bc.k.p(0, jSONArrayOptJSONArray.length())), new g(jSONArrayOptJSONArray)), new h(jSONArrayOptJSONArray)).iterator();
                                }
                                Iterator itY = w.y(it);
                                while (itY.hasNext()) {
                                    C4186J c4186j = (C4186J) itY.next();
                                    arrayList.add(new MessageButton((JSONObject) c4186j.d(), jSONArray.optJSONObject(c4186j.c())));
                                }
                                setMessageButtons(arrayList);
                                return;
                            }
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    } else {
                        i12++;
                        strOptString = str;
                    }
                }
                str = strOptString;
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private InAppMessageImmersiveBase(JSONObject jSONObject, m0 m0Var, String str, int i10, int i11, ImageStyle imageStyle, TextAlign textAlign, TextAlign textAlign2) {
        super(jSONObject, m0Var);
        this.headerTextColor = Color.parseColor("#333333");
        this.closeButtonColor = Color.parseColor("#9B9B9B");
        this.messageButtons = C4206t.k();
        this.imageStyle = ImageStyle.TOP;
        this.headerTextAlign = TextAlign.CENTER;
        setHeader(str);
        setHeaderTextColor(i10);
        setCloseButtonColor(i11);
        if (jSONObject.has("frame_color")) {
            setFrameColor(Integer.valueOf(jSONObject.optInt("frame_color")));
        }
        setImageStyle(imageStyle);
        setHeaderTextAlign(textAlign);
        setMessageTextAlign(textAlign2);
    }
}
