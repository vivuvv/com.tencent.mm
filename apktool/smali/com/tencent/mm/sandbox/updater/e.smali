.class final Lcom/tencent/mm/sandbox/updater/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static jTI:J

.field private static jTJ:J


# instance fields
.field anF:Lcom/tencent/mm/sdk/platformtools/af;

.field private bvP:Z

.field dPt:Z

.field private jTK:J

.field private jTL:J

.field private jTM:Ljava/lang/String;

.field private jTN:Lcom/tencent/mm/sandbox/updater/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 781
    const-wide/32 v0, 0x7800000

    sput-wide v0, Lcom/tencent/mm/sandbox/updater/e;->jTI:J

    .line 782
    const-wide/32 v0, 0x12c00000

    sput-wide v0, Lcom/tencent/mm/sandbox/updater/e;->jTJ:J

    return-void
.end method

.method public constructor <init>(Lcom/tencent/mm/sandbox/updater/i;)V
    .locals 6

    .prologue
    const-wide/16 v4, 0x0

    const/4 v3, 0x0

    .line 804
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 786
    new-instance v0, Lcom/tencent/mm/sdk/platformtools/af;

    new-instance v1, Lcom/tencent/mm/sandbox/updater/e$1;

    invoke-direct {v1, p0}, Lcom/tencent/mm/sandbox/updater/e$1;-><init>(Lcom/tencent/mm/sandbox/updater/e;)V

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/tencent/mm/sdk/platformtools/af;-><init>(Lcom/tencent/mm/sdk/platformtools/af$a;Z)V

    iput-object v0, p0, Lcom/tencent/mm/sandbox/updater/e;->anF:Lcom/tencent/mm/sdk/platformtools/af;

    .line 794
    iput-wide v4, p0, Lcom/tencent/mm/sandbox/updater/e;->jTK:J

    .line 795
    iput-wide v4, p0, Lcom/tencent/mm/sandbox/updater/e;->jTL:J

    .line 796
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/mm/sandbox/updater/e;->jTM:Ljava/lang/String;

    .line 798
    iput-boolean v3, p0, Lcom/tencent/mm/sandbox/updater/e;->bvP:Z

    .line 802
    iput-boolean v3, p0, Lcom/tencent/mm/sandbox/updater/e;->dPt:Z

    .line 805
    iput-object p1, p0, Lcom/tencent/mm/sandbox/updater/e;->jTN:Lcom/tencent/mm/sandbox/updater/i;

    .line 806
    return-void
.end method

.method public static Cu(Ljava/lang/String;)Z
    .locals 4

    .prologue
    .line 904
    invoke-static {p0}, Lcom/tencent/mm/sandbox/updater/h;->Cw(Ljava/lang/String;)J

    move-result-wide v0

    .line 905
    sget-wide v2, Lcom/tencent/mm/sandbox/updater/e;->jTI:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 906
    const-string/jumbo v0, "!44@/B4Tb64lLpIoz7uBiEqQZS70cVT/Q61Ax49vraaHmec="

    const-string/jumbo v1, "overTrafficAlertLine reach traffic alert line!"

    invoke-static {v0, v1}, Lcom/tencent/mm/sdk/platformtools/u;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 907
    const/4 v0, 0x1

    .line 909
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic a(Lcom/tencent/mm/sandbox/updater/e;J)J
    .locals 2

    .prologue
    .line 777
    iget-wide v0, p0, Lcom/tencent/mm/sandbox/updater/e;->jTK:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lcom/tencent/mm/sandbox/updater/e;->jTK:J

    return-wide v0
.end method

.method static synthetic a(Lcom/tencent/mm/sandbox/updater/e;Z)V
    .locals 0

    .prologue
    .line 777
    invoke-virtual {p0, p1}, Lcom/tencent/mm/sandbox/updater/e;->gG(Z)V

    return-void
.end method

.method static synthetic b(Lcom/tencent/mm/sandbox/updater/e;J)J
    .locals 2

    .prologue
    .line 777
    iget-wide v0, p0, Lcom/tencent/mm/sandbox/updater/e;->jTL:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lcom/tencent/mm/sandbox/updater/e;->jTL:J

    return-wide v0
.end method


