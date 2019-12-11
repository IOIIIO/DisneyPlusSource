package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/identity/bam/ResetPasswordRequest;", "", "newPassword", "", "passwordResetToken", "(Ljava/lang/String;Ljava/lang/String;)V", "getNewPassword", "()Ljava/lang/String;", "getPasswordResetToken", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PasswordClient.kt */
public final class ResetPasswordRequest {
    private final String newPassword;
    private final String passwordResetToken;

    public ResetPasswordRequest(String str, String str2) {
        this.newPassword = str;
        this.passwordResetToken = str2;
    }

    public final String getNewPassword() {
        return this.newPassword;
    }

    public final String getPasswordResetToken() {
        return this.passwordResetToken;
    }
}
