package io.sentry.internal.gestures;

import io.sentry.util.Objects;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class UiElement {
    final String className;
    final String origin;
    final String resourceName;
    final String tag;
    final WeakReference<Object> viewRef;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum Type {
        CLICKABLE,
        SCROLLABLE
    }

    public UiElement(Object obj, String str, String str2, String str3, String str4) {
        this.viewRef = new WeakReference<>(obj);
        this.className = str;
        this.resourceName = str2;
        this.tag = str3;
        this.origin = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && UiElement.class == obj.getClass()) {
            UiElement uiElement = (UiElement) obj;
            if (Objects.equals(this.className, uiElement.className) && Objects.equals(this.resourceName, uiElement.resourceName) && Objects.equals(this.tag, uiElement.tag)) {
                return true;
            }
        }
        return false;
    }

    public String getClassName() {
        return this.className;
    }

    public String getIdentifier() {
        String str = this.resourceName;
        return str != null ? str : (String) Objects.requireNonNull(this.tag, "UiElement.tag can't be null");
    }

    public String getOrigin() {
        return this.origin;
    }

    public String getResourceName() {
        return this.resourceName;
    }

    public String getTag() {
        return this.tag;
    }

    public Object getView() {
        return this.viewRef.get();
    }

    public int hashCode() {
        return Objects.hash(this.viewRef, this.resourceName, this.tag);
    }
}
