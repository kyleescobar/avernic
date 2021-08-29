import java.text.DecimalFormat;

public class class56 {
   static boolean field798;
   static boolean field800;
   static boolean field820;
   static boolean field821;
   static boolean field830;
   static class277 field831;
   static class397 field801;
   static class397[] field797;
   static class398 field803;
   static class398 field815;
   static int field805;
   static int field806;
   static int field810;
   static int field812;
   static int field817;
   static int field822;
   static int field825 = 0;
   static int field826;
   static int field827;
   static int field828;
   static String field799;
   static String field807;
   static String loginUsername;
   static String field811;
   static String field814;
   static String field816;
   static String loginPassword;
   static String field823;
   static String field824;
   static long field813;
   static long field829;

   static {
      field817 = field825 + 202;
      field806 = 10;
      field807 = "";
      field805 = -1;
      field810 = 1;
      field812 = 0;
      field799 = "";
      field823 = "";
      field814 = "";
      field816 = "";
      loginUsername = "";
      loginPassword = "";
      field830 = false;
      field820 = false;
      field821 = true;
      field822 = 0;
      field811 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
      field824 = "1234567890";
      field800 = false;
      field826 = -1;
      field827 = 0;
      field828 = 0;
      new DecimalFormat("##0.00");
      new class99();
      field829 = -1L;
      field813 = -1L;
   }

   public static int method1545(int var0, int var1) {
      int var3 = var0 >>> 31;
      return (var3 + var0) / var1 - var3;
   }

   static final void method1580() {
      PacketBufferNode var1 = class149.getPacketBufferNode(ClientPacket.field2655, client.packetWriter.isaacCipher);
      var1.packetBuffer.writeByte(0);
      client.packetWriter.addNode(var1);
   }
}
