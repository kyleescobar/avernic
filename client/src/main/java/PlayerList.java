public class PlayerList {
   static boolean field1183;
   static byte[] movementDirectionCache = new byte[2048];
   static byte[] field1175 = new byte[2048];
   static Buffer field1182 = new Buffer(new byte[5000]);
   static Buffer[] playerAppearances = new Buffer[2048];
   static int localPlayerCount = 0;
   static int emptyPlayerIndexCount = 0;
   static int pendingUpdateCount = 0;
   static int[] localPlayerEmptyIndexes = new int[2048];
   static int[] localPlayerOrientations = new int[2048];
   static int[] localPlayerRegions = new int[2048];
   static int[] localPlayerIndexes = new int[2048];
   static int[] localPlayerTargetIndexes = new int[2048];
   static int[] pendingUpdateIndexes = new int[2048];

   public static boolean method1885(int var0) {
      return (var0 >> 20 & 1) != 0;
   }

   public static void method1886(class277 var0, int var1, int var2, int var3, boolean var4) {
      class235.field2819 = 1;
      class235.field2820 = var0;
      class235.field2822 = var1;
      class97.field1264 = var2;
      class147.field1612 = var3;
      class146.field1598 = var4;
      class124.field1439 = 10000;
   }
}
