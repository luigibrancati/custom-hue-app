package com.braze.ui.actions.brazeactions.steps;

import Bc.f;
import Bc.k;
import Nd.q;
import Nd.t;
import com.braze.enums.Channel;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.ui.actions.brazeactions.steps.StepData;
import fc.C4029l;
import fc.InterfaceC4028k;
import gc.C4179C;
import gc.C4206t;
import io.sentry.protocol.Request;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vc.InterfaceC6082a;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u000e\b\u0080\b\u0018\u0000 62\u00020\u0001:\u00016B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(R!\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00010)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u00102\u001a\u0004\u0018\u00010\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u00101R\u001d\u00105\u001a\u0004\u0018\u00010\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b4\u00101¨\u00067"}, d2 = {"Lcom/braze/ui/actions/brazeactions/steps/StepData;", "", "Lorg/json/JSONObject;", "srcJson", "Lcom/braze/enums/Channel;", "channel", "<init>", "(Lorg/json/JSONObject;Lcom/braze/enums/Channel;)V", "", "index", "getArg$android_sdk_ui_release", "(I)Ljava/lang/Object;", "getArg", "Lcom/braze/models/outgoing/BrazeProperties;", "coerceArgToPropertiesOrNull", "(I)Lcom/braze/models/outgoing/BrazeProperties;", "fixedArgCount", "LBc/f;", "rangedArgCount", "", "isArgCountInBounds", "(ILBc/f;)Z", "isArgString", "(I)Z", "isArgOptionalJsonObject", "", "toString", "()Ljava/lang/String;", "copy", "(Lorg/json/JSONObject;Lcom/braze/enums/Channel;)Lcom/braze/ui/actions/brazeactions/steps/StepData;", "hashCode", "()I", Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Lorg/json/JSONObject;", "getSrcJson", "()Lorg/json/JSONObject;", "Lcom/braze/enums/Channel;", "getChannel", "()Lcom/braze/enums/Channel;", "", "args$delegate", "Lfc/k;", "getArgs", "()Ljava/util/List;", "args", "firstArg$delegate", "getFirstArg", "()Ljava/lang/Object;", "firstArg", "secondArg$delegate", "getSecondArg", "secondArg", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StepData {

    /* JADX INFO: renamed from: args$delegate, reason: from kotlin metadata */
    private final InterfaceC4028k args;
    private final Channel channel;

    /* JADX INFO: renamed from: firstArg$delegate, reason: from kotlin metadata */
    private final InterfaceC4028k firstArg;

    /* JADX INFO: renamed from: secondArg$delegate, reason: from kotlin metadata */
    private final InterfaceC4028k secondArg;
    private final JSONObject srcJson;

    public StepData(JSONObject srcJson, Channel channel) {
        AbstractC4862t.e(srcJson, "srcJson");
        AbstractC4862t.e(channel, "channel");
        this.srcJson = srcJson;
        this.channel = channel;
        this.args = C4029l.b(new InterfaceC6082a() { // from class: B5.k
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return StepData.args_delegate$lambda$0(this.f659a);
            }
        });
        this.firstArg = C4029l.b(new InterfaceC6082a() { // from class: B5.l
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return StepData.firstArg_delegate$lambda$1(this.f660a);
            }
        });
        this.secondArg = C4029l.b(new InterfaceC6082a() { // from class: B5.m
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return StepData.secondArg_delegate$lambda$2(this.f661a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List args_delegate$lambda$0(StepData stepData) {
        final JSONArray jSONArrayOptJSONArray = stepData.srcJson.optJSONArray("args");
        return t.O(q.g(jSONArrayOptJSONArray == null ? C4206t.k().iterator() : t.I(t.y(C4179C.X(k.p(0, jSONArrayOptJSONArray.length())), new l() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$args_delegate$lambda$0$$inlined$iterator$1
            @Override // vc.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Boolean invoke(int i10) {
                return Boolean.valueOf(Objects.nonNull(jSONArrayOptJSONArray.opt(i10)));
            }
        }), new l() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$args_delegate$lambda$0$$inlined$iterator$2
            public final Object invoke(int i10) throws JSONException {
                Object obj = jSONArrayOptJSONArray.get(i10);
                if (obj != null) {
                    return obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
            }

            @Override // vc.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }).iterator()));
    }

    public static /* synthetic */ StepData copy$default(StepData stepData, JSONObject jSONObject, Channel channel, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jSONObject = stepData.srcJson;
        }
        if ((i10 & 2) != 0) {
            channel = stepData.channel;
        }
        return stepData.copy(jSONObject, channel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object firstArg_delegate$lambda$1(StepData stepData) {
        return stepData.getArg$android_sdk_ui_release(0);
    }

    private final List<Object> getArgs() {
        return (List) this.args.getValue();
    }

    public static /* synthetic */ boolean isArgCountInBounds$default(StepData stepData, int i10, f fVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -1;
        }
        if ((i11 & 2) != 0) {
            fVar = null;
        }
        return stepData.isArgCountInBounds(i10, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isArgCountInBounds$lambda$3(int i10, StepData stepData) {
        return "Expected " + i10 + " arguments. Got: " + stepData.getArgs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isArgCountInBounds$lambda$4(f fVar, StepData stepData) {
        return "Expected " + fVar + " arguments. Got: " + stepData.getArgs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isArgOptionalJsonObject$lambda$6(int i10, StepData stepData) {
        return "Argument [" + i10 + "] is not a JSONObject. Source: " + stepData.srcJson;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isArgString$lambda$5(int i10, StepData stepData) {
        return "Argument [" + i10 + "] is not a String. Source: " + stepData.srcJson;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object secondArg_delegate$lambda$2(StepData stepData) {
        return stepData.getArg$android_sdk_ui_release(1);
    }

    public final BrazeProperties coerceArgToPropertiesOrNull(int index) {
        Object objK0 = C4179C.k0(getArgs(), index);
        if (objK0 == null || !(objK0 instanceof JSONObject)) {
            return null;
        }
        return new BrazeProperties((JSONObject) objK0);
    }

    public final StepData copy(JSONObject srcJson, Channel channel) {
        AbstractC4862t.e(srcJson, "srcJson");
        AbstractC4862t.e(channel, "channel");
        return new StepData(srcJson, channel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepData)) {
            return false;
        }
        StepData stepData = (StepData) other;
        return AbstractC4862t.a(this.srcJson, stepData.srcJson) && this.channel == stepData.channel;
    }

    public final Object getArg$android_sdk_ui_release(int index) {
        return C4179C.k0(getArgs(), index);
    }

    public final Channel getChannel() {
        return this.channel;
    }

    public final Object getFirstArg() {
        return this.firstArg.getValue();
    }

    public final Object getSecondArg() {
        return this.secondArg.getValue();
    }

    public final JSONObject getSrcJson() {
        return this.srcJson;
    }

    public int hashCode() {
        return (this.srcJson.hashCode() * 31) + this.channel.hashCode();
    }

    public final boolean isArgCountInBounds(final int fixedArgCount, final f rangedArgCount) {
        if (fixedArgCount != -1 && getArgs().size() != fixedArgCount) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: B5.p
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return StepData.isArgCountInBounds$lambda$3(fixedArgCount, this);
                }
            }, 7, (Object) null);
            return false;
        }
        if (rangedArgCount == null || rangedArgCount.k(getArgs().size())) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: B5.q
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return StepData.isArgCountInBounds$lambda$4(rangedArgCount, this);
            }
        }, 7, (Object) null);
        return false;
    }

    public final boolean isArgOptionalJsonObject(final int index) {
        Object arg$android_sdk_ui_release = getArg$android_sdk_ui_release(index);
        if (arg$android_sdk_ui_release == null || (arg$android_sdk_ui_release instanceof JSONObject)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: B5.o
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return StepData.isArgOptionalJsonObject$lambda$6(index, this);
            }
        }, 7, (Object) null);
        return false;
    }

    public final boolean isArgString(final int index) {
        if (getArg$android_sdk_ui_release(index) instanceof String) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: B5.n
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return StepData.isArgString$lambda$5(index, this);
            }
        }, 7, (Object) null);
        return false;
    }

    public String toString() {
        return "Channel " + this.channel + " and json\n" + JsonUtils.getPrettyPrintedString(this.srcJson);
    }

    public /* synthetic */ StepData(JSONObject jSONObject, Channel channel, int i10, AbstractC4854k abstractC4854k) {
        this(jSONObject, (i10 & 2) != 0 ? Channel.UNKNOWN : channel);
    }
}