# virtual methods
.method public final aJ(Ljava/lang/String;I)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v5, 0x1

    .line 817
    invoke-static {p1}, Lcom/tencent/mm/sdk/platformtools/ay;->kz(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 835
    :cond_0
    :goto_0
    return-void

    .line 821
    :cond_1
    iget-object v0, p0, Lcom/tencent/mm/sandbox/updater/e;->jTM:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 822
    invoke-virtual {p0}, Lcom/tencent/mm/sandbox/updater/e;->stop()V

    .line 825
    :cond_2
    const-string/jumbo v0, "!44@/B4Tb64lLpIoz7uBiEqQZS70cVT/Q61Ax49vraaHmec="

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "pack size: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/mm/sdk/platformtools/u;->i(Ljava/lang/String;Ljava/lang/String;)V

    const-string/jumbo v0, "!44@/B4Tb64lLpIoz7uBiEqQZS70cVT/Q61Ax49vraaHmec="

    const-string/jumbo v1, "TRAFFIC_ALERT_LINE before : %s"

    new-array v2, v5, [Ljava/lang/Object;

    sget-wide v3, Lcom/tencent/mm/sandbox/updater/e;->jTI:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v2, v6

    invoke-static {v0, v1, v2}, Lcom/tencent/mm/sdk/platformtools/u;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    mul-int/lit8 v0, p2, 0x4

    int-to-long v0, v0

    sget-wide v2, Lcom/tencent/mm/sandbox/updater/e;->jTI:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    sput-wide v0, Lcom/tencent/mm/sandbox/updater/e;->jTI:J

    sget-wide v0, Lcom/tencent/mm/sandbox/updater/e;->jTJ:J

    sget-wide v2, Lcom/tencent/mm/sandbox/updater/e;->jTI:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    sput-wide v0, Lcom/tencent/mm/sandbox/updater/e;->jTI:J

    const-string/jumbo v0, "!44@/B4Tb64lLpIoz7uBiEqQZS70cVT/Q61Ax49vraaHmec="

    const-string/jumbo v1, "TRAFFIC_ALERT_LINE after : %s"

    new-array v2, v5, [Ljava/lang/Object;

    sget-wide v3, Lcom/tencent/mm/sandbox/updater/e;->jTI:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v2, v6

    invoke-static {v0, v1, v2}, Lcom/tencent/mm/sdk/platformtools/u;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 827
    iget-boolean v0, p0, Lcom/tencent/mm/sandbox/updater/e;->bvP:Z

    if-nez v0, :cond_0

    .line 828
    iget-object v0, p0, Lcom/tencent/mm/sandbox/updater/e;->jTN:Lcom/tencent/mm/sandbox/updater/i;

    iget-object v0, v0, Lcom/tencent/mm/sandbox/updater/i;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_3

    .line 829
    iget-object v0, p0, Lcom/tencent/mm/sandbox/updater/e;->jTN:Lcom/tencent/mm/sandbox/updater/i;

    iget-object v0, v0, Lcom/tencent/mm/sandbox/updater/i;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/tencent/mm/sdk/platformtools/ah;->dB(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/tencent/mm/sandbox/updater/e;->dPt:Z

    .line 831
    :cond_3
    iget-object v0, p0, Lcom/tencent/mm/sandbox/updater/e;->anF:Lcom/tencent/mm/sdk/platformtools/af;

    const-wide/16 v1, 0x7530

    invoke-virtual {v0, v1, v2}, Lcom/tencent/mm/sdk/platformtools/af;->ds(J)V

    .line 832
    iput-boolean v5, p0, Lcom/tencent/mm/sandbox/updater/e;->bvP:Z

    .line 833
    iput-object p1, p0, Lcom/tencent/mm/sandbox/updater/e;->jTM:Ljava/lang/String;

    goto :goto_0
.end method

.method final gG(Z)V
    .locals 7

    .prologue
    const-wide/16 v0, 0x0

    .line 893
    if-nez p1, :cond_0

    iget-wide v2, p0, Lcom/tencent/mm/sandbox/updater/e;->jTK:J

    iget-wide v4, p0, Lcom/tencent/mm/sandbox/updater/e;->jTL:J

    add-long/2addr v2, v4

    const-wide/32 v4, 0x80000

    cmp-long v2, v2, v4

    if-ltz v2, :cond_3

    .line 894
    :cond_0
    iget-wide v2, p0, Lcom/tencent/mm/sandbox/updater/e;->jTK:J

    iget-wide v4, p0, Lcom/tencent/mm/sandbox/updater/e;->jTL:J

    add-long/2addr v2, v4

    cmp-long v2, v2, v0

    if-lez v2, :cond_2

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    const-string/jumbo v3, "com.tencent.mm.sandbox.updater.intent.ACTION_UPDATE"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string/jumbo v3, "intent_extra_flow_stat_upstream"

    iget-wide v4, p0, Lcom/tencent/mm/sandbox/updater/e;->jTK:J

    invoke-virtual {v2, v3, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    const-string/jumbo v3, "intent_extra_flow_stat_downstream"

    iget-wide v4, p0, Lcom/tencent/mm/sandbox/updater/e;->jTL:J

    invoke-virtual {v2, v3, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    iget-object v3, p0, Lcom/tencent/mm/sandbox/updater/e;->jTN:Lcom/tencent/mm/sandbox/updater/i;

    iget-object v3, v3, Lcom/tencent/mm/sandbox/updater/i;->mContext:Landroid/content/Context;

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/tencent/mm/sandbox/updater/e;->jTN:Lcom/tencent/mm/sandbox/updater/i;

    iget-object v3, v3, Lcom/tencent/mm/sandbox/updater/i;->mContext:Landroid/content/Context;

    invoke-static {v3}, Lcom/tencent/mm/sdk/platformtools/ah;->dB(Landroid/content/Context;)Z

    move-result v3

    iput-boolean v3, p0, Lcom/tencent/mm/sandbox/updater/e;->dPt:Z

    :cond_1
    const-string/jumbo v3, "intent_extra_flow_stat_is_wifi"

    iget-boolean v4, p0, Lcom/tencent/mm/sandbox/updater/e;->dPt:Z

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    iget-object v3, p0, Lcom/tencent/mm/sandbox/updater/e;->jTN:Lcom/tencent/mm/sandbox/updater/i;

    iget-object v3, v3, Lcom/tencent/mm/sandbox/updater/i;->mContext:Landroid/content/Context;

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/tencent/mm/sandbox/updater/e;->jTN:Lcom/tencent/mm/sandbox/updater/i;

    iget-object v3, v3, Lcom/tencent/mm/sandbox/updater/i;->mContext:Landroid/content/Context;

    const-string/jumbo v4, "com.tencent.mm.permission.MM_MESSAGE"

    invoke-virtual {v3, v2, v4}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    :cond_2
    iget-object v2, p0, Lcom/tencent/mm/sandbox/updater/e;->jTM:Ljava/lang/String;

    invoke-static {v2}, Lcom/tencent/mm/sdk/platformtools/ay;->kz(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    const-string/jumbo v2, "!44@/B4Tb64lLpIoz7uBiEqQZS70cVT/Q61Ax49vraaHmec="

    const-string/jumbo v3, "traffic is null!"

    invoke-static {v2, v3}, Lcom/tencent/mm/sdk/platformtools/u;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 895
    :goto_0
    sget-wide v2, Lcom/tencent/mm/sandbox/updater/e;->jTI:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_3

    iget-object v0, p0, Lcom/tencent/mm/sandbox/updater/e;->jTN:Lcom/tencent/mm/sandbox/updater/i;

    iget v0, v0, Lcom/tencent/mm/sandbox/updater/i;->jSR:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 896
    const-string/jumbo v0, "!44@/B4Tb64lLpIoz7uBiEqQZS70cVT/Q61Ax49vraaHmec="

    const-string/jumbo v1, "checkIfTrafficAlert reach traffic alert line!"

    invoke-static {v0, v1}, Lcom/tencent/mm/sdk/platformtools/u;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 897
    iget-object v0, p0, Lcom/tencent/mm/sandbox/updater/e;->jTN:Lcom/tencent/mm/sandbox/updater/i;

    invoke-virtual {v0}, Lcom/tencent/mm/sandbox/updater/i;->cancel()V

    .line 901
    :cond_3
    return-void

    .line 894
    :cond_4
    iget-object v2, p0, Lcom/tencent/mm/sandbox/updater/e;->jTM:Ljava/lang/String;

    iget-wide v3, p0, Lcom/tencent/mm/sandbox/updater/e;->jTK:J

    iget-wide v5, p0, Lcom/tencent/mm/sandbox/updater/e;->jTL:J

    invoke-static {v2, v3, v4, v5, v6}, Lcom/tencent/mm/sandbox/updater/h;->b(Ljava/lang/String;JJ)J

    move-result-wide v2

    iput-wide v0, p0, Lcom/tencent/mm/sandbox/updater/e;->jTK:J

    iput-wide v0, p0, Lcom/tencent/mm/sandbox/updater/e;->jTL:J

    move-wide v0, v2

    goto :goto_0
.end method

.method public final stop()V
    .locals 1

    .prologue
    .line 848
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/tencent/mm/sandbox/updater/e;->gG(Z)V

    .line 849
    iget-object v0, p0, Lcom/tencent/mm/sandbox/updater/e;->anF:Lcom/tencent/mm/sdk/platformtools/af;

    invoke-virtual {v0}, Lcom/tencent/mm/sdk/platformtools/af;->aUF()V

    .line 850
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/mm/sandbox/updater/e;->bvP:Z

    .line 851
    return-void
.end method
