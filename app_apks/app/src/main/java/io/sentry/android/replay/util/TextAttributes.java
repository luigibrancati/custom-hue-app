package io.sentry.android.replay.util;

import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import o0.AbstractC5188e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Lio/sentry/android/replay/util/TextAttributes;", "", "Lo0/e;", "color", "", "hasFillModifier", "<init>", "(Lo0/e;ZLkotlin/jvm/internal/k;)V", "component1-QN2ZGVo", "()Lo0/e;", "component1", "component2", "()Z", "copy-fRWUv9g", "(Lo0/e;Z)Lio/sentry/android/replay/util/TextAttributes;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Lo0/e;", "getColor-QN2ZGVo", "Z", "getHasFillModifier", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class TextAttributes {
    public static final int $stable = 0;
    private final AbstractC5188e color;
    private final boolean hasFillModifier;

    public /* synthetic */ TextAttributes(AbstractC5188e abstractC5188e, boolean z10, AbstractC4854k abstractC4854k) {
        this(abstractC5188e, z10);
    }

    /* JADX INFO: renamed from: copy-fRWUv9g$default, reason: not valid java name */
    public static /* synthetic */ TextAttributes m262copyfRWUv9g$default(TextAttributes textAttributes, AbstractC5188e abstractC5188e, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            abstractC5188e = textAttributes.color;
        }
        if ((i10 & 2) != 0) {
            z10 = textAttributes.hasFillModifier;
        }
        return textAttributes.m264copyfRWUv9g(abstractC5188e, z10);
    }

    /* JADX INFO: renamed from: component1-QN2ZGVo, reason: not valid java name and from getter */
    public final AbstractC5188e getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasFillModifier() {
        return this.hasFillModifier;
    }

    /* JADX INFO: renamed from: copy-fRWUv9g, reason: not valid java name */
    public final TextAttributes m264copyfRWUv9g(AbstractC5188e color, boolean hasFillModifier) {
        return new TextAttributes(color, hasFillModifier, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextAttributes)) {
            return false;
        }
        TextAttributes textAttributes = (TextAttributes) other;
        return AbstractC4862t.a(this.color, textAttributes.color) && this.hasFillModifier == textAttributes.hasFillModifier;
    }

    /* JADX INFO: renamed from: getColor-QN2ZGVo, reason: not valid java name */
    public final AbstractC5188e m265getColorQN2ZGVo() {
        return this.color;
    }

    public final boolean getHasFillModifier() {
        return this.hasFillModifier;
    }

    public int hashCode() {
        return (0 * 31) + Boolean.hashCode(this.hasFillModifier);
    }

    public String toString() {
        return "TextAttributes(color=" + this.color + ", hasFillModifier=" + this.hasFillModifier + ')';
    }

    private TextAttributes(AbstractC5188e abstractC5188e, boolean z10) {
        this.color = abstractC5188e;
        this.hasFillModifier = z10;
    }
}
