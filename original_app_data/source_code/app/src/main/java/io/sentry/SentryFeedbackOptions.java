package io.sentry;

import io.sentry.protocol.Feedback;
import io.sentry.protocol.SentryId;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryFeedbackOptions {
    private CharSequence cancelButtonLabel;
    private CharSequence emailLabel;
    private CharSequence emailPlaceholder;
    private CharSequence formTitle;
    private IDialogHandler iDialogHandler;
    private boolean isEmailRequired;
    private boolean isNameRequired;
    private CharSequence isRequiredLabel;
    private CharSequence messageLabel;
    private CharSequence messagePlaceholder;
    private CharSequence nameLabel;
    private CharSequence namePlaceholder;
    private Runnable onFormClose;
    private Runnable onFormOpen;
    private SentryFeedbackCallback onSubmitError;
    private SentryFeedbackCallback onSubmitSuccess;
    private boolean showBranding;
    private boolean showEmail;
    private boolean showName;
    private CharSequence submitButtonLabel;
    private CharSequence successMessageText;
    private boolean useSentryUser;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface IDialogHandler {
        void showDialog(SentryId sentryId, OptionsConfigurator optionsConfigurator);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface OptionsConfigurator {
        void configure(SentryFeedbackOptions sentryFeedbackOptions);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface SentryFeedbackCallback {
        void call(Feedback feedback);
    }

    public SentryFeedbackOptions(IDialogHandler iDialogHandler) {
        this.isNameRequired = false;
        this.showName = true;
        this.isEmailRequired = false;
        this.showEmail = true;
        this.useSentryUser = true;
        this.showBranding = true;
        this.formTitle = "Report a Bug";
        this.submitButtonLabel = "Send Bug Report";
        this.cancelButtonLabel = "Cancel";
        this.nameLabel = "Name";
        this.namePlaceholder = "Your Name";
        this.emailLabel = "Email";
        this.emailPlaceholder = "your.email@example.org";
        this.isRequiredLabel = " (Required)";
        this.messageLabel = "Description";
        this.messagePlaceholder = "What's the bug? What did you expect?";
        this.successMessageText = "Thank you for your report!";
        this.iDialogHandler = iDialogHandler;
    }

    public CharSequence getCancelButtonLabel() {
        return this.cancelButtonLabel;
    }

    public IDialogHandler getDialogHandler() {
        return this.iDialogHandler;
    }

    public CharSequence getEmailLabel() {
        return this.emailLabel;
    }

    public CharSequence getEmailPlaceholder() {
        return this.emailPlaceholder;
    }

    public CharSequence getFormTitle() {
        return this.formTitle;
    }

    public CharSequence getIsRequiredLabel() {
        return this.isRequiredLabel;
    }

    public CharSequence getMessageLabel() {
        return this.messageLabel;
    }

    public CharSequence getMessagePlaceholder() {
        return this.messagePlaceholder;
    }

    public CharSequence getNameLabel() {
        return this.nameLabel;
    }

    public CharSequence getNamePlaceholder() {
        return this.namePlaceholder;
    }

    public Runnable getOnFormClose() {
        return this.onFormClose;
    }

    public Runnable getOnFormOpen() {
        return this.onFormOpen;
    }

    public SentryFeedbackCallback getOnSubmitError() {
        return this.onSubmitError;
    }

    public SentryFeedbackCallback getOnSubmitSuccess() {
        return this.onSubmitSuccess;
    }

    public CharSequence getSubmitButtonLabel() {
        return this.submitButtonLabel;
    }

    public CharSequence getSuccessMessageText() {
        return this.successMessageText;
    }

    public boolean isEmailRequired() {
        return this.isEmailRequired;
    }

    public boolean isNameRequired() {
        return this.isNameRequired;
    }

    public boolean isShowBranding() {
        return this.showBranding;
    }

    public boolean isShowEmail() {
        return this.showEmail;
    }

    public boolean isShowName() {
        return this.showName;
    }

    public boolean isUseSentryUser() {
        return this.useSentryUser;
    }

    public void setCancelButtonLabel(CharSequence charSequence) {
        this.cancelButtonLabel = charSequence;
    }

    public void setDialogHandler(IDialogHandler iDialogHandler) {
        this.iDialogHandler = iDialogHandler;
    }

    public void setEmailLabel(CharSequence charSequence) {
        this.emailLabel = charSequence;
    }

    public void setEmailPlaceholder(CharSequence charSequence) {
        this.emailPlaceholder = charSequence;
    }

    public void setEmailRequired(boolean z10) {
        this.isEmailRequired = z10;
    }

    public void setFormTitle(CharSequence charSequence) {
        this.formTitle = charSequence;
    }

    public void setIsRequiredLabel(CharSequence charSequence) {
        this.isRequiredLabel = charSequence;
    }

    public void setMessageLabel(CharSequence charSequence) {
        this.messageLabel = charSequence;
    }

    public void setMessagePlaceholder(CharSequence charSequence) {
        this.messagePlaceholder = charSequence;
    }

    public void setNameLabel(CharSequence charSequence) {
        this.nameLabel = charSequence;
    }

    public void setNamePlaceholder(CharSequence charSequence) {
        this.namePlaceholder = charSequence;
    }

    public void setNameRequired(boolean z10) {
        this.isNameRequired = z10;
    }

    public void setOnFormClose(Runnable runnable) {
        this.onFormClose = runnable;
    }

    public void setOnFormOpen(Runnable runnable) {
        this.onFormOpen = runnable;
    }

    public void setOnSubmitError(SentryFeedbackCallback sentryFeedbackCallback) {
        this.onSubmitError = sentryFeedbackCallback;
    }

    public void setOnSubmitSuccess(SentryFeedbackCallback sentryFeedbackCallback) {
        this.onSubmitSuccess = sentryFeedbackCallback;
    }

    public void setShowBranding(boolean z10) {
        this.showBranding = z10;
    }

    public void setShowEmail(boolean z10) {
        this.showEmail = z10;
    }

    public void setShowName(boolean z10) {
        this.showName = z10;
    }

    public void setSubmitButtonLabel(CharSequence charSequence) {
        this.submitButtonLabel = charSequence;
    }

    public void setSuccessMessageText(CharSequence charSequence) {
        this.successMessageText = charSequence;
    }

    public void setUseSentryUser(boolean z10) {
        this.useSentryUser = z10;
    }

    public String toString() {
        return "SentryFeedbackOptions{isNameRequired=" + this.isNameRequired + ", showName=" + this.showName + ", isEmailRequired=" + this.isEmailRequired + ", showEmail=" + this.showEmail + ", useSentryUser=" + this.useSentryUser + ", showBranding=" + this.showBranding + ", formTitle='" + ((Object) this.formTitle) + "', submitButtonLabel='" + ((Object) this.submitButtonLabel) + "', cancelButtonLabel='" + ((Object) this.cancelButtonLabel) + "', nameLabel='" + ((Object) this.nameLabel) + "', namePlaceholder='" + ((Object) this.namePlaceholder) + "', emailLabel='" + ((Object) this.emailLabel) + "', emailPlaceholder='" + ((Object) this.emailPlaceholder) + "', isRequiredLabel='" + ((Object) this.isRequiredLabel) + "', messageLabel='" + ((Object) this.messageLabel) + "', messagePlaceholder='" + ((Object) this.messagePlaceholder) + "'}";
    }

    public SentryFeedbackOptions(SentryFeedbackOptions sentryFeedbackOptions) {
        this.isNameRequired = false;
        this.showName = true;
        this.isEmailRequired = false;
        this.showEmail = true;
        this.useSentryUser = true;
        this.showBranding = true;
        this.formTitle = "Report a Bug";
        this.submitButtonLabel = "Send Bug Report";
        this.cancelButtonLabel = "Cancel";
        this.nameLabel = "Name";
        this.namePlaceholder = "Your Name";
        this.emailLabel = "Email";
        this.emailPlaceholder = "your.email@example.org";
        this.isRequiredLabel = " (Required)";
        this.messageLabel = "Description";
        this.messagePlaceholder = "What's the bug? What did you expect?";
        this.successMessageText = "Thank you for your report!";
        this.isNameRequired = sentryFeedbackOptions.isNameRequired;
        this.showName = sentryFeedbackOptions.showName;
        this.isEmailRequired = sentryFeedbackOptions.isEmailRequired;
        this.showEmail = sentryFeedbackOptions.showEmail;
        this.useSentryUser = sentryFeedbackOptions.useSentryUser;
        this.showBranding = sentryFeedbackOptions.showBranding;
        this.formTitle = sentryFeedbackOptions.formTitle;
        this.submitButtonLabel = sentryFeedbackOptions.submitButtonLabel;
        this.cancelButtonLabel = sentryFeedbackOptions.cancelButtonLabel;
        this.nameLabel = sentryFeedbackOptions.nameLabel;
        this.namePlaceholder = sentryFeedbackOptions.namePlaceholder;
        this.emailLabel = sentryFeedbackOptions.emailLabel;
        this.emailPlaceholder = sentryFeedbackOptions.emailPlaceholder;
        this.isRequiredLabel = sentryFeedbackOptions.isRequiredLabel;
        this.messageLabel = sentryFeedbackOptions.messageLabel;
        this.messagePlaceholder = sentryFeedbackOptions.messagePlaceholder;
        this.successMessageText = sentryFeedbackOptions.successMessageText;
        this.onFormOpen = sentryFeedbackOptions.onFormOpen;
        this.onFormClose = sentryFeedbackOptions.onFormClose;
        this.onSubmitSuccess = sentryFeedbackOptions.onSubmitSuccess;
        this.onSubmitError = sentryFeedbackOptions.onSubmitError;
        this.iDialogHandler = sentryFeedbackOptions.iDialogHandler;
    }
}
