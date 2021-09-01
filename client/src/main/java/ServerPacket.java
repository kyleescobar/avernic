import java.io.File;

public class ServerPacket {
   public static final ServerPacket IF_OPEN_SUB = new ServerPacket(83, 7);
   public static final ServerPacket field2693 = new ServerPacket(3, 0);
   public static final ServerPacket REBUILD_REGION_NORMAL = new ServerPacket(2, -2);
   public static final ServerPacket field2695 = new ServerPacket(20, -2);
   public static final ServerPacket field2696 = new ServerPacket(4, 1);
   public static final ServerPacket field2697 = new ServerPacket(92, -2);
   public static final ServerPacket field2698 = new ServerPacket(6, 5);
   public static final ServerPacket field2699 = new ServerPacket(66, 28);
   public static final ServerPacket field2700 = new ServerPacket(8, 2);
   public static final ServerPacket field2701 = new ServerPacket(9, 8);
   public static final ServerPacket field2702 = new ServerPacket(10, 3);
   public static final ServerPacket field2703 = new ServerPacket(11, -1);
   public static final ServerPacket field2704 = new ServerPacket(31, 6);
   public static final ServerPacket field2705 = new ServerPacket(13, 12);
   public static final ServerPacket field2706 = new ServerPacket(14, 2);
   public static final ServerPacket field2707 = new ServerPacket(15, -2);
   public static final ServerPacket field2708 = new ServerPacket(16, 4);
   public static final ServerPacket field2709 = new ServerPacket(73, 0);
   public static final ServerPacket field2710 = new ServerPacket(48, 2);
   public static final ServerPacket field2711 = new ServerPacket(19, -1);
   public static final ServerPacket field2712 = new ServerPacket(25, 7);
   public static final ServerPacket field2713 = new ServerPacket(21, 20);
   public static final ServerPacket field2714 = new ServerPacket(22, -1);
   public static final ServerPacket field2715 = new ServerPacket(23, 2);
   public static final ServerPacket field2716 = new ServerPacket(37, -2);
   public static final ServerPacket field2717 = new ServerPacket(76, 4);
   public static final ServerPacket field2718 = new ServerPacket(28, 0);
   public static final ServerPacket field2719 = new ServerPacket(27, 1);
   public static final ServerPacket field2720 = new ServerPacket(7, 0);
   public static final ServerPacket field2721 = new ServerPacket(52, 1);
   public static final ServerPacket field2722 = new ServerPacket(30, 6);
   public static final ServerPacket field2723 = new ServerPacket(64, -1);
   public static final ServerPacket field2724 = new ServerPacket(32, 8);
   public static final ServerPacket field2725 = new ServerPacket(33, 8);
   public static final ServerPacket field2726 = new ServerPacket(34, -1);
   public static final ServerPacket field2727 = new ServerPacket(35, -2);
   public static final ServerPacket field2728 = new ServerPacket(55, 0);
   public static final ServerPacket field2729 = new ServerPacket(29, -2);
   public static final ServerPacket PLAYER_UPDATE = new ServerPacket(38, -2);
   public static final ServerPacket field2731 = new ServerPacket(39, 1);
   public static final ServerPacket field2732 = new ServerPacket(40, 4);
   public static final ServerPacket field2733 = new ServerPacket(56, -2);
   public static final ServerPacket IF_SET_TEXT = new ServerPacket(42, -2);
   public static final ServerPacket field2735 = new ServerPacket(43, 4);
   public static final ServerPacket field2736 = new ServerPacket(44, 0);
   public static final ServerPacket IF_SET_COLOR = new ServerPacket(45, 6);
   public static final ServerPacket field2738 = new ServerPacket(46, -2);
   public static final ServerPacket IF_SET_OBJ = new ServerPacket(47, 10);
   public static final ServerPacket field2741 = new ServerPacket(49, -1);
   public static final ServerPacket field2742 = new ServerPacket(50, 1);
   public static final ServerPacket field2743 = new ServerPacket(51, 0);
   public static final ServerPacket field2744 = new ServerPacket(79, -2);
   public static final ServerPacket field2745 = new ServerPacket(53, 6);
   public static final ServerPacket field2746 = new ServerPacket(54, 14);
   public static final ServerPacket GAMEFRAME_FULL = new ServerPacket(1, -2);
   public static final ServerPacket IF_SET_ANGLE = new ServerPacket(62, 10);
   public static final ServerPacket field2749 = new ServerPacket(24, -2);
   public static final ServerPacket IF_SET_HIDE = new ServerPacket(58, 5);
   public static final ServerPacket IF_CLOSE_SUB = new ServerPacket(26, 4);
   public static final ServerPacket IF_MOVE_SUB = new ServerPacket(60, 8);
   public static final ServerPacket field2753 = new ServerPacket(61, -2);
   public static final ServerPacket field2754 = new ServerPacket(90, 6);
   public static final ServerPacket field2755 = new ServerPacket(63, 0);
   public static final ServerPacket field2756 = new ServerPacket(18, 2);
   public static final ServerPacket field2757 = new ServerPacket(36, -2);
   public static final ServerPacket field2758 = new ServerPacket(17, -2);
   public static final ServerPacket field2759 = new ServerPacket(67, 2);
   public static final ServerPacket field2760 = new ServerPacket(68, 6);
   public static final ServerPacket field2761 = new ServerPacket(69, 3);
   public static final ServerPacket field2762 = new ServerPacket(70, 6);
   public static final ServerPacket field2763 = new ServerPacket(71, 1);
   public static final ServerPacket IF_SET_MODEL = new ServerPacket(72, 6);
   public static final ServerPacket field2765 = new ServerPacket(86, -2);
   public static final ServerPacket field2766 = new ServerPacket(74, -1);
   public static final ServerPacket field2767 = new ServerPacket(75, 6);
   public static final ServerPacket field2768 = new ServerPacket(12, 4);
   public static final ServerPacket field2769 = new ServerPacket(5, 0);
   public static final ServerPacket field2770 = new ServerPacket(65, 5);
   public static final ServerPacket IF_SET_PLAYER_HEAD = new ServerPacket(59, 4);
   public static final ServerPacket field2772 = new ServerPacket(80, 15);
   public static final ServerPacket field2773 = new ServerPacket(81, 5);
   public static final ServerPacket field2774 = new ServerPacket(82, -2);
   public static final ServerPacket field2775 = new ServerPacket(41, 6);
   public static final ServerPacket field2776 = new ServerPacket(84, 6);
   public static final ServerPacket field2777 = new ServerPacket(85, -2);
   public static final ServerPacket field2778 = new ServerPacket(78, -1);
   public static final ServerPacket IF_OPEN_TOP = new ServerPacket(87, 2);
   public static final ServerPacket field2780 = new ServerPacket(88, 5);
   public static final ServerPacket field2781 = new ServerPacket(89, -2);
   public static final ServerPacket field2782 = new ServerPacket(57, 2);
   public static final ServerPacket RUN_CLIENT_SCRIPT = new ServerPacket(91, -2);
   public static final ServerPacket field2784 = new ServerPacket(77, 2);
   public static final ServerPacket field2785 = new ServerPacket(93, -1);
   public static final ServerPacket field2786 = new ServerPacket(94, 2);
   public static final ServerPacket field2788 = new ServerPacket(0, -2);
   static class356 platformInfo;
   public final int length;
   public final int field2787;

   static void method3920(File var0) {
      class133.field1482 = var0;
      if (!class133.field1482.exists()) {
         throw new RuntimeException("");
      } else {
         class133.field1483 = true;
      }
   }

   ServerPacket(int var1, int var2) {
      this.field2787 = var1;
      this.length = var2;
   }

   public static class302 method3918(class277 var0, class277 var1, String var2, String var3) {
      int var5 = var0.readGroup(var2);
      int var6 = var0.method4430(var5, var3);
      return class252.method4299(var0, var1, var5, var6);
   }

   static final int method3921(int var0, int var1, int var2) {
      int var4 = var0 / var2;
      int var5 = var0 & var2 - 1;
      int var6 = var1 / var2;
      int var7 = var1 & var2 - 1;
      int var8 = class282.method4540(var4, var6);
      int var9 = class282.method4540(var4 + 1, var6);
      int var10 = class282.method4540(var4, 1 + var6);
      int var11 = class282.method4540(var4 + 1, 1 + var6);
      int var12 = class47.method808(var8, var9, var5, var2);
      int var13 = class47.method808(var10, var11, var5, var2);
      return class47.method808(var12, var13, var7, var2);
   }
}
