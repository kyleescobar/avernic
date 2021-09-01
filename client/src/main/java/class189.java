import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class class189 extends class168 {
   static class336 field2122;
   static class398[] field2127;
   HashSet field2123;
   HashSet field2125;
   List field2124;

   class189() {
   }

   void method3262(Buffer var1, Buffer var2, int var3, boolean var4) {
      this.method2890(var1, var3);
      int var6 = var2.readUnsignedShort();
      this.field2125 = new HashSet(var6);

      int var7;
      for(var7 = 0; var7 < var6; ++var7) {
         class163 var8 = new class163();

         try {
            var8.method2853(var2);
         } catch (IllegalStateException var12) {
            continue;
         }

         this.field2125.add(var8);
      }

      var7 = var2.readUnsignedShort();
      this.field2123 = new HashSet(var7);

      for(int var13 = 0; var13 < var7; ++var13) {
         class171 var9 = new class171();

         try {
            var9.method3112(var2);
         } catch (IllegalStateException var11) {
            continue;
         }

         this.field2123.add(var9);
      }

      this.method3260(var2, var4);
   }

   void method3260(Buffer var1, boolean var2) {
      this.field2124 = new LinkedList();
      int var4 = var1.readUnsignedShort();

      for(int var5 = 0; var5 < var4; ++var5) {
         int var6 = var1.method5965();
         class245 var7 = new class245(var1.readInt());
         boolean var8 = var1.readUnsignedByte() == 1;
         if (var2 || !var8) {
            this.field2124.add(new class174((class245)null, var7, var6, (class181)null));
         }
      }

   }

   public static ServerPacket[] getServerPacketList() {
      return new ServerPacket[]{ServerPacket.field2788, ServerPacket.GAMEFRAME_FULL, ServerPacket.REBUILD_REGION_NORMAL, ServerPacket.field2693, ServerPacket.field2696, ServerPacket.field2769, ServerPacket.field2698, ServerPacket.field2720, ServerPacket.field2700, ServerPacket.field2701, ServerPacket.field2702, ServerPacket.field2703, ServerPacket.field2768, ServerPacket.field2705, ServerPacket.field2706, ServerPacket.field2707, ServerPacket.field2708, ServerPacket.field2758, ServerPacket.field2756, ServerPacket.field2711, ServerPacket.field2695, ServerPacket.field2713, ServerPacket.field2714, ServerPacket.field2715, ServerPacket.field2749, ServerPacket.field2712, ServerPacket.IF_CLOSE_SUB, ServerPacket.field2719, ServerPacket.field2718, ServerPacket.field2729, ServerPacket.field2722, ServerPacket.field2704, ServerPacket.field2724, ServerPacket.field2725, ServerPacket.field2726, ServerPacket.field2727, ServerPacket.field2757, ServerPacket.field2716, ServerPacket.PLAYER_UPDATE, ServerPacket.field2731, ServerPacket.field2732, ServerPacket.field2775, ServerPacket.IF_SET_TEXT, ServerPacket.field2735, ServerPacket.field2736, ServerPacket.IF_SET_COLOR, ServerPacket.field2738, ServerPacket.IF_SET_OBJ, ServerPacket.field2710, ServerPacket.SEND_MESSAGE_GAME, ServerPacket.field2742, ServerPacket.field2743, ServerPacket.field2721, ServerPacket.field2745, ServerPacket.field2746, ServerPacket.field2728, ServerPacket.field2733, ServerPacket.field2782, ServerPacket.IF_SET_HIDE, ServerPacket.IF_SET_PLAYER_HEAD, ServerPacket.IF_MOVE_SUB, ServerPacket.field2753, ServerPacket.IF_SET_ANGLE, ServerPacket.field2755, ServerPacket.field2723, ServerPacket.field2770, ServerPacket.field2699, ServerPacket.field2759, ServerPacket.field2760, ServerPacket.UPDATE_VARP_SMALL, ServerPacket.UPDATE_VARP_LARGE, ServerPacket.field2763, ServerPacket.IF_SET_MODEL, ServerPacket.field2709, ServerPacket.field2766, ServerPacket.field2767, ServerPacket.field2717, ServerPacket.field2784, ServerPacket.field2778, ServerPacket.field2744, ServerPacket.field2772, ServerPacket.field2773, ServerPacket.field2774, ServerPacket.IF_OPEN_SUB, ServerPacket.field2776, ServerPacket.field2777, ServerPacket.field2765, ServerPacket.IF_OPEN_TOP, ServerPacket.field2780, ServerPacket.field2781, ServerPacket.field2754, ServerPacket.RUN_CLIENT_SCRIPT, ServerPacket.field2697, ServerPacket.field2785, ServerPacket.field2786};
   }

   static class48 method3261() {
      class48.field694 = 0;
      return class113.method2115();
   }
}
