.class final Lcom/tencent/mm/ui/account/RegSetInfoUI$16$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/mm/ui/account/RegSetInfoUI$16;->onClick(Landroid/content/DialogInterface;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic kwq:Lcom/tencent/mm/modelfriend/z;

.field final synthetic kwr:Lcom/tencent/mm/ui/account/RegSetInfoUI$16;


# direct methods
.method constructor <init>(Lcom/tencent/mm/ui/account/RegSetInfoUI$16;Lcom/tencent/mm/modelfriend/z;)V
    .locals 0

    .prologue
    .line 974
    iput-object p1, p0, Lcom/tencent/mm/ui/account/RegSetInfoUI$16$1;->kwr:Lcom/tencent/mm/ui/account/RegSetInfoUI$16;

    iput-object p2, p0, Lcom/tencent/mm/ui/account/RegSetInfoUI$16$1;->kwq:Lcom/tencent/mm/modelfriend/z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 3

    .prologue
    .line 978
    invoke-static {}, Lcom/tencent/mm/model/ah;->tE()Lcom/tencent/mm/r/m;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/mm/ui/account/RegSetInfoUI$16$1;->kwq:Lcom/tencent/mm/modelfriend/z;

    invoke-virtual {v0, v1}, Lcom/tencent/mm/r/m;->c(Lcom/tencent/mm/r/j;)V

    .line 979
    invoke-static {}, Lcom/tencent/mm/model/ah;->tE()Lcom/tencent/mm/r/m;

    move-result-object v0

    const/16 v1, 0x1ad

    iget-object v2, p0, Lcom/tencent/mm/ui/account/RegSetInfoUI$16$1;->kwr:Lcom/tencent/mm/ui/account/RegSetInfoUI$16;

    iget-object v2, v2, Lcom/tencent/mm/ui/account/RegSetInfoUI$16;->kwh:Lcom/tencent/mm/ui/account/RegSetInfoUI;

    invoke-virtual {v0, v1, v2}, Lcom/tencent/mm/r/m;->b(ILcom/tencent/mm/r/d;)V

    .line 980
    return-void
.end method
