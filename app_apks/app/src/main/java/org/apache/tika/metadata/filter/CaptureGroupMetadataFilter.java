package org.apache.tika.metadata.filter;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.apache.tika.config.Field;
import org.apache.tika.config.Initializable;
import org.apache.tika.config.InitializableProblemHandler;
import org.apache.tika.config.Param;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class CaptureGroupMetadataFilter extends MetadataFilter implements Initializable {
    private Pattern regex;
    private String regexString;
    private String sourceField;
    private String targetField;

    @Override // org.apache.tika.config.Initializable
    public void checkInitialization(InitializableProblemHandler initializableProblemHandler) throws TikaConfigException {
        if (StringUtils.isBlank(this.sourceField)) {
            throw new TikaConfigException("Must specify a 'sourceField'");
        }
        if (StringUtils.isBlank(this.targetField)) {
            throw new TikaConfigException("Must specify a 'targetField'");
        }
    }

    @Override // org.apache.tika.metadata.filter.MetadataFilter
    public void filter(Metadata metadata) {
        String str = metadata.get(this.sourceField);
        if (StringUtils.isBlank(str)) {
            return;
        }
        Matcher matcher = this.regex.matcher(str);
        if (matcher.find()) {
            metadata.set(this.targetField, matcher.group(1));
        }
    }

    public String getRegex() {
        return this.regexString;
    }

    public String getSourceField() {
        return this.sourceField;
    }

    public String getTargetField() {
        return this.targetField;
    }

    @Override // org.apache.tika.config.Initializable
    public void initialize(Map<String, Param> map) throws TikaConfigException {
        try {
            this.regex = Pattern.compile(this.regexString);
        } catch (PatternSyntaxException e10) {
            throw new TikaConfigException("Couldn't parse regex", e10);
        }
    }

    @Field
    public void setRegex(String str) {
        this.regexString = str;
    }

    @Field
    public void setSourceField(String str) {
        this.sourceField = str;
    }

    @Field
    public void setTargetField(String str) {
        this.targetField = str;
    }
}
