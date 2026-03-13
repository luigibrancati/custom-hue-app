package io.sentry.android.replay.viewhierarchy;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.barhopper.RecognitionOptions;
import fc.C4034q;
import io.sentry.SentryOptions;
import io.sentry.android.replay.util.AndroidTextLayout;
import io.sentry.android.replay.util.TextLayout;
import io.sentry.android.replay.util.ViewsKt;
import io.sentry.protocol.Request;
import io.sentry.protocol.ViewHierarchyNode;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.v;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 =2\u00020\u0001:\u0005=>?@ABo\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0000\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\u00192\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b%\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b)\u0010(R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b*\u0010$R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b+\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u00101R\"\u0010\r\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010/\u001a\u0004\b\r\u00101\"\u0004\b2\u0010\u001bR\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b\u000e\u00101R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00103\u001a\u0004\b4\u00105R*\u00107\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<\u0082\u0001\u0003BCD¨\u0006E"}, d2 = {"Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "", "", "x", "y", "", "width", "height", "elevation", "distance", "parent", "", "shouldMask", "isImportantForContentCapture", "isVisible", "Landroid/graphics/Rect;", "visibleRect", "<init>", "(FFIIFILio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;ZZZLandroid/graphics/Rect;)V", "node", "otherNode", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode$LCAResult;", "findLCA", "(Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;)Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode$LCAResult;", "isImportant", "Lfc/H;", "setImportantForCaptureToAncestors", "(Z)V", "Lkotlin/Function1;", "callback", "traverse", "(Lvc/l;)V", "isObscured", "(Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;)Z", "F", "getX", "()F", "getY", "I", "getWidth", "()I", "getHeight", "getElevation", "getDistance", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "getParent", "()Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "Z", "getShouldMask", "()Z", "setImportantForContentCapture", "Landroid/graphics/Rect;", "getVisibleRect", "()Landroid/graphics/Rect;", "", ViewHierarchyNode.JsonKeys.CHILDREN, "Ljava/util/List;", "getChildren", "()Ljava/util/List;", "setChildren", "(Ljava/util/List;)V", "Companion", "GenericViewHierarchyNode", "ImageViewHierarchyNode", "LCAResult", "TextViewHierarchyNode", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode$GenericViewHierarchyNode;", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode$ImageViewHierarchyNode;", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode$TextViewHierarchyNode;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"UseRequiresApi"})
@TargetApi(26)
public abstract class ViewHierarchyNode {
    private static final String SENTRY_MASK_TAG = "sentry-mask";
    private static final String SENTRY_UNMASK_TAG = "sentry-unmask";
    private List<? extends ViewHierarchyNode> children;
    private final int distance;
    private final float elevation;
    private final int height;
    private boolean isImportantForContentCapture;
    private final boolean isVisible;
    private final ViewHierarchyNode parent;
    private final boolean shouldMask;
    private final Rect visibleRect;
    private final int width;
    private final float x;
    private final float y;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u001e\u0010\u000f\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013H\u0002J\u0014\u0010\u0014\u001a\u00020\u0010*\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0014\u0010\u0015\u001a\u00020\u0010*\u00020\u00162\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0014\u0010\u0017\u001a\u00020\u0010*\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode$Companion;", "", "()V", "SENTRY_MASK_TAG", "", "SENTRY_UNMASK_TAG", "fromView", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "view", "Landroid/view/View;", "parent", "distance", "", RRWebOptionsEvent.EVENT_TAG, "Lio/sentry/SentryOptions;", "isAssignableFrom", "", "Ljava/lang/Class;", "set", "", "isMaskContainer", "isUnmaskContainer", "Landroid/view/ViewParent;", "shouldMask", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        private final boolean isAssignableFrom(Class<?> cls, Set<String> set) {
            while (cls != null) {
                if (set.contains(cls.getName())) {
                    return true;
                }
                cls = cls.getSuperclass();
            }
            return false;
        }

        private final boolean isMaskContainer(View view, SentryOptions sentryOptions) {
            String maskViewContainerClass = sentryOptions.getSessionReplay().getMaskViewContainerClass();
            if (maskViewContainerClass == null) {
                return false;
            }
            return AbstractC4862t.a(view.getClass().getName(), maskViewContainerClass);
        }

        private final boolean isUnmaskContainer(ViewParent viewParent, SentryOptions sentryOptions) {
            String unmaskViewContainerClass = sentryOptions.getSessionReplay().getUnmaskViewContainerClass();
            if (unmaskViewContainerClass == null) {
                return false;
            }
            return AbstractC4862t.a(viewParent.getClass().getName(), unmaskViewContainerClass);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final boolean shouldMask(android.view.View r8, io.sentry.SentryOptions r9) {
            /*
                r7 = this;
                java.lang.Object r0 = r8.getTag()
                boolean r1 = r0 instanceof java.lang.String
                r2 = 0
                if (r1 == 0) goto Lc
                java.lang.String r0 = (java.lang.String) r0
                goto Ld
            Lc:
                r0 = r2
            Ld:
                r1 = 2
                java.lang.String r3 = "toLowerCase(...)"
                r4 = 1
                r5 = 0
                if (r0 == 0) goto L28
                java.util.Locale r6 = java.util.Locale.ROOT
                java.lang.String r0 = r0.toLowerCase(r6)
                kotlin.jvm.internal.AbstractC4862t.d(r0, r3)
                if (r0 == 0) goto L28
                java.lang.String r6 = "sentry-unmask"
                boolean r0 = Od.F.V(r0, r6, r5, r1, r2)
                if (r0 != r4) goto L28
                goto L36
            L28:
                int r0 = io.sentry.android.replay.R.id.sentry_privacy
                java.lang.Object r0 = r8.getTag(r0)
                java.lang.String r6 = "unmask"
                boolean r0 = kotlin.jvm.internal.AbstractC4862t.a(r0, r6)
                if (r0 == 0) goto L37
            L36:
                return r5
            L37:
                java.lang.Object r0 = r8.getTag()
                boolean r6 = r0 instanceof java.lang.String
                if (r6 == 0) goto L42
                java.lang.String r0 = (java.lang.String) r0
                goto L43
            L42:
                r0 = r2
            L43:
                if (r0 == 0) goto L59
                java.util.Locale r6 = java.util.Locale.ROOT
                java.lang.String r0 = r0.toLowerCase(r6)
                kotlin.jvm.internal.AbstractC4862t.d(r0, r3)
                if (r0 == 0) goto L59
                java.lang.String r3 = "sentry-mask"
                boolean r0 = Od.F.V(r0, r3, r5, r1, r2)
                if (r0 != r4) goto L59
                goto L67
            L59:
                int r0 = io.sentry.android.replay.R.id.sentry_privacy
                java.lang.Object r0 = r8.getTag(r0)
                java.lang.String r1 = "mask"
                boolean r0 = kotlin.jvm.internal.AbstractC4862t.a(r0, r1)
                if (r0 == 0) goto L68
            L67:
                return r4
            L68:
                boolean r0 = r7.isMaskContainer(r8, r9)
                if (r0 != 0) goto L84
                android.view.ViewParent r0 = r8.getParent()
                if (r0 == 0) goto L84
                android.view.ViewParent r0 = r8.getParent()
                java.lang.String r1 = "getParent(...)"
                kotlin.jvm.internal.AbstractC4862t.d(r0, r1)
                boolean r0 = r7.isUnmaskContainer(r0, r9)
                if (r0 == 0) goto L84
                return r5
            L84:
                java.lang.Class r0 = r8.getClass()
                io.sentry.SentryReplayOptions r1 = r9.getSessionReplay()
                java.util.Set r1 = r1.getUnmaskViewClasses()
                java.lang.String r2 = "getUnmaskViewClasses(...)"
                kotlin.jvm.internal.AbstractC4862t.d(r1, r2)
                boolean r0 = r7.isAssignableFrom(r0, r1)
                if (r0 == 0) goto L9c
                return r5
            L9c:
                java.lang.Class r8 = r8.getClass()
                io.sentry.SentryReplayOptions r9 = r9.getSessionReplay()
                java.util.Set r9 = r9.getMaskViewClasses()
                java.lang.String r0 = "getMaskViewClasses(...)"
                kotlin.jvm.internal.AbstractC4862t.d(r9, r0)
                boolean r7 = r7.isAssignableFrom(r8, r9)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.viewhierarchy.ViewHierarchyNode.Companion.shouldMask(android.view.View, io.sentry.SentryOptions):boolean");
        }

        public final ViewHierarchyNode fromView(View view, ViewHierarchyNode parent, int distance, SentryOptions options) {
            Drawable drawable;
            AbstractC4862t.e(view, "view");
            AbstractC4862t.e(options, "options");
            C4034q c4034qIsVisibleToUser = ViewsKt.isVisibleToUser(view);
            boolean zBooleanValue = ((Boolean) c4034qIsVisibleToUser.a()).booleanValue();
            Rect rect = (Rect) c4034qIsVisibleToUser.b();
            boolean z10 = zBooleanValue && shouldMask(view, options);
            if (!(view instanceof TextView)) {
                if (!(view instanceof ImageView)) {
                    return new GenericViewHierarchyNode(view.getX(), view.getY(), view.getWidth(), view.getHeight(), (parent != null ? parent.getElevation() : 0.0f) + view.getElevation(), distance, parent, z10, false, zBooleanValue, rect);
                }
                if (parent != null) {
                    parent.setImportantForCaptureToAncestors(true);
                }
                ImageView imageView = (ImageView) view;
                return new ImageViewHierarchyNode(imageView.getX(), imageView.getY(), imageView.getWidth(), imageView.getHeight(), (parent != null ? parent.getElevation() : 0.0f) + imageView.getElevation(), distance, parent, z10 && (drawable = imageView.getDrawable()) != null && ViewsKt.isMaskable(drawable), true, zBooleanValue, rect);
            }
            if (parent != null) {
                parent.setImportantForCaptureToAncestors(true);
            }
            TextView textView = (TextView) view;
            Layout layout = textView.getLayout();
            AndroidTextLayout androidTextLayout = layout != null ? new AndroidTextLayout(layout) : null;
            int opaque = ViewsKt.toOpaque(textView.getCurrentTextColor());
            int totalPaddingLeft = textView.getTotalPaddingLeft();
            int totalPaddingTopSafe = ViewsKt.getTotalPaddingTopSafe(textView);
            float x10 = textView.getX();
            float y10 = textView.getY();
            int width = textView.getWidth();
            float elevation = 0.0f;
            int height = textView.getHeight();
            if (parent != null) {
                elevation = parent.getElevation();
            }
            return new TextViewHierarchyNode(androidTextLayout, Integer.valueOf(opaque), totalPaddingLeft, totalPaddingTopSafe, x10, y10, width, height, elevation + textView.getElevation(), distance, parent, z10, true, zBooleanValue, rect);
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode$GenericViewHierarchyNode;", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "x", "", "y", "width", "", "height", "elevation", "distance", "parent", "shouldMask", "", "isImportantForContentCapture", "isVisible", "visibleRect", "Landroid/graphics/Rect;", "(FFIIFILio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;ZZZLandroid/graphics/Rect;)V", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class GenericViewHierarchyNode extends ViewHierarchyNode {
        public static final int $stable = 8;

        public /* synthetic */ GenericViewHierarchyNode(float f10, float f11, int i10, int i11, float f12, int i12, ViewHierarchyNode viewHierarchyNode, boolean z10, boolean z11, boolean z12, Rect rect, int i13, AbstractC4854k abstractC4854k) {
            this(f10, f11, i10, i11, f12, i12, (i13 & 64) != 0 ? null : viewHierarchyNode, (i13 & 128) != 0 ? false : z10, (i13 & 256) != 0 ? false : z11, (i13 & 512) != 0 ? false : z12, (i13 & RecognitionOptions.UPC_E) != 0 ? null : rect);
        }

        public GenericViewHierarchyNode(float f10, float f11, int i10, int i11, float f12, int i12, ViewHierarchyNode viewHierarchyNode, boolean z10, boolean z11, boolean z12, Rect rect) {
            super(f10, f11, i10, i11, f12, i12, viewHierarchyNode, z10, z11, z12, rect, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode$ImageViewHierarchyNode;", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "x", "", "y", "width", "", "height", "elevation", "distance", "parent", "shouldMask", "", "isImportantForContentCapture", "isVisible", "visibleRect", "Landroid/graphics/Rect;", "(FFIIFILio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;ZZZLandroid/graphics/Rect;)V", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ImageViewHierarchyNode extends ViewHierarchyNode {
        public static final int $stable = 8;

        public /* synthetic */ ImageViewHierarchyNode(float f10, float f11, int i10, int i11, float f12, int i12, ViewHierarchyNode viewHierarchyNode, boolean z10, boolean z11, boolean z12, Rect rect, int i13, AbstractC4854k abstractC4854k) {
            this(f10, f11, i10, i11, f12, i12, (i13 & 64) != 0 ? null : viewHierarchyNode, (i13 & 128) != 0 ? false : z10, (i13 & 256) != 0 ? false : z11, (i13 & 512) != 0 ? false : z12, (i13 & RecognitionOptions.UPC_E) != 0 ? null : rect);
        }

        public ImageViewHierarchyNode(float f10, float f11, int i10, int i11, float f12, int i12, ViewHierarchyNode viewHierarchyNode, boolean z10, boolean z11, boolean z12, Rect rect) {
            super(f10, f11, i10, i11, f12, i12, viewHierarchyNode, z10, z11, z12, rect, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\b\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\u000b¨\u0006\u0019"}, d2 = {"Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode$LCAResult;", "", "lca", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "nodeSubtree", "otherNodeSubtree", "(Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;)V", "getLca", "()Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "getNodeSubtree", "setNodeSubtree", "(Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;)V", "getOtherNodeSubtree", "setOtherNodeSubtree", "component1", "component2", "component3", "copy", "equals", "", Request.JsonKeys.OTHER, "hashCode", "", "toString", "", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LCAResult {
        private final ViewHierarchyNode lca;
        private ViewHierarchyNode nodeSubtree;
        private ViewHierarchyNode otherNodeSubtree;

        public LCAResult(ViewHierarchyNode viewHierarchyNode, ViewHierarchyNode viewHierarchyNode2, ViewHierarchyNode viewHierarchyNode3) {
            this.lca = viewHierarchyNode;
            this.nodeSubtree = viewHierarchyNode2;
            this.otherNodeSubtree = viewHierarchyNode3;
        }

        public static /* synthetic */ LCAResult copy$default(LCAResult lCAResult, ViewHierarchyNode viewHierarchyNode, ViewHierarchyNode viewHierarchyNode2, ViewHierarchyNode viewHierarchyNode3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                viewHierarchyNode = lCAResult.lca;
            }
            if ((i10 & 2) != 0) {
                viewHierarchyNode2 = lCAResult.nodeSubtree;
            }
            if ((i10 & 4) != 0) {
                viewHierarchyNode3 = lCAResult.otherNodeSubtree;
            }
            return lCAResult.copy(viewHierarchyNode, viewHierarchyNode2, viewHierarchyNode3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ViewHierarchyNode getLca() {
            return this.lca;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ViewHierarchyNode getNodeSubtree() {
            return this.nodeSubtree;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ViewHierarchyNode getOtherNodeSubtree() {
            return this.otherNodeSubtree;
        }

        public final LCAResult copy(ViewHierarchyNode lca, ViewHierarchyNode nodeSubtree, ViewHierarchyNode otherNodeSubtree) {
            return new LCAResult(lca, nodeSubtree, otherNodeSubtree);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LCAResult)) {
                return false;
            }
            LCAResult lCAResult = (LCAResult) other;
            return AbstractC4862t.a(this.lca, lCAResult.lca) && AbstractC4862t.a(this.nodeSubtree, lCAResult.nodeSubtree) && AbstractC4862t.a(this.otherNodeSubtree, lCAResult.otherNodeSubtree);
        }

        public final ViewHierarchyNode getLca() {
            return this.lca;
        }

        public final ViewHierarchyNode getNodeSubtree() {
            return this.nodeSubtree;
        }

        public final ViewHierarchyNode getOtherNodeSubtree() {
            return this.otherNodeSubtree;
        }

        public int hashCode() {
            ViewHierarchyNode viewHierarchyNode = this.lca;
            int iHashCode = (viewHierarchyNode == null ? 0 : viewHierarchyNode.hashCode()) * 31;
            ViewHierarchyNode viewHierarchyNode2 = this.nodeSubtree;
            int iHashCode2 = (iHashCode + (viewHierarchyNode2 == null ? 0 : viewHierarchyNode2.hashCode())) * 31;
            ViewHierarchyNode viewHierarchyNode3 = this.otherNodeSubtree;
            return iHashCode2 + (viewHierarchyNode3 != null ? viewHierarchyNode3.hashCode() : 0);
        }

        public final void setNodeSubtree(ViewHierarchyNode viewHierarchyNode) {
            this.nodeSubtree = viewHierarchyNode;
        }

        public final void setOtherNodeSubtree(ViewHierarchyNode viewHierarchyNode) {
            this.otherNodeSubtree = viewHierarchyNode;
        }

        public String toString() {
            return "LCAResult(lca=" + this.lca + ", nodeSubtree=" + this.nodeSubtree + ", otherNodeSubtree=" + this.otherNodeSubtree + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, d2 = {"Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode$TextViewHierarchyNode;", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "layout", "Lio/sentry/android/replay/util/TextLayout;", "dominantColor", "", "paddingLeft", "paddingTop", "x", "", "y", "width", "height", "elevation", "distance", "parent", "shouldMask", "", "isImportantForContentCapture", "isVisible", "visibleRect", "Landroid/graphics/Rect;", "(Lio/sentry/android/replay/util/TextLayout;Ljava/lang/Integer;IIFFIIFILio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;ZZZLandroid/graphics/Rect;)V", "getDominantColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLayout", "()Lio/sentry/android/replay/util/TextLayout;", "getPaddingLeft", "()I", "getPaddingTop", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TextViewHierarchyNode extends ViewHierarchyNode {
        public static final int $stable = 8;
        private final Integer dominantColor;
        private final TextLayout layout;
        private final int paddingLeft;
        private final int paddingTop;

        public /* synthetic */ TextViewHierarchyNode(TextLayout textLayout, Integer num, int i10, int i11, float f10, float f11, int i12, int i13, float f12, int i14, ViewHierarchyNode viewHierarchyNode, boolean z10, boolean z11, boolean z12, Rect rect, int i15, AbstractC4854k abstractC4854k) {
            this((i15 & 1) != 0 ? null : textLayout, (i15 & 2) != 0 ? null : num, (i15 & 4) != 0 ? 0 : i10, (i15 & 8) != 0 ? 0 : i11, f10, f11, i12, i13, f12, i14, (i15 & RecognitionOptions.UPC_E) != 0 ? null : viewHierarchyNode, (i15 & RecognitionOptions.PDF417) != 0 ? false : z10, (i15 & RecognitionOptions.AZTEC) != 0 ? false : z11, (i15 & 8192) != 0 ? false : z12, (i15 & 16384) != 0 ? null : rect);
        }

        public final Integer getDominantColor() {
            return this.dominantColor;
        }

        public final TextLayout getLayout() {
            return this.layout;
        }

        public final int getPaddingLeft() {
            return this.paddingLeft;
        }

        public final int getPaddingTop() {
            return this.paddingTop;
        }

        public TextViewHierarchyNode(TextLayout textLayout, Integer num, int i10, int i11, float f10, float f11, int i12, int i13, float f12, int i14, ViewHierarchyNode viewHierarchyNode, boolean z10, boolean z11, boolean z12, Rect rect) {
            super(f10, f11, i12, i13, f12, i14, viewHierarchyNode, z10, z11, z12, rect, null);
            this.layout = textLayout;
            this.dominantColor = num;
            this.paddingLeft = i10;
            this.paddingTop = i11;
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.viewhierarchy.ViewHierarchyNode$isObscured$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "otherNode", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "invoke", "(Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends v implements l {
        final /* synthetic */ I $isObscured;
        final /* synthetic */ ViewHierarchyNode $node;
        final /* synthetic */ ViewHierarchyNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(I i10, ViewHierarchyNode viewHierarchyNode, ViewHierarchyNode viewHierarchyNode2) {
            super(1);
            this.$isObscured = i10;
            this.$node = viewHierarchyNode;
            this.this$0 = viewHierarchyNode2;
        }

        @Override // vc.l
        public final Boolean invoke(ViewHierarchyNode otherNode) {
            AbstractC4862t.e(otherNode, "otherNode");
            if (otherNode.getVisibleRect() == null || this.$isObscured.f39773a) {
                return Boolean.FALSE;
            }
            if (!otherNode.getIsVisible() || !otherNode.getIsImportantForContentCapture() || !otherNode.getVisibleRect().contains(this.$node.getVisibleRect())) {
                return Boolean.FALSE;
            }
            if (otherNode.getElevation() > this.$node.getElevation()) {
                this.$isObscured.f39773a = true;
                return Boolean.FALSE;
            }
            if (otherNode.getElevation() == this.$node.getElevation()) {
                LCAResult lCAResultFindLCA = this.this$0.findLCA(this.$node, otherNode);
                ViewHierarchyNode lca = lCAResultFindLCA.getLca();
                ViewHierarchyNode nodeSubtree = lCAResultFindLCA.getNodeSubtree();
                ViewHierarchyNode otherNodeSubtree = lCAResultFindLCA.getOtherNodeSubtree();
                if (!AbstractC4862t.a(lca, otherNode) && otherNodeSubtree != null && nodeSubtree != null) {
                    this.$isObscured.f39773a = otherNodeSubtree.getDistance() > nodeSubtree.getDistance();
                    return Boolean.valueOf(!this.$isObscured.f39773a);
                }
            }
            return Boolean.TRUE;
        }
    }

    public /* synthetic */ ViewHierarchyNode(float f10, float f11, int i10, int i11, float f12, int i12, ViewHierarchyNode viewHierarchyNode, boolean z10, boolean z11, boolean z12, Rect rect, AbstractC4854k abstractC4854k) {
        this(f10, f11, i10, i11, f12, i12, viewHierarchyNode, z10, z11, z12, rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LCAResult findLCA(ViewHierarchyNode node, ViewHierarchyNode otherNode) {
        ViewHierarchyNode viewHierarchyNode = AbstractC4862t.a(this, node) ? this : null;
        ViewHierarchyNode viewHierarchyNode2 = AbstractC4862t.a(this, otherNode) ? this : null;
        List<? extends ViewHierarchyNode> list = this.children;
        if (list != null) {
            AbstractC4862t.b(list);
            for (ViewHierarchyNode viewHierarchyNode3 : list) {
                LCAResult lCAResultFindLCA = viewHierarchyNode3.findLCA(node, otherNode);
                if (lCAResultFindLCA.getLca() != null) {
                    return lCAResultFindLCA;
                }
                if (lCAResultFindLCA.getNodeSubtree() != null) {
                    viewHierarchyNode = viewHierarchyNode3;
                }
                if (lCAResultFindLCA.getOtherNodeSubtree() != null) {
                    viewHierarchyNode2 = viewHierarchyNode3;
                }
            }
        }
        if (viewHierarchyNode == null || viewHierarchyNode2 == null) {
            this = null;
        }
        return new LCAResult(this, viewHierarchyNode, viewHierarchyNode2);
    }

    public final List<ViewHierarchyNode> getChildren() {
        return this.children;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final float getElevation() {
        return this.elevation;
    }

    public final int getHeight() {
        return this.height;
    }

    public final ViewHierarchyNode getParent() {
        return this.parent;
    }

    public final boolean getShouldMask() {
        return this.shouldMask;
    }

    public final Rect getVisibleRect() {
        return this.visibleRect;
    }

    public final int getWidth() {
        return this.width;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    /* JADX INFO: renamed from: isImportantForContentCapture, reason: from getter */
    public final boolean getIsImportantForContentCapture() {
        return this.isImportantForContentCapture;
    }

    public final boolean isObscured(ViewHierarchyNode node) {
        AbstractC4862t.e(node, "node");
        if (this.parent != null) {
            throw new IllegalArgumentException("This method should be called on the root node of the view hierarchy.");
        }
        if (node.visibleRect == null) {
            return false;
        }
        I i10 = new I();
        traverse(new AnonymousClass2(i10, node, this));
        return i10.f39773a;
    }

    /* JADX INFO: renamed from: isVisible, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public final void setChildren(List<? extends ViewHierarchyNode> list) {
        this.children = list;
    }

    public final void setImportantForCaptureToAncestors(boolean isImportant) {
        for (ViewHierarchyNode viewHierarchyNode = this.parent; viewHierarchyNode != null; viewHierarchyNode = viewHierarchyNode.parent) {
            viewHierarchyNode.isImportantForContentCapture = isImportant;
        }
    }

    public final void setImportantForContentCapture(boolean z10) {
        this.isImportantForContentCapture = z10;
    }

    public final void traverse(l callback) {
        List<? extends ViewHierarchyNode> list;
        AbstractC4862t.e(callback, "callback");
        if (!((Boolean) callback.invoke(this)).booleanValue() || (list = this.children) == null) {
            return;
        }
        AbstractC4862t.b(list);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((ViewHierarchyNode) it.next()).traverse(callback);
        }
    }

    private ViewHierarchyNode(float f10, float f11, int i10, int i11, float f12, int i12, ViewHierarchyNode viewHierarchyNode, boolean z10, boolean z11, boolean z12, Rect rect) {
        this.x = f10;
        this.y = f11;
        this.width = i10;
        this.height = i11;
        this.elevation = f12;
        this.distance = i12;
        this.parent = viewHierarchyNode;
        this.shouldMask = z10;
        this.isImportantForContentCapture = z11;
        this.isVisible = z12;
        this.visibleRect = rect;
    }

    public /* synthetic */ ViewHierarchyNode(float f10, float f11, int i10, int i11, float f12, int i12, ViewHierarchyNode viewHierarchyNode, boolean z10, boolean z11, boolean z12, Rect rect, int i13, AbstractC4854k abstractC4854k) {
        this(f10, f11, i10, i11, f12, i12, (i13 & 64) != 0 ? null : viewHierarchyNode, (i13 & 128) != 0 ? false : z10, (i13 & 256) != 0 ? false : z11, (i13 & 512) != 0 ? false : z12, (i13 & RecognitionOptions.UPC_E) != 0 ? null : rect, null);
    }
}
