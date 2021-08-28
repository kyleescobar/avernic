public class PlayerType implements class290 {
   static final PlayerType field3539 = new PlayerType(1, 0, true, true, true);
   static final PlayerType field3540 = new PlayerType(2, 1, true, true, false);
   static final PlayerType field3541 = new PlayerType(6, 22, false, false, true);
   static final PlayerType field3542 = new PlayerType(4, 3, false, false, true);
   static final PlayerType field3544 = new PlayerType(0, -1, true, false, true);
   static final PlayerType field3545 = new PlayerType(5, 10, false, false, true);
   static final PlayerType field3549 = new PlayerType(3, 2, false, false, true);
   final int field3546;
   public final boolean isPrivileged;
   public final boolean field3548;
   public final int field3543;

   PlayerType(int var1, int var2, boolean var3, boolean var4, boolean var5) {
      this.field3546 = var1;
      this.field3543 = var2;
      this.isPrivileged = var4;
      this.field3548 = var5;
   }

   public int method4619() {
      return this.field3546;
   }
}
