public class LoginPacket implements class226 {
   public static final LoginPacket field2790 = new LoginPacket(16);
   public static final LoginPacket field2792 = new LoginPacket(14);
   public static final LoginPacket field2793 = new LoginPacket(18);
   public static final LoginPacket field2794 = new LoginPacket(19);
   static final LoginPacket field2791 = new LoginPacket(27);
   static final LoginPacket field2797 = new LoginPacket(15);
   static final LoginPacket[] field2795 = new LoginPacket[32];
   public final int id;

   static {
      LoginPacket[] var0 = class359.method5692();

      for(int var1 = 0; var1 < var0.length; ++var1) {
         field2795[var0[var1].id] = var0[var1];
      }

   }

   LoginPacket(int var1) {
      this.id = var1;
   }
}
