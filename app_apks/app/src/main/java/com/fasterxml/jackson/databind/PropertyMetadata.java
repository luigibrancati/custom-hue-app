package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class PropertyMetadata implements Serializable {
    private static final long serialVersionUID = -1;
    protected Nulls _contentNulls;
    protected final String _defaultValue;
    protected final String _description;
    protected final Integer _index;
    protected final transient MergeInfo _mergeInfo;
    protected final Boolean _required;
    protected Nulls _valueNulls;
    public static final PropertyMetadata STD_REQUIRED = new PropertyMetadata(Boolean.TRUE, null, null, null, null, null, null);
    public static final PropertyMetadata STD_OPTIONAL = new PropertyMetadata(Boolean.FALSE, null, null, null, null, null, null);
    public static final PropertyMetadata STD_REQUIRED_OR_OPTIONAL = new PropertyMetadata(null, null, null, null, null, null, null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class MergeInfo {
        public final boolean fromDefaults;
        public final AnnotatedMember getter;

        public MergeInfo(AnnotatedMember annotatedMember, boolean z10) {
            this.getter = annotatedMember;
            this.fromDefaults = z10;
        }

        public static MergeInfo createForDefaults(AnnotatedMember annotatedMember) {
            return new MergeInfo(annotatedMember, true);
        }

        public static MergeInfo createForPropertyOverride(AnnotatedMember annotatedMember) {
            return new MergeInfo(annotatedMember, false);
        }

        public static MergeInfo createForTypeOverride(AnnotatedMember annotatedMember) {
            return new MergeInfo(annotatedMember, false);
        }
    }

    public PropertyMetadata(Boolean bool, String str, Integer num, String str2, MergeInfo mergeInfo, Nulls nulls, Nulls nulls2) {
        this._required = bool;
        this._description = str;
        this._index = num;
        this._defaultValue = (str2 == null || str2.isEmpty()) ? null : str2;
        this._mergeInfo = mergeInfo;
        this._valueNulls = nulls;
        this._contentNulls = nulls2;
    }

    public static PropertyMetadata construct(Boolean bool, String str, Integer num, String str2) {
        return (str == null && num == null && str2 == null) ? bool == null ? STD_REQUIRED_OR_OPTIONAL : bool.booleanValue() ? STD_REQUIRED : STD_OPTIONAL : new PropertyMetadata(bool, str, num, str2, null, null, null);
    }

    public Nulls getContentNulls() {
        return this._contentNulls;
    }

    public String getDefaultValue() {
        return this._defaultValue;
    }

    public String getDescription() {
        return this._description;
    }

    public Integer getIndex() {
        return this._index;
    }

    public MergeInfo getMergeInfo() {
        return this._mergeInfo;
    }

    public Boolean getRequired() {
        return this._required;
    }

    public Nulls getValueNulls() {
        return this._valueNulls;
    }

    public boolean hasDefaultValue() {
        return this._defaultValue != null;
    }

    public boolean hasIndex() {
        return this._index != null;
    }

    public boolean isRequired() {
        Boolean bool = this._required;
        return bool != null && bool.booleanValue();
    }

    public Object readResolve() {
        if (this._description != null || this._index != null || this._defaultValue != null || this._mergeInfo != null || this._valueNulls != null || this._contentNulls != null) {
            return this;
        }
        Boolean bool = this._required;
        return bool == null ? STD_REQUIRED_OR_OPTIONAL : bool.booleanValue() ? STD_REQUIRED : STD_OPTIONAL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
    
        if (r9.equals(r8._defaultValue) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.PropertyMetadata withDefaultValue(java.lang.String r9) {
        /*
            r8 = this;
            if (r9 == 0) goto L14
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L9
            goto L14
        L9:
            java.lang.String r0 = r8._defaultValue
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L12
            goto L18
        L12:
            r4 = r9
            goto L1b
        L14:
            java.lang.String r9 = r8._defaultValue
            if (r9 != 0) goto L19
        L18:
            return r8
        L19:
            r9 = 0
            goto L12
        L1b:
            com.fasterxml.jackson.databind.PropertyMetadata r0 = new com.fasterxml.jackson.databind.PropertyMetadata
            java.lang.Boolean r1 = r8._required
            java.lang.String r2 = r8._description
            java.lang.Integer r3 = r8._index
            com.fasterxml.jackson.databind.PropertyMetadata$MergeInfo r5 = r8._mergeInfo
            com.fasterxml.jackson.annotation.Nulls r6 = r8._valueNulls
            com.fasterxml.jackson.annotation.Nulls r7 = r8._contentNulls
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.PropertyMetadata.withDefaultValue(java.lang.String):com.fasterxml.jackson.databind.PropertyMetadata");
    }

    public PropertyMetadata withDescription(String str) {
        return new PropertyMetadata(this._required, str, this._index, this._defaultValue, this._mergeInfo, this._valueNulls, this._contentNulls);
    }

    public PropertyMetadata withIndex(Integer num) {
        return new PropertyMetadata(this._required, this._description, num, this._defaultValue, this._mergeInfo, this._valueNulls, this._contentNulls);
    }

    public PropertyMetadata withMergeInfo(MergeInfo mergeInfo) {
        return new PropertyMetadata(this._required, this._description, this._index, this._defaultValue, mergeInfo, this._valueNulls, this._contentNulls);
    }

    public PropertyMetadata withNulls(Nulls nulls, Nulls nulls2) {
        return new PropertyMetadata(this._required, this._description, this._index, this._defaultValue, this._mergeInfo, nulls, nulls2);
    }

    public PropertyMetadata withRequired(Boolean bool) {
        return (bool != null ? !bool.equals(this._required) : this._required != null) ? new PropertyMetadata(bool, this._description, this._index, this._defaultValue, this._mergeInfo, this._valueNulls, this._contentNulls) : this;
    }

    @Deprecated
    public static PropertyMetadata construct(boolean z10, String str, Integer num, String str2) {
        if (str == null && num == null && str2 == null) {
            return z10 ? STD_REQUIRED : STD_OPTIONAL;
        }
        return new PropertyMetadata(Boolean.valueOf(z10), str, num, str2, null, null, null);
    }
}
